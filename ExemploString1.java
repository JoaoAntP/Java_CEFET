 import java.util.Scanner;
    public class ExemploString1 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o sobrenome: ");
            String sobrenome = entrada.next();
            System.out.println("Digite o nome completo: ");
            String nome = entrada.nextLine();
            System.out.println("Valores lidos: \n" + nome + "\n" + sobrenome);
        entrada.close();   
        }
 }