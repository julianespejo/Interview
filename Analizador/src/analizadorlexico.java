import java.util.StringTokenizer;

public class analizadorlexico {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		teclado in = new teclado();
		String cadena = in.getString("Ingresa los caracteres");	
		dividirstring(cadena);
		
	}
	
	
	public static void dividirstring (String cadena){

	    StringTokenizer token = new StringTokenizer (cadena, "\\(\\d{2}\\,\\d{6}\\)a-z0-9", true)  ;
	  
	    while(token.hasMoreTokens()){
	               
	           System.out.println(token.nextToken());
	            
	    } 
	  
	}
	
	
	            
	
}
