package exercicio6;

import java.util.Scanner;

public class TestaExercicio6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String saida = "";
		double calcPisos;
		
	    Exercicio6 ex = new Exercicio6();
	    
	    System.out.print("Digite a largura do ret�ngulo: ");
	    ex.largura = ent.nextDouble();
	    System.out.print("Digite o comprimento do ret�ngulo: ");
	    ex.comprimento = ent.nextDouble();
	    
	    calcPisos = ex.largura * ex.comprimento;
	    
		 saida = "\nA figura � um ret�ngulo de:  " + "\n" + ex.getComprimento() + 
				 " de comprimento " +"\n" +
		         ex.getLargura() + " de largura" +
				 " \n�rea: " + ex.calculaArea() + 
				 "\nPer�metro: " + ex.calcularPerimetro();
		
		 System.out.println(saida);
		 ex.mudarValorDosLados(10, 5);
		 System.out.println("A quantidade de pisos: " + calcPisos);
		 
		
	 
		

	}

}
