package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		 Scanner ent = new Scanner(System.in);
		 int horasTrabalhadas;
		 double salarioMinimo, salario, salarioBruto, horaTrabalhada, imposto;
		 System.out.print("Digite o número de horas trabalhadas: ");
		 horasTrabalhadas = ent.nextInt();
		 System.out.print("Digite o valor do salário mínimo: ");
		 salarioMinimo = ent.nextDouble();
		 
		 horaTrabalhada = (salarioMinimo * 10) /100;
		 salarioBruto =  horasTrabalhadas * horaTrabalhada;
		 imposto = (salarioBruto * 3)/100;
		 salario = salarioBruto - imposto;
		 
		 System.out.println("O salário final é: " + salario);
		 
		 //Horas trabalhadas = 8
		 //Salário mínimo = 1000
		 //Salário final = 776.0
		 

	}

}
