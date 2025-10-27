package tp3;
import java.util.Scanner;
public class exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = {4, 7, 2, 7, 9, 7, 3, 5};
        System.out.print("Entrez un entier : ");
        int n = sc.nextInt();
        int indice = -1;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == n) {
                indice = i;
            }
        }
        if (indice != -1) {
            System.out.println("L'entier " + n + " se trouve à l'indice " + indice + " du tableau.");
        } else {
            System.out.println("L'entier " + n + " n'existe pas dans le tableau.");
        }
    }
}


