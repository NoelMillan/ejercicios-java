
public class Ejercicio4i11 {

	public static void main(String[] args) {
		double calculo;
		int hora;
		double minuto;
		double sec;
		System.out.print("Introduzca una hora: ");
		hora = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca los minutos: ");
		minuto = Double.parseDouble(System.console().readLine());
		if ((hora<=0 || hora>=24)) {
			System.out.println("Hora no valida");
		} else {
			if ((minuto<0 || minuto>=60)) {
				System.out.println("Minutos no validos");
			} else {
				switch (hora) {
				case 1:
					calculo = 60-minuto;
					sec = (22*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 2:
					calculo = 60-minuto;
					sec = (21*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 3:
					calculo = 60-minuto;
					sec = (20*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 4:
					calculo = 60-minuto;
					sec = (19*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 5:
					calculo = 60-minuto;
					sec = (18*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 6:
					calculo = 60-minuto;
					sec = (17*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 7:
					calculo = 60-minuto;
					sec = (16*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 8:
					calculo = 60-minuto;
					sec = (15*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 9:
					calculo = 60-minuto;
					sec = (14*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 10:
					calculo = 60-minuto;
					sec = (13*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 11:
					calculo = 60-minuto;
					sec = (12*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 12:
					calculo = 60-minuto;
					sec = (11*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 13:
					calculo = 60-minuto;
					sec = (10*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 14:
					calculo = 60-minuto;
					sec = (9*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 15:
					calculo = 60-minuto;
					sec = (8*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 16:
					calculo = 60-minuto;
					sec = (7*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 17:
					calculo = 60-minuto;
					sec = (6*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 18:
					calculo = 60-minuto;
					sec = (5*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 19:
					calculo = 60-minuto;
					sec = (4*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 20:
					calculo = 60-minuto;
					sec = (3*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 21:
					calculo = 60-minuto;
					sec = (2*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 22:
					calculo = 60-minuto;
					sec = (1*3600)+(calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				case 23:
					calculo = 60-minuto;
					sec = (calculo*60);
					System.out.println("Los segundos que faltan para llegar a la medianoche son: "+sec);
					break;
				}
			}
		}
	}
}

