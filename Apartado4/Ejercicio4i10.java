
public class Ejercicio4i10 {

	public static void main(String [] args) {
		double dia;
		int mes;
		System.out.print("Introduzca el mes de su nacimiento (1-12): ");
		mes = Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca el dia de su nacimiento: ");
		dia = Double.parseDouble(System.console().readLine());
    if (mes <= 0 || mes > 12 || dia <= 0 || dia > 31) {
      System.out.print("Mes o dia invalido");
    } else {
		switch ((mes)) {
		case 1:
			if ((dia>=1 && dia<=19)) {
				System.out.println("Eres capricornio");
			} else {
				if ((dia>=20 && dia<=31)) {
					System.out.println("Eres Acuario");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 2:
			if ((dia>=1 && dia<=18)) {
				System.out.println("Eres Acuario");
			} else {
				if ((dia>=19 && dia<=29)) {
					System.out.println("Eres Piscis");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 3:
			if ((dia>=1 && dia<=20)) {
				System.out.println("Eres Piscis");
			} else {
				if ((dia>=20 && dia<=31)) {
					System.out.println("Eres Aries");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 4:
			if ((dia>=1 && dia<=19)) {
				System.out.println("Eres Aries");
			} else {
				if ((dia>=20 && dia<=30)) {
					System.out.println("Eres Tauro");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 5:
			if ((dia>=1 && dia<=20)) {
				System.out.println("Eres Tauro");
			} else {
				if ((dia>=20 && dia<=31)) {
					System.out.println("Eres Geminis");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 6:
			if ((dia>=1 && dia<=20)) {
				System.out.println("Eres Geminis");
			} else {
				if ((dia>=21 && dia<=30)) {
					System.out.println("Eres Cancer");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 7:
			if ((dia>=1 && dia<=22)) {
				System.out.println("Eres Cancer");
			} else {
				if ((dia>=23 && dia<=31)) {
					System.out.println("Eres Leo");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 8:
			if ((dia>=1 && dia<=22)) {
				System.out.println("Eres Leo");
			} else {
				if ((dia>=23 && dia<=31)) {
					System.out.println("Eres Virgo");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 9:
			if ((dia>=1 && dia<=22)) {
				System.out.println("Eres Virgo");
			} else {
				if ((dia>=23 && dia<=30)) {
					System.out.println("Eres Libra");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 10:
			if ((dia>=1 && dia<=22)) {
				System.out.println("Eres Libra");
			} else {
				if ((dia>=23 && dia<=31)) {
					System.out.println("Eres Escorpio");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 11:
			if ((dia>=1 && dia<=21)) {
				System.out.println("Eres Escorpio");
			} else {
				if ((dia>=22 && dia<=30)) {
					System.out.println("Eres Sagitario");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		case 12:
			if ((dia>=1 && dia<=21)) {
				System.out.println("Eres Sagitario");
			} else {
				if ((dia>=22 && dia<=31)) {
					System.out.println("Eres Capricornio");
				} else {
					System.out.println("Dato incorrecto");
				}
			}
			break;
		}
  }
	}


}

