import java.util.Scanner;



public class ex2 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);



        System.out.print("Digite o preço por MByte (R$): ");

        double precoPorMB = sca.nextDouble();



        int totalUsuarios = 0;

        double somaValoresPagos = 0;



        System.out.print("\nDigite a quantidade de downloads do usuário (0 para encerrar): ");

        int downloads = sca.nextInt();



        while (downloads != 0) {

            int downloadsAte2MB = 0;

            double valorPago = 0;



            for (int i = 1; i <= downloads; i++) {

                System.out.print("Digite o tamanho do download " + i + " (em MB): ");

                double tamanho = sca.nextDouble();



                if (tamanho <= 2.0) {

                    downloadsAte2MB++;

                }



                valorPago += tamanho * precoPorMB;

            }



            System.out.println("Downloads até 2MB: " + downloadsAte2MB);

            System.out.printf("Valor a ser pago: R$ %.2f\n", valorPago);



            totalUsuarios++;

            somaValoresPagos += valorPago;



            System.out.print("\nDigite a quantidade de downloads do usuário (0 para encerrar): ");

            downloads = sca.nextInt();

        }



        if (totalUsuarios > 0) {

            double media = somaValoresPagos / totalUsuarios;

            System.out.printf("\nValor médio pago pelos usuários: R$ %.2f\n", media);

        } else {

            System.out.println("\nNenhum usuário foi processado.");

        }



        sca.close();

    }

}
