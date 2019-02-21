package primerEjercicio;
//commited
//commited2
//commited2

import java.util.Scanner;

public class HorasTrabajo {
	public static void main(String[] args) {
		   
		Scanner entrada = new Scanner (System.in);
		   
		  int horas;
		  int sueldo;
		  System.out.println("Cuantos horas has trabajado este mes? ");
		  horas= entrada.nextInt();
		   
		  sueldo = horas*10;
		   
		  System.out.println("Tu sueldo de este mes es de: " + sueldo + " €");
		  entrada.close();
		 }
		}
