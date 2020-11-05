package clasesCriatura;

import java.util.Arrays;

public class Personaje extends Criatura {
	
	//Saves
	private int strsave = str.getModifier();
	private int dexsave = dex.getModifier();
	private int consave = con.getModifier();
	private int intsave = intel.getModifier();
	private int wissave = wis.getModifier();
	private int chasave = cha.getModifier();
	
	//Skills
	private int acrobacias = dex.getModifier();
	private int tratoAnimales = wis.getModifier();
	private int arcana = intel.getModifier();
	private int atletismo = str.getModifier();
	private int enganyo = cha.getModifier();
	private int historia = intel.getModifier();
	private int perspicacia = wis.getModifier();
	private int intimidacion = cha.getModifier();
	private int investigacion = intel.getModifier();
	private int medicina = wis.getModifier();
	private int naturaleza = intel.getModifier();
	private int percepcion = wis.getModifier();
	private int interpretacion = cha.getModifier();
	private int persuasion = cha.getModifier();
	private int religion = intel.getModifier();
	private int juegoManos = dex.getModifier();
	private int sigilo = dex.getModifier();
	private int supervivencia = wis.getModifier();
	
	//Otros
	private int bonoCompetencia;
	private int iniciativa = dex.getModifier();
    Arma[] armas;
    Clase clasepj;
    Hechizo[] hechizos;
    
    //Pertenencias
    private int piezasCobre;
    private int piezasPlata;
    private int piezasOro;
    private int piezasElectrum;
    private int piezasPlatino;
    private String equipo;
    private String tesoro;
    
