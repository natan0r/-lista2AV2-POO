package lista2POO;

public class ControleRemoto {
	public static void main(String[] args) {
		Televisao tv = new Televisao();
		
		tv.aumentarVolume();
		
		tv.trocarCanal(22);
		
		tv.getInfo();
	}
}
