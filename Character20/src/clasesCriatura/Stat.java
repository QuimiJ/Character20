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
		switch(score) {
		case 1:
			this.modifier = -5;
			break;

		case 2:
			this.modifier = -4;
			break;

		case 3:
			this.modifier = -4;
			break;

		case 4:
			this.modifier = -3;
			break;

		case 5:
			this.modifier = -3;
			break;

		case 6:
			this.modifier = -2;
			break;

		case 7:
			this.modifier = -2;
			break;

		case 8:
			this.modifier = -1;
			break;

		case 9:
			this.modifier = -1;
			break;

		case 10:
			this.modifier = 0;
			break;

		case 11:
			this.modifier = 0;
			break;

		case 12:
			this.modifier = 1;
			break;

		case 13:
			this.modifier = 1;
			break;

		case 14:
			this.modifier = 2;
			break;

		case 15:
			this.modifier = 2;
			break;

		case 16:
			this.modifier = 3;
			break;

		case 17:
			this.modifier = 3;
			break;

		case 18:
			this.modifier = 4;
			break;

		case 19:
			this.modifier = 4;
			break;

		case 20:
			this.modifier = 5;
			break;

		case 21:
			this.modifier = 5;
			break;	

		case 22:
			this.modifier = 6;
			break;

		case 23:
			this.modifier = 6;
			break;

		case 24:
			this.modifier = 7;
			break;

		case 25:
			this.modifier = 7;
			break;

		case 26:
			this.modifier = 8;
			break;

		case 27:
			this.modifier = 8;
			break;

		case 28:
			this.modifier = 9;
			break;

		case 29:
			this.modifier = 9;
			break;

		case 30:
			this.modifier = 10;
			break;

		default:
			this.modifier = 0;
			break;
		}
	}
	
	public int getModifier() {
		return modifier;
	}
	
	public void setModifier(int score) {
		this.modifier = modifier;
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