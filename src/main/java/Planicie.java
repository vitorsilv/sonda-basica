public class Planicie {
    private int limiteX;
    private int limiteY;

    public Planicie(int limiteX, int limiteY) {
        this.limiteX = limiteX;
        this.limiteY = limiteY;
    }

    @Override
    public String toString() {
        return "Planicie{" +
                "limiteX=" + limiteX +
                ", limiteY=" + limiteY +
                '}';
    }
}
