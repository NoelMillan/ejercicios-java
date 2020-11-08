public class Ejercicio11i5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un numero: ");
    int num = Integer.parseInt(System.console().readLine());
    int contador = 0;
    int fila = 0;
    while(contador <= 5) {
      int numextra = num + contador;
      int cuadrado = numextra * numextra;
      int cubo = numextra * numextra * numextra;
      System.out.println(numextra + "\t" + cuadrado + "\t" + cubo);
      contador = contador + 1;
    }
  }
}
