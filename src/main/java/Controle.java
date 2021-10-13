abstract class Controle {
    private int posicaoX;
    private int posicaoY;
    private Planeta planeta;
    private Direcao direcao;

    public Controle(int posicaoX, int posicaoY, String direcao, Planeta planeta) {

        if((posicaoX > planeta.getLimiteX() || posicaoX < 0) ||
                (posicaoY > planeta.getLimiteY() || posicaoY < 0)){
            System.err.println("Você tentou pousar em uma área inválida.");
            throw new RuntimeException();
        }

        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.planeta = planeta;
        setDirecao(direcao);

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

    public Planeta getPlaneta() {
        return planeta;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public String getDirecao() {
        return direcao.getValorReal();
    }
    // TODO Yudi tinha me mostrado como navegar em enums sem ser assim, tipo com um ++ mas não me lembro
    public void setDirecao(String direcao) {
        switch (direcao){
            case "N":
                this.direcao = Direcao.N;
                break;
            case "E":
                this.direcao = Direcao.E;
                break;
            case "S":
                this.direcao = Direcao.S;
                break;
            case "W":
                this.direcao = Direcao.W;
                break;
            default:
                System.err.println("Valor inválido de direção");
                throw new RuntimeException();
        }
    }
}
