package pucrs.poo;

import java.util.Scanner;

public class FerroviaApp {

	private static FerroviaControlador ferroviaControlador;

	public static void main(java.lang.String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println( "Ferrovia!" );

		ferroviaControlador = new FerroviaControlador();
		ferroviaControlador.preencheGaragens();
		String line;
		int op;
		do {
			mostrarMenuPrincipal();
			line = in.nextLine();
			op = Integer.parseInt(line);
			switch (op) {
				case 1:
					criarComposicao();
			}
		} while (op != 9);
		in.close();
		System.out.println( "-*FIM*-" );
	}

	private static void criarComposicao() {

	}

	private static void mostrarMenuPrincipal() {
	}

}
