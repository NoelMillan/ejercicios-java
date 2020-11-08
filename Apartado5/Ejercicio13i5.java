public class Ejercicio13i5 {
  public static void main (String[] args) {
    int contador = 0;
    int positivos = 0;
    int negativos = 0;
    while(contador < 10) {
      System.out.print("Introduzca un número: ");
      int num = Integer.parseInt(System.console().readLine());
      if(num < 0) {
        negativos = negativos + 1;
      }
      else {
        positivos = positivos + 1;
      }
      contador = contador + 1;
    }
    System.out.println("Has introducido " + positivos + " números positivos y " + negativos + " números negativos");
  }
}
