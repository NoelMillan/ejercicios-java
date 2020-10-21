public class Ejercicio8i3 {
  public static void main (String[] args) {
    String linea;
    System.out.print("Escriba las horas semanales que ha trabajado: ");
    linea = System.console().readLine();
    int horas;
    horas = Integer.parseInt(linea);
    
    int horaeuro = 12;
    int salario = horaeuro * horas;
    System.out.println("El salario semanal que le corresponde serían: " + salario + " euros");
    }
}
