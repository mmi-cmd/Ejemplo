import java.util.Arrays;
import java.util.Scanner;
public class Anagramas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 1 palabra");
        String palabra1 = scanner.next();
        System.out.println("Ingrese otra palabra");
        String palabra2 = scanner.next();

        boolean resultado= verificarAnagramas(palabra1, palabra2);
        if(resultado) {
            System.out.println("Las palabras " + palabra1 + " y " + palabra2 + " son anagramas");
        } else {
            System.out.println("Las palabras " + palabra1 + " y " + palabra2 + " no son anagramas");
        }
    }

    public static boolean verificarAnagramas (String palabra1, String palabra2 ){
        palabra1=palabra1.toLowerCase();
        palabra2=palabra2.toLowerCase();

        if (palabra1.equals(palabra2)){
            return false;
        }
        char[] caracteres1 = palabra1.toCharArray();
        char[] caracteres2 = palabra2.toCharArray();

        Arrays.sort(caracteres1);
        Arrays.sort(caracteres2);

        return(Arrays.equals(caracteres1,caracteres2));
    }
}
