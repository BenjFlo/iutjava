package edu.iut.filtre;

import java.util.ArrayList;
import java.util.List;

import edu.iut.app.ExamEvent;

public class FiltreSalle implements Filtre {
	
	private int[] SalleTest = new int[100];
	int i =1 ;
	int j=0;
	@Override
	public List<ExamEvent> meetExamEvent(List<ExamEvent> filtre) {
		List<ExamEvent> filtreSalle = new ArrayList<ExamEvent>(); 
		for (ExamEvent filtre1 : filtre ) {
	         if(filtre1.getMaritalStatus().equalsIgnoreCase("SALLE")){
	            filtreSalle.add(filtre1);
	            //On récupére le num de salle.
	            SalleTest[j]=i;
	            j++;
	         }
	         i++;
	      }
		return filtreSalle;
	}

}
