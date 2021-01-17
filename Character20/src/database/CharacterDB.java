package database;

import database.CharacterDB;
import database.CharacterDBException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import clasesCriatura.*;

public class CharacterDB {

	private Connection con;

	public CharacterDB() throws CharacterDBException {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			throw new CharacterDBException("Error al cargar el driver.", e);
		}
	}
	
	public void openDB() throws CharacterDBException {
		try {
			con = DriverManager.getConnection("jdbc:sqlite:characterDB.db");
		} catch (SQLException e) {
			throw new CharacterDBException("Error al abrir la base de datos.", e);
		}
	}
	
	public void insertDB(Personaje character) throws CharacterDBException {				
		//Codigo de los INSERT
		try (PreparedStatement stmt = con.prepareStatement("INSERT OR REPLACE INTO Personaje("
				+ "name, life, AC, speed, "
				+ "str, dex, con, intel, wis, cha, strmod, dexmod, conmod, intmod, wismod, chamod, "
				+ "strsave, dexsave, consave, intsave, wissave, chasave, "
				+ "acrobacias, tratoAnimales, arcana, atletismo, enganyo, historia, perspicacia, intimidacion, investigacion, medicina, naturaleza, percepcion, interpretacion, persuasion, religion, juegoManos, sigilo, supervivencia, "
				+ "bonoCompetencia, iniciativa, piezaCobre, piezaPlata, piezaOro, piezaElectrum, piezaPlatino, "
				+ "equipo, tesoro, idiomas, rasgoPersonalidad1, rasgoPersonalidad2, rasgoPersonalidad3, "
				+ "ideales, vinculos, defectos, raza, subraza) VALUES "
				//62 ?
				+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
				+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
					stmt.setString(1, character.getName());
					stmt.setInt(2, character.getLife());
					stmt.setInt(3, character.getAC());
					stmt.setInt(4, character.getSpeed());
					stmt.setInt(5, character.getStr().getScore());
					stmt.setInt(6, character.getDex().getScore());
					stmt.setInt(7, character.getCon().getScore());
					stmt.setInt(8, character.getIntel().getScore());
					stmt.setInt(9, character.getWis().getScore());
					stmt.setInt(10, character.getCha().getScore());
					stmt.setInt(11, character.getStr().getModifier());
					stmt.setInt(12, character.getDex().getModifier());
					stmt.setInt(13, character.getCon().getModifier());
					stmt.setInt(14, character.getIntel().getModifier());
					stmt.setInt(15, character.getWis().getModifier());
					stmt.setInt(16, character.getCha().getModifier());
					stmt.setInt(17, character.getStrsave());
					stmt.setInt(18, character.getDexsave());
					stmt.setInt(19, character.getConsave());
					stmt.setInt(20, character.getIntsave());
					stmt.setInt(21, character.getWissave());
					stmt.setInt(22, character.getChasave());
					stmt.setInt(23, character.getAcrobacias());
					stmt.setInt(24, character.getTratoAnimales());
					stmt.setInt(25, character.getArcana());
					stmt.setInt(26, character.getAtletismo());
					stmt.setInt(27, character.getEnganyo());
					stmt.setInt(28, character.getHistoria());
					stmt.setInt(29, character.getPerspicacia());
					stmt.setInt(30, character.getIntimidacion());
					stmt.setInt(31, character.getInvestigacion());
					stmt.setInt(32, character.getMedicina());
					stmt.setInt(33, character.getNaturaleza());
					stmt.setInt(34, character.getPercepcion());
					stmt.setInt(35, character.getInterpretacion());
					stmt.setInt(36, character.getPersuasion());
					stmt.setInt(37, character.getReligion());
					stmt.setInt(38, character.getJuegoManos());	
					stmt.setInt(39, character.getSigilo());
					stmt.setInt(40, character.getSupervivencia());
					stmt.setInt(41, character.getBonoCompetencia());
					stmt.setInt(42, character.getIniciativa());
					stmt.setInt(43, character.getPiezasCobre());
					stmt.setInt(44, character.getPiezasPlata());	
					stmt.setInt(45, character.getPiezasOro());
					stmt.setInt(46, character.getPiezasElectrum());
					stmt.setInt(47, character.getPiezasPlatino());
					stmt.setString(48, character.getEquipo());
					stmt.setString(49, character.getTesoro());	
					stmt.setString(50, character.getIdiomas());
					//Separar en 3
					stmt.setString(51, character.getRasgosPersonalidad());
					stmt.setString(52, character.getRasgosPersonalidad());
					stmt.setString(53, character.getRasgosPersonalidad());
					stmt.setString(54, character.getIdeales());	
					stmt.setString(55, character.getVinculos());
					stmt.setString(56, character.getDefectos());
					stmt.setString(57,  character.getRaza().getNombre());
					stmt.setString(58, character.getSubraza().getNombre());
				stmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}

			for (int i = 0; i < character.getArmas().size(); i++) {
				for (Arma ar : character.getArmas()) {
					try (PreparedStatement stmt2 = con.prepareStatement("INSERT OR REPLACE INTO Arma("
							+ "c_arma, nombre, marcial, danyo, tipo)"
							+ "VALUES (?, ?, ?, ?, ?)"
							)) {
						stmt2.setString(1, "arma" + i + character.getName());
						stmt2.setString(2, ar.getNombre());
						stmt2.setBoolean(3, ar.isMarcial());
						stmt2.setString(4, ar.getDanyo());
						stmt2.setString(5, ar.getTipo());
						stmt2.executeUpdate();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			try (PreparedStatement stmt5 = con.prepareStatement("INSERT OR REPLACE INTO Clase("
					+ "c_clase, nombre, hitdie, rasgo1, rasgo2, rasgo3, simpleProficiency, martialProficiency)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
					)) {
				stmt5.setString(1, "clase" + character.getName());
				stmt5.setString(2, character.getClasepj().getNombre());
				stmt5.setString(3, character.getClasepj().getHitdie());
				stmt5.setString(4, character.getClasepj().getRasgos()[0]);
				stmt5.setString(5, character.getClasepj().getRasgos()[1]);
				stmt5.setString(6, character.getClasepj().getRasgos()[2]);
				stmt5.setBoolean(7, character.getClasepj().isSimpleproficiency());
				stmt5.setBoolean(8, character.getClasepj().isMartialproficiency());
				stmt5.executeUpdate();
				System.out.println("Personaje guardado o actualizado.");
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	public Personaje selectDB(String nombre) throws CharacterDBException {
		Personaje character = new Personaje();
		
		//Codigo de los select
		String line = "SELECT * FROM Personaje WHERE name = " + "'" + nombre + "'";
		try (PreparedStatement stmt = con.prepareStatement(line)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					character.setName(rs.getString("name"));
					character.setLife(rs.getInt("life"));
					character.setAC(rs.getInt("AC"));
					character.setSpeed(rs.getInt("speed"));
					character.getStr().setScore(rs.getInt("str"));
					character.getStr().setModifier(rs.getInt("strmod"));
					character.setStrsave(rs.getInt("strsave"));
					character.getDex().setScore(rs.getInt("dex"));
					character.getDex().setModifier(rs.getInt("dexmod"));
					character.setDexsave(rs.getInt("dexsave"));
					character.getCon().setScore(rs.getInt("con"));
					character.getCon().setModifier(rs.getInt("conmod"));
					character.setConsave(rs.getInt("consave"));
					character.getIntel().setScore(rs.getInt("intel"));
					character.getIntel().setModifier(rs.getInt("intmod"));
					character.setIntsave(rs.getInt("intsave"));
					character.getWis().setScore(rs.getInt("wis"));
					character.getWis().setModifier(rs.getInt("wismod"));
					character.setWissave(rs.getInt("wissave"));
					character.getCha().setScore(rs.getInt("cha"));
					character.getCha().setModifier(rs.getInt("chamod"));
					character.setChasave(rs.getInt("chasave"));
					
					character.setAcrobacias(rs.getInt("acrobacias"));
					character.setTratoAnimales(rs.getInt("tratoAnimales"));
					character.setArcana(rs.getInt("arcana"));
					character.setAtletismo(rs.getInt("atletismo"));
					character.setEnganyo(rs.getInt("enganyo"));
					character.setHistoria(rs.getInt("historia"));
					character.setPerspicacia(rs.getInt("perspicacia"));
					character.setIntimidacion(rs.getInt("intimidacion"));
					character.setInvestigacion(rs.getInt("investigacion"));
					character.setMedicina(rs.getInt("medicina"));
					character.setNaturaleza(rs.getInt("naturaleza"));
					character.setPercepcion(rs.getInt("percepcion"));
					character.setInterpretacion(rs.getInt("interpretacion"));
					character.setPersuasion(rs.getInt("persuasion"));
					character.setReligion(rs.getInt("religion"));
					character.setJuegoManos(rs.getInt("juegoManos"));
					character.setSigilo(rs.getInt("sigilo"));
					character.setSupervivencia(rs.getInt("supervivencia"));
					
					character.setBonoCompetencia(rs.getInt("bonoCompetencia"));
					character.setIniciativa(rs.getInt("iniciativa"));
					
					//
					Arma arma1 = new Arma(), arma2 = new Arma(), arma3 = new Arma();
					List<Arma> armas = new ArrayList<Arma>();
					armas.add(arma1);
					armas.add(arma2);
					armas.add(arma3);
					try (PreparedStatement stmt2 = con.prepareStatement("SELECT * FROM Arma  WHERE c_arma = " + "'" + rs.getString("c_arma1") + "'")) {
						try (ResultSet rs2 = stmt2.executeQuery()) {
						while(rs2.next()) {
							arma1.setNombre(rs2.getString("nombre"));
							arma1.setMarcial(rs2.getBoolean("marcial"));
							arma1.setDanyo(rs2.getString("danyo"));
							arma1.setTipo(rs2.getString("tipo"));
						}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					try (PreparedStatement stmt3 = con.prepareStatement("SELECT * FROM Arma WHERE c_arma == " + "'" + rs.getString("c_arma2") + "'")) {
						try (ResultSet rs3 = stmt3.executeQuery()) {
						while(rs3.next()) {
							arma2.setNombre(rs3.getString("nombre"));
							arma2.setMarcial(rs3.getBoolean("marcial"));
							arma2.setDanyo(rs3.getString("danyo"));
							arma2.setTipo(rs3.getString("tipo"));
						}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					try (PreparedStatement stmt4 = con.prepareStatement("SELECT * FROM Arma WHERE c_arma == " + "'" + rs.getString("c_arma3") + "'")) {
						try (ResultSet rs4 = stmt4.executeQuery()) {
						while(rs4.next()) {
							arma3.setNombre(rs4.getString("nombre"));
							arma3.setMarcial(rs4.getBoolean("marcial"));
							arma3.setDanyo(rs4.getString("danyo"));
							arma3.setTipo(rs4.getString("tipo"));
						}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}	
					character.setArmas(armas);
					
					try (PreparedStatement stmt5 = con.prepareStatement("SELECT * FROM Clase WHERE c_clase == " + "'" + rs.getString("c_clasePj") + "'")) {
						try (ResultSet rs5 = stmt5.executeQuery()) {
						while(rs5.next()) {
							Clase clase = new Clase();
							clase.setNombre(rs5.getString("nombre"));
							clase.setHitdie(rs5.getString("hitdie"));
							String rasgos[] = {rs5.getString("rasgo1"), rs5.getString("rasgo2"), rs5.getString("rasgo3")};
							clase.setRasgos(rasgos);
							clase.setSimpleproficiency(rs5.getBoolean("simpleProficiency"));
							clase.setMartialproficiency(rs5.getBoolean("martialProficiency"));
							character.setClasepj(clase);
						}
						}
							
					} catch (Exception e) {
						e.printStackTrace();
					}
					//
					
					character.setPiezasCobre(rs.getInt("piezaCobre"));
					character.setPiezasPlata(rs.getInt("piezaPlata"));
					character.setPiezasOro(rs.getInt("piezaOro"));
					character.setPiezasPlatino(rs.getInt("piezaPlatino"));
					character.setPiezasElectrum(rs.getInt("piezaElectrum"));
					character.setEquipo(rs.getString("equipo"));
					character.setTesoro(rs.getString("tesoro"));
					character.setIdiomas(rs.getString("idiomas"));
					character.setRasgosPersonalidad(rs.getString("rasgoPersonalidad1") + ", " +  rs.getString("rasgoPersonalidad2") + ", " + rs.getString("rasgoPersonalidad3"));
					character.setIdeales(rs.getString("ideales"));
					character.setVinculos(rs.getString("vinculos"));
					character.setDefectos(rs.getString("defectos"));
					Raza raza = new Raza();
					Subraza subraza = new Subraza();
					raza.setNombre(rs.getString("raza"));
					subraza.setNombre(rs.getString("subraza"));
					character.setRaza(raza);
					character.setSubraza(subraza);
				}
			}
			System.out.println("Character loaded.");
			return character;
		} catch (SQLException e) {
			System.out.println("Caracteres no permitidos.");
			e.printStackTrace();;
		}
		return character;
	}
	
	public void closeDB() throws CharacterDBException {
		try {
			con.close();
		} catch (SQLException e) {
			throw new CharacterDBException("No se ha podido cerrar la conexion a la base de datos.", e);
		}
	}
}
