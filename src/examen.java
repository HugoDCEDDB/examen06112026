public class examen {
    public static void main(String[] args) {

        double pedido1 = 12.5;
        double unidad1 = 4;
        double total1 = getTotal(pedido1, unidad1);
        double descuento1 = getDescuento(total1);
        double preciofinal1 = getPreciofinal(total1, descuento1);

        double pedido2 = 8.0;
        double unidad2 = 5;
        double total2 = getTotal(pedido2, unidad2);
        double descuento2 = getDescuento(total2);
        double preciofinal2 = getPreciofinal(total2, descuento2);

        double plazo = getPlazo(preciofinal1, preciofinal2);
        double media = getMedia(unidad1, unidad2);

        ImprimirFactura(preciofinal1, preciofinal2, plazo, media);

    }








    //Funciones
    private static double getMedia(double unidad1, double unidad2) {
        return (unidad1 + unidad2) / 2;
    }

    private static double getPlazo(double preciofinal1, double preciofinal2) {
        return (preciofinal1 + preciofinal2) / 3;
    }

    private static void ImprimirFactura(double preciofinal1, double preciofinal2, double plazo, double media) {
        System.out.println("Pedido 1: " + preciofinal1 + " euros");
        System.out.println("Pedido 2: " + preciofinal2 + " euros");
        System.out.println("Pago de cada plazo (3 plazos): " + plazo + " euros");
        System.out.println("Media de unidades por pedido: " + media);


    }

    private static double getPreciofinal(double total, double descuento) {
        return total - descuento;
    }

    private static double getDescuento(double total) {
        return total * 10 / 100;
    }

    private static double getTotal(double pedido, double unidad) {
        return pedido * unidad;
    }
}

//1. Debugging y fix de errores
//El calculo del plazo estaba mal porque no se habian puestos los () para separar y hacer primero la suma y luego ya el resultado de la suma / nº a dividir.
//El pedido2 daba mal porque en el calculo de t2 estaba puesto p2+u2, por lo que daba otro numero diferente, simplemente cambias el + por un * y ya te da bien
//Y para el error de las medidas de unidades, como unidad1 y unidad2 eran ints, pues el resultado que te da va era un int tambien, simplemente he cambiado las variables a double y ya

//2. Refactorizar
//He cambiado los nombres a las variables para que sean mas legibles
//He hecho lo de ctlr + alt + l para formatear el codigo, no hay muchos cambios porque yo tambien manualmente lo arregle un poco antes por verlo mejor cuando estaba haciendo el debugging
//He metido el gettotal para ambos en una misma funcion
//Lo mismo con el descuento
//Basicamente he hecho refactor a todos los calculos como desucento, totales, plazos, etc. No se que comentar en eso
//He metido todos los printfs en una misma funcion y la he llamado imprimir factura, asi limpio un poco el main y ademas ya me imprime la factura junta