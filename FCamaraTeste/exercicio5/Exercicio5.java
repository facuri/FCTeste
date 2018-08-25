package exercicio5;

public class Exercicio5 {
	public int numConta;
	private String nome;
	private float saldo;
	
	
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Exercicio5(){//Construtor
		this.setNumConta(123456789);
		this.setNome("Dalmo");
		this.setSaldo(0);
		
	}
	
	public void alterarNome(String nome){//setNome estiver vazio
		if (nome == null) throw new RuntimeException("Nome Invalido");
	      else this.nome = nome;
		
	}
	public void depositar(float v){
		this.setSaldo(this.getSaldo() + v);
		System.out.println("Depósito de: " + this.getSaldo() + 
		" realizado na conta de: " + this.getNome());
		 
	}
	public void sacar(float v){
		 if(this.getSaldo() >= v){
			 this.setSaldo(this.getSaldo() - v);
			 System.out.println("Saque de: " + v + " realizado na conta de: " + this.getNome());
		}else
			 System.out.println("Saldo insuficiente!");
		
	}
	public void visualizarConta(){
		System.out.println("---------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Correntista: " + this.getNome());
		System.out.println("Saldo: " + this.getSaldo());
		 
		}
	

}
