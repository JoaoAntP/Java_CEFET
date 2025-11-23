 public class ExemploSemBreak {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        switch (num) {
            case 1: System.out.println("Primeiro");
            case 2: System.out.println("Segundo");
            case 3: System.out.println("Terceiro");
            default: System.out.println("Default");
           }
        }
    }