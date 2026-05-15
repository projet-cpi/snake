
public class ScoreResult {
	
		private String pseudo;
		private int score;
		private int temps;

		public ScoreResult(String pseudo, int score, int temps) {
			this.pseudo = pseudo;
			this.score = score;
			this.temps = temps;
		}

		public String getPseudo() {
			return pseudo;
		}

		public int getScore() {
			return score;
		}

		public int getTemps() {
			return temps;
		}

		
		public String toString() {
			return pseudo + " - Score : " + score + " - Temps : " + temps + "s";
		}
	}
	
