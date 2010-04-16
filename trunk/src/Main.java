


public class Main {
		
	enum Test
	{
		SingleThread, // - Test single thread execution
		MultiThread   // - Test multi thread execution
	}
	
	public static void main(String[] args) throws InterruptedException
	{				
		//choose here the test
		Test testOption = Test.MultiThread;
		
		if(testOption.equals(Test.SingleThread))
		{
			Pessoa pai = new Pessoa("Utilizador Pai", "Xpto Pai", 50, null);		
			Pessoa pessoa = new Pessoa("Utilizador", "Xpto", 21, pai);
			pessoa.setIdade(22);
			pai.setIdade(100);	
		}
		else if(testOption.equals(Test.MultiThread))
		{
			Mesa mesa = new Mesa();
			Cozinheiro poe =   new Cozinheiro(mesa,1);
			Glutão tira = new Glutão(mesa,1);
			poe.start();
			tira.start();
			
			new Cozinheiro(mesa,2).start();
			new Cozinheiro(mesa,3).start();
			new Glutão(mesa,2).start();
			new Glutão(mesa,3).start();
		}
	}
}
