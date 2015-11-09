package edu.iut.gui.listeners;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ApplicationErrorMessageDialog extends
		AbstractApplicationMessageDialog {

	protected void showMessage(String level, String message) {
		/** UTILISER l'AIDE FORUNIR DANS L'ENNONCE */
		JOptionPane jop3 ;      
	    jop3 = new JOptionPane();
	    ImageIcon img = new ImageIcon("images/erreur.gif");
	    jop3.showMessageDialog(null, "[ERROR]", "Erreur", JOptionPane.ERROR_MESSAGE, img);
		
	}

	protected void showMessage() {
		
	}

}
