package pucrs.poo.entidades;

/**
 * @author marco.mangan@pucrs.br
 */
public class Locomotiva {

    private static int NEXT_ID = 1;

    private final int identificador;

    private final double pesoMaximo;

    private final int qtdadeMaxVagoes;

    private Composicao composicao;

    public Locomotiva(double pesoMaximo, int qtdadeMaxVagoes) {
        identificador = NEXT_ID++;
        this.pesoMaximo = pesoMaximo;
        this.qtdadeMaxVagoes = qtdadeMaxVagoes;
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public int getQtdadeMaxVagoes() {
        return qtdadeMaxVagoes;
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
