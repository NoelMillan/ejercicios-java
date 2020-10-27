public class Ejercicio4i9 {
  public static void main (String[] args) {
    System.out.println("Este programa realiza una ecuación de segundo grado teniendo el valor a, b y c");
    System.out.print("Introduzca el valor de a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor de b: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor de c: ");
    int c = Integer.parseInt(System.console().readLine());
    double formula = ((b * b) - (4 * a * c));
    double exponente = 0.5;
    double raiz = Math.pow(formula, exponente);
    double ecuacion  = (-b + raiz) / (2 * a);
    double ecuacion2 = (-b - raiz) / (2 * a);
    if (a == 0) {
      System.out.print("No se puede dividir entre 0");
    } else {
      if (formula < 0) {
        System.out.print("La raíz cuadrada no puede ser un número negativo");
      } else {
        System.out.println("El primer resultado de la ecuación de segundo grado es: " + ecuacion);
        System.out.println("El segundo resultado de la ecuacion de segundo grado es: " + ecuacion2);
      }
    }
  }
}
