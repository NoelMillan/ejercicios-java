public class Ejercicio1i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int num1;
    num1 = Integer.parseInt( linea );
    
    String linea2;
    System.out.print("Por favor, introduce otro número: ");
    linea2 = System.console().readLine();
    int num2;
    num2 = Integer.parseInt( linea2 );
    int multiplicacion = num1 * num2;
    System.out.print("La multiplicación entre los dos números es: " + multiplicacion);
    }
}
