public class Affichage {
    private Grille grille ; // La grille de jeu

    // Constructeur : reçoit la grille en paramètre
    public Affichage(Grille grille) {
    	this.grille = grille;
    }

    // Affiche la grille vide
    public void afficher() {
    	grille.afficher();
    }

    // Affiche la grille avec la pomme et le serpent
    public void afficher(Apple apple, Serpent serpent) {
        
        // Place la tête du serpent ('T')
        grille.placer(serpent.getHead()[0], serpent.getHead()[1], 'T');

        // Récupère le corps du serpent
        int[][] corps = serpent.getBody();

        // Place chaque segment du corps ('X')
        for(int i = 0; i < serpent.getTaille(); i++) {
        	grille.placer(corps[i][0], corps[i][1], 'X');
        }
        
        // Place la pomme ('P')
        grille.placer(apple.getX(), apple.getY(), 'P');
        
        // Affiche la grille
        grille.afficher();
    }
}
