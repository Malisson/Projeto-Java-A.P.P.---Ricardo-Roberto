
public class Main {
	
		public static void main(String[] args) {
		Singleton S = Singleton.getInstance();
		S.setMessage("Testando o Padrão Singletoon.");
		
		Singleton SS = Singleton.getInstance();
		if(S == SS) {
			System.out.println("Ambos são iguais");
			System.out.println(S);
			System.out.println(SS);
		}
	}
}
