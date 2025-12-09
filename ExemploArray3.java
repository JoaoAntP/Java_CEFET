import java.util.Scanner;

public class ExemploArray3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de funcionários da empresa: ");
        int qtd = entrada.nextInt();
        
        int[][] mat = new int[qtd][];
        int i, k, filhos, total, somaid, abaixo;
        float idmedia;
        total = somaid = 0;
        
        // Entrada de dados
        for(i = 0; i < mat.length; i++) {
            System.out.print("Digite a quantidade de filhos do funcionário ");
            System.out.println((i + 1) + ": ");
            filhos = entrada.nextInt();
            total += filhos;
            
            mat[i] = new int[filhos];
            
            for(k = 0; k < filhos; k++) {
                System.out.println("Digite a idade do filho " + (k + 1) + ": ");
                mat[i][k] = entrada.nextInt();
                somaid += mat[i][k];
            }
        }
        
        // Cálculo e exibição
        if(total != 0) {
            idmedia = (float) somaid / total;
            System.out.println("Idade média dos filhos: " + idmedia);
            
            for(i = 0; i < qtd; i++) {
                abaixo = 0;
                for(int idade : mat[i]) {
                    if(idade < idmedia)
                        abaixo++;
                }
                System.out.print("Quantidade de filhos do funcionário " + (i + 1));
                System.out.println(" com idade abaixo da média: " + abaixo);
            }
        }
        entrada.close();
    }
}