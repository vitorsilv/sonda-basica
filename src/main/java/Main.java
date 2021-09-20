import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Criando um Planeta
        System.out.println("Digite o tamanho do planeta com X e Y de numeros inteiros");
        System.out.print("X:");
        int xPlaneta = in.nextInt();
        System.out.print("Y:");
        int yPlaneta = in.nextInt();
        System.out.print("Digite o nome do planeta:");
        String nomePlaneta = in.next();

        Planeta planeta = new Planeta(xPlaneta, yPlaneta, nomePlaneta);

        //Criando uma Sonda
        System.out.println("Digite a posição inicial em " + nomePlaneta + "(X:" + xPlaneta + ", Y:" + yPlaneta + ") contendo X(de 0 a " + xPlaneta + "), Y(de 0 a " + yPlaneta + ") e Direção da Sonda (N, E, S, W)");
        System.out.print("X:");
        int xSonda = in.nextInt();
        System.out.print("Y:");
        int ySonda = in.nextInt();
        System.out.print("Direção:");
        String direcaoSonda = in.next();

        Sonda sonda = new Sonda(xSonda, ySonda, direcaoSonda, planeta);

        //Comandos
        System.out.print("Digite os comandos para a sua Sonda: ");
        String comandos = in.next();

        sonda.comandos(comandos);

        System.out.println(sonda.toString());

        //Criando uma Sonda
        System.out.println("Digite a posição inicial em " + nomePlaneta + "(X:" + xPlaneta + ", Y:" + yPlaneta + ") contendo X(de 0 a " + xPlaneta + "), Y(de 0 a " + yPlaneta + ") e Direção da Sonda (N, E, S, W)");
        System.out.print("X:");
        int xSonda1 = in.nextInt();
        System.out.print("Y:");
        int ySonda1 = in.nextInt();
        System.out.print("Direção:");
        String direcaoSonda1 = in.next();

        Sonda sonda1 = new Sonda(xSonda1, ySonda1, direcaoSonda1, planeta);

        //Comandos
        System.out.print("Digite os comandos para a sua Sonda: ");
        String comandos1 = in.next();

        sonda1.comandos(comandos1);

        System.out.println(sonda1.toString());
    }
}
