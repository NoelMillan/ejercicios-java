public class Ejercicio4i2 {
  public static void main (String [] args) {
    System.out.print ("Introduzca una hora: ");
    int hora;
    hora = Integer.parseInt(System.console().readLine());
    if (hora <= 12 && hora >= 6) {
      System.out.println ("Buenos días");
    }
    if (hora <= 20 && hora >= 13) {
      System.out.println ("Buenas tardes"); 
    }
    if (hora <= 5 || hora >= 21 && hora <= 24) {
      System.out.println ("Buenas noches");
    }
    if (hora >= 25) {
      System.out.println ("Hora no válida");
    }
  }
}
