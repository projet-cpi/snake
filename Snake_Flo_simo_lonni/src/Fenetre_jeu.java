import java.util.Scanner;

public class Fenetre_jeu {
    private int nombre;
    private Sauvegarde sauvegarde = new Sauvegarde("sauvrecord"); // Fichier de sauvegarde du record

    public int getNombre() {
        return nombre;
    }

    // Constructeur : lance le jeu avec un message d'accueil
    Fenetre_jeu() {
        System.out.println("Bienvenu sur Snake");
        boucle_jeu();
    }

    // Affiche les règles du jeu et attend que le joueur appuie sur 1 pour quitter
    public void regle() {
    	 System.out.println("\n");
    	    System.out.println("╔═════════════════════════════════════════════════════════╗");
    	    System.out.println("║                                                         ║");
    	    System.out.println("║                        RÈGLES DU JEU                    ║");
    	    System.out.println("║                                                         ║");
    	    System.out.println("╠═════════════════════════════════════════════════════════╣");
    	    System.out.println("║                                                         ║");
    	    System.out.println("║      OBJECTIF                                           ║");
    	    System.out.println("║      Survivre le plus longtemps possible et battre      ║");
    	    System.out.println("║      votre propre record de score !                     ║");
    	    System.out.println("║                                                         ║");
    	    System.out.println("╠═════════════════════════════════════════════════════════╣");
    	    System.out.println("║                                                         ║");
    	    System.out.println("║      CONTRÔLES                                          ║");
    	    System.out.println("║      ▲  Flèche HAUT    →  Aller vers le haut            ║");
    	    System.out.println("║      ▼  Flèche BAS     →  Aller vers le bas             ║");
    	    System.out.println("║      ◄  Flèche GAUCHE  →  Aller à gauche                ║");
    	    System.out.println("║      ►  Flèche DROITE  →  Aller à droite                ║");
    	    System.out.println("║                                                         ║");
    	    System.out.println("╠═════════════════════════════════════════════════════════╣");
    	    System.out.println("║                                                         ║");
    	    System.out.println("║      NOURRITURE                                         ║");
    	    System.out.println("║    • De la nourriture apparaît aléatoirement sur la map ║");
    	    System.out.println("║   • Chaque repas mangé = +1 point et le serpent grandit ║");
    	    System.out.println("║      • Plus le serpent est long, plus c'est difficile ! ║");
    	    System.out.println("║                                                         ║");
    	    System.out.println("╠═════════════════════════════════════════════════════════╣");
    	    System.out.println("║                                                         ║");
    	    System.out.println("║      GAME OVER SI...                                    ║");
    	    System.out.println("║         Le serpent touche un bord de l'écran            ║");
    	    System.out.println("║         Le serpent se mord lui-même                     ║");
    	    System.out.println("║                                                         ║");
    	    System.out.println("╠═════════════════════════════════════════════════════════╣");
    	    System.out.println("║                                                         ║");
    	    System.out.println("║      NIVEAUX DE DIFFICULTÉ                              ║");
    	    System.out.println("║      Niveau 1  →  Vitesse lente    (idéal pour débuter) ║");
    	    System.out.println("║      Niveau 2  →  Vitesse normale  (pour les habitués)  ║");
    	    System.out.println("║      Niveau 3  →  Vitesse rapide   (pour les experts !) ║");
    	    System.out.println("║                                                         ║");
    	    System.out.println("╚═════════════════════════════════════════════════════════╝");
    	    System.out.println("\n");
        Scanner __sc_regle__ = new Scanner(System.in);
        while (true) {
            System.out.print("voulez vous quitter les regles ? Si oui appuyer sur 1 : ");
            String regle = __sc_regle__.nextLine();
            switch (regle) {
                case "1":
                    System.out.println("vous avez quitté les regles");
                    return; // Retour au menu principal
            }
        }
    }

    // Menu principal : règles, jouer ou quitter
    public void boucle_jeu() {
        Scanner __sc_boucle__ = new Scanner(System.in);
        while (true) {
            System.out.println("que voulez vous faire ? 1 pour les regles ; 2 pour jouer ; 3 pour quitter");
            String boucle = __sc_boucle__.nextLine();
            switch (boucle) {
                case "1":
                    regle(); // Affiche les règles
                    break;
                case "2":
                    modejeux(nombre); // Passe au choix du niveau
                    break;
                case "3":
                    System.out.println("vous avez quitté le jeu");
                    return; // Quitte le programme
            }
        }
    }

    // Menu de sélection du niveau de difficulté
    public void modejeux(int nombre) {
        Scanner __sc_mode__ = new Scanner(System.in);
        while (true) {
            System.out.println("Choisir un niveau : 1, 2, 3 ou 4 pour quitter");
            String mode = __sc_mode__.nextLine();
            switch (mode) {
                case "1":
                    System.out.println("vous avez choisi le niveau 1"); // Vitesse lente
                    break;
                case "2":
                    System.out.println("vous avez choisi le niveau 2"); // Vitesse normale
                    break;
                case "3":
                    System.out.println("vous avez choisi le niveau 3"); // Vitesse rapide
                    break;
                case "4":
                    System.out.println("vous avez quitté les modes de jeux");
                    return; // Retour au menu principal
            }
        }
    }

    // Boucle de jeu : attend que le joueur appuie sur 1 pour quitter
    public void jeu(int n) {
        Scanner __sc_option__ = new Scanner(System.in);
        while (true) {
            System.out.print("voulez vous quitter ? Si oui appuyer sur 1 : ");
            String option = __sc_option__.nextLine();
            switch (option) {
                case "1":
                    System.out.println("vous avez quitté");
                    return; // Fin de la partie
            }
        }
    }
}
