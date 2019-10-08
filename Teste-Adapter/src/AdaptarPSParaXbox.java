
public class AdaptarPSParaXbox {
	private ConectarXbox adaptee;
	
	public AdaptarPSParaXbox(ConectarXbox adaptee) {
		this.adaptee = adaptee;
	}
	
	public void conectarPS5() {
		adaptee.conectarXbox2();
        System.out.println("But stadia wins!");
	}

}
