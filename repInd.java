public class repind {
    public static void main(String[] args) {
        int soma = 0, i = 0;
        int num;
        num = Integer.parseInt(args[i]);
        while (num != -1) {
            soma += num;
            i++;
            num = Integer.parseInt(args[i]);
        }
        if (i != 0)
            System.out.println("Soma dos números: " + soma);
    }
}