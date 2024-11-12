import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.HashMap;
import java.util.Scanner;

public class LetrasPorNumeros {
    public static String normalizarSinAcentos(String palabra) {
        // Normaliza la palabra a la forma NFD (Descomposición) para separar las letras y los acentos
        String palabraNormalizada = Normalizer.normalize(palabra, Form.NFD);
        // Elimina los caracteres no ASCII (acentos y marcas diacríticas)
        palabraNormalizada = palabraNormalizada.replaceAll("[^\\p{ASCII}]", "");
        return palabraNormalizada;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra que desea verificar");
        String palabra = scanner.nextLine();
        palabra = normalizarSinAcentos(palabra).toLowerCase().replaceAll("\\s+", "");
        
        char [] caracteresPalabra = palabra.toCharArray();


        HashMap <Character, Integer> indiceAlfabetico = new HashMap <>();
        indiceAlfabetico.put('a', 1);
        indiceAlfabetico.put('b', 2);
        indiceAlfabetico.put('c', 3);
        indiceAlfabetico.put('d', 4);
        indiceAlfabetico.put('e', 5);
        indiceAlfabetico.put('f', 6);
        indiceAlfabetico.put('g', 7);
        indiceAlfabetico.put('h', 8);
        indiceAlfabetico.put('i', 9);
        indiceAlfabetico.put('j', 10);
        indiceAlfabetico.put('k', 11);
        indiceAlfabetico.put('l', 12);
        indiceAlfabetico.put('m', 13);
        indiceAlfabetico.put('n', 14);
        indiceAlfabetico.put('o', 15);
        indiceAlfabetico.put('p', 16);
        indiceAlfabetico.put('q', 17);
        indiceAlfabetico.put('r', 18);
        indiceAlfabetico.put('s', 19);
        indiceAlfabetico.put('t', 20);
        indiceAlfabetico.put('u', 21);
        indiceAlfabetico.put('v', 22);
        indiceAlfabetico.put('w', 23);
        indiceAlfabetico.put('x', 24);
        indiceAlfabetico.put('y', 25);
        indiceAlfabetico.put('z', 26);

        System.out.println("El string modificado es: ");
        for (char c : caracteresPalabra) {
            System.out.print(indiceAlfabetico.get(c) + " ");
        }    
    }
}
