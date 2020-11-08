public class Ejercicio14i5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca su exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    double potencia = Math.pow(num, exponente);
    System.out.print("La potencia es " + (int)potencia);
  }
}
