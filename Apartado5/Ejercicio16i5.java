public class Ejercicio16i5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    double contador = 1;
    double contador2 = 0;
    while(contador <= num){
      if((num % contador) == 0) {
        contador2 = contador2 + 1;
      }
      contador = contador + 1;
    }
    if (contador2 <= 2) {
      System.out.print("El número introducido es primo");
    }
    else {
      System.out.print("El número introducido no es primo");
    }
  }
}
