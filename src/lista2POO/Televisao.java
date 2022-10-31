package lista2POO;

import java.util.Arrays;
import java.util.List;

public class Televisao {
	int volume = 10; // volume de fabrica
	int canal = 10; // canal de fabrica
	List<Integer> canalList = Arrays.asList(2, 5, 8, 10, 12, 14, 17, 20, 22);
	
	public void aumentarVolume() {
		if(getVolume() <= 99) {
			setVolume(getVolume() + 1);
		}
	}
	
	public void diminuirVolume() {
		if(getVolume() > 0) {	
			setVolume(getVolume() - 1);
		}
	}
	
	public void aumentarCanal() {
		int index = canalList.indexOf(getCanal());
		setCanal(canalList.get(index + 1));
	}
	
	public void diminuirCanal() {
		int index = canalList.indexOf(getCanal());
		setCanal(canalList.get(index - 1));
	}
	
	public void trocarCanal(int canal) {
		setCanal(canal);
	}
	
	public void getInfo() {
		System.out.println("Canal: " + getCanal());
		System.out.println("Volume: " + getVolume());
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
}
