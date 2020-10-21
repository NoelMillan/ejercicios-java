public class Ejercicio11i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduzca los Kb para pasarlos a Mb: ");
    linea = System.console().readLine();
    int kb;
    kb = Integer.parseInt(linea);
    
    int conversor = kb / 1024;
    System.out.println("Los Kb introducidos serían: " + conversor + " Mb");
    }
}
