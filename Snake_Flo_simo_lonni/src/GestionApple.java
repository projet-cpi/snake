
import java.util.ArrayList;
import java.util.Random;

public class GestionApple {
	
	public ArrayList<Apple> apples;
	private int largeur;
	private int hauteur;
	private Random random;
	
	
	public GestionApple(int largeur, int hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.apples = new ArrayList <>();
		this.random = new Random();
	}
	
	public ArrayList <Apple> getApples() {
		return apples;
	}
	
	public boolean InArena(int x, int y) {
		return x >= 0 && x < largeur && y >= 0 && y < hauteur;
		}
	
	public boolean CaseFull(int x, int y) {
		for (Apple apple : apples) {
			if (apple.getX() == x && apple.getY() == y) {
				return true;
			}
		}
		return false;
	}
	
	public boolean FullCaseSnake(int x, int y, Serpent snake) {
		int [] head = snake.getHead();
		
		if (head != null && head [0] == x && head [1] == y) {
			return true;
		}
		
		int [][] body = snake.getBody ();
		
		if (body != null) {
			for (int i = 0; i < body.length; i++) {
				if (body [i] != null && body [i][0] == x && body[i][1]== y) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean CaseFree(int x, int y, Serpent snake) {
		if (!InArena(x, y)) {
			return false;
		}
		
		if (CaseFull(x, y)) {
			return false;
		}
		
		if (FullCaseSnake (x, y, snake)) {
			return false;
		}
		return true;
	}
	
	
	public void AddRandomApple(Serpent snake) {
		int essaisMax = largeur * hauteur * 2;
		int essais = 0;
	

	
	while (essais < essaisMax) {
		int x = random.nextInt(largeur);
		int y = random.nextInt(hauteur);
		
		if (CaseFree(x, y, snake) && FreeNeighbor(x, y, snake)) {
			apples.add(new Apple(x, y));
			return;
				}
			}
	
		essais++;
		
		}
	
	
	
	public int AppleWanted(Serpent snake) {
		int wanted = 1 + snake.getTaille() / 4;
		int nbCasesSnake = largeur * hauteur;
		int nbCasesLibres = snake.getTaille();
		
		
		if (nbCasesLibres < 0) {
			nbCasesLibres = 0;
		}
		
		if (wanted > nbCasesLibres) {
			wanted = nbCasesLibres;
		}
		
		return wanted;
	}
	
	
	public void UpdateApple(Serpent snake) {
		int wanted = AppleWanted(snake);
		
		while (apples.size() < wanted) {
			AddRandomApple(snake);
		}
	}
	
	public void AppleEaten(Serpent snake, Score score) {
		for (int i = 0; i < apples.size(); i++) {
			Apple apple = apples.get(i);
			
			if(snake.collision_with(apple.getCoord())) {
				score.addPoints();
				snake.scal(apple.getCoord());
				apples.remove(i);
				UpdateApple(snake);
				return;
			}
		}
	}
	
	public boolean FreeNeighbor(int x, int y, Serpent snake) {
		int[][] directions = {
			{1, 0},
			{-1, 0},
			{0, 1},
			{0, -1}
		};

		for (int[] dir : directions) {
			int nx = x + dir[0];
			int ny = y + dir[1];

			if (InArena(nx, ny) && CaseFree(nx, ny, snake)) {
				return true;
			}
		}

		return false;
	}
	
	
	
}
