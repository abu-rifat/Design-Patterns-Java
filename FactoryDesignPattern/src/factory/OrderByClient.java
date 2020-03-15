package factory;

public class OrderByClient {
	public static void main(String[] arg) {
		JuiceFactory juiceFactory=new JuiceFactory();
		
		Juice juice1=juiceFactory.getJuice("LEMON");
		juice1.banao();
		
		Juice juice2=juiceFactory.getJuice("LASSI");
		juice2.banao();
		
		Juice juice3=juiceFactory.getJuice("MANGO");
		juice3.banao();
		
		
	}
}
