public class Ejercicio4i6 {
  public static void main (String[] args) {
    System.out.println ("Esto es un programa que calcula el tiempo que tardará un objeto en caer desde una altura h");
    System.out.print ("Introduzca la altura h a la que el objeto está: ");
    int h = Integer.parseInt(System.console().readLine());
    double g = 9.8;
    double formula = ((2 * h) / g);
    double exponente = 0.5;
    double t = Math.pow(formula, exponente);
    if (h < 0) {
      System.out.print("La altura no puede ser menor que 0 en este caso");
    } else {
      System.out.print("El tiempo que el objeto tarda en caer al suelo desde " + h + " metros son " + t);
    }
  }
}
