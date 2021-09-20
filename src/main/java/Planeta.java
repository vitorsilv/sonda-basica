public class Planeta extends Planicie {
    private String nomePlaneta;

    public Planeta(int limiteX, int limiteY, String nomePlaneta) {
        super(limiteX, limiteY);
        this.nomePlaneta = nomePlaneta;
    }

    public String getNomePlaneta() {
        return nomePlaneta;
    }
}
