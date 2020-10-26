public class Ejercicio4i1 {
  public static void main (String [] args) {
    System.out.print("Por favor, introduzca un día de la semana: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String NombreSemana;
    
    switch (dia) {
      case 1: 
        NombreSemana = "Lunes y toca  a primera hora ED";
        break;
      case 2:
        NombreSemana = "Martes y toca  a primera hora PRO";
        break;
      case 3:
        NombreSemana = "Miércoles y toca  a primera hora PRO";
        break;
      case 4:
        NombreSemana = "Jueves y toca  a primera hora PRO";
        break;
      case 5:
        NombreSemana = "Viernes y toca  a primera hora FOL";
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
