package tp3;
import java.util.Scanner;
public class exercice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre d'élèves : ");
        int n = sc.nextInt();
        double[] notes = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Note de l'élève " + (i + 1) + " : ");
            notes[i] = sc.nextDouble();
        }

        double somme = 0, max = notes[0], min = notes[0];
        for (int i = 0; i < n; i++) {
            somme += notes[i];
            if (notes[i] > max) max = notes[i];
            if (notes[i] < min) min = notes[i];
        }

        double moyenne = somme / n;
        System.out.println("Somme : " + somme);
        System.out.println("Plus grande note : " + max);
        System.out.println("Plus petite note : " + min);
        System.out.println("Moyenne : " + moyenne);
    }
}

