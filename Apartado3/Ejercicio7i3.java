public class Ejercicio7i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduzca la base imponible de un producto: ");
    linea = System.console().readLine();
    int baseimp;
    baseimp = Integer.parseInt(linea);
    
    double factura = baseimp * 0.16;
    double facturatotal = baseimp + factura;
    System.out.print("La factura es: " + facturatotal);
    }
}
