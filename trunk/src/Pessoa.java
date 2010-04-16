


public class Pessoa {

	private String primeiroNome;
	private String ultimoNome;
	private int idade;
	private Pessoa pai;
	private Mesa mesa = new Mesa();
	
	private static int numeroPessoa = 0;
	
	
	
	public Pessoa(String primeiroNome, String ultimoNome, int idade, Pessoa pai)
	{ 		
		this.setPrimeiroNome(primeiroNome);
		this.setUltimoNome(ultimoNome);		
		this.setPai(pai);
		this.setIdade(idade);
	}

	

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	public String getPrimeiroNome() {
		return primeiroNome;
	}


	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}


	public String getUltimoNome() {
		return ultimoNome;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getIdade() {
		return idade;
	}


	public void setPai(Pessoa pai) {
		this.pai = pai;
	}


	public Pessoa getPai() {
		return pai;
	}	
}
