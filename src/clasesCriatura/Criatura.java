package clasesCriatura;

public class Criatura {
	
	private String name;
	private int life;
	private int AC; //Armor Class
	private int speed;
	private Stat str;
	private Stat dex;
	private Stat con;
	private Stat intel;
	private Stat wis;
	private Stat cha;	
	
	public Criatura(String name, int life, int aC, int speed, Stat str, Stat dex, Stat con,
			Stat intel, Stat wis, Stat cha) {
		super();
		this.name = name;
		this.life = life;
		this.AC = aC;
		this.speed = speed;
		this.str = str;
		this.dex = dex;
		this.con = con;
		this.intel = intel;
		this.wis = wis;
		this.cha = cha;		
	}
	
	public Criatura() {
		super();
		this.name = "";
		this.life = 0;
		this.AC = 0;
		this.speed = 0;
		this.str = new Stat();
		this.dex = new Stat();
		this.con = new Stat();
		this.intel = new Stat();
		this.wis = new Stat();
		this.cha = new Stat();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAC() {
		return AC;
	}

	public void setAC(int aC) {
		AC = aC;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Stat getStr() {
		return str;
	}

	public void setStr(Stat str) {
		this.str = str;
	}

	public Stat getDex() {
		return dex;
	}

	public void setDex(Stat dex) {
		this.dex = dex;
	}

	public Stat getCon() {
		return con;
	}

	public void setCon(Stat con) {
		this.con = con;
	}

	public Stat getIntel() {
		return intel;
	}

	public void setIntel(Stat intel) {
		this.intel = intel;
	}

	public Stat getWis() {
		return wis;
	}

	public void setWis(Stat wis) {
		this.wis = wis;
	}

	public Stat getCha() {
		return cha;
	}

	public void setCha(Stat cha) {
		this.cha = cha;
	}
	
	//Poner toString() aqui o en las clases Personaje y Encuentro
	
}
