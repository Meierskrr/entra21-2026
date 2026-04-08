import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        int[] par = new int[10];
        int p = 0;

        int[] impar = new int[10];
        int imp = 0;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Escolha um número: ");
            int n = s.nextInt();

            if (n % 2 == 0) {
                par[p] = n;
                p++;
            } else {
                impar[imp] = n;
                imp++;
            }
        }

        System.out.print("Os números pares digitados foram: ( ");
        for (int i = 0; i < p; i++) {
            System.out.print(par[i] + " ");
        }
        System.out.println(")");
        

        System.out.print("Os números impares digitados foram: ( ");
        for (int i = 0; i < imp; i++) {
            System.out.print(impar[i] + " ");
        }
        System.out.println(")");
        

        s.close();
    }
}
		
		
		
	
	
		