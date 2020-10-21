public class Ejercicio3i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Por favor, introduzca el número de pesetas que quiera pasar a euros: ");
    linea = System.console().readLine();
    int num1;
    num1 = Integer.parseInt(linea);
    
    double conversor = num1 * 0.0060;
    System.out.print(conversor + " euros");
    }
}
