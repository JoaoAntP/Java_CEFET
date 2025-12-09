public class RepDo {
    public static void main(String[] args) {
        // Verifica se há argumentos
        if (args.length == 0) {
            System.out.println("Nenhum número fornecido!");
            return;
        }
        
        int i = 0, soma = 0;
        int num = Integer.parseInt(args[i]);

        do {
            soma += num;
            i++;
            
            // Verifica se ainda há argumentos
            if (i >= args.length) {
                break;
            }
            
            num = Integer.parseInt(args[i]);
        } while(num != -1);
        
        System.out.println("\nSoma dos números: " + soma);
    }
}