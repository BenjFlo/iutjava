package edu.iut.gui.frames;

import java.awt.CardLayout;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

import edu.iut.gui.widget.agenda.AgendaPanelFactory;
import edu.iut.gui.widget.agenda.ControlAgendaViewPanel;
import edu.iut.gui.widget.agenda.AgendaPanelFactory.ActiveView;


public class SchedulerFrame extends JFrame {
	JPanel contentPane;
	CardLayout layerLayout;
	AgendaPanelFactory agendaPanelFactory;	
	JPanel dayView;
	JPanel weekView;
	JPanel monthView;

	//Where the GUI is created:
	JMenuBar menuBar;
	JMenu menu, submenu;
	JMenuItem menuItem;
	JRadioButtonMenuItem rbMenuItem;
	JCheckBoxMenuItem cbMenuItem;
	private CardLayout agendaViewLayout;

	protected void setupUI() {

		contentPane = new JPanel();
		layerLayout = new CardLayout();
		contentPane.setLayout(layerLayout);
		ControlAgendaViewPanel agendaViewPanel = new ControlAgendaViewPanel(layerLayout,contentPane);
		agendaPanelFactory = new AgendaPanelFactory();
		dayView = agendaPanelFactory.getAgendaView(ActiveView.DAY_VIEW);
		weekView = agendaPanelFactory.getAgendaView(ActiveView.WEEK_VIEW);
		monthView = agendaPanelFactory.getAgendaView(ActiveView.MONTH_VIEW);

		contentPane.add(dayView,ActiveView.DAY_VIEW.name());
		contentPane.add(weekView,ActiveView.WEEK_VIEW.name());
		contentPane.add(monthView,ActiveView.MONTH_VIEW.name());

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,agendaViewPanel, contentPane);
		this.setContentPane(splitPane);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu;	
		JMenu menuE;		
		JMenu menuH;		
		JMenuItem menuItem;

		/* File Menu */
		/** EX4 : MENU : UTILISER L'AIDE FOURNIE DANS LE TP**/
		
		JFrame frame = new JFrame("Information");

		//Create the menu bar.
		menuBar = new JMenuBar();

		//File
		menu = new JMenu("File");


		//Build the first menu.
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
		menuBar.add(menu);

		//Items de File
		menuItem = new JMenuItem("Load",KeyEvent.VK_T);
		menuItem.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Cette rubrique n'est pas encore implementée","Information",1);
			}
		});
		menu.add(menuItem);
		menuItem = new JMenuItem("Save",KeyEvent.VK_T);
		menuItem.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Cette rubrique n'est pas encore implementée","Information",1);
			}
		});
		menu.add(menuItem);
		menuItem = new JMenuItem("Quit",KeyEvent.VK_T);
		menuItem.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Cette rubrique n'est pas encore implementée","Information",1);
			}
		});
		menu.add(menuItem);



		//Edit
		menuE = new JMenu("Edit");
		menuE.setMnemonic(KeyEvent.VK_N);
		menuE.getAccessibleContext().setAccessibleDescription("Edit menu");
		menuBar.add(menuE);
		//Ses items
		menuE.addSeparator();
		submenu = new JMenu("View");
		this.agendaViewLayout = layerLayout;
		this.contentPane = contentPane;
		//agendaViewLayout.next(contentPane);	
		submenu.setMnemonic(KeyEvent.VK_S);
		//Month
		menuItem = new JMenuItem("Month");
		menuItem.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				agendaViewLayout.show(contentPane,"MONTH_VIEW");	
			}
		});
		submenu.add(menuItem);
		//Week
		menuItem = new JMenuItem("Week");
		menuItem.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				agendaViewLayout.show(contentPane,"WEEK_VIEW");	
			}
		});
		submenu.add(menuItem);
		//Day
		menuItem = new JMenuItem("Day");
		menuItem.addActionListener(new ActionListener (){
			@Override
			public void actionPerformed(ActionEvent e) {
				agendaViewLayout.show(contentPane,"DAY_VIEW");	
			}
		});
		submenu.add(menuItem);

		menuE.add(submenu);

		//Help
		menuH = new JMenu("Help");
		menuH.setMnemonic(KeyEvent.VK_N);
		menuH.getAccessibleContext().setAccessibleDescription("This menu does nothing");
		menuBar.add(menuH);
		//Items de Help
				menuItem = new JMenuItem("Display",KeyEvent.VK_T);
				menuItem.addActionListener(new ActionListener (){
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frame,"Cette rubrique n'est pas encore implementée","Information",1);
					}
				});
				menuH.add(menuItem);
				menuItem = new JMenuItem("About",KeyEvent.VK_T);
				menuItem.addActionListener(new ActionListener (){
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(frame,"Cette rubrique n'est pas encore implementée","Information",1);
					}
				});
				menuH.add(menuItem);
		/*
		//a group of radio button menu items
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		rbMenuItem = new JRadioButtonMenuItem("A radio button menu item");
		rbMenuItem.setSelected(true);
		rbMenuItem.setMnemonic(KeyEvent.VK_R);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);

		rbMenuItem = new JRadioButtonMenuItem("Another one");
		rbMenuItem.setMnemonic(KeyEvent.VK_O);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);

		//a group of check box menu items
		menu.addSeparator();
		cbMenuItem = new JCheckBoxMenuItem("A check box menu item");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbMenuItem);

		cbMenuItem = new JCheckBoxMenuItem("Another one");
		cbMenuItem.setMnemonic(KeyEvent.VK_H);
		menu.add(cbMenuItem);

		//a submenu
		menu.addSeparator();
		submenu = new JMenu("A submenu");
		submenu.setMnemonic(KeyEvent.VK_S);

		menuItem = new JMenuItem("An item in the submenu");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_2, ActionEvent.ALT_MASK));
		submenu.add(menuItem);

		menuItem = new JMenuItem("Another item");
		submenu.add(menuItem);
		menu.add(submenu);
		 */

		this.setJMenuBar(menuBar);
		this.pack();
		layerLayout.next(contentPane);
	}

	public SchedulerFrame() {
		super();

		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		contentPane = null;
		dayView = null;
		weekView = null;
		monthView = null;
		agendaPanelFactory = null;
		setupUI();

	}
	public SchedulerFrame(String title) {
		super(title);
		addWindowListener (new WindowAdapter(){
			public void windowClosing (WindowEvent e){
				System.exit(0);
			}
		});
		setupUI();
	}

}
