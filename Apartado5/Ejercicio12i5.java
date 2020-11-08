public class Ejercicio12i5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    int contador = 1;
    int num2 = 0;
    int num3 = 1;
    int suma = 1;
    System.out.print("0, ");
    while(contador < num) {
      System.out.print(suma + ", ");
      suma = num2 + num3;
      num2 = num3;
      num3 = suma;
      contador = contador + 1;
    }
  }
}
