package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String args[]){
		Scanner ent = new Scanner(System.in);
		int numFinal, numInicial;
		boolean primo;
		
		System.out.print("Digite o n�mero inicial: ");
		numInicial = ent.nextInt();
		System.out.print("Digite o n�mero final: ");
		numFinal = ent.nextInt();

        System.out.print("N�meros Primos entre " + numInicial + " e " + numFinal + " s�o: ");
		for(int i = numInicial; i <= numFinal; i++) {
               primo = true;
            for (int j = 2; j <= i; j++) {
                if (((i % j) == 0) && (j != i)) {
                    primo = false;
                    break;
                }
            }

            if(primo)
                System.out.print( i + " ");
              
            }
        }

	}
 
