public class Ejercicio4i3 {
  public static void main (String [] args) {
    System.out.print("Por favor, introduzca un día de la semana: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String NombreSemana;
    
    switch (dia) {
      case 1: 
        NombreSemana = "Lunes";
        break;
      case 2:
        NombreSemana = "Martes";
        break;
      case 3:
        NombreSemana = "Miércoles";
        break;
      case 4:
        NombreSemana = "Jueves";
        break;
      case 5:
        NombreSemana = "Viernes";
        break;
      case 6:
        NombreSemana = "Sábado";
        break;
      case 7:
        NombreSemana = "Domingo";
        break;
      default:
        NombreSemana = "No existe ese día de la semana.";
      }
      System.out.println("El día de la semana introducido es: " + NombreSemana);
      
  }
}
