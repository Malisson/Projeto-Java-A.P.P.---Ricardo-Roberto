
public class ControleNitendo {
	
	private ConectarNitendo Sensor;
	
	public void Conectar(ConectarNitendo sensor) {
		this.Sensor = sensor;
		Sensor.conectarNintendo();
	}
}
