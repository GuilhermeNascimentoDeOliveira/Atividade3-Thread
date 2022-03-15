package view;
import java.util.Random;

import javax.swing.JOptionPane;

import controller.ati3;

public class ex3 {

	public static void main(String[] args) {
		int opc = 1;
		Random random = new Random();
		
		int [] vetor  = new int [1000];
		
		for (int i = 0; i < 1000; i++) {
				int numero = random.nextInt(100);	
				vetor[i] = numero;
			}	
		
		while (opc != 0) {
			int aux = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
			if(aux == 0) {
				JOptionPane.showMessageDialog(null, "Programa Finalizado !!");
				opc = 0;
			} else {
				ati3 m1 = new ati3(vetor, aux);
				m1.start();
			}
			
				
		
		}

	}

}
