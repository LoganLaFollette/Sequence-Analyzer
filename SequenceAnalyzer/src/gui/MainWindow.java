package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
//import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.event.CaretEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import javax.swing.JSeparator;

public class MainWindow {

	//The file most recently opened/saved
	private File currentBatch;
	private boolean unsavedChanges;
	
	private File currentOutputDump;
	
	private JFrame frame;
	private JTextField inputLine;
	private JButton btnEnter;
	private JTextArea editorArea;
	private JLabel lblCursorposdisplay;
	private JTextArea outputArea;
	private JMenuItem mntmSaveBatchAs;
	private JMenuItem mntmSaveBatch;
	private JMenuItem mntmSaveResultsAs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
		
		currentBatch = null;
		unsavedChanges = false;
		
		currentOutputDump = null;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewBatch = new JMenuItem("New Batch...");
		mnFile.add(mntmNewBatch);
		
		JMenuItem mntmOpenBatch = new JMenuItem("Open Batch...");
		mntmOpenBatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				//check if any changes have not been saved
				if(unsavedChanges)
				{
					int option = JOptionPane.showConfirmDialog(frame, "There are unsaved changes. Would you like to save?", "Save?", JOptionPane.YES_NO_CANCEL_OPTION);
					switch(option)
					{
					case JOptionPane.YES_OPTION:
						//save the contents of editorArea
						save(currentBatch, editorArea);
						unsavedChanges = false;
						break;
						
					case JOptionPane.NO_OPTION:
						//just continue with the opening procedure
						
						break;
						
					case JOptionPane.CANCEL_OPTION:
						//back out of opening a file
						return;
					}
				}
				
				//dump the contents of the editor
				editorArea.setText("");
				
				//user selects file
				JFileChooser chooser = new JFileChooser();
				chooser.setDialogType(JFileChooser.OPEN_DIALOG);
				int retVal = chooser.showOpenDialog(frame);
				File f = null;
				if(retVal == JFileChooser.APPROVE_OPTION)
					f = chooser.getSelectedFile();
				else
					return;
				
				//save reference to file for future saves
				currentBatch = f;
				
				//dump file contents into the editorArea
				try
				{
					BufferedReader reader = new BufferedReader(new FileReader(f));
					String line;
					while((line = reader.readLine()) != null)
						editorArea.append(line + "\n");
					reader.close();
				}
				catch (IOException e){ e.printStackTrace(); }
				
