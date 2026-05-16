import java.util.*;

public class Grille {

    // Attributs
    private int nblig; // Nombre de lignes
    private int nbCol; // Nombre de colonnes
    private char[][] grille; // Tableau 2D représentant la grille

    // Constructeur : crée une grille de n lignes et p colonnes remplie de 'O'
    public Grille(int n, int p) {
        nblig = n;
        nbCol = p;
        grille = new char[nblig][nbCol];

        // Remplit toutes les cases avec le caractère 'O' (case vide)
        for (int i = 0; i < nblig; i++) {
            for (int j = 0; j < nbCol; j++) {
                grille[i][j] = 'O';
            }
        }
    }

    // Getter nombre de lignes
    public int getNblig() {
        return nblig;
    }

    // Getter nombre de colonnes
    public int getNbCol() {
        return nbCol;
    }

    // Affiche la grille case par case dans la console
    public void afficher() {
        System.out.println();
        for (int i = 0; i < nblig; i++) {
            for (int j = 0; j < nbCol; j++) {
                System.out.print(" | " + grille[i][j]); // Affiche chaque case entre | |
            }
            System.out.println(" | "); // Retour à la ligne après chaque ligne
        }
        System.out.println();
    }

    // Place le caractère c aux coordonnées (x, y) si elles sont valides
    public void placer(int x, int y, char c) {
        if (x >= 0 && x < nblig && y >= 0 && y < nbCol) { // Vérifie que les coordonnées sont dans la grille
            grille[x][y] = c;
        }
    }
}

