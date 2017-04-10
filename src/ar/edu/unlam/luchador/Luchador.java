package ar.edu.unlam.luchador;

public class Luchador {

	private Integer altura;
	private Integer peso;
	private Integer cantidadDominados = 0;

	public static void main(String[] args) {
	}

	public Luchador(Integer peso, Integer altura) {
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

	/**
	 * Aumenta la cantidad de luchadores que domina el luchador. <br>
	 */
	public void aumentarCantidadDomina() {
		this.cantidadDominados++;
	}

	/**
	 * Indica si el luchador domina a otro luchador. <br>
	 * 
	 * @param luchador
	 * @return true si lo domina, false si no lo domina. <br>
	 */
	public Boolean domina(Luchador luchador) {
		if (this.peso >= luchador.peso && this.altura >= luchador.altura) {
			return true;
		}
		return false;
	}
}
