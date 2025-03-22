import java.util.Scanner;

public class UniversoParalelo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Conductores = 5;
        int VelocidadMax = 60;
        int i = 1;
        Double VelocidadConductor = 0D;
        int Contador = 0;
        String Name = "";

        while (i <= Conductores) {
            Contador = Contador + 1;
            System.out.println("Señor conductor " + Contador + " conteste las sigientes preguntas");
            System.out.println("Ingrese su nombre ");
            Name = in.nextLine();
            System.out.println("ingrese la velocidad a la que iba");
            VelocidadConductor = in.nextDouble();

            in.nextLine();

            
            if (VelocidadConductor > VelocidadMax) {
                System.out.println("Usted acaba de sobre pasar la Velocidad Maxima");
                Double Multa = ((VelocidadConductor - 60) * 2.5);
                System.out.println("Y se le ponera una multa de " + Multa + " Dolares");

            } else {
                System.out.println("Gracias por ser un buen conductor señ@r " + Name);
            }
        }

    }
}
