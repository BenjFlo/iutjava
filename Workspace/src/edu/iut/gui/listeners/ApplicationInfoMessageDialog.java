package edu.iut.gui.listeners;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ApplicationInfoMessageDialog extends
		AbstractApplicationMessageDialog {

	protected void showMessage(String level, String message) {
		/** UTILISER l'AIDE FORUNIR DANS L'ENNONCE */
		JOptionPane jop1 ;      
	    jop1 = new JOptionPane();
	    ImageIcon img = new ImageIcon("images/information.png");
	    jop1.showMessageDialog(null,message, "[INFO]", JOptionPane.INFORMATION_MESSAGE, img);
	}

	protected void showMessage() {
	
	}
}
