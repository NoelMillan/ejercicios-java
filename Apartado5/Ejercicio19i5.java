
public class Ejercicio19i5 {
  public static void main(String[] args) {
    System.out.print("Introduzca un carácter: ");
    String caracter = System.console().readLine();
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    int fila = num;
    int espacios = 0;
    int contador = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 1;
    while (contador < num){
      while (espacios < num) {
        System.out.print(" ");
        espacios = espacios + 1;
      }
      contador3 = contador3 + 1;
      espacios = 0 + contador3;
        while (fila <= num){
          System.out.print(caracter);
          fila = fila + 1;
        }
      contador2 = contador2 + 1;
      fila = (num - contador4) - contador2;
      System.out.println("");
      contador = contador + 1;
      contador4 = contador4 + 1;
    }
  }
}

