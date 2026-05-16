public class fin_partie {

    // Défaite : vérifie si la tête du serpent est sortie de la grille
    public static boolean collisionMur(Serpent serpent, Grille grille) {
        int x = serpent.getHead()[0]; // Coordonnée ligne de la tête
        int y = serpent.getHead()[1]; // Coordonnée colonne de la tête

        if (x < 0 || x >= grille.getNblig()
         || y < 0 || y >= grille.getNbCol()) { // Hors des limites
            System.out.println("GAME OVER");
            return true;
        }
        return false;
    }

    // Victoire : vérifie si le serpent a atteint la taille maximale
    public static boolean victoire(Serpent serpent, int tailleMax) {
        if (serpent.getTaille() >= tailleMax) {
            System.out.println("VICTOIRE");
            return true;
        }
        return false;
    }

    // Vérification générale : retourne true si le jeu est terminé (défaite ou victoire)
    public static boolean finJeu(Serpent serpent, Grille grille, int tailleMax) {
        return collisionMur(serpent, grille)
            || victoire(serpent, tailleMax);
    }
}
