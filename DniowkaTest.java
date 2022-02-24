package projekt.praca2;

import java.util.List;
import java.util.Scanner;

public class DniowkaTest {

	public static void main(String[] args) {
		List<projekt.praca2.Employee> emps = ObslugaPliku.wczytaj("pracownicy.CSV"); {
		for (Employee emp: emps) {
			//	System.out.println("Saldo " + emp.getLastName() + "wynosi: " + emp.getSaldo());
			Dniowka.obliczDniowke(emp); 
			

			
	}

		}}}

