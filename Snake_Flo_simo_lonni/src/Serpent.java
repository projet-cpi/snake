
public class Serpent {
	private int[] head ;
	private int[][] body;     
	private int taille;
	private char direction='d';
	
	
	
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
	
	
	
	public boolean collision_with(int[] coord) {
		
		if(coord[0]==head[0] && coord[1]==head[1]) {
			return true;

			
		}
		return false;
	}
	
	void scal(int[]coord_pomme){
		
		setTaille();
		int[][]resultat =new int[taille][2];
		resultat[0]=this.head;
		
		
		for(int i=1;i<taille;i++) {
			
			resultat[i]=this.body[i-1];
		}
		
		this.head=coord_pomme;
			
		}
	
	boolean verif_eat(int []head_future,int[][] tab_pomme) {
		for(int[]pomme : tab_pomme) {
			if((pomme[0]==head[0])&(pomme[1]==head_future[1])){
				return true ;
			}
		}
		return false;
	}
	
	boolean move(char d) {
		if((this.direction=='l'&& d=='r')||(this.direction=='r'&& d=='l')||(this.direction=='t'&& d=='b')||(this.direction=='b'&& d=='t')){
			return false;
		}
		
		int[][]resultat=new int[taille][2];
		resultat[0]=this.head;
		
		for(int i=1;i<taille;i++){
			
			resultat[i]=this.body[i];
			
		}
		int[][]pommes= {{2,3},{3,2}};
		switch(d) {
		case 'r':
			int[]head_r= {head[0]-1,head[1]};
			if(verif_eat(head_r,pommes)==true) {
				scal(head_r);
				return true;	
			}
			this.head[0]-=1;
			
		case 'l':
			int[]head_l= {head[0]+=1,head[1]};
			if(verif_eat(head_l,pommes)==true) {
				scal(head_l);
				return true;	
			}
			this.head[0]+=1;
			
		case 't':
			int[]head_t= {head[0],head[1]-=1};
			if(verif_eat(head_t,pommes)==true) {
				scal(head_t);
				return true;	
			}
			this.head[1]-=1;
			
		case 'd':
			int[]head_d= {head[0],head[1]+=1};
			if(verif_eat(head_d,pommes)==true) {
				scal(head_d);
				return true;	
			}
			this.head[1]+=1;
		}
		
		return true;
		
	}

}
