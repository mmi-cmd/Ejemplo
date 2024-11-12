import java.util.Scanner;
import java.text.Normalizer;
import java.text.Normalizer.Form;

public class Isogramas {

    public static boolean isIsogram (String palabra){

         // Verificar si el string está vacío
        if (palabra.isEmpty()) {
            return true; 
        }

          // Verificar si la palabra tiene más de dos palabras
        String[] palabras = palabra.split(" "); // Dividir en palabras usando espacio
        if (palabras.length > 2) {
              return false; // Si tiene más de dos palabras, no es un isograma
        }
        
        palabra=normalizarSinAcentos(palabra).toUpperCase();

        char[] caracteresPalabra = palabra.toCharArray();

        for (int i = 0; i < caracteresPalabra.length; i++) {
            for (int j = i+1; j < caracteresPalabra.length; j++) {
                if (caracteresPalabra[i]==caracteresPalabra[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static String normalizarSinAcentos(String palabra) {
        // Normaliza la palabra a la forma NFD (Descomposición) para separar las letras y los acentos
        String palabraNormalizada = Normalizer.normalize(palabra, Form.NFD);
        // Elimina los caracteres no ASCII (acentos y marcas diacríticas)
        return palabraNormalizada.replaceAll("[^\\p{ASCII}]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flag = "si";

        do {
            
            System.out.println("Ingrese la palabra que desea verificar");
            String palabra = scanner.nextLine();
    
            boolean resultado = isIsogram(palabra);
            System.err.println("¿La palabra " + palabra + " es isograma? " + resultado );

            System.out.println("¿Desea verificar otra palabra? si/no");
            flag = scanner.nextLine();
        } while (flag.equals("si"));
        scanner.close();
    }
}
