package edu.iut.app;

import java.util.ArrayList;


public class ApplicationLogs extends ArrayList<IApplicationLog> {

	public ApplicationLogs() {		
	}
	
	public ArrayList<IApplicationLog> getErrors() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		for (IApplicationLog e : this) {
			if (e instanceof ApplicationWarningLog) {
				filteredLogs.add(e);
			}
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getWarnings() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		for (IApplicationLog w : this) {
			if (w instanceof ApplicationWarningLog) {
				filteredLogs.add(w);
			}
		}
		return filteredLogs;
	}
	public ArrayList<IApplicationLog> getInfos() {
		ArrayList<IApplicationLog> filteredLogs = new ArrayList<IApplicationLog>();
		// une boucle à faire ici, penser à utiliser instanceof
		for (IApplicationLog i : this) {
			if (i instanceof ApplicationWarningLog) {
				filteredLogs.add(i);
			}
		}
		return filteredLogs;
	}
	

}
