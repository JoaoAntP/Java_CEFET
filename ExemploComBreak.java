public class ExemploComBreak {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        switch(num) {
         case 1: num *= 2;
             break;
        case 2: num *= 3; 
            break;
        default: num *= 10;
    }
    System.out.println("Novo valor: " + num);
    }
 } 