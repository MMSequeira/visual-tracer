
public class Mesa {

	public int numeroElementos = 0;
	public static int numeroMaximo = 3;
	
	public synchronized void poe() throws InterruptedException
	{
		while(numeroElementos==numeroMaximo)
		{
			System.out.println(Thread.currentThread().toString()+": Vou dormir");
			wait();
			System.out.println(Thread.currentThread().toString()+": Acordei");
		}
		
		System.out.println(Thread.currentThread().toString() + ": meti o javali");
		numeroElementos++;
		notifyAll();
	}
	
	public synchronized void tira() throws InterruptedException
	{
		while(numeroElementos==0)
		{
			System.out.println(Thread.currentThread().toString()+": Vou dormir");
			wait();
			System.out.println(Thread.currentThread().toString()+": Acordei");
		}
			
		System.out.println(Thread.currentThread().toString() + ": comi um javali");
		numeroElementos--;
		notifyAll();
	}
}
