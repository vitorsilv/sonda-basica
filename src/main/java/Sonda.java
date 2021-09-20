public class Sonda extends Movimentacao{

    public Sonda(int posicaoX, int posicaoY, String direcao) {
        super(posicaoX, posicaoY, direcao);
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
        switch (direcao){
            case "N":
                posicaoY++;
                break;
            case "E":
                posicaoX++;
                break;
            case "S":
                posicaoY--;
                break;
            case "W":
                posicaoX--;
                break;
        }
    }
}
