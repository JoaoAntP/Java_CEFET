/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class TabuadaFor
{
	public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int valor;
    for (int cont = 1; cont <= 10; cont++){
        valor = cont *n;
        System.out.print(n +"x"+cont+"="+valor);
        }
	}
}