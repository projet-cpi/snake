
public class Affichage {
    private Grille grille ;
    public Affichage(Grille grille) {
    	this.grille = grille;
    }
    public void afficher() {
    	grille.afficher();
    }
    public void afficher(Apple apple,Serpent serpent) {
        
        grille.placer(serpent.getHead()[0],serpent.getHead()[1], 'T');
        int[][]corps=serpent.getBody();
        for(int i=0;i<serpent.getTaille();i++) {
        	grille.placer(corps[i][0],corps[i][1], 'X');
        }
        
        grille.placer(apple.getX(), apple.getY(), 'P');

        
        grille.afficher();
    }
}
