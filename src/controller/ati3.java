package controller;


public class ati3 extends Thread{
	private int[] vetor;
	private int aux;
	
	public ati3(int[] vetor, int aux) {
		this.vetor = vetor;
		this.aux = aux;
		
	}
	
	@Override
	public void run() {
		int res = aux % 2;
		
		if (res == 0) {
			double inicio = System.nanoTime();
			for(int i = 0; i < vetor.length; i++) {
				System.out.println(vetor[i]);
			}
			double fim = System.nanoTime();
			double tempoPercorrido = (fim - inicio)  / (10^9);
			System.out.println("Tempo: " + tempoPercorrido);
			
		} else {
			double inicio = System.nanoTime();
			for(int i : vetor ) {
				 System.out.println(i);
			}
			double fim = System.nanoTime();
			double tempoPercorrido = (fim - inicio)  / (10^9);
			System.out.println("Tempo: " + tempoPercorrido);
		}
		
	}
	
}
