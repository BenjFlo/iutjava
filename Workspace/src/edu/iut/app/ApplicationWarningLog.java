package edu.iut.app;

public class ApplicationWarningLog extends AbstractApplicationLog {

	/** Ajouter un tableau ou profiter de l'h�ritage ? */
	public ApplicationWarningLog() {
		super();
	}
	
	public void setMessage(String message) {
		this.message = message;
		super.fireMessage("[WARNING]", this.message);
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
