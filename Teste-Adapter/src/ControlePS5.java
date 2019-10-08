
public class ControlePS5 {
	
	private AdaptarPSParaXbox Sensor;
	
	public void Conectar1(AdaptarPSParaXbox adapter) {
		this.Sensor = adapter;
		Sensor.conectarPS5();
	}

	public void Conectar(AdaptarPSParaXbox adapter) {
		
	}
}
