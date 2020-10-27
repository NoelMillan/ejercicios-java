public class Ejercicio4i12 {
  public static void main (String[] args){
    int puntuacion = 0;
    System.out.println("Primera pregunta: ¿cuál es la capital de España?");
    String respuesta = System.console().readLine();
    
    if(respuesta.equals("Madrid")){
      System.out.println("La respuesta es correcta");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("La respuesta es incorrecta");
      puntuacion = puntuacion - 1;
    }
    
    System.out.println("Segunda pregunta: ¿cómo se llama nuestra galaxia?");
    String respuesta2 = System.console().readLine();
    if(respuesta2.equals("Via Láctea")){
      System.out.println("La respuesta es correcta");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("La respuesta es incorrecta");
      puntuacion = puntuacion - 1;
    }
    
    System.out.println("Tercera pregunta: ¿cuál es el animal con el miembro reproductor más grande del mundo?");
    String respuesta3 = System.console().readLine();
    if(respuesta3.equals("Ballena Azul")){
      System.out.println("La respuesta es correcta");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("La respuesta es incorrecta");
      puntuacion = puntuacion - 1;
    }
    
    System.out.println("Cuarta pregunta: ¿cuál es el símbolo químico de la plata?");
    String respuesta4 = System.console().readLine();
    if(respuesta4.equals("AG")){
      System.out.println("La respuesta es correcta");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("La respuesta es incorrecta");
      puntuacion = puntuacion - 1;
    }
    
    System.out.println("Quinta pregunta: ¿cuál es la vida útil de una libélula?");
    String respuesta5 = System.console().readLine();
    if(respuesta5.equals("24 horas")){
      System.out.println("La respuesta es correcta");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("La respuesta es incorrecta");
      puntuacion = puntuacion - 1;
    }
    
    System.out.println("Sexta pregunta: ¿cuál es el nombre completo de la muñeca, Barbie?");
    String respuesta6 = System.console().readLine();
    if(respuesta6.equals("Barbara Millicent Roberts")){
      System.out.println("La respuesta es correcta");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("La respuesta es incorrecta");
      puntuacion = puntuacion - 1;
    }
    
    System.out.println("Séptima pregunta: ¿cuál es la capital de Portugal?");
    String respuesta7 = System.console().readLine();
    if(respuesta7.equals("Lisboa")){
      System.out.println("La respuesta es correcta");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("La respuesta es incorrecta");
      puntuacion = puntuacion - 1;
    }
    
    System.out.println("Octava pregunta: ¿Quién inventó el gramófono?");
    String respuesta8 = System.console().readLine();
    if(respuesta8.equals("Emile Berliner")){
      System.out.println("La respuesta es correcta");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("La respuesta es incorrecta");
      puntuacion = puntuacion - 1;
    }
    
    System.out.println("Novena pregunta: ¿Cómo se llamó el primer disco de Adele?");
    String respuesta9 = System.console().readLine();
    if(respuesta9.equals("Gloria de la ciudad natal")){
      System.out.println("La respuesta es correcta");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("La respuesta es incorrecta");
      puntuacion = puntuacion - 1;
    }
    
    System.out.println("Décima pregunta: ¿Cuál es el verdadero nombre de Hodor en Juego de Tronos?");
    String respuesta10 = System.console().readLine();
    if(respuesta10.equals("Wylis")){
      System.out.println("La respuesta es correcta");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("La respuesta es incorrecta");
      puntuacion = puntuacion - 1;
    }
    System.out.print("Tu puntuación han sido " + puntuacion + " puntos");
  }
}
