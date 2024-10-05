import java.util.Scanner;
import java.util.Locale;
public class AreaPoligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Menú de figuras");
        System.out.println("Opción 1 ---> Triángulo");
        System.out.println("Opción 2 ---> Cuadrado");
        System.out.println("Opción 3 ---> Rectángulo");

        int codigo;
        do {
            System.out.println("Ingrese el codigo de la figura deseada");
            codigo = scanner.nextInt();
            if (codigo<1 || codigo>3){
                System.out.println("Ingrese un codigo valido");
            }
        } while ((codigo<1) || (codigo>3));

        
        System.out.print("Ingresa la base de la figura: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura de la altura: ");
        double altura = scanner.nextDouble();

        double Area = (calcularArea(codigo, base, altura));
        if (Area>0){
            System.out.println("El area de la figura es " + Area);
        }
        
        
        }
        public static double calcularArea(int codigo, double base, double altura){
            switch (codigo) {
                case 1:
                    return (base * altura) / 2;
                
                case 2:
                    return (base*altura);
    
                case 3:
                    return (base*altura);
            
                default:
                System.out.println("Area no valida");
                return 0.0;
                    
    
            }
        }

        
        
}
