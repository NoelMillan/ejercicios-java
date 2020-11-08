public class Ejercicio15i5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca su exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    int contador = 0;
    int potencia = num;
    while(contador < exponente) {
      System.out.print(potencia + ", ");
      potencia = num * potencia;
      contador = contador + 1;
    }
  }
}
