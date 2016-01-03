package edu.iut.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import edu.iut.app.ExamEvent;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

// EX 1 Completer la classe

public class XMLProjectReader {
	protected Document document;

	Element root = document.createElement("agenda");			
	Comment comment = document.createComment("Agenda backup");

	public XMLProjectReader() {

	}

	public ArrayList<ExamEvent> load(java.io.File xmlfile) throws IOException {
		ArrayList<ExamEvent> data = new ArrayList<ExamEvent>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();   
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			// EX1: Lire un Document XML
			Document document= builder.parse(new File("/save.xml"));
			Element root = document.getDocumentElement();
			NodeList rootChildren = root.getElementsByTagName("event"); 
			for (int ci = 0;ci<rootChildren.getLength();ci++) {
				if (rootChildren.item(ci).getNodeType() == Node.ELEMENT_NODE) { 
					Node child = (Element)rootChildren.item(ci);
					if (child.hasAttributes()) {
						NamedNodeMap attributes = child.getAttributes(); 
						for (int att_i = 0;att_i<attributes.getLength();att_i++) {
							Attr attribute = (Attr)attributes.item(att_i); }
					}
					NodeList titles = ((Element)child).getElementsByTagName("title");
					NodeList rooms = ((Element)child).getElementsByTagName("room"); 
					for (int si = 0;si<titles.getLength();si++) {
						Node subNode = titles.item(si);
						Element titleElement = (Element)subNode; 
					}
				}
			}
		} catch (ParserConfigurationException e) {
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;

	}
}
