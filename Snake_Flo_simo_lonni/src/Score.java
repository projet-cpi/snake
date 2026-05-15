public class Score {
		private int points = 0;
		private Object score;
		
		public int getPoints() {
			return points;
		}

		public void setPoints(int points) {
			this.points = points;
		}

		public Object getScore() {
			return score;
		}

		public void setScore(Object score) {
			this.score = score;
		}

		public void addPoints() {
			points ++;
		}
}

