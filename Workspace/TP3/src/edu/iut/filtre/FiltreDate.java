package edu.iut.filtre;

import java.util.ArrayList;
import java.util.List;

import edu.iut.app.ExamEvent;

public class FiltreDate implements Filtre {

	@Override
	public List<ExamEvent> meetExamEvent(List<ExamEvent> filtre) {
		List<ExamEvent> filtreDate = new ArrayList<ExamEvent>(); 
		for (ExamEvent filtreD : filtre ) {
	         if(filtreD.getMaritalStatus().equalsIgnoreCase("DATE")){
	            filtreDate.add(filtreD);
	         }
	      }
		return filtreDate;
	}

}
