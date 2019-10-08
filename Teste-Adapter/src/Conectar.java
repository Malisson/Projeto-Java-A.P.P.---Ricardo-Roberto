
public class Conectar {
	

	public static void main(String[] args) {
		
		ConectarXbox adaptee = new ConectarXbox();
		ControlePS5 target = new ControlePS5();
		AdaptarPSParaXbox adapter = new AdaptarPSParaXbox(adaptee);

		
		ConctarPS5 adaptee1 = new ConctarPS5();
		ConectarNitendo target1 = new ConectarNitendo();
		AdaptarNitendoParaPS5 adapter1 = new AdaptarNitendoParaPS5();
		
		target.Conectar(adapter);
		
		target1.Conectar(adapter1);
	}

}
