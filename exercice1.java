package exercice1;

import java.util.Scanner;

public class exercice1{
    public static void main(String[] args) {
        Scanner cl = new Scanner(System.in);
        boolean ajouter = true;

        do {
            System.out.println("Entrer le nom :");
            String nom = cl.nextLine();

            System.out.println("Entrer le prenom :");
            String prenom = cl.nextLine();

            System.out.println("Entrer l'âge :");
            int age = cl.nextInt();

            System.out.println("Entrer le salaire :");
            double salaire = cl.nextDouble();

            System.out.println("Est-ce que tu veux ajouter un autre employé ? (true/false)");
            ajouter = cl.nextBoolean();
            cl.nextLine(); 

        } while (ajouter == true);

        cl.close();
    }
}
