package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		 Scanner ent = new Scanner(System.in);
		 int horasTrabalhadas;
		 double salarioMinimo, salario, salarioBruto, horaTrabalhada, imposto;
		 System.out.print("Digite o n�mero de horas trabalhadas: ");
		 horasTrabalhadas = ent.nextInt();
		 System.out.print("Digite o valor do sal�rio m�nimo: ");
		 salarioMinimo = ent.nextDouble();
		 
		 horaTrabalhada = (salarioMinimo * 10) /100;
		 salarioBruto =  horasTrabalhadas * horaTrabalhada;
		 imposto = (salarioBruto * 3)/100;
		 salario = salarioBruto - imposto;
		 
		 System.out.println("O sal�rio final �: " + salario);
		 
		 //Horas trabalhadas = 8
		 //Sal�rio m�nimo = 1000
		 //Sal�rio final = 776.0
		 

	}

}
