public class FizzBuzz {
    public static void main(String[] args) {
        final int MAX_NUMBER = 100; //Se asigna una constante con la maxima cantidad de numeros a verificar para evitar magic numbers
        for (int i = 1; i <= MAX_NUMBER; i++) { //se inicializa un for que va a a recorrer todos los nuemos hasta 100
            if ((i%3==0)&&(i%5==0)) { //condicion para verificar si el numero es multiplo de 3 y 5 al mismo tiempo
                System.out.println("FizzBuzz");
            } else if (i%5==0) { //condicion para verificar si el numero es multiplo de 5
                System.out.println("Buzz");
            } else if(i%3==0){ //condicion para verificar si el numero es multiplo de 3
                System.out.println("Fizz");
            } else{ //condicion para verificar si el numero no cumple con ser multiplo de 3 o 5
                System.out.println(i);
            }
            
        }
    }
}