public class RepInd2 {
    public static void main(String[] args) {
        int soma = 0, i = 0;
        
        // Verifica se há argumentos
        if (args.length == 0) {
            System.out.println("Nenhum número fornecido!");
            return;
        }
        
        int num = Integer.parseInt(args[i]);
        
        while(num != -1) {
            soma += num;
            i++;
            
            // Verifica se ainda há argumentos
            if (i >= args.length) {
                break;
            }
            
            num = Integer.parseInt(args[i]);
        }
        
        if (i != 0) {
            float md = (float)soma / i;
            System.out.println("Média dos números: " + md);
        }
    }
}