import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int n = entrada.nextInt();
        
        System.out.println("Informe o preço da gasolina: ");
        float gas = entrada.nextFloat(); // Corrigido: nextFloat() em vez de nextInt()
        
        System.out.println("Informe o salário do funcionário: ");
        double sal = entrada.nextDouble(); // Corrigido: nextDouble() em vez de nextInt()
        
        System.out.println("Valores lidos: " + n + "\t" + gas + "\t" + sal);
        entrada.close();
    }
}