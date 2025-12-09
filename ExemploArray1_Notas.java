import java.util.Scanner;

public class ExemploArray1_Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] num = new int[11]; // Índices de 0 a 10
        int i, nota;
        
        for(i = 0; i < num.length; i++)
            num[i] = 0;
            
        for(i = 0; i < 20; i++) {
            System.out.println("Digite a nota do aluno: ");
            nota = entrada.nextInt();
            num[nota]++;
        }
        
        for(i = 0; i < num.length; i++) {
            System.out.println("Nota " + i + ": " + num[i]);
        }
        entrada.close();
    }
}