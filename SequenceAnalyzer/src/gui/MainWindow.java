package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
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
import javax.swing.text.BadLocationException;
import javax.swing.event.CaretEvent;

public class MainWindow {

	private JFrame frame;
	private JTextField inputLine;
	private JButton btnEnter;
	private JTextArea editorArea;
	private JLabel lblCursorposdisplay;
	private JTextArea outputArea;

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
		mnFile.add(mntmOpenBatch);
		
		JMenuItem mntmSaveResults = new JMenuItem("Save Results");
		mnFile.add(mntmSaveResults);
		
		JMenuItem mntmSaveResultsAs = new JMenuItem("Save Results As...");
		mnFile.add(mntmSaveResultsAs);
		
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
			@Override
			public void mouseClicked(MouseEvent arg0) {
				sendInToOut();
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
		editorArea.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				JTextArea area = (JTextArea)arg0.getSource();
				int dot = area.getCaretPosition();
				String label = "ERROR";
				try
				{
					label = "Line " + (area.getLineOfOffset(dot) + 1)
							+ " | Col " + (dot - area.getLineStartOffset(dot));
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
	
	private void sendInToOut()
	{
		outputArea.setText(outputArea.getText() + inputLine.getText() + "\n");
		inputLine.setText("");
	}
}