				unsavedChanges = false;
			}
		});
		mnFile.add(mntmOpenBatch);
		
		JSeparator separator_1 = new JSeparator();
		mnFile.add(separator_1);
		
		mntmSaveBatch = new JMenuItem("Save Batch");
		mntmSaveBatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//save the contents of editorArea to currentBatch, ifex
				save(currentBatch, editorArea);
				unsavedChanges = false;
			}
		});
		mnFile.add(mntmSaveBatch);
		
		mntmSaveBatchAs = new JMenuItem("Save Batch As...");
		mntmSaveBatchAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//save the contents of the editorArea to a user-defined file
				currentBatch = saveAs(editorArea);
			}
		});
		mnFile.add(mntmSaveBatchAs);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmSaveResults = new JMenuItem("Save Results");
		mntmSaveResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				save(currentOutputDump, outputArea);
			}
		});
		mnFile.add(mntmSaveResults);
		
		mntmSaveResultsAs = new JMenuItem("Save Results As...");
		mntmSaveResultsAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				currentOutputDump = saveAs(outputArea);
			}
		});
		mnFile.add(mntmSaveResultsAs);
		
		JSeparator separator_2 = new JSeparator();
		mnFile.add(separator_2);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(UIManager.getFont("TextArea.font"));
		frame.getContentPane().add(tabbedPane);
		
		JPanel cli_view = new JPanel();
		cli_view.setBorder(null);
		tabbedPane.addTab("Command Line", null, cli_view, null);
		tabbedPane.setDisplayedMnemonicIndexAt(0, 1);
		tabbedPane.setMnemonicAt(0, 1);
		cli_view.setLayout(new MigLayout("", "[2px][grow][]", "[2px][grow][]"));
		
		JScrollPane scrollPane = new JScrollPane();
		cli_view.add(scrollPane, "cell 0 0 3 2,grow");
		
		outputArea = new JTextArea();
		outputArea.setTabSize(4);
		outputArea.setEditable(false);
		scrollPane.setViewportView(outputArea);
		
		inputLine = new JTextField();
		inputLine.setFont(UIManager.getFont("TextArea.font"));
		inputLine.addKeyListener(new KeyAdapter() {
			/*
			 * Input line pushing input text somewhere
			 */
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
					sendInToOut();
			}
		});
		cli_view.add(inputLine, "cell 0 2 2 1,growx");
		inputLine.setColumns(10);
		
		btnEnter = new JButton("Enter");
		btnEnter.setFont(UIManager.getFont("TextArea.font"));
		btnEnter.setToolTipText("Run what's currently in the input line.");
		btnEnter.addMouseListener(new MouseAdapter() {
			/*
			 * Tell the input line to push input somewhere
			 */
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sendInToOut(); //TODO remove debug
			}
		});
		cli_view.add(btnEnter, "cell 2 2");
		
		JPanel editor_view = new JPanel();
		editor_view.setBorder(null);
		tabbedPane.addTab("Editor", null, editor_view, null);
		tabbedPane.setDisplayedMnemonicIndexAt(1, 2);
		tabbedPane.setMnemonicAt(1, 2);
		editor_view.setLayout(new MigLayout("", "[grow]", "[grow][]"));
		
		JScrollPane scrollPane_1 = new JScrollPane();
		editor_view.add(scrollPane_1, "cell 0 0,grow");
		
		editorArea = new JTextArea();
		editorArea.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void changedUpdate(DocumentEvent arg0) {
				unsavedChanges = true;
			}
			@Override
			public void insertUpdate(DocumentEvent arg0) {
				unsavedChanges = true;
			}
			@Override
			public void removeUpdate(DocumentEvent arg0) {
				unsavedChanges = true;
			}
		});
		editorArea.addCaretListener(new CaretListener() {
			/*
			 * Update caret status bar in the editor tab
			 */
			public void caretUpdate(CaretEvent arg0)
			{
				JTextArea area = (JTextArea)arg0.getSource();
				
				int line = 1, col = 1;
				String label = "ERROR";
				
				try
				{
					int cpos = area.getCaretPosition();
					line = area.getLineOfOffset(cpos);
					col = cpos - area.getLineStartOffset(line);
					line++;
					label = "Line " + line + " | Col " + col;
				}
				catch (BadLocationException e){ e.printStackTrace(); }
				
				lblCursorposdisplay.setText(label);
			}
		});
		scrollPane_1.setViewportView(editorArea);
		
		lblCursorposdisplay = new JLabel("Line 1 | Col 0");
		lblCursorposdisplay.setFont(UIManager.getFont("TextArea.font"));
		lblCursorposdisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		editor_view.add(lblCursorposdisplay, "cell 0 1");
	}
	
	/*
	 * Save the currentBatch. If there is no currentBatch, run saveAs()
	 */
	private void save(File defaultFile, JTextArea source)
	{
		if(defaultFile == null)
		{
			defaultFile = saveAs(source);
			return;
		}
		
		//editorArea contents into file
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(defaultFile));
			writer.write(source.getText());
			writer.close();
		}
		catch (IOException ioe){ ioe.printStackTrace(); }
	}
	
	/*
	 * Save the contents of editorArea to a file in the file system
	 */
	private File saveAs(JTextArea source)
	{
		//user defines save file name and directory
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogType(JFileChooser.SAVE_DIALOG);
		int retVal = chooser.showSaveDialog(frame);
		File f = null;
		if(retVal == JFileChooser.APPROVE_OPTION)
			f = chooser.getSelectedFile();
		else
			return null;
		
		//editorArea contents into file
		try
		{
			BufferedWriter writer = new BufferedWriter(new FileWriter(f));
			writer.write(source.getText());
			writer.close();
		}
		catch (IOException ioe){ ioe.printStackTrace(); }
		
		return f;
	}
	
	//TODO remove debug
	private void sendInToOut()
	{
		outputArea.setText(outputArea.getText() + inputLine.getText() + "\n");
		inputLine.setText("");
	}
}
