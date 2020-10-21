public class Ejercicio9i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduzca el radio del cono: ");
    linea = System.console().readLine();
    int radio;
    radio = Integer.parseInt(linea);
    
    String linea2;
    System.out.print("Introduzca la altura del cono: ");
    linea2 = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea2);
    
    double volumen = ((3.14 * radio * radio) / 3);
    System.out.println("El volumen del cono sería: " + volumen);
    }
}
