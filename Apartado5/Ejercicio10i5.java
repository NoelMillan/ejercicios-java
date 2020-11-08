public class Ejercicio10i5 {
  public static void main (String[] args) {
    int contador = 0;
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    int suma = num;
    while (num >= 0) {
      System.out.print("Introduzca otro número: ");
      contador = contador + 1;
      num = Integer.parseInt(System.console().readLine());
      if (num < 0) {
        suma = suma;
      }
      else {
        suma = num + suma;
      }
    }
    int media = suma / contador;
    System.out.print("La media de los números introducidos es " + media);
  }
}
