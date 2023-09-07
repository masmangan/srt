package pucrs.poo.repositorios;

import pucrs.poo.entidades.Locomotiva;

import java.util.ArrayList;

public class GaragemLocomotivas {

    public static final int PESO_MAXIMO = 300;
    public static final int QTDADE_MAX_VAGOES = 100;
    private final ArrayList<Locomotiva> locomotivas;

    public Locomotiva getLocomotiva(int identificador) {
        return locomotivas.get(identificador - 1);
    }

    public GaragemLocomotivas() {
        locomotivas = new ArrayList<>();
    }

    public void estacionaLocomotiva(Locomotiva locomotiva) {
        if (locomotiva == null) {
            throw new IllegalArgumentException();
        }
        locomotiva.setComposicao(null);
    }

    public ArrayList<Locomotiva> getLocomotivasLivres() {
        ArrayList<Locomotiva> livres = new ArrayList<>();
        for (Locomotiva locomotiva : locomotivas) {
            if (locomotiva.getComposicao() == null) {
                livres.add(locomotiva);
            }
        }
        return livres;
    }

    public void preencheGaragem() {
        locomotivas.add(new Locomotiva(PESO_MAXIMO, QTDADE_MAX_VAGOES));
    }

}
