package mainAndWindow;

import java.awt.EventQueue;
import clasesCriatura.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.awt.event.ActionEvent;

public class Window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{151, 163, 179, 175, 163, 158, 0};
		gbl_panel.rowHeights = new int[]{24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 0;
		panel.add(panel_7, gbc_panel_7);*/
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 1));
		frame.add(panel);
		
		JPanel panel11 = new JPanel(); 
		JPanel panel12 = new JPanel();
		JPanel panel13 = new JPanel();
		JPanel panel14 = new JPanel();
		panel11.setLayout(new GridLayout(1, 6));
		panel12.setLayout(new GridLayout(1, 2));
		panel13.setLayout(new GridLayout(1, 2));
		panel14.setLayout(new GridLayout(1, 2));
		panel.add(panel11);
		panel.add(panel12);
		panel.add(panel13);	
		panel.add(panel14);
		
		JPanel panel111 = new JPanel();
		JPanel panel112 = new JPanel();
		JPanel panel113 = new JPanel();
		JPanel panel114 = new JPanel();
		JPanel panel115 = new JPanel();
		JPanel panel116 = new JPanel();
		panel111.setLayout(new GridLayout(1,3));
		panel112.setLayout(new GridLayout(1,3));
		panel113.setLayout(new GridLayout(1,3));
		panel114.setLayout(new GridLayout(1,3));
		panel115.setLayout(new GridLayout(1,3));
		panel116.setLayout(new GridLayout(1,3));
		panel11.add(panel111);
		panel11.add(panel112);
		panel11.add(panel113);
		panel11.add(panel114);
		panel11.add(panel115);
		panel11.add(panel116);
		
		
		JPanel panel1111 = new JPanel();
		JPanel panel1121 = new JPanel();
		JPanel panel1131 = new JPanel();
		JPanel panel1141 = new JPanel();
		JPanel panel1151 = new JPanel();
		JPanel panel1161 = new JPanel();
		panel1111.setLayout(new GridLayout(2,1));
		panel1121.setLayout(new GridLayout(2,1));
		panel1131.setLayout(new GridLayout(2,1));
		panel1141.setLayout(new GridLayout(2,1));
		panel1151.setLayout(new GridLayout(2,1));
		panel1161.setLayout(new GridLayout(2,1));
		panel111.add(panel1111);
		panel112.add(panel1121);
		
		JPanel panel1113 = new JPanel();
		JPanel panel1123 = new JPanel();
		JPanel panel1133 = new JPanel();
		JPanel panel1143 = new JPanel();
		JPanel panel1153 = new JPanel();
		JPanel panel1163 = new JPanel();
		panel1113.setLayout(new GridLayout(2,1));
		panel1123.setLayout(new GridLayout(2,1));
		panel1133.setLayout(new GridLayout(2,1));
		panel1143.setLayout(new GridLayout(2,1));
		panel1153.setLayout(new GridLayout(2,1));
		panel1163.setLayout(new GridLayout(2,1));
		
		//Estadisticas de prueba hasta que se implementen los personajes en los ficheros de texto
		Stat pruebaStr = new Stat();
		pruebaStr.setScore(17);
		Stat pruebaDex = new Stat();
		pruebaDex.setScore(7);
		Stat pruebaCon = new Stat();
		pruebaCon.setScore(10);
		Stat pruebaInt = new Stat();
		pruebaInt.setScore(18);
		Stat pruebaWis = new Stat();
		pruebaWis.setScore(8);
		Stat pruebaChar = new Stat();
		pruebaChar.setScore(13);
		//IMPORTANTE
		Personaje character = new Personaje();
		
		
		JLabel lStrScore = new JLabel(pruebaStr.scoreToString());
		panel1111.add(lStrScore);
		
		JLabel lStrMod = new JLabel(pruebaStr.modToString());
		panel1111.add(lStrMod);
		
		JLabel lStr = new JLabel("Fuerza");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel111.add(lStr, gbc_lblNewLabel);
		
		JPanel panel_13 = new JPanel();
		GridBagConstraints gbc_panel_13 = new GridBagConstraints();
		gbc_panel_13.insets = new Insets(0, 0, 5, 5);
		gbc_panel_13.fill = GridBagConstraints.BOTH;
		gbc_panel_13.gridx = 0;
		gbc_panel_13.gridy = 2;
		panel.add(panel_13, gbc_panel_13);
		
		JButton btnNewButton = new JButton("+");
		
		//Si el score es 20 no se podra sumar mas
		if (pruebaStr.getScore()<21) {
			btnNewButton.addActionListener(new ActionListener() {		
				public void actionPerformed(ActionEvent arg0) {
					
				}
			});
		}
		panel_13.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		panel_13.add(btnNewButton_1);
		
		JPanel panel_8 = new JPanel();
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 5);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 3;
		panel.add(panel_8, gbc_panel_8);
		
		JLabel lDexScore = new JLabel(pruebaDex.scoreToString());
		panel_8.add(lDexScore);
		
		JLabel lDexMod = new JLabel(pruebaDex.modToString());
		panel_8.add(lDexMod);
		
		JLabel lDex = new JLabel("Destreza");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		panel.add(lDex, gbc_lblNewLabel_1);
		lDex.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 5;
		panel.add(panel_1, gbc_panel_1);
		
		JPanel panel_14 = new JPanel();
		GridBagConstraints gbc_panel_14 = new GridBagConstraints();
		gbc_panel_14.insets = new Insets(0, 0, 5, 5);
		gbc_panel_14.fill = GridBagConstraints.BOTH;
		gbc_panel_14.gridx = 0;
		gbc_panel_14.gridy = 6;
		panel.add(panel_14, gbc_panel_14);
		
		JButton btnNewButton_2 = new JButton("+");
		panel_14.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("-");
		panel_14.add(btnNewButton_3);
		
		JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 5, 5);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 7;
		panel.add(panel_9, gbc_panel_9);
		
		JLabel lConScore = new JLabel(pruebaCon.scoreToString());
		panel_9.add(lConScore);
		
		JLabel lConMod = new JLabel(pruebaCon.modToString());
		panel_9.add(lConMod);
		
		JPanel panel_19 = new JPanel();
		GridBagConstraints gbc_panel_19 = new GridBagConstraints();
		gbc_panel_19.insets = new Insets(0, 0, 5, 5);
		gbc_panel_19.fill = GridBagConstraints.BOTH;
		gbc_panel_19.gridx = 1;
		gbc_panel_19.gridy = 7;
		panel.add(panel_19, gbc_panel_19);
		
		//ATENCION: como esto es muy largo se estropean las demás label
		JLabel lCapacities = new JLabel("<html>Acrobacias (Des)<br>Atletismo (Fue)<br>C. Arcano (Int)<br>Enganyo (Car)<br>Historia (Int)<br>Interpretacion (Car)<br>Intimidacion (Car)<br>Investigacion (Int)<br>Juego de manos (Des)<br>Medicina (Sab)<br>Naturaleza (Int)<br>Percepcion (Sab)<br>Perspicacia (Sab)<br>Persuasion (Car)<br>Religion (Int)<br>Sigilo (Des)</html>");
		panel_19.add(lCapacities);
		
		JLabel lCon = new JLabel("Constitucion");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 8;
		panel.add(lCon, gbc_lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 9;
		panel.add(panel_2, gbc_panel_2);
		
		JPanel panel_15 = new JPanel();
		GridBagConstraints gbc_panel_15 = new GridBagConstraints();
		gbc_panel_15.insets = new Insets(0, 0, 5, 5);
		gbc_panel_15.fill = GridBagConstraints.BOTH;
		gbc_panel_15.gridx = 0;
		gbc_panel_15.gridy = 10;
		panel.add(panel_15, gbc_panel_15);
		
		JButton btnNewButton_4 = new JButton("+");
		panel_15.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("-");
		panel_15.add(btnNewButton_5);
		
		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 5, 5);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 11;
		panel.add(panel_10, gbc_panel_10);
		
		JLabel lIntScore = new JLabel(pruebaInt.scoreToString());
		panel_10.add(lIntScore);
		
		JLabel lIntMod = new JLabel(pruebaInt.modToString());
		panel_10.add(lIntMod);
		
		JLabel lInt = new JLabel("Inteligencia");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 12;
		panel.add(lInt, gbc_lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 13;
		panel.add(panel_3, gbc_panel_3);
		
		JPanel panel_16 = new JPanel();
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.insets = new Insets(0, 0, 5, 5);
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.gridx = 0;
		gbc_panel_16.gridy = 14;
		panel.add(panel_16, gbc_panel_16);
		
		JButton btnNewButton_6 = new JButton("+");
		panel_16.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		panel_16.add(btnNewButton_7);
		
		JPanel panel_11 = new JPanel();
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 5, 5);
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 15;
		panel.add(panel_11, gbc_panel_11);
		
		JLabel lWisScore = new JLabel(pruebaWis.scoreToString());
		panel_11.add(lWisScore);
		
		JLabel lWisMod = new JLabel(pruebaWis.modToString());
		panel_11.add(lWisMod);
		
		JLabel lWis = new JLabel("Sabiduria");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 16;
		panel.add(lWis, gbc_lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 17;
		panel.add(panel_4, gbc_panel_4);
		
		JPanel panel_17 = new JPanel();
		GridBagConstraints gbc_panel_17 = new GridBagConstraints();
		gbc_panel_17.insets = new Insets(0, 0, 5, 5);
		gbc_panel_17.fill = GridBagConstraints.BOTH;
		gbc_panel_17.gridx = 0;
		gbc_panel_17.gridy = 18;
		panel.add(panel_17, gbc_panel_17);
		
		JButton btnNewButton_8 = new JButton("+");
		panel_17.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("-");
		panel_17.add(btnNewButton_9);
		
		JPanel panel_12 = new JPanel();
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.insets = new Insets(0, 0, 5, 5);
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 0;
		gbc_panel_12.gridy = 19;
		panel.add(panel_12, gbc_panel_12);
		
		JLabel lCharScore = new JLabel(pruebaChar.scoreToString());
		panel_12.add(lCharScore);
		
		JLabel lCharMod = new JLabel(pruebaChar.modToString());
		panel_12.add(lCharMod);
		
		JLabel lChar = new JLabel("Carisma");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 20;
		panel.add(lChar, gbc_lblNewLabel_2);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 21;
		panel.add(panel_5, gbc_panel_5);
		
		JPanel panel_18 = new JPanel();
		GridBagConstraints gbc_panel_18 = new GridBagConstraints();
		gbc_panel_18.insets = new Insets(0, 0, 5, 5);
		gbc_panel_18.fill = GridBagConstraints.BOTH;
		gbc_panel_18.gridx = 0;
		gbc_panel_18.gridy = 22;
		panel.add(panel_18, gbc_panel_18);
		
		JButton btnNewButton_10 = new JButton("+");
		panel_18.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		panel_18.add(btnNewButton_11);
		
		JPanel panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 0, 5);
		gbc_panel_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 24;
		panel.add(panel_6, gbc_panel_6);
		
		
		
		
		JLabel lLife = new JLabel("Life");
		JLabel lLifeNumber = new JLabel(Integer.toString(character.getLife()));
		JLabel lAC = new JLabel("AC");
		JLabel lACNumber = new JLabel(Integer.toString(character.getAC()));
		JLabel lSpeed = new JLabel("Speed");
		JLabel lSpeedNumber = new JLabel(Integer.toString(character.getSpeed()));
		JLabel lIniciative = new JLabel("Iniciative");
		//Aqui habra que meter un if para incluir los modificiadores de raza y clase al valor de la iniciativa
		JLabel lIniciativeNumber = new JLabel(Integer.toString(character.getDex().getModifier()));
		JLabel lHitDice = new JLabel("Hit Dice");
		//A DESARROLLAR
		//Meter ifs para esto:
		JLabel lHitDiceNumber = new JLabel("1d10");
		
		
		
		JButton storeProperties = new JButton("Store");
		//Rodear de un if que chequeé si se puede hacer el store 
		storeProperties.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				storeOrLoadProperties("store", character, "");
			}
		});
		
		JButton loadProperties = new JButton("Load");
		storeProperties.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				storeOrLoadProperties("load", null, "QuimiMalo");
			}
		});
		
	}
	
	public static void storeOrLoadProperties(String operation, Personaje character, String nCharacter) {
		Properties objetoP = new Properties();
		
		try {
			objetoP.load(new FileInputStream("characters.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		int i = 0;
				
		if (operation == "store") {
		for (i = 0; i < 200; i++) {
			if (objetoP.getProperty("Number" + Integer.toString(i)) == null) {
				objetoP.setProperty("Number" + Integer.toString(i), Integer.toString(i));
				objetoP.setProperty("Name" + Integer.toString(i), character.getName());
				objetoP.setProperty("Life" + Integer.toString(i), Integer.toString(character.getLife()));
				objetoP.setProperty("AC" + Integer.toString(i), Integer.toString(character.getAC()));
				objetoP.setProperty("Speed" + Integer.toString(i), Integer.toString(character.getSpeed()));
				objetoP.setProperty("Str" + Integer.toString(i), character.getStr().scoreToString());
				objetoP.setProperty("Dex" + Integer.toString(i), character.getDex().scoreToString());
				objetoP.setProperty("Con" + Integer.toString(i), character.getCon().scoreToString());
				objetoP.setProperty("Int" + Integer.toString(i), character.getIntel().scoreToString());
				objetoP.setProperty("Wis" + Integer.toString(i), character.getWis().scoreToString());
				objetoP.setProperty("Char" + Integer.toString(i), character.getCha().scoreToString());
				objetoP.setProperty("StrSave" + Integer.toString(i), Integer.toString(character.getStrsave()));
				objetoP.setProperty("DexSave" + Integer.toString(i), Integer.toString(character.getDexsave()));
				objetoP.setProperty("ConSave" + Integer.toString(i), Integer.toString(character.getConsave()));
				objetoP.setProperty("IntSave" + Integer.toString(i), Integer.toString(character.getIntsave()));
				objetoP.setProperty("WisSave" + Integer.toString(i), Integer.toString(character.getWissave()));
				objetoP.setProperty("CharSave" + Integer.toString(i), Integer.toString(character.getChasave()));
				
				objetoP.setProperty("Acrobacias" + Integer.toString(i), Integer.toString(character.getAcrobacias()));
				objetoP.setProperty("TratoConAnimales" + Integer.toString(i), Integer.toString(character.getTratoAnimales()));
				objetoP.setProperty("Arcana" + Integer.toString(i), Integer.toString(character.getArcana()));
				objetoP.setProperty("Atletismo" + Integer.toString(i), Integer.toString(character.getAtletismo()));
				objetoP.setProperty("Engaño" + Integer.toString(i), Integer.toString(character.getEngaño()));
				objetoP.setProperty("Historia" + Integer.toString(i), Integer.toString(character.getHistoria()));
				objetoP.setProperty("Perspicacia" + Integer.toString(i), Integer.toString(character.getPerspicacia()));
				objetoP.setProperty("Intimidacion" + Integer.toString(i), Integer.toString(character.getIntimidacion()));
				objetoP.setProperty("Investigacion" + Integer.toString(i), Integer.toString(character.getInvestigacion()));
				objetoP.setProperty("Medicina" + Integer.toString(i), Integer.toString(character.getInvestigacion()));
				objetoP.setProperty("Naturaleza" + Integer.toString(i), Integer.toString(character.getNaturaleza()));
				objetoP.setProperty("Percepcion" + Integer.toString(i), Integer.toString(character.getPercepcion()));
				objetoP.setProperty("Interpretacion" + Integer.toString(i), Integer.toString(character.getInterpretacion()));
				objetoP.setProperty("Persuasion" + Integer.toString(i), Integer.toString(character.getPersuasion()));
				objetoP.setProperty("Religion" + Integer.toString(i), Integer.toString(character.getReligion()));
				objetoP.setProperty("JuegoManos" + Integer.toString(i), Integer.toString(character.getJuegoManos()));
				objetoP.setProperty("Sigilo" + Integer.toString(i), Integer.toString(character.getSigilo()));
				objetoP.setProperty("Supervivencia" + Integer.toString(i), Integer.toString(character.getSupervivencia()));
				
				objetoP.setProperty("BonoCompetencia" + Integer.toString(i), Integer.toString(character.getBonoCompetencia()));
				objetoP.setProperty("Iniciativa" + Integer.toString(i), Integer.toString(character.getIniciativa()));
				objetoP.setProperty("WeaponOne" + Integer.toString(i), character.getArmas()[0].getNombre());
				objetoP.setProperty("WeaponTwo" + Integer.toString(i), character.getArmas()[1].getNombre());
				objetoP.setProperty("WeaponThree" + Integer.toString(i), character.getArmas()[2].getNombre());
				objetoP.setProperty("SpellOne" + Integer.toString(i), character.getHechizos()[0].getSpellName());
				objetoP.setProperty("SpellTwo" + Integer.toString(i), character.getHechizos()[1].getSpellName());
				objetoP.setProperty("SpellThree" + Integer.toString(i), character.getHechizos()[2].getSpellName());
				objetoP.setProperty("Class" + Integer.toString(i), character.getClasepj().getNombre());
				objetoP.setProperty("Copper" + Integer.toString(i), Integer.toString(character.getPiezasCobre()));
				objetoP.setProperty("Silver" + Integer.toString(i), Integer.toString(character.getPiezasPlata()));
				objetoP.setProperty("Gold" + Integer.toString(i), Integer.toString(character.getPiezasOro()));
				objetoP.setProperty("Platinum" + Integer.toString(i), Integer.toString(character.getPiezasPlatino()));
				objetoP.setProperty("Electrum" + Integer.toString(i), Integer.toString(character.getPiezasElectrum()));
				objetoP.setProperty("Equipment" + Integer.toString(i), character.getEquipo());
				objetoP.setProperty("Treasure" + Integer.toString(i), character.getTesoro());
				objetoP.setProperty("Language" + Integer.toString(i), character.getIdiomas());
				objetoP.setProperty("PersonalityTraits" + Integer.toString(i), character.getRasgosPersonalidad());
				objetoP.setProperty("Ideals" + Integer.toString(i), character.getIdeales());
				objetoP.setProperty("Bonds" + Integer.toString(i), character.getVinculos());
				objetoP.setProperty("Flaws" + Integer.toString(i), character.getDefectos());		
				objetoP.setProperty("Race" + Integer.toString(i), character.getSubraza().getNombre());
				objetoP.setProperty("Subrace" + Integer.toString(i), character.getRaza().getNombre());

				try {
					objetoP.store(new FileWriter("characters.properties"), "Operation" + objetoP.getProperty("Number" + Integer.toString(i)));
				} catch (IOException e) {
					e.printStackTrace();
				}
						
				i=200;
			}
		}
		}
				
		//FALTA PONERLO CON LAS COSAS DE LA VENTANA CON UN HILO
		if (operation == "load") {
		for (i = 0; i < 200; i++) {
			if (nCharacter == objetoP.getProperty("Name" + Integer.toString(i))) {				
				character.setName(objetoP.getProperty("Name"));
				character.setLife(Integer.parseInt(objetoP.getProperty("Life")));
				character.setAC(Integer.parseInt(objetoP.getProperty("AC")));
				character.setSpeed(Integer.parseInt(objetoP.getProperty("Speed")));
				Stat str = new Stat();
				Stat dex = new Stat();
				Stat con = new Stat();
				Stat intel = new Stat();
				Stat wis = new Stat();
				Stat car = new Stat();
				str.setScore(Integer.parseInt(objetoP.getProperty("Str")));
				dex.setScore(Integer.parseInt(objetoP.getProperty("Dex")));
				con.setScore(Integer.parseInt(objetoP.getProperty("Con")));
				intel.setScore(Integer.parseInt(objetoP.getProperty("Int")));
				wis.setScore(Integer.parseInt(objetoP.getProperty("Wis")));
				car.setScore(Integer.parseInt(objetoP.getProperty("Char")));
				character.setStr(str);
				character.setDex(dex);
				character.setCon(con);
				character.setIntel(intel);
				character.setWis(wis);
				character.setCha(car);
				character.setStrsave(Integer.parseInt(objetoP.getProperty("StrSave")));
				character.setDexsave(Integer.parseInt(objetoP.getProperty("DexSave")));
				character.setConsave(Integer.parseInt(objetoP.getProperty("ConSave")));
				character.setIntsave(Integer.parseInt(objetoP.getProperty("IntSave")));
				character.setWissave(Integer.parseInt(objetoP.getProperty("WisSave")));
				character.setChasave(Integer.parseInt(objetoP.getProperty("CharSave")));
				
				character.setAcrobacias(Integer.parseInt(objetoP.getProperty("Acrobacias")));
				character.setTratoAnimales(Integer.parseInt(objetoP.getProperty("TratoConAnimales")));
				character.setArcana(Integer.parseInt(objetoP.getProperty("Arcana")));
				character.setAtletismo(Integer.parseInt(objetoP.getProperty("Atletismo")));
				character.setEngaño(Integer.parseInt(objetoP.getProperty("Engaño")));
				character.setHistoria(Integer.parseInt(objetoP.getProperty("Historia")));
				character.setPerspicacia(Integer.parseInt(objetoP.getProperty("Perspicacia")));
				character.setIntimidacion(Integer.parseInt(objetoP.getProperty("Intimidacion")));
				character.setInvestigacion(Integer.parseInt(objetoP.getProperty("Investigacion")));
				character.setMedicina(Integer.parseInt(objetoP.getProperty("Medicina")));
				character.setNaturaleza(Integer.parseInt(objetoP.getProperty("Naturaleza")));
				character.setPercepcion(Integer.parseInt(objetoP.getProperty("Percepcion")));
				character.setInterpretacion(Integer.parseInt(objetoP.getProperty("Interpretacion")));
				character.setPersuasion(Integer.parseInt(objetoP.getProperty("Persuasion")));
				character.setPersuasion(Integer.parseInt(objetoP.getProperty("Persuasion")));
				character.setReligion(Integer.parseInt(objetoP.getProperty("Religion")));
				character.setJuegoManos(Integer.parseInt(objetoP.getProperty("JuegoManos")));
				character.setSigilo(Integer.parseInt(objetoP.getProperty("Sigilo")));
				character.setSupervivencia(Integer.parseInt(objetoP.getProperty("Supervivencia")));
				
				character.setBonoCompetencia(Integer.parseInt(objetoP.getProperty("BonoCompetencia")));
				character.setIniciativa(Integer.parseInt(objetoP.getProperty("Iniciativa")));
				//PROVISIONAL
				Arma arma = new Arma();
				Arma armas[] = {arma};
				armas[0].setNombre(objetoP.getProperty("WeaponOne"));
				armas[1].setNombre(objetoP.getProperty("WeaponTwo"));
				armas[2].setNombre(objetoP.getProperty("WeaponThree"));
				character.setArmas(armas);
				//PROVISIONAL
				Hechizo hechizo = new Hechizo();
				Hechizo hechizos[] = {hechizo};
				hechizos[0].setSpellName(objetoP.getProperty("SpellOne"));
				hechizos[1].setSpellName(objetoP.getProperty("SpellTwo"));
				hechizos[2].setSpellName(objetoP.getProperty("SpellThree"));
				character.setHechizos(hechizos);
				Clase clase = new Clase();
				//PROVISIONAL
				clase.setNombre(objetoP.getProperty("Class"));
				character.setClasepj(clase);
				character.setPiezasCobre(Integer.parseInt(objetoP.getProperty("Copper")));
				character.setPiezasPlata(Integer.parseInt(objetoP.getProperty("Silver")));
				character.setPiezasOro(Integer.parseInt(objetoP.getProperty("Gold")));
				character.setPiezasPlatino(Integer.parseInt(objetoP.getProperty("Platinum")));
				character.setPiezasElectrum(Integer.parseInt(objetoP.getProperty("Electrum")));
				character.setEquipo(objetoP.getProperty("Equipment"));
				character.setTesoro(objetoP.getProperty("Treasure"));
				character.setIdiomas(objetoP.getProperty("Language"));
				character.setRasgosPersonalidad(objetoP.getProperty("PersonalityTraits"));
				character.setIdeales(objetoP.getProperty("Ideals"));
				character.setVinculos(objetoP.getProperty("Bonds"));
				character.setDefectos(objetoP.getProperty("Flaws"));
				Raza raza = new Raza();
				Subraza subraza = new Subraza();
				//PROVISIONAL
				raza.setNombre(objetoP.getProperty("Race"));
				subraza.setNombre(objetoP.getProperty("Subrace"));
				character.setRaza(raza);
				character.setSubraza(subraza);
					
				i=200;
			}
		}
	}
	}
		
}