public class Ejercicio2i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Por favor, introduzca el número de euros que quiera pasar a pesetas: ");
    linea = System.console().readLine();
    int num1;
    num1 = Integer.parseInt(linea);
    
    double conversor = num1 * 166.386;
    System.out.print(conversor + " pesetas");
    }
}
