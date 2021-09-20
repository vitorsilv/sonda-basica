import java.util.Locale;

abstract class Movimentacao {
    protected int posicaoX;
    protected int posicaoY;
    protected String direcao;

    public Movimentacao(int posicaoX, int posicaoY, String direcao) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.direcao = direcao.toUpperCase(Locale.ROOT);
    }

    public void comandos(String comandos) {
        String[] array = comandos.split("");
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("L")) {
                virarEsquerda();
            }else if(array[i].equals("R")) {
                virarDireita();
            }else {
                mover();
            }
        }
    }

    abstract void virarEsquerda();

    abstract void virarDireita();

    abstract void mover();
}
