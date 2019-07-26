package metodoDos;

import java.util.Scanner;

/**
 *
 * @author cavargas10
 */
public class Ejecutable {

    public static void main(String[] args) {
        int limite = 5;
        int contador = 1;
        String ciudad = "";

        Scanner sc = new Scanner(System.in);

        while (contador <= limite) {

            System.out.println("Ingrese el nombre de la ciudad");
            ciudad = sc.nextLine();

            boolean resultado = Operacion.comporbarCadena(ciudad);

            if (resultado == true) {

                System.out.printf("%s\n", ciudad);
                contador = contador + 1;
            } else {
                System.out.println("Valor ingresado fuera de rango");
            }

        }

        /*
        String nombreCiudad = "Loja";
        boolean resultado = Operacion.comporbarCadena(nombreCiudad);
        
        System.out.printf("%s\n",resultado);
         */
    }
}
