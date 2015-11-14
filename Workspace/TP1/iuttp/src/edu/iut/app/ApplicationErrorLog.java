package edu.iut.app;

public class ApplicationErrorLog extends AbstractApplicationLog {

	/* Ajouter un tableau ou profiter de l'héritage ? */
	public ApplicationErrorLog() {
		super();
	}
	
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[ERROR]", this.message);
	}

	public String getMessage() {
		return null;
	}

	public void addListener(IApplicationLogListener listener) {
		
	}

	public IApplicationLogListener[] getpplicationLogListeners() {
		return null;
	}


}
