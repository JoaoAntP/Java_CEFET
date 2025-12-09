import java.util.Scanner;

public class ExemploArray1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[20];
        int soma = 0;
        int i;
        float media;
        
        for(i = 0; i < num.length; i++) {
            System.out.println("Digite um número inteiro: ");
            num[i] = entrada.nextInt();
            soma += num[i];
        }
        
        media = (float) soma / i;
        System.out.println("Média dos números: " + media);
        System.out.println("Números acima da média: ");
        
        for(i = 0; i < num.length; i++) {
            if(num[i] > media)
                System.out.println(num[i]);
        }
        entrada.close();
    }
}