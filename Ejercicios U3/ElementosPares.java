import java.util.ArrayList;
public class ElementosPares {
    public static <T> ArrayList<T> obtenerRepetidosPares(ArrayList <T> elementos){ //metodo generico para cualquier tipo de datos
        ArrayList <T> resultadoRepetidos = new ArrayList<>();

        for (T elemento : elementos) {
            int contadorRepetidos=0;
            for (T e : elementos) {
                if (e.equals(elemento)) {
                    contadorRepetidos++;
                }
            }
            if (contadorRepetidos%2==0 && !resultadoRepetidos.contains(elemento)) { //contains verfica que el elemnto no este repetido
                resultadoRepetidos.add(elemento);
            }
        }
        return resultadoRepetidos;
    }

    public static void main(String[] args) {
        ArrayList <String> elementosString = new ArrayList<>();
        elementosString.add("A");
        elementosString.add("B");
        elementosString.add("A");
        elementosString.add("C");
        elementosString.add("C");
        elementosString.add("C");
        elementosString.add("C");
        ArrayList<String> resultadoString = obtenerRepetidosPares(elementosString);
        System.out.println("String repetidos" + resultadoString);

        //Array para enteros
        ArrayList <Integer> elementosInt = new ArrayList<>();
        elementosInt.add(1);
        elementosInt.add(2);
        elementosInt.add(3);
        elementosInt.add(1);
        elementosInt.add(2);
        ArrayList<Integer> resultadoInt = obtenerRepetidosPares(elementosInt);
        System.out.println("String repetidos" + resultadoInt);
    }
}

   /* public static ArrayList<String> obtenerRepetidosPares(ArrayList <String> elementos){ //metodo que solo sirve para datos string
        
        ArrayList <String> resultadoRepetidos = new ArrayList<>();

        for (String elemento : elementos) {
            int contadorRepetidos=0;
            for (String e : elementos) {
                if (e.equals(elemento)) {
                    contadorRepetidos++;
                }
            }
            if (contadorRepetidos%2==0 && !resultadoRepetidos.contains(elemento)) {
                resultadoRepetidos.add(elemento);
            }
        }
        return resultadoRepetidos;
    } */
