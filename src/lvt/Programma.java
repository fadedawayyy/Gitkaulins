package lvt;

import java.util.Random;
import java.util.Scanner;
public class Programma {
	

	public static void main(String[] args) {
		System.out.println("Esi sveicinats mana metama kaulina programma!");
		int skaitlis, reizes;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kaulinu?");
		reizes = scan.nextInt();
		for(int i=1; i<=reizes;i++) {
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);
		
	}
		scan.close();

}
}
