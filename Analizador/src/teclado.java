import java.util.Scanner;

public class teclado {

	Scanner sc;
	
	public teclado() {
		sc = new Scanner(System.in);
				
	}
		
	public String getString(String cadena) {
		String caracteres="";
		
		System.out.println(cadena);
		caracteres = sc.nextLine();
		
		
		return caracteres;
	}

	
}
