package projekt.praca2;

import java.util.List;

import java.util.Scanner;

import javax.swing.JOptionPane;

import projekt.praca2.Employee;

public class Dniowka {
	
	static void obliczDniowke(Employee emp) {

	int dniowka; 
	List<projekt.praca2.Employee> emps = ObslugaPliku.wczytaj("pracownicy.CSV"); 
		Scanner sc = new Scanner(System.in); 
		
	
			int rate = emp.getRate(); 
			System.out.println("Ile godzin przepracował/a dziś " + emp.getFirstName()+ " " + emp.getLastName() + " ?");
			int iloscGodzin = sc.nextInt(); 

			if (8 >= iloscGodzin) {
				dniowka = rate * iloscGodzin;
			} else {
				dniowka = ((iloscGodzin - 8)* (2*rate)) + 8*rate;
			} 
			
			int saldo = emp.getSaldo(); 
			saldo += dniowka; 
			System.out.println("Dniowka dla pracownika " + emp.getFirstName() + " " + emp.getLastName()+ " wynosi: " + dniowka);
		}
		}
		




 
