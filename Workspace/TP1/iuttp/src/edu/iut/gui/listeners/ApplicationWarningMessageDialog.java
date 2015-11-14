package edu.iut.gui.listeners;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ApplicationWarningMessageDialog extends
		AbstractApplicationMessageDialog {

	protected void showMessage(String level, String message) {
		/** UTILISER l'AIDE FORUNIR DANS L'ENNONCE */
		JOptionPane jop2 ;  
		ImageIcon img = new ImageIcon("images/Warning.png");
		jop2 = new JOptionPane();
		jop2.showMessageDialog(null, "[WARNING]", "Attention", JOptionPane.WARNING_MESSAGE, img); 
	}

	protected void showMessage() {
		
	}

}
