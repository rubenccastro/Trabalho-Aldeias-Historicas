package nicee;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
    	String txt; 
    	String rev="";
    	Scanner input = new Scanner(System.in);
        System.out.println("Escreva com espaços: ");
        txt = input.nextLine();
        input.close();
        for(int i=0; i<txt.length();i++) {
        	char c = txt.charAt(i);
        	rev = c+rev;
        	}
        System.out.println(rev);
        }
    }