import java.util.Scanner;

public class TablaMultipicar {
	public static void main(String[] args) {
	int num;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Ingresar numero: ");
	num = sc.nextInt();
	
	System.out.print("--- TABLA MULTIPLICAR JAVA --- \n");
	
	for (int i = 0; i < 11; i++) {
		System.out.println(num + " x " + i + " = " + num*i);
	}
	}
}
