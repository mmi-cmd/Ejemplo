public class Fibonacci{
    public static void main(String[] args) {
        long inicialNumber = 0; // se define el primer numero de la serie de fibonacci
        long secondNumber = 1; // se define el segundo numero de la serie de fibonacci
        final int MAX_NUMBER = 50; // se constante que indica el maximo numero de la serie para evitar magic numbers 
        
        /*Con for */
        System.out.print(inicialNumber + "," + secondNumber); //se imprimen los dos primeros numeros
        for (int i = 2; i < MAX_NUMBER; i++) { // for que incia en 2 (debido a que ya estan los 2 primeros numeros) para hacer la sumatoria y formar la serie
        long thirdNumber = inicialNumber + secondNumber; //sumatoria de los dos numeros anteriores
        inicialNumber = secondNumber; //se cambia la posicion de los numeros para que funcione el for
        secondNumber = thirdNumber;
            System.out.print( "," + thirdNumber ); //continua imprimiendo el resto de numeros
        } 
        
        /*Con while */
        /* System.out.print(inicialNumber + "," + secondNumber);

        int i=2;
        while (i<MAX_NUMBER) {
            long thirdNumber = inicialNumber + secondNumber;
            inicialNumber = secondNumber;
            secondNumber = thirdNumber;
            System.out.print("," + thirdNumber);
            i++;
        } */
    } 
}
