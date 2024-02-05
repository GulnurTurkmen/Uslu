package Uslu;
import java.util.Scanner;
public class Uslu {
	public static void main(String[] args) {
		int n,k;
		Scanner scan = new Scanner(System.in);
        System.out.println("taban sayı: ");
        n = scan.nextInt();
        System.out.println("üs: ");
        k = scan.nextInt();
        int total =1;
        
        for(int i=1;i<=k;i++) {
        	total=total*n;
        }
        System.out.print("sonuç:"+total);
	}
}
