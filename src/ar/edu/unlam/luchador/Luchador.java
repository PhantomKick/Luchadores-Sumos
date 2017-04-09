package ar.edu.unlam.luchador;

public class Luchador {

	private Integer altura;
	private Integer peso;
	private Integer cantidadDominados = 0;
	
	public static void main(String[] args) {
	}

	public Luchador(Integer peso, Integer altura){
		this.peso = peso;
		this.altura = altura;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	public Integer getCantidadDominados() {
		return cantidadDominados;
	}

	public void setCantidadDominados(Integer domina) {
		this.cantidadDominados = domina;
	}
	
	public int domina(Luchador obj){
		if (this.peso > obj.peso) return 1;
		if (this.peso == obj.peso) return 0;
		return -1;
	}
	
}
