package pucrs.poo.entidades;


public class Vagao {

    private static int NEXT_ID = 1;

    private final int identificador;

    private final double capacidadeCarga;

    private Composicao composicao;

    public Vagao(double capacidadeCarga) {
        identificador = NEXT_ID++;
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public Composicao getComposicao() {
        return composicao;
    }

    public void setComposicao(Composicao composicao) {
        if (composicao == null) {
            throw new IllegalArgumentException();
        }
        this.composicao = composicao;
    }

}
