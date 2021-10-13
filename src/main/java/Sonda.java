import java.util.HashSet;
import java.util.Set;

public class Sonda extends Controle {

    static Set<Sonda> sondas = new HashSet<>();

    public Sonda(int posicaoX, int posicaoY, String direcao, Planeta planeta) {
        super(posicaoX, posicaoY, direcao, planeta);
        sondas.add(this);
    }

    @Override
    public String toString() {
        return "Sonda{" +
                "posicaoX=" + getPosicaoX() +
                ", posicaoY=" + getPosicaoY() +
                ", direcao='" + getDirecao() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Sonda sonda = (Sonda) obj;
        return this.infoSonda().equals(sonda.infoSonda());
    }

    @Override
    public int hashCode() {
        return this.infoSonda().hashCode();
    }

    private String infoSonda(){
        return "Planeta: "+getPlaneta().getNomePlaneta()+" X: "+getPosicaoX()+" Y: "+getPosicaoY();
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
        Sonda sondaTeste = new Sonda(getPosicaoX(),getPosicaoY(),getDirecao(),getPlaneta());
        if (getDirecao().equals("N") && getPosicaoY() < getPlaneta().getLimiteY()) {
            sondaTeste.setPosicaoY(getPosicaoY() + 1);
            if (sondas.contains(sondaTeste)) {
                System.out.println("Olá operador, sua sonda ia bater impedimos isso. Tome mais cuidado");
            } else {
                setPosicaoY(getPosicaoY() + 1);
            }
        } else if (getDirecao().equals("E") && getPosicaoX() < getPlaneta().getLimiteX()) {
            sondaTeste.setPosicaoX(getPosicaoX() + 1);
            if (sondas.contains(sondaTeste)) {
                System.out.println("Olá operador, sua sonda ia bater impedimos isso. Tome mais cuidado");
            } else {
                setPosicaoX(getPosicaoX() + 1);
            }
        } else if (getDirecao().equals("S") && getPosicaoY() > 0) {
            sondaTeste.setPosicaoY(getPosicaoY() - 1);
            if (sondas.contains(sondaTeste)) {
                System.out.println("Olá operador, sua sonda ia bater impedimos isso. Tome mais cuidado");
            } else {
                setPosicaoY(getPosicaoY() - 1);
            }
        } else if (getDirecao().equals("W") && getPosicaoX() > 0) {
            sondaTeste.setPosicaoX(getPosicaoX() - 1);
            if (sondas.contains(sondaTeste)) {
                System.out.println("Olá operador, sua sonda ia bater impedimos isso. Tome mais cuidado");
            } else {
                setPosicaoX(getPosicaoX() - 1);
            }
        }
    }
}
