public class Main{
        //Atributos

        String nome;
        String marca;
        int ano;
        int veloc;

        //Metodo
        void acelerar(int aceleracao){
            veloc += aceleracao;
            }

         void freiar(int freiar){
             veloc-=freiar;
            }

        void buzinar(){
            System.out.println("BUBUUUU");
            }
    }

