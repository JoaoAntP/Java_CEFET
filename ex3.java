import java.util.Scanner;



public class ex3 {



    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);



        int[] quantidadePorIdade = new int[58];



        int totalFuncionarios = 0;

        int idade = -1; 



        System.out.println("Digite as idades dos funcionários (entre 18 e 75). O programa será encerrado quando o total de funcionários for igual a 100:");



        while (totalFuncionarios < 100) {

            idade = sca.nextInt();



            if (idade >= 18 && idade <= 75) {

                quantidadePorIdade[idade - 18]++;

                totalFuncionarios++;

            } else {

                System.out.println("Idade inválida. Informe uma idade entre 18 e 75.");

            }

        }



        quantidadeIdades(quantidadePorIdade);



        sca.close();

    }



    public static void quantidadeIdades(int[] vetor) {

        System.out.println("\nQuantidade de funcionários por idade:");



        for (int i = 0; i < 58; i++) {

            if (vetor[i] > 0) {

                System.out.println("Idade " + (i + 18) + ": " + vetor[i] + " funcionário(s)");

            }

        }

    }

}
