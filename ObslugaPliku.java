package projekt.praca2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObslugaPliku {
	private static final String SEP = ",";


	public static List<Employee> wczytaj(String sciezka) {
		return wczytaj(new File(sciezka));
	}
	
	public static List<Employee> wczytaj(File plik) {
		List<Employee> emps = new ArrayList<>();
		try(Scanner scanner = new Scanner(plik)) {
			while(scanner.hasNextLine()) {
				String linia = scanner.nextLine();
				String[] t = linia.split(SEP, 11);
				Employee emp = new Employee(Integer.parseInt(t[0]),
					(t[1]),(t[2]),(t[3]),
					Integer.parseInt(t[4]),(t[5]),Integer.parseInt(t[6]));
				emps.add(emp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return emps;
	}
	
	public static void zapisz(List<Employee> emps, String sciezka) {
		zapisz(emps, new File(sciezka));
	}
	
	public static void zapisz(List<Employee> emps, File plik) {
		try(PrintWriter out = new PrintWriter(plik)) {
			for (Employee emp : emps) {
				out.print(emp.getNumber());
				out.print(SEP);
				out.print(emp.getFirstName());
				out.print(SEP);
				out.print(emp.getLastName());
				out.print(SEP);
				out.print(emp.getJobTitle());
				out.print(SEP);
				out.print(emp.getRate());
				out.print(SEP);
				out.print(emp.getCity());
				out.print(SEP);
				out.print(emp.getSaldo());
				out.print(SEP); 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
