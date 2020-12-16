package clasesCriatura;

public class Hechizo {
	private String spellName;
	private int level;
	private String school;
	private String castingTime;
	private int range;
	private String components;
	private String duration;
	private String description;
	
	public String getSpellName() {
		return spellName;
	}
	public void setSpellName(String spellName) {
		this.spellName = spellName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if (this.level >= 1 && this.level <=9 ) { 
		this.level = level;
		}
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getCastingTime() {
		return castingTime;
	}
	public void setCastingTime(String castingTime) {
		this.castingTime = castingTime;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public String getComponents() {
		return components;
	}
	public void setComponents(String components) {
		this.components = components;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Hechizo(String spellName, int level, String school, String castingTime, int range, String components,
			String duration, String description) {
		super();
		this.spellName = spellName;
		this.level = level;
		this.school = school;
		this.castingTime = castingTime;
		this.range = range;
		this.components = components;
		this.duration = duration;
		this.description = description;
	}
	
	public Hechizo() {
		super();
		this.spellName = "";
		this.level = 0;
		this.school = "";
		this.castingTime = "";
		this.range = 0;
		this.components = "";
		this.duration = "";
		this.description = "";
	}
}