    //Trasfondo
    private String idiomas;
    private String rasgosPersonalidad;
    private String ideales;
    private String vinculos;
    private String defectos;
    private Raza raza;
    private Subraza subraza;
    
    
    //Getters y setters
	public int getStrsave() {
		return strsave;
	}
	public void setStrsave(int strsave) {
		this.strsave = strsave;
	}
	public int getDexsave() {
		return dexsave;
	}
	public void setDexsave(int dexsave) {
		this.dexsave = dexsave;
	}
	public int getConsave() {
		return consave;
	}
	public void setConsave(int consave) {
		this.consave = consave;
	}
	public int getIntsave() {
		return intsave;
	}
	public void setIntsave(int intsave) {
		this.intsave = intsave;
	}
	public int getWissave() {
		return wissave;
	}
	public void setWissave(int wissave) {
		this.wissave = wissave;
	}
	public int getChasave() {
		return chasave;
	}
	public void setChasave(int chasave) {
		this.chasave = chasave;
	}
	public int getAcrobacias() {
		return acrobacias;
	}
	public void setAcrobacias(int acrobacias) {
		this.acrobacias = acrobacias;
	}
	public int getTratoAnimales() {
		return tratoAnimales;
	}
	public void setTratoAnimales(int tratoAnimales) {
		this.tratoAnimales = tratoAnimales;
	}
	public int getArcana() {
		return arcana;
	}
	public void setArcana(int arcana) {
		this.arcana = arcana;
	}
	public int getAtletismo() {
		return atletismo;
	}
	public void setAtletismo(int atletismo) {
		this.atletismo = atletismo;
	}
	public int getEnganyo() {
		return enganyo;
	}
	public void setEnganyo(int engaño) {
		this.enganyo = engaño;
	}
	public int getHistoria() {
		return historia;
	}
	public void setHistoria(int historia) {
		this.historia = historia;
	}
	public int getPerspicacia() {
		return perspicacia;
	}
	public void setPerspicacia(int perspicacia) {
		this.perspicacia = perspicacia;
	}
	public int getIntimidacion() {
		return intimidacion;
	}
	public void setIntimidacion(int intimidacion) {
		this.intimidacion = intimidacion;
	}
	public int getInvestigacion() {
		return investigacion;
	}
	public void setInvestigacion(int investigacion) {
		this.investigacion = investigacion;
	}
	public int getMedicina() {
		return medicina;
	}
	public void setMedicina(int medicina) {
		this.medicina = medicina;
	}
	public int getNaturaleza() {
		return naturaleza;
	}
	public void setNaturaleza(int naturaleza) {
		this.naturaleza = naturaleza;
	}
	public int getPercepcion() {
		return percepcion;
	}
	public void setPercepcion(int percepcion) {
		this.percepcion = percepcion;
	}
	public int getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(int interpretacion) {
		this.interpretacion = interpretacion;
	}
	public int getPersuasion() {
		return persuasion;
	}
	public void setPersuasion(int persuasion) {
		this.persuasion = persuasion;
	}
	public int getReligion() {
		return religion;
	}
	public void setReligion(int religion) {
		this.religion = religion;
	}
	public int getJuegoManos() {
		return juegoManos;
	}
	public void setJuegoManos(int juegoManos) {
		this.juegoManos = juegoManos;
	}
	public int getSigilo() {
		return sigilo;
	}
	public void setSigilo(int sigilo) {
		this.sigilo = sigilo;
	}
	public int getSupervivencia() {
		return supervivencia;
	}
	public void setSupervivencia(int supervivencia) {
		this.supervivencia = supervivencia;
	}
	public int getBonoCompetencia() {
		return bonoCompetencia;
	}
	public void setBonoCompetencia(int bonoCompetencia) {
		this.bonoCompetencia = bonoCompetencia;
	}
	public int getIniciativa() {
		return iniciativa;
	}
	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}
	public Arma[] getArmas() {
		return armas;
	}
	public void setArmas(Arma[] armas) {
		this.armas = armas;
	}
	public Clase getClasepj() {
		return clasepj;
	}
	public void setClasepj(Clase clase) {
		this.clasepj = clasepj;
	}
	public Hechizo[] getHechizos() {
		return hechizos;
	}
	public void setHechizos(Hechizo[] hechizos) {
		this.hechizos = hechizos;
	}
	public int getPiezasCobre() {
		return piezasCobre;
	}
	public void setPiezasCobre(int piezasCobre) {
		this.piezasCobre = piezasCobre;
	}
	public int getPiezasPlata() {
		return piezasPlata;
	}
	public void setPiezasPlata(int piezasPlata) {
		this.piezasPlata = piezasPlata;
	}
	public int getPiezasOro() {
		return piezasOro;
	}
	public void setPiezasOro(int piezasOro) {
		this.piezasOro = piezasOro;
	}
	public int getPiezasElectrum() {
		return piezasElectrum;
	}
	public void setPiezasElectrum(int piezasElectrum) {
		this.piezasElectrum = piezasElectrum;
	}
	public int getPiezasPlatino() {
		return piezasPlatino;
	}
	public void setPiezasPlatino(int piezasPlatino) {
		this.piezasPlatino = piezasPlatino;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	public String getTesoro() {
		return tesoro;
	}
	public void setTesoro(String tesoro) {
		this.tesoro = tesoro;
	}
	public String getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	public String getRasgosPersonalidad() {
		return rasgosPersonalidad;
	}
	public void setRasgosPersonalidad(String rasgosPersonalidad) {
		this.rasgosPersonalidad = rasgosPersonalidad;
	}
	public String getIdeales() {
		return ideales;
	}
	public void setIdeales(String ideales) {
		this.ideales = ideales;
	}
	public String getVinculos() {
		return vinculos;
	}
	public void setVinculos(String vinculos) {
		this.vinculos = vinculos;
	}
	public String getDefectos() {
		return defectos;
	}
	public void setDefectos(String defectos) {
		this.defectos = defectos;
	}
    public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	public Subraza getSubraza() {
		return subraza;
	}
	public void setSubraza(Subraza subraza) {
		this.subraza = subraza;
	}
	
	//Constructores
	public Personaje(String name, int life, int aC, int speed, Stat str, Stat dex, Stat con, Stat intel, Stat wis,
			Stat cha, int strsave, int dexsave, int consave, int intsave, int wissave, int chasave, int acrobacias,
			int tratoAnimales, int arcana, int atletismo, int engaño, int historia, int perspicacia, int intimidacion,
			int investigacion, int medicina, int naturaleza, int percepcion, int interpretacion, int persuasion,
			int religion, int juegoManos, int sigilo, int supervivencia, int bonoCompetencia, int iniciativa,
			Arma[] armas, Clase clasepj, Hechizo[] hechizos, int piezasCobre, int piezasPlata, int piezasOro,
			int piezasElectrum, int piezasPlatino, String equipo, String tesoro, String idiomas,
			String rasgosPersonalidad, String ideales, String vinculos, String defectos, Raza raza, Subraza subraza) {
		super(name, life, aC, speed, str, dex, con, intel, wis, cha);
		this.strsave = strsave;
		this.dexsave = dexsave;
		this.consave = consave;
		this.intsave = intsave;
		this.wissave = wissave;
		this.chasave = chasave;
		this.acrobacias = acrobacias;
		this.tratoAnimales = tratoAnimales;
		this.arcana = arcana;
		this.atletismo = atletismo;
		this.enganyo = engaño;
		this.historia = historia;
		this.perspicacia = perspicacia;
		this.intimidacion = intimidacion;
		this.investigacion = investigacion;
		this.medicina = medicina;
		this.naturaleza = naturaleza;
		this.percepcion = percepcion;
		this.interpretacion = interpretacion;
		this.persuasion = persuasion;
		this.religion = religion;
		this.juegoManos = juegoManos;
		this.sigilo = sigilo;
		this.supervivencia = supervivencia;
		this.bonoCompetencia = bonoCompetencia;
		this.iniciativa = iniciativa;
		this.armas = armas;
		this.clasepj = clasepj;
		this.hechizos = hechizos;
		this.piezasCobre = piezasCobre;
		this.piezasPlata = piezasPlata;
		this.piezasOro = piezasOro;
		this.piezasElectrum = piezasElectrum;
		this.piezasPlatino = piezasPlatino;
		this.equipo = equipo;
		this.tesoro = tesoro;
		this.idiomas = idiomas;
		this.rasgosPersonalidad = rasgosPersonalidad;
		this.ideales = ideales;
		this.vinculos = vinculos;
		this.defectos = defectos;
		this.raza = raza;
		this.subraza = subraza;
	}
	
	public Personaje() {
		super();
		this.strsave = 0;
		this.dexsave = 0;
		this.consave = 0;
		this.intsave = 0;
		this.wissave = 0;
		this.chasave = 0;
		this.acrobacias = 0;
		this.tratoAnimales = 0;
		this.arcana = 0;
		this.atletismo = 0;
		this.enganyo = 0;
		this.historia = 0;
		this.perspicacia = 0;
		this.intimidacion = 0;
		this.investigacion = 0;
		this.medicina = 0;
		this.naturaleza = 0;
		this.percepcion = 0;
		this.interpretacion = 0;
		this.persuasion = 0;
		this.religion = 0;
		this.juegoManos = 0;
		this.sigilo = 0;
		this.supervivencia = 0;
		this.bonoCompetencia = 0;
		this.iniciativa = 0;
		Arma arma1 = new Arma(), arma2 = new Arma(), arma3 = new Arma();
		Arma[] armas = {arma1, arma2, arma3};
		this.armas = armas;
		this.clasepj = new Clase();
		Hechizo hechizo1 = new Hechizo(), hechizo2 = new Hechizo(), hechizo3 = new Hechizo();
		Hechizo[] hechizos = {hechizo1, hechizo2, hechizo3};
		this.hechizos = hechizos;
		this.piezasCobre = 0;
		this.piezasPlata = 0;
		this.piezasOro = 0;
		this.piezasElectrum = 0;
		this.piezasPlatino = 0;
		this.equipo = "";
		this.tesoro = "";
		this.idiomas = "";
		this.rasgosPersonalidad = "";
		this.ideales = "";
		this.vinculos = "";
		this.defectos = "";
		this.raza = new Raza();
		this.subraza = new Subraza();
	}
	
	public String toString() {
		return "Personaje [strsave=" + strsave + ", dexsave=" + dexsave + ", consave=" + consave + ", intsave="
				+ intsave + ", wissave=" + wissave + ", chasave=" + chasave + ", acrobacias=" + acrobacias
				+ ", tratoAnimales=" + tratoAnimales + ", arcana=" + arcana + ", atletismo=" + atletismo + ", engaño="
				+ enganyo + ", historia=" + historia + ", perspicacia=" + perspicacia + ", intimidacion=" + intimidacion
				+ ", investigacion=" + investigacion + ", medicina=" + medicina + ", naturaleza=" + naturaleza
				+ ", percepcion=" + percepcion + ", interpretacion=" + interpretacion + ", persuasion=" + persuasion
				+ ", religion=" + religion + ", juegoManos=" + juegoManos + ", sigilo=" + sigilo + ", supervivencia="
				+ supervivencia + ", bonoCompetencia=" + bonoCompetencia + ", iniciativa=" + iniciativa + ", armas="
				+ (armas != null ? Arrays.asList(armas) : null) + ", clasepj=" + clasepj + ", hechizos="
				+ (hechizos != null ? Arrays.asList(hechizos) : null) + ", piezasCobre=" + piezasCobre
				+ ", piezasPlata=" + piezasPlata + ", piezasOro=" + piezasOro + ", piezasElectrum=" + piezasElectrum
				+ ", piezasPlatino=" + piezasPlatino + ", equipo=" + equipo + ", tesoro=" + tesoro + ", idiomas="
				+ idiomas + ", rasgosPersonalidad=" + rasgosPersonalidad + ", ideales=" + ideales + ", vinculos="
				+ vinculos + ", defectos=" + defectos + "]";
	}
}