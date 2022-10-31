package lista2POO;

public class Elevador {
	int andarAtual = 0;
	int totalAndares;
	int capacidadeElevador;
	int quantPessoasPresentes;
	
	public void inicializar(int capacidadeElevador, int totalAndares) {
		setCapacidadeElevador(capacidadeElevador);
		setTotalAndares(totalAndares);
	}
	
	public void entrar() {
		if(getQuantPessoasPresentes() <= getCapacidadeElevador()) {
			setQuantPessoasPresentes(getQuantPessoasPresentes() + 1);
		} else {
			System.out.println("Não tem mais espaço");
		}
	}
	
	public void sair() {
		if(getQuantPessoasPresentes() > 0) {
			setQuantPessoasPresentes(getQuantPessoasPresentes() - 1);  
		}
	}
	
	public void subir() {
		if(getAndarAtual() <= getTotalAndares()) {
			setAndarAtual(getAndarAtual() + 1);
		} else {
			System.out.println("Você chegou no ultimo andar");
		}
	}
	
	public void descer() {
		if(getAndarAtual() > 0) {
			setAndarAtual(getAndarAtual() - 1);
		} else {
			System.out.println("Você não pode mais descer");
		}
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}
	
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	
	public int getTotalAndares() {
		return totalAndares;
	}
	
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}
	
	public int getCapacidadeElevador() {
		return capacidadeElevador;
	}
	
	public void setCapacidadeElevador(int capacidadeElevador) {
		this.capacidadeElevador = capacidadeElevador;
	}
	
	public int getQuantPessoasPresentes() {
		return quantPessoasPresentes;
	}
	
	public void setQuantPessoasPresentes(int quantPessoasPresentes) {
		this.quantPessoasPresentes = quantPessoasPresentes;
	}
}
