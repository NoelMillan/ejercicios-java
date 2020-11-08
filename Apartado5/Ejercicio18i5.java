public class Ejercicio18i5 {
  public static void main (String[] args) {
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca otro número distinto: ");
    int num2 = Integer.parseInt(System.console().readLine());
    int contador = num;
    if(num == num2){
      System.out.print("Los números introducidos deber ser diferentes");
    }
    else{
    if(num < num2){
      contador = num;
    }
    else {
      contador = num2;
    }
    while(contador < num || contador < num2) {
      System.out.print(contador + ", ");
      contador = contador + 7;
    }
  }
  }
}
