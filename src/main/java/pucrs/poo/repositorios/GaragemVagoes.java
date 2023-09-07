package pucrs.poo.repositorios;

import pucrs.poo.entidades.Locomotiva;
import pucrs.poo.entidades.Vagao;

import java.util.ArrayList;

public class GaragemVagoes {

	public static final int CAPACIDADE_CARGA = 2;
	private ArrayList<Vagao> vagoes;

	public Vagao getVagao(int identificador) {
		return vagoes.get(identificador-1);
	}

	public GaragemVagoes() {
		vagoes = new ArrayList<>();
	}

	public void estacionaVagao(Vagao vagao) {
		if (vagao == null) {
			throw new IllegalArgumentException();
		}
		vagao.setComposicao(null);
	}

	public java.util.ArrayList<Vagao> getVagoesLivres() {
		ArrayList<Vagao> livres = new ArrayList<>();
		for (Vagao vagao : vagoes) {
			if (vagao.getComposicao() == null) {
				livres.add(vagao);
			}
		}
		return livres;
	}

	public void preencheGaragem() {
		vagoes.add(new Vagao(CAPACIDADE_CARGA));
	}

}
