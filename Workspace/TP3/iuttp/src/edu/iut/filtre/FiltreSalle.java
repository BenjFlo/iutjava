package edu.iut.filtre;

import java.util.ArrayList;
import java.util.List;

import edu.iut.app.ExamEvent;

public class FiltreSalle implements Filtre {

	@Override
	public List<ExamEvent> meetExamEvent(List<ExamEvent> filtre) {
		List<ExamEvent> filtreSalle = new ArrayList<ExamEvent>(); 
		for (ExamEvent filtre1 : filtre ) {
	         if(filtre1.getMaritalStatus().equalsIgnoreCase("SALLE")){
	            filtreSalle.add(filtre1);
	         }
	      }
		return filtreSalle;
	}

}
