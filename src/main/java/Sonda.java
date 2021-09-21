public class Sonda extends Movimentacao{

    private Planicie planicie;

    public Sonda(int posicaoX, int posicaoY, String direcao, Planicie planicie) {
        super(posicaoX, posicaoY, direcao);
        this.planicie = planicie;
    }

    @Override
    public String toString() {
        return "Sonda{" +
                "posicaoX=" + posicaoX +
                ", posicaoY=" + posicaoY +
                ", direcao='" + direcao + '\'' +
                '}';
    }

    public void virarEsquerda() {
        switch (direcao) {
            case "N":
                direcao = "W";
                break;
            case "E":
                direcao = "N";
                break;
            case "S":
                direcao = "E";
                break;
            case "W":
                direcao = "S";
                break;
        }
    }

    public void virarDireita() {
        switch (direcao){
            case "N":
                direcao = "E";
                break;
            case "E":
                direcao = "S";
                break;
            case "S":
                direcao = "W";
                break;
            case "W":
                direcao = "N";
                break;
        }
    }

    public void mover() {
        if (direcao.equals("N") &&posicaoY < planicie.getLimiteY())
            posicaoY++;
        else if (direcao.equals("E") && posicaoX < planicie.getLimiteX())
            posicaoX++;
        else if (direcao.equals("S") && posicaoY > 0)
            posicaoY--;
        else if (direcao.equals("W") && posicaoX > 0)
            posicaoX--;
    }
}
