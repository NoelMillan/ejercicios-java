public class Ejercicio4i5 {
  public static void main (String[] args) {
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Introduzca el valor de a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor de b: ");
    int b = Integer.parseInt(System.console().readLine());
    int x = -b / a;
    System.out.print("x = " + x);
  }
}

