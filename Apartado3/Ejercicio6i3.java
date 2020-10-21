public class Ejercicio6i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduzca la base del triángulo: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt(linea);
    
    String linea2;
    System.out.print("Introduzca la altura del triángulo: ");
    linea2 = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea2);
    
    int area = (base * altura) / 2;
    System.out.println("El área del triáangulo sería: " + area);
    }
}
