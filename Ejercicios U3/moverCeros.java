import java.util.ArrayList;
public class moverCeros {
    
    public static ArrayList<Object> cambiarCeros (ArrayList<Object> numeros){

        ArrayList<Object> resultado = new ArrayList<>();

        for (Object numero : numeros) {
            if (numero instanceof Integer && (Integer) numero != 0) {
                resultado.add(numero);  // Agregar el número si no es 0
            } else if (numero instanceof Integer && (Integer) numero == 0) {
                continue;  // Si el número es 0, simplemente se ignora
            } else {
                resultado.add(numero);  // Agregar otros objetos como "false", "a", etc.
            }
        }

        for (Object numero : numeros) {
            if (numero instanceof Integer && (Integer) numero == 0) {
                resultado.add(0);  // Agregar ceros al final
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        
        ArrayList<Object> numeros = new ArrayList<>();

        numeros.add("false");
        numeros.add(1);
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(0);
        numeros.add(1);
        numeros.add(3);
        numeros.add("a");
        
        System.out.println("Lista original: " + numeros);

        ArrayList<Object> respuesta = cambiarCeros(numeros);

        System.out.println("Lista con ceros al final: " + respuesta);
    }
}
