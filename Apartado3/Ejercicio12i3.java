public class Ejercicio12i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Introduzca la nota del primer examen: ");
    linea = System.console().readLine();
    int nota1;
    nota1 = Integer.parseInt(linea);
    
    String linea2;
    System.out.print("Introduzca l nota que quieres sacar en el trimestre: ");
    linea2 = System.console().readLine();
    int notarequerida;
    notarequerida = Integer.parseInt(linea2);
    
    int media = (notarequerida * 2) - nota1;
    System.out.println("La nota que deberías sacar en el siguiente examen es: " + media);
    }
}
