 public static double raizQuadrada(double numero) {

        double chute = numero / 2;

        int contador = 0;

        while (contador < 10) {

            chute = (chute + numero / chute) / 2;

            contador = contador + 1;

        }

        return chute;

    }





    public static double valorAbsoluto(double numero) {

        if (numero < 0) {

            return -numero;

        } else {

            return numero;

        }

    }

}

