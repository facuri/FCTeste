package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
		 Scanner ent = new Scanner(System.in);
		 float tamanho, litros, preco;
		 int latas;
		 System.out.print("Digite o tamanho da área a ser pintada: ");
		 tamanho = ent.nextFloat();
		 
		 litros = tamanho / 3;
		 if(tamanho % 54 == 0)
			latas = (int)tamanho / 54;
		 else 
			latas = (int)(tamanho / 54) + 1;
		 
		 preco = latas * 80;
		 
		 System.out.println("Latas: " + latas +
                             "\nPreço: " + preco);
				 
		 }

}
