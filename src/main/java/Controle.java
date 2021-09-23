import java.util.Locale;

abstract class Controle {
    private int posicaoX;
    private int posicaoY;
    private String direcao;
    private Planicie planicie;

    public Controle(int posicaoX, int posicaoY, String direcao, Planicie planicie) {

        if((posicaoX > planicie.getLimiteX() || posicaoX < 0) ||
                (posicaoY > planicie.getLimiteY() || posicaoY < 0)){
            System.err.println("Você tentou pousar em uma área inválida.");
            throw new RuntimeException();
        }

        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.direcao = direcao.toUpperCase(Locale.ROOT);
        this.planicie = planicie;

    }

    public void comandos(String comandos) {
        String[] array = comandos.split("");
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("L")) {
                virarEsquerda();
            }else if(array[i].equals("R")) {
                virarDireita();
            }else if (array[i].equals("M")){
                mover();
            }else{
                System.err.println("O "+(i+1)+"º valor("+array[i]+") entre a lista de comandos('L','R' e 'M') é inválido.");
                throw new RuntimeException();
            }
        }
    }

    abstract void virarEsquerda();

    abstract void virarDireita();

    abstract void mover();

    public int getPosicaoX() {
        return posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public String getDirecao() {
        return direcao;
    }

    public Planicie getPlanicie() {
        return planicie;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }
}
