import java.awt.Point;

public class Serpent {
	private int[] head ={5, 5};
	private int[][] body = {{4, 5}};    
	private int taille;
	private Point direction = new Point(1, 0);
	
	
	
	public int[] getHead() {
		return head;
	}
	public void setHead(int[] head) {
		this.head = head;
	}
	
	
	public int[][] getBody() {
		return body;
	}
	public void setBody(int[][] body) {
		this.body = body;
	}
	
	
	public int getTaille() {
		return taille;
	}
	public void setTaille() {
		this.taille += 1;
	}
	 public boolean setDirection(String touche) {
	        switch (touche) {
	            case "UP"    ->{ if (direction.y != 1)  direction = new Point(0, -1);return true ; }
	            case "DOWN"  -> { if (direction.y != -1) direction = new Point(0,  1);return true ; }
	            case "LEFT"  -> { if (direction.x != 1)  direction = new Point(-1, 0);return true ;}
	            case "RIGHT" -> { if (direction.x != -1) direction = new Point(1,  0); return true;}
	        }
	        return false;
	    }
	
	
	public boolean collision_with(int[] coord) {
		
		if(coord[0]==head[0] && coord[1]==head[1]) {
			return true;

			
		}
		return false;
	}
	
	void scal(int[]coord_pomme){
		
		setTaille();
		int[][]resultat = new int[taille][2];
		resultat[0]=this.head;
		
		
		for(int i=1;i<taille;i++) {
			
			resultat[i]=this.body[i-1];
		}
		
		this.head = coord_pomme;
		this.body = resultat;
			
		}
	
	boolean verif_eat(int []head_future,int[][] tab_pomme) {
		for(int[]pomme : tab_pomme) {
			if ((pomme[0] == head_future[0]) && (pomme[1] == head_future[1])){
				return true ;
			}
		}
		return false;
	}
	
	boolean move(String touche) {
		if(setDirection(touche)) {
			
		
		int[] future_head = {head[0]+direction.x,head[1]+direction.y};
		int[][] pomme ={ {0,1}} ;
		
		if(verif_eat(future_head,pomme)){
			this.scal(future_head);
			return true ;
			
		}
		int[][]resultat = new int[taille][2];
		resultat[0]=this.head;
		
		
		for(int i=1;i<taille;i++) {
			
			resultat[i]=this.body[i-1];
		}
		
		this.head = future_head;
		this.body = resultat;
		
		
		return true;
		}
		return false;
		
	}

}
