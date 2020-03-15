package factory;

public class JuiceFactory {
	
	public Juice getJuice(String juiceType) {
		
		if(juiceType==null) {
			return null;
		}
		if(juiceType.equalsIgnoreCase("lemon")) {
			return new LemonMent();
		}else if(juiceType.equalsIgnoreCase("Mango")) {
			return new MangoJuice();
		}else if(juiceType.equalsIgnoreCase("LASSI")) {
			return new Lassi();
		}
		return null;
	}
}
