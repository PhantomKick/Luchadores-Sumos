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
		}
		catch (FileNotFoundException e) {
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
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private int compara(int valor1, int valor2) {

		if (valor1 > valor2) return 1;
		if (valor1 == valor2) return 0;
		return -1;
	}

	public void compiten() {
		int peso = 0;
		int altura = 0;

		for (int i = 0; i < this.luchadores.length; i++) {
			for (int j = 0; j < this.luchadores.length; j++) {
				peso = compara(this.luchadores[i].getPeso(), this.luchadores[j].getPeso());
				altura = compara(this.luchadores[i].getAltura(), this.luchadores[j].getAltura());

				if (peso + altura > 0)
					this.luchadores[i].setCantidadDominados(this.luchadores[i].getCantidadDominados() + 1);
			}
		}

	}
}
