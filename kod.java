import java.util.Scanner;

public class Ders {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Hesaplamak istediginiz sayiyi giriniz = ");
		double n = scan.nextDouble();
		for (int i = 1; i < n; i++)
		if (i % 2 != 0)
		System.out.println(i);
		System.out.println("Program Sonlandı...");
		}
		}
