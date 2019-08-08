package julian.espejo;

import java.util.Scanner;

public class Capicua {


    
	
	public static void main(String[] args) {
		
		 
		Scanner sc = new Scanner(System.in);
		 
	        System.out.print("Introduce un número: ");
	        int num = sc.nextInt();
	        
	        int iteracion=0;
	        		
	           while(esCapicua(num)==false) {
	        	        		
	        	    int numInvertido=invertirNumero(num);
	        		iteracion++;
	        		num+=numInvertido;
	    			System.out.println(num+" "+iteracion);
	    			
	    			if(esCapicua(num)==true) {
	    			
	    				break;
	    			}
	    			
	    			
	        	 }
	           
	          
	    }
	 
	    public static boolean esCapicua(int num) {
	      	
	        return num==invertirNumero(num);
	    }
	     
	    public static int invertirNumero(int num){
	        int cifra, inverso = 0;
	        while(num>0){
	            cifra = num%10;
	            inverso = cifra + inverso * 10; 
	            num /= 10;
	        }
	        return inverso;
	    }
	    
	    

	}