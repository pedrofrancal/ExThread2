package view;

import javax.swing.JOptionPane;

import controller.ThreadController;

public class Principal {

	public static void main(String[] args) {
		int[] temp = new int[3];
		int[] cod = new int[3];
		
		for(int i = 0; i<3; i++) {
			temp[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em celsius"));
			cod[i] = Integer.parseInt(JOptionPane.showInputDialog("1 - KELVIN\n2 - FAHRENHEIT\nOUTROS - CELSIUS"));
		}
		
		for(int i = 0; i<3; i++) {
			Thread tc = new ThreadController(cod[i], temp[i], i);
			tc.start();
		}
	}

}
