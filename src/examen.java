public class examen {
    public static void main(String[] args) {

        double p1 = 12.5;
        double u1 = 4;
        double t1 = p1 * u1;
        double d1 = t1 * 10 / 100;
        double f1 = t1 - d1;
        System.out.println("Pedido 1: " + f1 + " euros");

        double p2 = 8.0;
        double u2 = 5;
        double t2 = p2 * u2;
        double d2 = t2 * 10 / 100;
        double f2 = t2 - d2;
        System.out.println("Pedido 2: " + f2 + " euros");

        double plazo = (f1 + f2) / 3;
        System.out.println("Pago de cada plazo (3 plazos): " + plazo + " euros");

        double m = (u1 + u2) / 2;
        System.out.println("Media de unidades por pedido: " + m);
    }
}




//El calculo del plazo estaba mal porque no se habian puestos los () para separar y hacer primero la suma y luego ya el resultado de la suma / nº a dividir.
//El pedido2 daba mal porque en el calculo de t2 estaba puesto p2+u2, por lo que daba otro numero diferente, simplemente cambias el + por un * y ya te da bien
//Y para el error de las medidas de unidades, como unidad1 y unidad2 eran ints, pues el resultado que te da va era un int tambien, simplemente he cambiado las variables a double y ya