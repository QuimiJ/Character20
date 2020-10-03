package ClasesCriatura;

public class Criatura {
	
	private String name;
	private int life;
	private int AC; //Armor Class
	private int speed;
	private int str;
	private int dex;
	private int con;
	private int intel;
	private int wis;
	private int cha;	
	
	public Criatura(String name, int life, int aC, int speed, int str, int dex, int con,
			int intel, int wis, int cha) {
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
		this.str = 0;
		this.dex = 0;
		this.con = 0;
		this.intel = 0;
		this.wis = 0;
		this.cha = 0;
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

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getIntel() {
		return intel;
	}

	public void setIntel(int intel) {
		this.intel = intel;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}
	
	//Poner toString() aqui o en las clases Personaje y Encuentro
	
}
