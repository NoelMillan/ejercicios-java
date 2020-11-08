public class Ejercicio17i5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    int contador = 0;
    int contador2 = num;
    int suma = num;
    if(num < 0) {
      System.out.print("El número introducido debe ser positivo");
    }
    else {
      while(contador < 100){
        contador = contador + 1;
        contador2 = contador2 + 1;
        suma = suma + contador2;
        System.out.print(suma + ", ");
      }
    }
  }
}
