package pucrs.poo.repositorios;

import pucrs.poo.entidades.Composicao;
import pucrs.poo.entidades.Locomotiva;
import pucrs.poo.entidades.LocomotivaEmOutraComposicaoException;

import java.util.ArrayList;

public class PatioComposicoes {

	private final ArrayList<Composicao> composicoes;

	public PatioComposicoes() {
		composicoes = new ArrayList<>();
	}

	public Composicao getComposicao(int identificador) {
		for (Composicao composicao: composicoes) {
			if (composicao.getIdentificador() == identificador) {
				return composicao;
			}
		}
		throw new IdentificadorNaoEncontradoExceptioin();
	}

	public ArrayList<Composicao> getComposicoes() {
		return composicoes;
	}

	public void desfazComposicao(Composicao composicao) {
		while (composicao.getQtdadeVagoes() >0) {
			composicao.desengataUltimoElemento();
		}
		while (composicao.getQtdadeLocomotivas() >0) {
			composicao.desengataUltimoElemento();
		}
		composicoes.remove(composicao);
	}

	public void criaComposicao(Locomotiva locomotiva) {
		if (locomotiva.getComposicao() != null) {
			throw new LocomotivaEmOutraComposicaoException();
		}
		Composicao composicao = new Composicao(locomotiva);
		composicoes.add(composicao);
	}

}
