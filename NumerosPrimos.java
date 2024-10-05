import java.util.Scanner;
public class NumerosPrimos {
    public static void main(String[] args) {
        final int MAX_NUMBER = 100;
        final int MAX_DIVISORES_PRIMO = 2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero que desea verificar"); // se pide el numero a verificar
        int number = scanner.nextInt();
        int cantidadDivisores = 0; //contador que cuenta la cantidad de divisores que tiene un numero

        // Verificar si el número ingresado es primo
        if (number > 1) { // Solo verificamos números mayores que 1 ya que si no, no es primo
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    cantidadDivisores++; //cuenta los divisores
                }
            }

            if (cantidadDivisores == MAX_DIVISORES_PRIMO) { //solo si la cantidad de divisores es 2, es primo
                System.out.println("El numero " + number + " es primo");
            } else {
                System.out.println("El numero " + number + " no es primo");
            }

        System.out.println("Los numero primos hasta " + MAX_NUMBER + " son: ");

        for (int numero = 1; numero <= MAX_NUMBER; numero++) { //para imprimir todos los primos entre 1 y 100, se agrega otro for

            cantidadDivisores=0;

            for (int i = 1; i <= numero; i++) {
                if (numero%i==0) {
                    cantidadDivisores++;
                }
            }
            if (cantidadDivisores==MAX_DIVISORES_PRIMO) {
                System.out.println(numero);
            }
            }
        }
        scanner.close();
    }
}