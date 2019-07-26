package manejometodoss;

/**
 *
 * @author cavargas10
 */
public class ManejoMetodos {

    public static void main(String[] args) {

        Operacion.metodoUno();
        Operacion.metodoTres("52");
        Operacion.metodoUno();
        String m = Operacion.metodoDos();

        System.out.println(m);

        Operacion.metodoTres("20", "51");
        System.out.println(m);

        Operacion.metodoUno();
    }

}
