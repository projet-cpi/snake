
import java.util.*;

public class Grille {
	
	//Attributs
	private int nblig;
	private int nbCol;
	private char [][] grille;
	
	//Constructeur
	public Grille(int n, int p) {
		nblig = n;
		nbCol = p;
		grille = new char[nblig][nbCol];
		
		for(int i=0;i<nblig;i++) {
			for(int j=0; j<nbCol; j++) {
				
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
	//Methodes
	
	public void afficher() {
		System.out.println();
		for(int i=0;i<nblig;i++) {
			for(int j=0; j<nbCol; j++) {
				
				System.out.print(" | " + grille[i][j]);
			}
			System.out.println(" | ");
		}
		System.out.println();
	}
	public void placer(int x, int y, char c) {
	    if (x >= 0 && x < nblig && y >= 0 && y < nbCol) {
	        grille[x][y] = c;
	    }
	}
}
