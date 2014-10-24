package frase;
import java.util.Scanner;
import java.util.ArrayList;
public class Frase {

	public static void main(String[] args) {
		Scanner lector = new Scanner (System.in);
		System.out.println("Escriu una frase: ");
		String frase = lector.nextLine();
		char[] lletres = {'a','b','c','d','e','g','h','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z', ' '	};
		
		int[] qtat = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int contador = 0;
		
		for (int i = 0; i < frase.length() ; i++) {
			for (int j = 0; j < lletres.length ; j++) {
				if (lletres[j] == frase.charAt(i)){
					qtat[j]++;
					if (frase.charAt(i) == '1' || frase.charAt(i) == '2' || frase.charAt(i)== '3' || frase.charAt(i) == '4' || frase.charAt(i) == '5'||
						frase.charAt(i)== '6' || frase.charAt(i) == '7' || frase.charAt(i) == '8' || frase.charAt(i) == '9' || frase.charAt(i) == '0'){
							contador++;
					}
				}
				
			}
		}
		
		for (int i = 0; i < lletres.length ; i++){
			System.out.print( lletres[i] + " " + qtat[i]);
			System.out.println();
		}
	}

}
