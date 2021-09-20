import java.util.Locale;

abstract class Movimentacao {
    protected int posicaoX;
    protected int posicaoY;
    protected String direcao;

    public Movimentacao() {}

    public Movimentacao(int posicaoX, int posicaoY, String direcao) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.direcao = direcao.toUpperCase(Locale.ROOT);
    }

    abstract void virarEsquerda();

    abstract void virarDireita();

    abstract void mover();
}
