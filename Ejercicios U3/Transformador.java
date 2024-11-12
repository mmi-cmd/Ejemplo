import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
public class Transformador {
    // creacion del metodo transformadorData que va a retornar un arraylist de mapas que a su vez tiene una clave de tipo String y un valor de Tipo Object se pone Object para que devuelva cualquier tipo de dato
    public static List<Map<String, Object>> tranformadorData (Map<String, List<?>> data){

        //se crea el output que va a almacenar los datos de cada persona
        List<Map<String, Object>> output = new ArrayList<>();
        //Se extraen las listas de data que contienen los nombres con .get que toma solo el valor asociado a una clave
        List<String> nombres = (List<String>) data.get("nombres"); //lista con solo nombres, se hace casting
        List<Integer> edades = (List<Integer>) data.get("edades"); //lista con solo edades, se hace casting

        for (int i = 0; i < nombres.size(); i++) { //se recorren las listas
            Map<String , Object> persona = new HashMap<>(); //Se crea un map que representa a cada persona
            persona.put("id", String.valueOf(i + 1));
            persona.put("nombre", nombres.get(i));
            persona.put("edad", edades.get(i));

            output.add(persona); //se agrega cada map al arraylist output
        }

        return output;
    }

    public static void main(String[] args) {
        //creacion del objeto data por medio de un hashmap que contiene una key de tipo string y un valor de tipo list
        Map<String, List<?>> data = new HashMap<>();

        data.put("nombres", List.of("Bruno", "Andrea")); //list.of permite crear una lista que no cambia
        data.put("edades", List.of(20, 19));

        List<Map<String, Object>> resultado = tranformadorData(data);
        System.err.println(resultado);
    }
}
