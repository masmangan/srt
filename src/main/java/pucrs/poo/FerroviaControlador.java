package pucrs.poo;

import pucrs.poo.repositorios.PatioComposicoes;
import pucrs.poo.repositorios.GaragemLocomotivas;
import pucrs.poo.repositorios.GaragemVagoes;
import pucrs.poo.entidades.Locomotiva;
import pucrs.poo.entidades.Composicao;
import pucrs.poo.entidades.Vagao;

import java.util.ArrayList;

public class FerroviaControlador {

	private PatioComposicoes patioComposicoes;

	private GaragemLocomotivas garagemLocomotivas;

	private GaragemVagoes garagemVagoes;

	public FerroviaControlador() {
		patioComposicoes = new PatioComposicoes();
		garagemLocomotivas = new GaragemLocomotivas();
		garagemVagoes = new GaragemVagoes();
	}

	public void preencheGaragens() {
		garagemLocomotivas.preencheGaragem();
		garagemVagoes.preencheGaragem();
	}

	public void criaComposicao(Locomotiva locomotiva) {

	}

	public void engataLocomotiva(Composicao composicao, Locomotiva locomotiva) {

	}

	public void engataVagao(Composicao composicao, Vagao vagao) {

	}

	public void desengataUltimoElemento(Composicao composicao) {

	}

	public ArrayList<Locomotiva> listaLocomotivasLivres() {
		return null;
	}

	public ArrayList<Vagao> listaVagoesLivres() {
		return null;
	}

	public ArrayList<Composicao> listaComposicoes() {
		return null;
	}

	public void desfazComposicao(Composicao composicao) {

	}

}
