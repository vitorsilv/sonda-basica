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
        System.out.println(this.toString());
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
        System.out.println(this.toString());
    }

    public void mover() {
        switch (direcao){
            case "N":
                if(posicaoY < planicie.getLimiteY()) {
                    posicaoY++;
                }
                break;
            case "E":
                if(posicaoX < planicie.getLimiteX()) {
                    posicaoX++;
                }
                break;
            case "S":
                if(posicaoY > 0) {
                    posicaoY--;
                }
                break;
            case "W":
                if(posicaoX > 0) {
                    posicaoX--;
                }
                break;
        }
        System.out.println(this.toString());
    }
}
