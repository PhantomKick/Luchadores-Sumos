package ar.edu.unlam.luchador;

public class Luchador implements Comparable<Luchador> {

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

	public int compareTo(Luchador obj) {
		if ((this.peso >= obj.peso && this.altura >= obj.altura)) {
			return 1;
		}
		if ((this.peso > obj.peso && this.altura < obj.altura) || (this.peso < obj.peso && this.altura > obj.altura)) {
			return 0;
		}
		return -1;
	}

	/**
	 * Indica si el luchador domina a otro luchador. <br>
	 * 
	 * @param luchador
	 * @return true si lo domina, false si no lo domina. <br>
	 */
	public Boolean domina(Luchador luchador) {
		if (this.compareTo(luchador) > 0) {
			return true;
		}
		return false;
	}
}
