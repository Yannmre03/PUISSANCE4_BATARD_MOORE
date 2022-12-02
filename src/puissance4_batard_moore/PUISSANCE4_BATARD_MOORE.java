/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puissance4_batard_moore;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class PUISSANCE4_BATARD_MOORE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez le nom du joueur 1");
        Joueur Julia = new Joueur(sc.nextLine());
        System.out.println("entrez le nom du joueur 2");
        Joueur Yann = new Joueur(sc.nextLine());
        Partie nouvellePartie = new Partie(Julia, Yann);
        nouvellePartie.lancerPartie();
        
    }
    
}
