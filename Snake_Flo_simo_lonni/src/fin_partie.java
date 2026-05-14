public class fin_partie {

    // Défaite : le serpent sort de la grille
    public static boolean collisionMur(Serpent serpent, Grille grille) {

        int x = serpent.getHead()[0];
        int y = serpent.getHead()[1];

        if(x < 0 || x >= grille.getNblig()
           || y < 0 || y >= grille.getNbCol()) {

            System.out.println("GAME OVER");
            return true;
        }

        return false;
    }

    // Victoire : taille max atteinte
    public static boolean victoire(Serpent serpent, int tailleMax) {

        if(serpent.getTaille() >= tailleMax) {

            System.out.println("VICTOIRE");
            return true;
        }

        return false;
    }

    // Vérification générale
    public static boolean finJeu(Serpent serpent,
                                 Grille grille,
                                 int tailleMax) {

        return collisionMur(serpent, grille)
                || victoire(serpent, tailleMax);
    }
}
