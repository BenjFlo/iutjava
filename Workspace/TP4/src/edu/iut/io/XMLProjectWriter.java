package edu.iut.io;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import edu.iut.app.*;

//EX 1 Completer la classe 

public class XMLProjectWriter {
	
	public XMLProjectWriter() {	
	}
	
	public void save(Agenda data, java.io.File xmlfile) {
		try {
			
			final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			Element root = document.createElement("agenda");			
			Comment comment = document.createComment("Agenda backup");
			int a=1;
			for (ExamEvent w : data) {
				Element event = document.createElement("event");
				ExamEvent e = new ExamEvent() ;
				event.setAttribute("date", ""+e.getDate());
				event.setAttribute("person", ""+e.getStudent());
				event.setAttribute("classroom",""+e.getClassroom());
				int j = 1 ;
				for (Person i : e.getJury()){
					event.setAttribute("personne"+j, ""+i);
					j++ ;
				}
				int x=1 ;
				for (edu.iut.app.Document document1 : e.getDocuments()){
					event.setAttribute("document"+x, ""+document1);
					x++ ;
				}
				Element eventTitle = document.createElement("title");
				eventTitle.appendChild(document.createTextNode("Examen " + a));
				Element eventRoom = document.createElement("classroom");
				eventRoom.setAttribute("number", "i107");
				event.appendChild(eventTitle);
				event.appendChild(eventRoom);
				root.appendChild(event);
				a++ ;
			}
			document.appendChild(root);
			document.setXmlStandalone(true);
			document.setXmlVersion("1.0");
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
		    Transformer transformer = transformerFactory.newTransformer();
		    DOMSource source = new DOMSource(document);
		    StreamResult output = new StreamResult(new File(System.getProperty("user.home")+"/save.xml"));
			    
		    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		    transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
				
		    transformer.transform(source, output);	
		} catch(Exception e2) {

		}
	}
}
