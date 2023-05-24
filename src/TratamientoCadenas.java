import java.util.Scanner;

public class TratamientoCadenas {
	
	Scanner sc = new Scanner (System.in);

	public String concatenarStrings() {
		
		String resultado="";
		
		System.out.println("¿Cual es el primer String?");
		String cadena_1 = sc.next();
		System.out.println("¿Cual es el segundo String");
		String cadena_2 = sc.next();
		resultado = cadena_1 + cadena_2;
		
		return resultado;
	}

	public int contar(String cadena) {
		int resultado = 0;
		
		for(int i=0; i<cadena.length(); i++) {
			if(cadena.substring(i, i+1).equals("a")) {
				resultado ++;
			}
		}
		return resultado;
	}
}
