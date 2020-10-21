public class Ejercicio5i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduzca la base del rectángulo: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt(linea);
    
    String linea2;
    System.out.print("Introduzca la altura del rectángulo: ");
    linea2 = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea2);
    
    int area = base * altura;
    System.out.println("El área del rectángulo sería: " + area);
    }
}
