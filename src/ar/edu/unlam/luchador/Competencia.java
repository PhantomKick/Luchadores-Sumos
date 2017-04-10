package ar.edu.unlam.luchador;

public class Competencia {

	public static void main(String[] args) {

		Torneo torneo = new Torneo();
		String archivo = "ganador_x_peso";

		torneo.leerArchivo(archivo);
		torneo.compiten();
		torneo.guardarArchivo(archivo);
	}
}
