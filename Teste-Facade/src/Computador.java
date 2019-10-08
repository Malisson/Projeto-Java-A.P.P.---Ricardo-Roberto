
public class Computador {
	private WebCam WebCam;
	private CPU CPU;
	private Impressora Impressora;
	private HD HD;
	private Memoria Memoria;
	public Computador() {
		this.CPU = new CPU();
		this.HD = new HD();
		this.Memoria = new Memoria();
		
		this.WebCam = new WebCam();
		this.Impressora = new Impressora();
	}
	
	public void startComputador() {
		CPU.Freeze();
		Memoria.IniciarMemoria(12, HD.LerHD(13, 3));
		CPU.Salto(12);
		CPU.Execultar();
		WebCam.LigandoCamera();
		Impressora.Imprimindo();
	}
}
