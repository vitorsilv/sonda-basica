public class Sonda extends Controle {

    public Sonda(int posicaoX, int posicaoY, String direcao, Planicie planicie) {
        super(posicaoX, posicaoY, direcao, planicie);
    }

    @Override
    public String toString() {
        return "Sonda{" +
                "posicaoX=" + getPosicaoX() +
                ", posicaoY=" + getPosicaoY() +
                ", direcao='" + getDirecao() + '\'' +
                '}';
    }

    public void virarEsquerda() {
        switch (getDirecao()) {
            case "N":
                setDirecao("W");
                break;
            case "E":
                setDirecao("N");
                break;
            case "S":
                setDirecao("E");
                break;
            case "W":
                setDirecao("S");
                break;
        }
    }

    public void virarDireita() {
        switch (getDirecao()){
            case "N":
                setDirecao("E");
                break;
            case "E":
                setDirecao("S");
                break;
            case "S":
                setDirecao("W");
                break;
            case "W":
                setDirecao("N");
                break;
        }
    }

    public void mover() {
        if (getDirecao().equals("N") && getPosicaoY() < getPlanicie().getLimiteY())
            setPosicaoY(getPosicaoY()+1);
        else if (getDirecao().equals("E") && getPosicaoX() < getPlanicie().getLimiteX())
            setPosicaoX(getPosicaoX()+1);
        else if (getDirecao().equals("S") && getPosicaoY() > 0)
            setPosicaoY(getPosicaoY()-1);
        else if (getDirecao().equals("W") && getPosicaoX() > 0)
            setPosicaoX(getPosicaoX()-1);
    }
}
