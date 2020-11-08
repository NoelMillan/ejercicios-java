public class Ejercicio7i5 {
  public static void main(String[] args) {
    int contador = 0;
    System.out.print("Introduzca el código de la caja fuerte (tiene 4 intentos): ");
    int codigo = Integer.parseInt(System.console().readLine());
    if (contador == 4) {
      System.out.print("Te has quedado sin intentos");
    }
    else {
      if (codigo != 1111) {
        while (codigo != 1111 && contador < 3) {
          System.out.print("El código es incorrecto, inténtelo de nuevo: ");
          codigo = Integer.parseInt(System.console().readLine());
          contador = contador + 1;
        }
      }
      else {
        System.out.print("EL código es correcto, has abierto la caja fuerte");
      }
    }
  }
}
