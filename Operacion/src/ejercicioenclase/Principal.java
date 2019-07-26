package ejercicioenclase;

/**
 *
 * @author cavargas10
 */
public class Principal {

    public static void main(String[] args) {

        String[] personas = {"Ashley Cooper", "Chirstopher Gutierrez", "Rodney"
            + " Thomas"};
        double[] costoTelefonoEnero = {20.2, 70.2, 50.9};
        double[] costoTelefonoFebrero = {10.2, 30.2, 120.9};
        String mensajeFinal = "";
        mensajeFinal = String.format("%s%s\n", mensajeFinal, "Lista de personas"
                + " a pagar");

        for (int i = 0; i < costoTelefonoEnero.length; i++) {

            double resultado = Operacion.obtenerValorConsumo(
                    costoTelefonoEnero[i], costoTelefonoFebrero[i]);

            mensajeFinal = String.format("%s\n%s paga de telefono %.2f \n",
                    mensajeFinal, personas[i], resultado);
        }

        System.out.printf("%s", mensajeFinal);

    }
}
