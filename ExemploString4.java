import java.util.Scanner;

public class ExemploString4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine(); // Limpa o buffer
        
        System.out.println("Digite o nome completo: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite o salário do funcionário: ");
        double sal = entrada.nextDouble();
        
        System.out.println("Digite o sobrenome: ");
        String sobrenome = entrada.next();
        
        System.out.println("Valores lidos: " + nome + "\n" + sobrenome + "\n" + idade + "\n" + sal);
        entrada.close();
    }
}