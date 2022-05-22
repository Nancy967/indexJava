package scannerLo;

import java.util.Scanner;

public class stringLo {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Name?");
        String name = scan.next();
        
        System.out.println("Age?");
        int age = scan.nextInt();
        
        System.out.println("Quote?");
        String quote = scan.next();
        quote += scan.nextLine();
        
        System.out.println("I'm " + name +" I'm "+ age + " years old");
        System.out.println("My senior quote is " + quote);
    }
}
