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

        int opcaoMenu = 1;
        do {
            //Criando uma Sonda
            System.out.println("Digite a posição inicial em " + planeta.getNomePlaneta() + "(X:" + planeta.getLimiteX() + ", Y:" + planeta.getLimiteY() + ") contendo X(de 0 a " + planeta.getLimiteX() + "), Y(de 0 a " + planeta.getLimiteY() + ") e Direção da Sonda (N, E, S, W)");
            System.out.print("X(de 0 a " +planeta.getLimiteX()+"):");
            int xSonda = in.nextInt();
            System.out.print("Y(de 0 a " +planeta.getLimiteY()+"):");
            int ySonda = in.nextInt();
            System.out.print("Direção:");
            String direcaoSonda = in.next();

            Sonda sonda = new Sonda(xSonda, ySonda, direcaoSonda, planeta);

            //Comandos
            System.out.print("Digite os comandos para a sua Sonda (os comando validos são 'L','R' e 'M'): ");
            String comandos = in.next();

            sonda.comandos(comandos);

            System.out.println(sonda);

            System.out.println("============= MENU =============\n" +
                    "1 - Enviar mais uma sonda para "+planeta.getNomePlaneta()+".\n" +
                    "0 - Encerrar controle de missão");
            opcaoMenu = in.nextInt();
        }while (opcaoMenu != 0);
    }
}
