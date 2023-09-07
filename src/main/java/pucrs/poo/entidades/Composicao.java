package pucrs.poo.entidades;

import java.util.ArrayList;

/**
 * @author marco.mangan@pucrs.br
 */
public class Composicao {

    /**
     *
     */
    private static int NEXT_ID = 1;

    /**
     *
     */
    private final int identificador;

    /**
     *
     */
    private final ArrayList<Vagao> vagoes;

    /**
     *
     */
    private final ArrayList<Locomotiva> locomotivas;

    /**
     *
     * @param locomotiva
     */
    public Composicao(Locomotiva locomotiva) {
        if (locomotiva == null) {
            throw new IllegalArgumentException();
        }
        identificador = NEXT_ID++;
        vagoes = new ArrayList<>();
        locomotivas = new ArrayList<>();
        locomotivas.add(locomotiva);
    }

    /**
     *
     * @return
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     *
     * @return
     */
    public int getQtdadeLocomotivas() {
        return locomotivas.size();
    }

    /**
     *
     * @param posicao
     * @return
     */
    public Locomotiva getLocomotiva(int posicao) {
        return locomotivas.get(posicao);
    }

    /**
     *
     * @return
     */
    public int getQtdadeVagoes() {
        return vagoes.size();
    }

    /**
     *
     * @param posicao
     * @return
     */
    public Vagao getVagao(int posicao) {
        return vagoes.get(posicao);
    }

    /**
     *
     * @param locomotiva
     */
    public void engataLocomotiva(Locomotiva locomotiva) {
        if (locomotiva == null) {
            throw new IllegalArgumentException();
        }
        if (locomotiva.getComposicao() != null) {
            throw new LocomotivaEmOutraComposicaoException();
        }
        if (!vagoes.isEmpty()) {
            throw new LocomotivaAposVagaoException();
        }
        locomotivas.add(locomotiva);
    }

    /**
     *
     * @param vagao
     */
    public void engataVagao(Vagao vagao) {
        if (vagao == null) {
            throw new IllegalArgumentException();
        }
        if (vagao.getComposicao() != null) {
            throw new VagaoEmOutraComposicaoException();
        }
        vagoes.add(vagao);
    }

    /**
     *
     */
    public void desengataLocomotiva() {
        if (locomotivas.size() <= 1) {
            throw new PrimeiraLocomotivaNaoPodeSerRemovidaException();
        }
        if (!vagoes.isEmpty()) {
            throw new VagaoAposLocomotivaException();
        }
        locomotivas.remove(locomotivas.size() - 1);
    }

    /**
     *
     */
    public void desengataVagao() {
        vagoes.remove(vagoes.size() - 1);
    }

    /**
     *
     */
    public void desengataUltimoElemento() {
        if (vagoes.isEmpty()) {
            desengataLocomotiva();
        } else {
            desengataVagao();
        }
    }
}
