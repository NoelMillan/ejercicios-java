public class Ejercicio4i4 {
  public static void main (String [] args) {
    System.out.print ("Introduzca una hora: ");
    int hora;
    hora = Integer.parseInt(System.console().readLine());
    int calculo;
    int resta;
    int extra;
    if (hora >= 0 && hora <= 40) {
      calculo = hora * 12;
      System.out.println ("Su salario semanal serían: " + calculo + "  euros");
    }
    if (hora >= 41) {
      resta = hora - 40;
      extra = (40 * 12) + (resta * 16);
      System.out.println ("Su salario semanal serían: " + extra + " euros");
    }
    if (hora < 0) {
      System.out.println ("No puede trabajar número negativos");
    }
  }
}
