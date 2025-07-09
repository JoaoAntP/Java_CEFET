import java.util.Scanner;



public class ex1 {

    public static void main(String[] args) {



        Scanner sca = new Scanner(System.in);





        System.out.println("Digite a altura: ");

        int altura = sca.nextInt();



       

        System.out.println("Digite o peso no início do ano: ");

        double pesoInicial = sca.nextDouble();



    

        System.out.println("Digite o peso no final do ano: ");

        double pesoFinal = sca.nextDouble();



        double areaInicial = raizQuadrada((altura * pesoInicial) / 3600);

        double areaFinal = raizQuadrada((altura * pesoFinal) / 3600);

        

        if (altura < 0 || pesoInicial < 0 || pesoFinal < 0) {

        	System.out.println("Erro!");

        }

        else if (valorAbsoluto(areaInicial - areaFinal) == 0) {

            System.out.println("Manteve área inalterada");

        } else if (areaFinal > areaInicial) {

            System.out.println("Aumentou a área corporal");

        } else {

            System.out.println("Diminuiu a área corporal");

        }

        



        sca.close();

    }
