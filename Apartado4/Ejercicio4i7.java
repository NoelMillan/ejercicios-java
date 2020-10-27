public class Ejercicio4i7 {
  public static void main (String[] args) {
    System.out.println("Este programa te calcula la media a partir de tres notas");
    System.out.print("Introduzca el valor de la primera nota: ");
    int nota1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor de la segunda nota: ");
    int nota2 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor de la tercera nota: ");
    int nota3 = Integer.parseInt(System.console().readLine());
    int media = (nota1 + nota2 + nota3) / 3;
    if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10 || media < 0 || media > 10) {
      System.out.print("Notas introducidas no válidas");
    } else {
      System.out.print("La nota media es: " + media);
    }
  }
}
