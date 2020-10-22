package clasesCriatura;

public class Stat {

	private int score;
	private int modifier;
	
	public Stat(int score, int modifier) {
		super();
		this.score = score;
		this.modifier = modifier;
	}
	
	public Stat() {
		super();
		this.score = 10;
		this.modifier = 0;
	}

	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
		if (score == 1) {
			this.modifier = -5;
		}
		if (score == 2 || score == 3) {
			this.modifier = -4;
		}
		if (score == 4 || score == 5) {
			this.modifier = -3;
		}
		if (score == 6 || score == 7) {
			this.modifier = -2;
		}
		if (score == 8 || score == 9) {
			this.modifier = -1;
		}
		if (score == 10 || score == 11) {
			this.modifier = 0;
		}
		if (score == 12 || score == 13) {
			this.modifier = 1;
		}
		if (score == 14 || score == 15) {
			this.modifier = 2;
		}
		if (score == 16 || score == 17) {
			this.modifier = 3;
		}
		if (score == 18 || score == 19) {
			this.modifier = 4;
		}
		if (score == 20 || score == 21) {
			this.modifier = 5;
		}
		if (score == 22 || score == 23) {
			this.modifier = 6;
		}
		if (score == 24 || score == 25) {
			this.modifier = 7;
		}
		if (score == 26 || score == 27) {
			this.modifier = 8;
		}
		if (score == 28 || score == 29) {
			this.modifier = 9;
		}
		if (score == 30) {
			this.modifier = 10;
		}
	}
	
	public int getModifier() {
		return modifier;
	}

	public String toString() {
		return "Stat [score=" + score + ", modifier=" + modifier + "]";
	}
	
	public String scoreToString() {
		return ""+score;
	}
	
	public String modToString() {
		if (modifier > 0) {
			return "(+"+modifier+")";
		} else {
			return "("+modifier+")";
		}
	}
}
