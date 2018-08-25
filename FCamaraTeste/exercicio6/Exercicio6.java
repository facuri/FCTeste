package exercicio6;

public class Exercicio6 {
	public double largura;
	public double comprimento;
	
	public void mudarValorDosLados(double l, double c){
		double b;
		String antesTroca, depoisTroca ;
		antesTroca = "";
		depoisTroca = "";
		
		System.out.println(antesTroca = "\nValores Normais" + "\nLargura: " + l + "\nComprimento: " + c);
		
		b = l;
		l = c;
		c = b;
		
		System.out.println(depoisTroca ="\nValores Trocados " +"\nLargura: " +l + "\nComprimento: " +c);
				            
	}
	public double getLargura(){
		return largura;
		
	}
	public double getComprimento(){
		return comprimento;
	}
	public double calculaArea(){
		double area = (largura * comprimento) /2;
		return area;
	}
	public double calcularPerimetro(){
		double peri = 2 * comprimento + 2 * largura;
		return peri;
	}

	 

}
