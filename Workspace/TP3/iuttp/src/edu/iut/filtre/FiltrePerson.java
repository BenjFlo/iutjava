package edu.iut.filtre;

import java.util.ArrayList;
import java.util.List;

import edu.iut.app.ExamEvent;

public class FiltrePerson implements Filtre {

	@Override
	public List<ExamEvent> meetExamEvent(List<ExamEvent> filtre) {
		List<ExamEvent> filtrePerson = new ArrayList<ExamEvent>(); 
		for (ExamEvent filtreP : filtre ) {
	         if(filtreP.getMaritalStatus().equalsIgnoreCase("PERSON")){
	            filtrePerson.add(filtreP);
	         }
	      }
		return filtrePerson;
	}

}
