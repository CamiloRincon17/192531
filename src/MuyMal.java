import java.util.Scanner;

public class MuyMal {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int i = 1;
        int ContadorThree = 0;
        int ContadorFive = 0;
        int ContadorNoMultiplos = 0;

        System.out.println("Ingrese un número límite:");
        int Limite = in.nextInt();

        while (i <= Limite) {
            if (i % 3 == 0) {
                ContadorThree = ContadorThree + i;
                System.out.println("El numero "+i + " es múltiplo de 3");
            }

            if (i % 5 == 0) {
                ContadorFive = ContadorFive + i;
                System.out.println("El numero "+i + " es múltiplo de 5");
            }

            if (i % 3 != 0 && i % 5 != 0) {
                ContadorNoMultiplos = ContadorNoMultiplos + i;
                System.out.println("El numero "+i + " no es múltiplo de 3 ni 5");
            }

            i = i + 1;
        }

        System.out.println("Suma de múltiplos de 3: " + ContadorThree);
        System.out.println("Suma de múltiplos de 5: " + ContadorFive);
        System.out.println("Suma del resto: " + ContadorNoMultiplos);
    }
}
