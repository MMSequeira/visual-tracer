
public class Cozinheiro extends Thread {

	private Mesa mesa;
	private int id_cozinheiro;
	
	public Cozinheiro(Mesa mesa, int id)
	{
		this.mesa = mesa;
		id_cozinheiro = id;
	}
	
	public void run()
	{
		for (int i = 0; i < 10; i++) {
			try {
				mesa.poe();
//				System.out.println("eu coloquei o "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public String toString()
	{
		return "Cozinheiro"+id_cozinheiro;
	}
}
