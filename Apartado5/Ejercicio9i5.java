public class Ejercicio9i5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número: ");
    long num = Integer.parseInt(System.console().readLine());
    long contador = 1;
    long contador2 = 0;
    while(contador <= num) {
      contador = contador * 10;
      contador2 = contador2 + 1;
    }
    System.out.print("EL número que has introducido tiene " + contador2 + " dígitos");
  }
}
