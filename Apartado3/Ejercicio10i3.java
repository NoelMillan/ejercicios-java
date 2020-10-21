public class Ejercicio10i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduzca los Mb para pasarlos a Kb: ");
    linea = System.console().readLine();
    int mb;
    mb = Integer.parseInt(linea);
    
    int conversor = mb * 1024;
    System.out.println("Los Mb introducidos serían: " + conversor + " Kb");
    }
}
