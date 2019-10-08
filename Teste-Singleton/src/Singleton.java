
public class Singleton {
	private static Singleton instance;
	public String messagem;
	private Singleton() {	
	}
		public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
	}	return instance;
	}
	public String getMessage() {
	return messagem;
	}
	public void setMessage(String messagem) {
		this.messagem = messagem;
	}
	public String toString() {
		return "Singleton {" + "mensagem = " + messagem + "}";
	}
}
}
