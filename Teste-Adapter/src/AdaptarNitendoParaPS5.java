
public class AdaptarNitendoParaPS5 {
	
	ConctarPS5 adapt = new ConctarPS5();
	
	public void AdaptarNintendoParaPS5(ConctarPS5 adapt) {
		this.adapt = adapt;
	}
	
	public void conectarNintendo64() {
		adapt.conectarPS5();
		System.out.println("Dale Mario.");
	}

}
