package ar.edu.unlam.luchador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Torneo {

	private Luchador[] luchadores;

	private String pathIn = "C:\\Users\\Damian\\workspace\\Luchadoresjapones\\in\\";
	private String pathOut = "C:\\Users\\Damian\\workspace\\Luchadoresjapones\\out\\";

	public Luchador[] getLuchadores() {
		return luchadores;
	}

	public void setLuchadores(Luchador[] luchadores) {
		this.luchadores = luchadores;
	}

	public void leerArchivo(String archivo) {

		Scanner sc;
		try {
			sc = new Scanner(new File(this.pathIn + archivo + ".in"));
			luchadores = new Luchador[sc.nextInt()];

			for (int i = 0; i < luchadores.length; i++) {
				int peso = sc.nextInt();
				int altura = sc.nextInt();
				this.luchadores[i] = new Luchador(peso, altura);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void guardarArchivo(String archivo) {

		PrintWriter salida;
		try {
			salida = new PrintWriter(new FileWriter(pathOut + archivo + ".out"));

			for (int j = 0; j < this.luchadores.length; j++) {
				salida.println(this.luchadores[j].getCantidadDominados());
			}

			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void compiten() {
		for (int i = 0; i < this.luchadores.length; i++) {
			for (int j = 0; j < this.luchadores.length; j++) {
				if (this.luchadores[i].domina(luchadores[j]))
					this.luchadores[i].setCantidadDominados(this.luchadores[i].getCantidadDominados() + 1);
			}
		}
	}
}
