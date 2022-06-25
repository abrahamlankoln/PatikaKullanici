import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password, newPassword;
		int control;
		Scanner deger = new Scanner(System.in);
		System.out.print("kullanici adinizi giriniz: ");
		userName = deger.nextLine();
		System.out.print("sifre giriniz: ");
		password = deger.nextLine();
		if (userName.equals("patika") && password.equals("java")) {
			System.out.print("giris basarili");
		} else {
			System.out.print("sifre yanlis...\nsifre yenilemek icin 1'e basiniz: ");
			control = deger.nextInt();
			if (control == 1) {
				System.out.print("yeni sifre giriniz");
				Scanner dgr = new Scanner(System.in);
				newPassword = dgr.nextLine();
			
			if (newPassword.equals("java")) {
				System.out.print("eski sifre ile yeni sifre ayni olamaz ");
			} else {
				System.out.print("sifre basarili bir sekilde degismistir ");
			}
		}

	}

}}
