
public class Glutão extends Thread{

	private Mesa mesa;
	private int id_glutao;
	
	public Glutão(Mesa mesa, int id)
	{
		this.mesa = mesa;
		id_glutao = id;
	}
	
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			try {
				mesa.tira();
//				System.out.println("eu tirei o "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String toString()
	{
		return "Glutão"+id_glutao;
	}
}
