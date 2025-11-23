public class Eleitoral {
 public static void main(String[] args) {
    int idade = Integer.parseInt(args[0]);
    if (idade < 16)
        System.out.println("Não eleitor");
    else if(idade < 18 || idade > 65)
        System.out.println("Eleitor facultativo");
    else
    System.out.println("Eleitor obrigatório");
    }
 }