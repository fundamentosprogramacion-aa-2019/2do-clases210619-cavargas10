package manejometodoss;

/**
 *
 * @author cavargas10
 */
public class Operacion {

    public static String variable;

    public static void metodoUno() {
        System.out.println(variable);
    }

    public static String metodoDos() {
        return variable;
    }

    public static void metodoTres(String v) {
        variable = v;
    }

    public static void metodoTres(String v, String m) {
        variable = v;
        variable = m;

    }
}
