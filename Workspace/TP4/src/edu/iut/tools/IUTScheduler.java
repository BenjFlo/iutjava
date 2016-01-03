package edu.iut.tools;

import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Locale;

import edu.iut.app.*;
import edu.iut.io.XMLProjectWriter;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class IUTScheduler {
	public static void main(String[] args) {
		Locale.setDefault(Locale.FRANCE);
		
		
		
		CommandLineParser commandLineParser = new CommandLineParser();
		CommandLineOption<java.io.File> configOption = new CommandLineOption<java.io.File>(CommandLineOption.OptionType.FILE, 
				                                                                           "config","configuration file",
				                                                                           new java.io.File("/tmp"));
		CommandLineOption<String> localeOption = new CommandLineOption<String>(CommandLineOption.OptionType.STRING, 
																			   "locale","en|fr",
																			   new String("fr"));

		CommandLineOption<java.io.File> projectOption = new CommandLineOption<java.io.File>(CommandLineOption.OptionType.FILE, 
				   																			"project file","xml project file",
				   																		    new java.io.File("/tmp"));
		
		commandLineParser.addOption(configOption);
		commandLineParser.addOption(localeOption);
		commandLineParser.addOption(projectOption);
		
		
		commandLineParser.parse(args);
		
		
		
		System.err.println("Option:"+commandLineParser.getOption("config").getValue());
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		        JFrame mainFrame = new edu.iut.gui.frames.SchedulerFrame("IUT Scheduler");
		        mainFrame.setVisible(true);		        
		    }
		});
		
		Agenda a = new Agenda() ;
		ArrayList<Document> document= new ArrayList();
		ArrayList<Person> jury1 = new ArrayList();
		Date d = new Date(10,12,2015);
		Classroom cr = new Classroom() ;
		Person p = new Person();
		ExamEvent e1 = new ExamEvent(d,p,jury1,cr,document);
		
		a.addCheckedEvent(e1);
		
		XMLProjectWriter xml = new XMLProjectWriter() ;
		File xmlfile = new File("save.xml");
		xml.save(a,xmlfile);	
		
	}
	
}
