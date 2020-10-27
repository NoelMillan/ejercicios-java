
public class Ejercicio4i13 {

	public static void main(String[] args) {
		double mayor;
		double menor;
		double num1;
		double num2;
		double num3;
		System.out.print("Introduzca el numero 1: ");
		num1 = Double.parseDouble(System.console().readLine());
		System.out.print("Introduzca el numero 2: ");
		num2 = Double.parseDouble(System.console().readLine());
		System.out.print("Introduzca el numero 3: ");
		num3 = Double.parseDouble(System.console().readLine());
		if ((num1==num2 || num1==num3 || num2==num3)) {
			System.out.println("Los numeros no pueden ser iguales");
		} else {
			if ((num1>num2 && num1>num3 && num2>num3)) {
				System.out.println(num1+", "+num2+", "+num3);
			} else {
				if ((num2>num1 && num2>num3 && num3<num1)) {
					System.out.println(num2+", "+num1+", "+num3);
				} else {
					if ((num3>num2 && num3>num1 && num2>num1)) {
						System.out.println(num3+", "+num2+", "+num1);
					} else {
						if ((num3>num1 && num1>num2)) {
							System.out.println(num3+", "+num1+", "+num2);
						} else {
							if ((num1>num2 && num1>num3 && num3>num2)) {
								System.out.println(num1+", "+num3+", "+num2);
							}
						}
					}
				}
			}
		}
	}


}

