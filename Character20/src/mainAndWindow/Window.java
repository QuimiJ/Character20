package mainAndWindow;


import clasesCriatura.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Window {

	private JFrame frame;
	private JTextField textFieldStr;
	private JTextField textFieldDex;
	private JTextField textFieldCon;
	private JTextField textFieldInt;
	private JTextField textFieldWis;
	private JTextField textFieldCar;
	private JTextField textFieldAcrobacias;
	private JTextField textFieldAtletismo;
	private JTextField textFieldArcana;
	private JTextField textFieldEnganyo;
	private JTextField textFieldHistoria;
	private JTextField textFieldInterpretacion;
	private JTextField textFieldIntimidacion;
	private JTextField textFieldInvestigacion;
	private JTextField textFieldJuegoManos;
	private JTextField textFieldMedicina;
	private JTextField textFieldNaturaleza;
	private JTextField textFieldPercepcion;
	private JTextField textFieldPerspicacia;
	private JTextField textFieldPersuasion;
	private JTextField textFieldReligion;
	private JTextField textFieldSigilo;
	private JTextField textFieldSupervivencia;
	private JTextField textFieldAnimales;
	private JTextField textFieldAC;
	private JTextField textFieldIniciativa;
	private JTextField textFieldSpeed;
	private JTextField textFieldPuntosGolpe;
	private JTextField textFieldVidaTemporal;
	private JTextField txDadosGolpe;
	private JTextField textFieldArma1;
	private JTextField textFieldDanyoTipo1;
	private JTextField textFieldBonificador1;
	private JTextField textFieldArma2;
	private JTextField textFieldArma3;
	private JTextField textFieldDanyoTipo2;
	private JTextField textFieldDanyoTipo3;
	private JTextField textFieldBonificador2;
	private JTextField textFieldBonificador3;
	private JTextField textFieldIntroduceTuNombre;

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
		Personaje character = new Personaje();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1626, 949);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 22, 270, 125);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textFieldStr = new JTextField();
		textFieldStr.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldStr.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldStr.setText(Integer.toString(character.getStr().getScore()));
		textFieldStr.setBounds(40, 30, 65, 45);
		panel.add(textFieldStr);
		textFieldStr.setColumns(14);
		
		JLabel lStrMod = new JLabel(Integer.toString(character.getStr().getModifier()));
		lStrMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lStrMod.setHorizontalAlignment(SwingConstants.CENTER);
		lStrMod.setBounds(115, 30, 65, 45);
		panel.add(lStrMod);
		
		JLabel lStr = new JLabel("FUERZA");
		lStr.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lStr.setHorizontalAlignment(SwingConstants.CENTER);
		lStr.setBounds(80, 80, 110, 30);
		panel.add(lStr);
		
		JLabel lStrSave = new JLabel(Integer.toString(character.getStrsave()));
		lStrSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lStrSave.setHorizontalAlignment(SwingConstants.CENTER);
		lStrSave.setBounds(180, 30, 65, 45);
		panel.add(lStrSave);
		
		//
		JLabel lMod = new JLabel("(Mods)");
		lMod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lMod.setHorizontalAlignment(SwingConstants.CENTER);
		lMod.setBounds(115, 15, 65, 14);
		panel.add(lMod);
		//
		
		JLabel lSaves = new JLabel("(Saves)");
		lSaves.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lSaves.setHorizontalAlignment(SwingConstants.CENTER);
		lSaves.setBounds(180, 15, 65, 14);
		panel.add(lSaves);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 168, 270, 125);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textFieldDex = new JTextField();
		textFieldDex.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldDex.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDex.setText(Integer.toString(character.getDex().getScore()));
		textFieldDex.setBounds(40, 30, 65, 45);
		panel_1.add(textFieldDex);
		textFieldDex.setColumns(10);
		
		JLabel lDexMod = new JLabel(Integer.toString(character.getDex().getModifier()));
		lDexMod.setHorizontalAlignment(SwingConstants.CENTER);
		lDexMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lDexMod.setBounds(115, 30, 65, 45);
		panel_1.add(lDexMod);
		
		JLabel lDex = new JLabel("DESTREZA");
		lDex.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lDex.setBounds(60, 80, 150, 30);
		panel_1.add(lDex);
		
		JLabel lDexSave = new JLabel(Integer.toString(character.getDexsave()));
		lDexSave.setHorizontalAlignment(SwingConstants.CENTER);
		lDexSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lDexSave.setBounds(180, 30, 65, 45);
		panel_1.add(lDexSave);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(20, 324, 270, 125);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		textFieldCon = new JTextField();
		textFieldCon.setText(Integer.toString(character.getCon().getScore()));
		textFieldCon.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldCon.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCon.setBounds(40, 30, 65, 45);
		panel_1_1.add(textFieldCon);
		textFieldCon.setColumns(10);
		
		JLabel lConMod = new JLabel(Integer.toString( character.getDex().getModifier()));
		lConMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lConMod.setHorizontalAlignment(SwingConstants.CENTER);
		lConMod.setBounds(115, 30, 65, 45);
		panel_1_1.add(lConMod);
		
		JLabel lCon = new JLabel("CONSTITUCION");
		lCon.setHorizontalAlignment(SwingConstants.CENTER);
		lCon.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lCon.setBounds(20, 80, 230, 30);
		panel_1_1.add(lCon);
		
		JLabel lConSave = new JLabel(Integer.toString(character.getConsave()));
		lConSave.setHorizontalAlignment(SwingConstants.CENTER);
		lConSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lConSave.setBounds(180, 30, 65, 45);
		panel_1_1.add(lConSave);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(20, 460, 270, 125);
		frame.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		textFieldInt = new JTextField();
		textFieldInt.setText(Integer.toString(character.getIntel().getScore()));
		textFieldInt.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInt.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldInt.setBounds(40, 30, 65, 45);
		panel_1_1_1.add(textFieldInt);
		textFieldInt.setColumns(10);
		
		JLabel lIntMod = new JLabel(Integer.toString(character.getIntel().getModifier()));
		lIntMod.setHorizontalAlignment(SwingConstants.CENTER);
		lIntMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lIntMod.setBounds(115, 30, 65, 45);
		panel_1_1_1.add(lIntMod);
		
		JLabel lInt = new JLabel("INTELIGENCIA");
		lInt.setHorizontalAlignment(SwingConstants.CENTER);
		lInt.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lInt.setBounds(20, 80, 230, 30);
		panel_1_1_1.add(lInt);
		
		JLabel lIntSave = new JLabel(Integer.toString(character.getIntsave()));
		lIntSave.setHorizontalAlignment(SwingConstants.CENTER);
		lIntSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lIntSave.setBounds(180, 30, 65, 45);
		panel_1_1_1.add(lIntSave);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBounds(20, 606, 270, 125);
		frame.getContentPane().add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		textFieldWis = new JTextField();
		textFieldWis.setText(Integer.toString(character.getWis().getScore()));
		textFieldWis.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldWis.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldWis.setBounds(40, 30, 65, 45);
		panel_1_1_1_1.add(textFieldWis);
		textFieldWis.setColumns(10);
		
		JLabel lWisMod = new JLabel(Integer.toString(character.getWis().getModifier()));
		lWisMod.setHorizontalAlignment(SwingConstants.CENTER);
		lWisMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lWisMod.setBounds(115, 30, 65, 45);
		panel_1_1_1_1.add(lWisMod);
		
		JLabel lWis = new JLabel("SABIDURIA");
		lWis.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lWis.setHorizontalAlignment(SwingConstants.CENTER);
		lWis.setBounds(20, 80, 230, 30);
		panel_1_1_1_1.add(lWis);
		
		JLabel lWisSave = new JLabel(Integer.toString(character.getWissave()));
		lWisSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lWisSave.setHorizontalAlignment(SwingConstants.CENTER);
		lWisSave.setBounds(180, 30, 65, 45);
		panel_1_1_1_1.add(lWisSave);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBounds(20, 752, 270, 125);
		frame.getContentPane().add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setLayout(null);
		
		textFieldCar = new JTextField();
		textFieldCar.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldCar.setText(Integer.toString(character.getCha().getScore()));
		textFieldCar.setBounds(40, 30, 65, 45);
		panel_1_1_1_1_1.add(textFieldCar);
		textFieldCar.setColumns(10);
		
		JLabel lCarMod = new JLabel(Integer.toString(character.getCha().getModifier()));
		lCarMod.setHorizontalAlignment(SwingConstants.CENTER);
		lCarMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lCarMod.setBounds(115, 30, 64, 45);
		panel_1_1_1_1_1.add(lCarMod);
		
		JLabel lCha = new JLabel("CARISMA");
		lCha.setHorizontalAlignment(SwingConstants.CENTER);
		lCha.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lCha.setBounds(20, 80, 230, 30);
		panel_1_1_1_1_1.add(lCha);
		
		JLabel lCarSave = new JLabel(Integer.toString(character.getChasave()));
		lCarSave.setHorizontalAlignment(SwingConstants.CENTER);
		lCarSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lCarSave.setBounds(180, 30, 65, 45);
		panel_1_1_1_1_1.add(lCarSave);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(330, 22, 390, 200);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lExitos = new JLabel("EXITOS");
		lExitos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lExitos.setHorizontalAlignment(SwingConstants.CENTER);
		lExitos.setBounds(40, 40, 80, 25);
		panel_2.add(lExitos);
		
		JLabel lFallos = new JLabel("FALLOS");
		lFallos.setHorizontalAlignment(SwingConstants.CENTER);
		lFallos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lFallos.setBounds(40, 90, 80, 25);
		panel_2.add(lFallos);
		
		JLabel lSalvaciones = new JLabel("SALVACIONES");
		lSalvaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lSalvaciones.setFont(new Font("Tahoma", Font.BOLD | Font.BOLD, 25));
		lSalvaciones.setBounds(47, 134, 300, 30);
		panel_2.add(lSalvaciones);
		
		JLabel lContraMuerte = new JLabel("CONTRA MUERTE");
		lContraMuerte.setFont(new Font("Tahoma", Font.BOLD | Font.BOLD, 25));
		lContraMuerte.setHorizontalAlignment(SwingConstants.CENTER);
		lContraMuerte.setBounds(47, 165, 300, 30);
		panel_2.add(lContraMuerte);
		
		JRadioButton rButtonFail1 = new JRadioButton("");
		rButtonFail1.setBounds(165, 41, 21, 23);
		panel_2.add(rButtonFail1);
		
		JRadioButton rButtonFail2 = new JRadioButton("");
		rButtonFail2.setBounds(235, 41, 21, 23);
		panel_2.add(rButtonFail2);
		
		JRadioButton rButtonFail3 = new JRadioButton("");
		rButtonFail3.setBounds(305, 41, 21, 23);
		panel_2.add(rButtonFail3);
		
		JRadioButton rButtonSave1 = new JRadioButton("");
		rButtonSave1.setBounds(165, 91, 21, 23);
		panel_2.add(rButtonSave1);
		
		JRadioButton rButtonSave2 = new JRadioButton("");
		rButtonSave2.setBounds(235, 91, 21, 23);
		panel_2.add(rButtonSave2);
		
		JRadioButton rButtonSave3 = new JRadioButton("");
		rButtonSave3.setBounds(305, 91, 21, 23);
		panel_2.add(rButtonSave3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(330, 287, 390, 590);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lSkills = new JLabel("HABILIDADES");
		lSkills.setHorizontalAlignment(SwingConstants.CENTER);
		lSkills.setFont(new Font("Tahoma", Font.BOLD | Font.BOLD, 30));
		lSkills.setBounds(20, 560, 350, 30);
		panel_3.add(lSkills);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(15, 27, 21, 23);
		panel_3.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setSelected(true);
		checkBox_1.setBounds(15, 57, 21, 23);
		panel_3.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(15, 87, 21, 23);
		panel_3.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(15, 267, 21, 23);
		panel_3.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(15, 297, 21, 23);
		panel_3.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("");
		checkBox_5.setBounds(15, 207, 21, 23);
		panel_3.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("");
		checkBox_6.setBounds(15, 327, 21, 23);
		panel_3.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("");
		checkBox_7.setBounds(15, 417, 21, 23);
		panel_3.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("");
		checkBox_8.setBounds(15, 237, 21, 23);
		panel_3.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("");
		checkBox_9.setBounds(15, 387, 21, 23);
		panel_3.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("");
		checkBox_10.setSelected(true);
		checkBox_10.setBounds(15, 147, 21, 23);
		panel_3.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("");
		checkBox_11.setBounds(15, 117, 21, 23);
		panel_3.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("");
		checkBox_12.setBounds(15, 177, 21, 23);
		panel_3.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("");
		checkBox_13.setSelected(true);
		checkBox_13.setBounds(15, 357, 21, 23);
		panel_3.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("");
		checkBox_14.setBounds(15, 447, 21, 23);
		panel_3.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("");
		checkBox_15.setBounds(15, 477, 21, 23);
		panel_3.add(checkBox_15);
		
		textFieldAcrobacias = new JTextField();
		textFieldAcrobacias.setText(Integer.toString(character.getAcrobacias()));
		textFieldAcrobacias.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAcrobacias.setBounds(40, 27, 25, 20);
		panel_3.add(textFieldAcrobacias);
		textFieldAcrobacias.setColumns(10);
		
		textFieldAtletismo = new JTextField();
		textFieldAtletismo.setText(Integer.toString(character.getAtletismo()));
		textFieldAtletismo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAtletismo.setColumns(10);
		textFieldAtletismo.setBounds(40, 57, 25, 20);
		panel_3.add(textFieldAtletismo);
		
		textFieldArcana = new JTextField();
		textFieldArcana.setText(Integer.toString(character.getArcana()));
		textFieldArcana.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldArcana.setColumns(10);
		textFieldArcana.setBounds(40, 87, 25, 20);
		panel_3.add(textFieldArcana);
		
		textFieldEnganyo = new JTextField();
		textFieldEnganyo.setText(Integer.toString(character.getEnganyo()));
		textFieldEnganyo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEnganyo.setColumns(10);
		textFieldEnganyo.setBounds(40, 117, 25, 20);
		panel_3.add(textFieldEnganyo);
		
		textFieldHistoria = new JTextField();
		textFieldHistoria.setText(Integer.toString(character.getHistoria()));
		textFieldHistoria.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHistoria.setColumns(10);
		textFieldHistoria.setBounds(40, 147, 25, 20);
		panel_3.add(textFieldHistoria);
		
		textFieldInterpretacion = new JTextField();
		textFieldInterpretacion.setText(Integer.toString(character.getInterpretacion()));
		textFieldInterpretacion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInterpretacion.setColumns(10);
		textFieldInterpretacion.setBounds(40, 177, 25, 20);
		panel_3.add(textFieldInterpretacion);
		
		textFieldIntimidacion = new JTextField();
		textFieldIntimidacion.setText(Integer.toString(character.getIntimidacion()));
		textFieldIntimidacion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIntimidacion.setColumns(10);
		textFieldIntimidacion.setBounds(40, 207, 25, 20);
		panel_3.add(textFieldIntimidacion);
		
		textFieldInvestigacion = new JTextField();
		textFieldInvestigacion.setText(Integer.toString(character.getInvestigacion()));
		textFieldInvestigacion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInvestigacion.setColumns(10);
		textFieldInvestigacion.setBounds(40, 237, 25, 20);
		panel_3.add(textFieldInvestigacion);
		
		textFieldJuegoManos = new JTextField();
		textFieldJuegoManos.setText(Integer.toString(character.getJuegoManos()));
		textFieldJuegoManos.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldJuegoManos.setColumns(10);
		textFieldJuegoManos.setBounds(40, 267, 25, 20);
		panel_3.add(textFieldJuegoManos);
		
		textFieldMedicina = new JTextField();
		textFieldMedicina.setText(Integer.toString(character.getMedicina()));
		textFieldMedicina.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMedicina.setColumns(10);
		textFieldMedicina.setBounds(40, 297, 25, 20);
		panel_3.add(textFieldMedicina);
		
		textFieldNaturaleza = new JTextField();
		textFieldNaturaleza.setText(Integer.toString(character.getNaturaleza()));
		textFieldNaturaleza.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNaturaleza.setColumns(10);
		textFieldNaturaleza.setBounds(40, 327, 25, 20);
		panel_3.add(textFieldNaturaleza);
		
		textFieldPercepcion = new JTextField();
		textFieldPercepcion.setText(Integer.toString(character.getPercepcion()));
		textFieldPercepcion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPercepcion.setColumns(10);
		textFieldPercepcion.setBounds(40, 357, 25, 20);
		panel_3.add(textFieldPercepcion);
		
		textFieldPerspicacia = new JTextField();
		textFieldPerspicacia.setText(Integer.toString(character.getPerspicacia()));
		textFieldPerspicacia.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPerspicacia.setColumns(10);
		textFieldPerspicacia.setBounds(40, 387, 25, 20);
		panel_3.add(textFieldPerspicacia);
		
		textFieldPersuasion = new JTextField();
		textFieldPersuasion.setText(Integer.toString(character.getPersuasion()));
		textFieldPersuasion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPersuasion.setColumns(10);
		textFieldPersuasion.setBounds(40, 417, 25, 20);
		panel_3.add(textFieldPersuasion);
		
		textFieldReligion = new JTextField();
		textFieldReligion.setText(Integer.toString(character.getReligion()));
		textFieldReligion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldReligion.setColumns(10);
		textFieldReligion.setBounds(40, 447, 25, 20);
		panel_3.add(textFieldReligion);
		
		textFieldSigilo = new JTextField();
		textFieldSigilo.setText(Integer.toString(character.getSigilo()));
		textFieldSigilo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSigilo.setColumns(10);
		textFieldSigilo.setBounds(40, 477, 25, 20);
		panel_3.add(textFieldSigilo);
		
		JLabel lAcrobacias = new JLabel("Acrobacias (SAB)");
		lAcrobacias.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lAcrobacias.setBounds(100, 27, 270, 20);
		panel_3.add(lAcrobacias);
		
		JLabel lAtletismo = new JLabel("Atletismo (FUE)");
		lAtletismo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lAtletismo.setBounds(100, 57, 270, 20);
		panel_3.add(lAtletismo);
		
		JLabel lArcana = new JLabel("Conocimiento Arcano (INT)");
		lArcana.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lArcana.setBounds(100, 87, 270, 20);
		panel_3.add(lArcana);
		
		JLabel lEnganyo = new JLabel("Enganyo (CAR)");
		lEnganyo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lEnganyo.setBounds(100, 117, 270, 20);
		panel_3.add(lEnganyo);
		
		JLabel lHistoria = new JLabel("Historia (INT)");
		lHistoria.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lHistoria.setBounds(100, 147, 270, 20);
		panel_3.add(lHistoria);
		
		JLabel lInterpretacion = new JLabel("Interpretacion (CAR)");
		lInterpretacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lInterpretacion.setBounds(100, 177, 270, 20);
		panel_3.add(lInterpretacion);
		
		JLabel lIntimidacion = new JLabel("Intimidacion (CAR)");
		lIntimidacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lIntimidacion.setBounds(100, 207, 270, 20);
		panel_3.add(lIntimidacion);
		
		JLabel lInvestigacion = new JLabel("Investigacion (INT)");
		lInvestigacion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lInvestigacion.setBounds(100, 237, 270, 20);
		panel_3.add(lInvestigacion);
		
		JLabel lJuegoManos = new JLabel("Juego de Manos (DES)");
		lJuegoManos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lJuegoManos.setBounds(100, 267, 270, 20);
		panel_3.add(lJuegoManos);
		
		JLabel lMedicina = new JLabel("Medicina (SAB)");
		lMedicina.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lMedicina.setBounds(100, 297, 270, 20);
		panel_3.add(lMedicina);
		
		JLabel lNaturaleza = new JLabel("Naturaleza (INT)");
		lNaturaleza.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lNaturaleza.setBounds(100, 327, 270, 20);
		panel_3.add(lNaturaleza);
		
		JLabel lPercepcion = new JLabel("Percepcion (SAB)");
		lPercepcion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lPercepcion.setBounds(100, 357, 270, 20);
		panel_3.add(lPercepcion);
		
		JLabel lPerspicacia = new JLabel("Perspicacia (SAB)");
		lPerspicacia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lPerspicacia.setBounds(100, 387, 270, 20);
		panel_3.add(lPerspicacia);
		
		JLabel lPersuasion = new JLabel("Persuasion (CAR)");
		lPersuasion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lPersuasion.setBounds(100, 417, 270, 20);
		panel_3.add(lPersuasion);
		
		JLabel lReligion = new JLabel("Religion (INT)");
		lReligion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lReligion.setBounds(100, 447, 270, 20);
		panel_3.add(lReligion);
		
		JLabel lSigilo = new JLabel("Sigilo (DES)");
		lSigilo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lSigilo.setBounds(100, 477, 270, 20);
		panel_3.add(lSigilo);
		
		JCheckBox checkBox_15_1 = new JCheckBox("");
		checkBox_15_1.setSelected(true);
		checkBox_15_1.setBounds(15, 507, 21, 23);
		panel_3.add(checkBox_15_1);
		
		JCheckBox checkBox_15_2 = new JCheckBox("");
		checkBox_15_2.setBounds(15, 537, 21, 23);
		panel_3.add(checkBox_15_2);
		
		textFieldSupervivencia = new JTextField();
		textFieldSupervivencia.setText(Integer.toString(character.getSupervivencia()));
		textFieldSupervivencia.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSupervivencia.setColumns(10);
		textFieldSupervivencia.setBounds(40, 507, 25, 20);
		panel_3.add(textFieldSupervivencia);
		
		textFieldAnimales = new JTextField();
		textFieldAnimales.setText(Integer.toString(character.getTratoAnimales()));
		textFieldAnimales.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAnimales.setColumns(10);
		textFieldAnimales.setBounds(40, 537, 25, 20);
		panel_3.add(textFieldAnimales);
		
		JLabel lSupervivencia = new JLabel("Supervivencia (SAB)");
		lSupervivencia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lSupervivencia.setBounds(100, 508, 270, 20);
		panel_3.add(lSupervivencia);
		
		JLabel lAnimales = new JLabel("Trato con Animales (SAB)");
		lAnimales.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lAnimales.setBounds(100, 537, 270, 20);
		panel_3.add(lAnimales);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(760, 22, 390, 420);
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lAC = new JLabel("Clase de armadura");
		lAC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lAC.setHorizontalAlignment(SwingConstants.CENTER);
		lAC.setBounds(10, 20, 110, 30);
		panel_2_1.add(lAC);
		
		textFieldAC = new JTextField();
		textFieldAC.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textFieldAC.setText(Integer.toString(character.getAC()));
		textFieldAC.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAC.setBounds(10, 55, 110, 110);
		panel_2_1.add(textFieldAC);
		textFieldAC.setColumns(10);
		
		JLabel lIniciativa = new JLabel("Iniciativa");
		lIniciativa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lIniciativa.setHorizontalAlignment(SwingConstants.CENTER);
		lIniciativa.setBounds(140, 20, 110, 30);
		panel_2_1.add(lIniciativa);
		
		textFieldIniciativa = new JTextField();
		textFieldIniciativa.setText(Integer.toString(character.getIniciativa()));
		textFieldIniciativa.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIniciativa.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textFieldIniciativa.setColumns(10);
		textFieldIniciativa.setBounds(140, 55, 110, 110);
		panel_2_1.add(textFieldIniciativa);
		
		JLabel lSpeed = new JLabel("Velocidad");
		lSpeed.setHorizontalAlignment(SwingConstants.CENTER);
		lSpeed.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lSpeed.setBounds(270, 20, 110, 30);
		panel_2_1.add(lSpeed);
		
		textFieldSpeed = new JTextField();
		textFieldSpeed.setText(Integer.toString(character.getSpeed()));
		textFieldSpeed.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSpeed.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textFieldSpeed.setColumns(10);
		textFieldSpeed.setBounds(270, 55, 110, 110);
		panel_2_1.add(textFieldSpeed);
		
		JLabel lPuntosGolpe = new JLabel("Puntos de Golpe");
		lPuntosGolpe.setHorizontalAlignment(SwingConstants.CENTER);
		lPuntosGolpe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lPuntosGolpe.setBounds(10, 235, 110, 30);
		panel_2_1.add(lPuntosGolpe);
		
		JLabel lVidaTemporal = new JLabel("PG Temporales");
		lVidaTemporal.setHorizontalAlignment(SwingConstants.CENTER);
		lVidaTemporal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lVidaTemporal.setBounds(140, 235, 110, 30);
		panel_2_1.add(lVidaTemporal);
		
		JLabel lDadosGolpe = new JLabel("Dados de Golpe");
		lDadosGolpe.setHorizontalAlignment(SwingConstants.CENTER);
		lDadosGolpe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lDadosGolpe.setBounds(270, 235, 110, 30);
		panel_2_1.add(lDadosGolpe);
		
		textFieldPuntosGolpe = new JTextField();
		textFieldPuntosGolpe.setText(Integer.toString(character.getLife()));
		textFieldPuntosGolpe.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPuntosGolpe.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textFieldPuntosGolpe.setColumns(10);
		textFieldPuntosGolpe.setBounds(10, 270, 110, 110);
		panel_2_1.add(textFieldPuntosGolpe);
		
		textFieldVidaTemporal = new JTextField();
		textFieldVidaTemporal.setText("0");
		textFieldVidaTemporal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldVidaTemporal.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textFieldVidaTemporal.setColumns(10);
		textFieldVidaTemporal.setBounds(140, 270, 110, 110);
		panel_2_1.add(textFieldVidaTemporal);
		
		txDadosGolpe = new JTextField();
		txDadosGolpe.setText(character.getClasepj().getHitdie());
		txDadosGolpe.setHorizontalAlignment(SwingConstants.CENTER);
		txDadosGolpe.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txDadosGolpe.setColumns(10);
		txDadosGolpe.setBounds(270, 270, 110, 110);
		panel_2_1.add(txDadosGolpe);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(760, 507, 390, 370);
		frame.getContentPane().add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel lArmasEquipo = new JLabel("ARMAS Y EQUIPO");
		lArmasEquipo.setFont(new Font("Tahoma", Font.BOLD | Font.BOLD, 30));
		lArmasEquipo.setHorizontalAlignment(SwingConstants.CENTER);
		lArmasEquipo.setBounds(20, 340, 350, 30);
		panel_2_1_1.add(lArmasEquipo);
		
		JLabel lNombre = new JLabel("Nombre");
		lNombre.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lNombre.setBounds(10, 10, 90, 15);
		panel_2_1_1.add(lNombre);
		
		JLabel lBonificador = new JLabel("Bonificador");
		lBonificador.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lBonificador.setHorizontalAlignment(SwingConstants.CENTER);
		lBonificador.setBounds(160, 10, 70, 15);
		panel_2_1_1.add(lBonificador);
		
		JLabel lDanyoTipo = new JLabel("Danyo/Tipo");
		lDanyoTipo.setHorizontalAlignment(SwingConstants.CENTER);
		lDanyoTipo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lDanyoTipo.setBounds(240, 10, 140, 15);
		panel_2_1_1.add(lDanyoTipo);
		
		textFieldArma1 = new JTextField();
		textFieldArma1.setText(character.getArmas()[0].getNombre());
		textFieldArma1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldArma1.setBounds(10, 35, 140, 20);
		panel_2_1_1.add(textFieldArma1);
		textFieldArma1.setColumns(10);
		
		textFieldDanyoTipo1 = new JTextField(character.getArmas()[0].getDaño() + "   " + character.getArmas()[0].getTipo());
		textFieldDanyoTipo1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldDanyoTipo1.setText(character.getArmas()[0].getDaño() + "   " + character.getArmas()[1].getTipo());
		textFieldDanyoTipo1.setColumns(10);
		textFieldDanyoTipo1.setBounds(240, 35, 140, 20);
		panel_2_1_1.add(textFieldDanyoTipo1);
		
		textFieldBonificador1 = new JTextField();
		textFieldBonificador1.setText("");
		textFieldBonificador1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldBonificador1.setColumns(10);
		textFieldBonificador1.setBounds(170, 35, 50, 20);
		panel_2_1_1.add(textFieldBonificador1);
		
		textFieldArma2 = new JTextField(character.getArmas()[1].getNombre());
		textFieldArma2.setColumns(10);
		textFieldArma2.setBounds(10, 65, 140, 20);
		panel_2_1_1.add(textFieldArma2);
		
		textFieldBonificador2 = new JTextField();
		textFieldBonificador2.setColumns(10);
		textFieldBonificador2.setBounds(170, 65, 50, 20);
		panel_2_1_1.add(textFieldBonificador2);
		
		textFieldDanyoTipo2 = new JTextField(character.getArmas()[1].getDaño() + "   " + character.getArmas()[1].getTipo());
		textFieldDanyoTipo2.setColumns(10);
		textFieldDanyoTipo2.setBounds(240, 65, 140, 20);
		panel_2_1_1.add(textFieldDanyoTipo2);
		
		textFieldArma3 = new JTextField(character.getArmas()[2].getNombre());
		textFieldArma3.setColumns(10);
		textFieldArma3.setBounds(10, 95, 140, 20);
		panel_2_1_1.add(textFieldArma3);
		
		textFieldBonificador3 = new JTextField();
		textFieldBonificador3.setColumns(10);
		textFieldBonificador3.setBounds(170, 95, 50, 20);
		panel_2_1_1.add(textFieldBonificador3);
		
		textFieldDanyoTipo3 = new JTextField(character.getArmas()[2].getDaño() + "   " + character.getArmas()[2].getTipo());
		textFieldDanyoTipo3.setColumns(10);
		textFieldDanyoTipo3.setBounds(240, 95, 140, 20);
		panel_2_1_1.add(textFieldDanyoTipo3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 125, 370, 210);
		panel_2_1_1.add(textPane);
		
		JPanel panel_2_1_2 = new JPanel();
		panel_2_1_2.setBounds(1190, 22, 390, 230);
		frame.getContentPane().add(panel_2_1_2);
		panel_2_1_2.setLayout(null);
		
		JLabel lPersonaje = new JLabel("PERSONAJE");
		lPersonaje.setHorizontalAlignment(SwingConstants.CENTER);
		lPersonaje.setFont(new Font("Tahoma", Font.BOLD | Font.BOLD, 20));
		lPersonaje.setBounds(20, 210, 350, 20);
		panel_2_1_2.add(lPersonaje);
		
		JLabel lNombreDosPuntos = new JLabel("Nombre:");
		lNombreDosPuntos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lNombreDosPuntos.setBounds(20, 10, 60, 20);
		panel_2_1_2.add(lNombreDosPuntos);
		
		textFieldIntroduceTuNombre = new JTextField();
		textFieldIntroduceTuNombre.setToolTipText("Introduce tu nombre...");
		textFieldIntroduceTuNombre.setBounds(90, 10, 280, 20);
		panel_2_1_2.add(textFieldIntroduceTuNombre);
		textFieldIntroduceTuNombre.setColumns(10);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setToolTipText("Caracteristicas del personaje");
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPane_1.setBounds(20, 40, 350, 165);
		panel_2_1_2.add(textPane_1);
		
		JPanel panel_2_1_2_1 = new JPanel();
		panel_2_1_2_1.setBounds(1190, 297, 390, 500);
		frame.getContentPane().add(panel_2_1_2_1);
		panel_2_1_2_1.setLayout(null);
		
		JLabel lRasgos = new JLabel("RASGOS Y ATRIBUTOS");
		lRasgos.setHorizontalAlignment(SwingConstants.CENTER);
		lRasgos.setFont(new Font("Tahoma", Font.BOLD | Font.BOLD, 20));
		lRasgos.setBounds(20, 480, 350, 20);
		panel_2_1_2_1.add(lRasgos);
		
		JTextPane txtpnCosasDeTortuga = new JTextPane();
		txtpnCosasDeTortuga.setText("cosas de tortuga:\r\n-Puedes atacar con tu zarpa haciendo 1d4 de da\u00F1o cortante\r\n-Puedes aguantar la respiraci\u00F3n bajo el agua durante 60 minutos\r\n-Puedes meterte dentro de tu caparaz\u00F3n usando tu acci\u00F3n reduciendo as\u00ED su velocidad a 0 teniendo desventaja en tiradas de destreza y ganando ventaja en tiradas de salvaci\u00F3n de constituci\u00F3n y fuerza y ganas un mas 4 en AC. puedes salir del caparaz\u00F3n como acci\u00F3n bonus pero, no puedes tomar ninguna otra acci\u00F3n tras eso.\r\n-bueno es supervivencia \r\n\r\ncosas de b\u00E1rbaro:\r\n-2 veces al dia ganas ventaja en checks y salvaciones de fuerza y recibes un +2 en  ataques a mele y resistencia contra da\u00F1o contundente penetrante y cortante\r\n-Tienes 17 de constituci\u00F3n cuando no llevas nada de armadura\r\n-Ataque temerario puedes dejar de lado toda preocupaci\u00F3n por tu defensa y atacar con una firme convicci\u00F3n. Una vez atacas por primera vez en tu turno puedes decidir atacar de forma temeraria, esto te dar\u00E1 ventaja en ataques a mele que usan fuerza, pero los ataques contra ti tendr\u00E1s desventaja hasta el siguiente turno.\r\n\r\ncosas de pescador:\r\n-Puedes hacer amigos contando historias y pescar lo suficientemente bien como para conseguir algo de pasta\r\n");
		txtpnCosasDeTortuga.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCosasDeTortuga.setBounds(10, 10, 370, 460);
		panel_2_1_2_1.add(txtpnCosasDeTortuga);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(1160, 815, 420, 62);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton bEditorPersonaje = new JButton("Editor \r\n");
		bEditorPersonaje.setBounds(0, 10, 130, 42);
		panel_4.add(bEditorPersonaje);
		
		JButton bStoreProperties = new JButton("Store");
		//Rodear de un if que chequeé si se puede hacer el store 
		bStoreProperties.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				/*
				character.setName(textFieldIntroduceTuNombre.getText());
				character.setLife(Integer.parseInt(textFieldPuntosGolpe.getText()));
				character.setAC(Integer.parseInt(textFieldAC.getText()));
				character.setSpeed(Integer.parseInt(textFieldSpeed.getText()));
				character.getStr().setScore(Integer.parseInt(textFieldStr.getText()));
				character.getDex().setScore(Integer.parseInt(textFieldDex.getText()));
				character.getCon().setScore(Integer.parseInt(textFieldCon.getText()));
				character.getIntel().setScore(Integer.parseInt(textFieldInt.getText()));
				character.getWis().setScore(Integer.parseInt(textFieldWis.getText()));
				character.getCha().setScore(Integer.parseInt(textFieldCar.getText()));
				character.setStrsave(Integer.parseInt(lStrSave.getText()));
				character.setDexsave(Integer.parseInt(lDexSave.getText()));
				character.setConsave(Integer.parseInt(lConSave.getText()));
				character.setIntsave(Integer.parseInt(lIntSave.getText()));
				character.setWissave(Integer.parseInt(lWisSave.getText()));
				character.setChasave(Integer.parseInt(lCarSave.getText()));
				character.setAcrobacias(Integer.parseInt(textFieldAcrobacias.getText()));
				character.setTratoAnimales(Integer.parseInt(textFieldAnimales.getText()));
				character.setArcana(Integer.parseInt(textFieldArcana.getText()));
				character.setAtletismo(Integer.parseInt(textFieldAtletismo.getText()));
				character.setEnganyo(Integer.parseInt(textFieldEnganyo.getText()));
				character.setHistoria(Integer.parseInt(textFieldHistoria.getText()));
				character.setPerspicacia(Integer.parseInt(textFieldPerspicacia.getText()));
				character.setIntimidacion(Integer.parseInt(textFieldIntimidacion.getText()));
				character.setInvestigacion(Integer.parseInt(textFieldInvestigacion.getText()));
				character.setMedicina(Integer.parseInt(textFieldMedicina.getText()));
				character.setNaturaleza(Integer.parseInt(textFieldNaturaleza.getText()));
				character.setPercepcion(Integer.parseInt(textFieldPercepcion.getText()));
				character.setInterpretacion(Integer.parseInt(textFieldInterpretacion.getText()));
				character.setPersuasion(Integer.parseInt(textFieldPersuasion.getText()));
				character.setReligion(Integer.parseInt(textFieldReligion.getText()));
				character.setJuegoManos(Integer.parseInt(textFieldJuegoManos.getText()));
				character.setSigilo(Integer.parseInt(textFieldSigilo.getText()));
				character.setSupervivencia(Integer.parseInt(textFieldSupervivencia.getText()));
				character.setBonoCompetencia(Integer.parseInt(""));
				character.setIniciativa(Integer.parseInt(textFieldIniciativa.getText()));
				character.getArmas()[0].setNombre("");
				character.getArmas()[1].setNombre("");
				character.getArmas()[2].setNombre("");
				character.getHechizos()[0].setSpellName("");
				character.getHechizos()[1].setSpellName("");
				character.getHechizos()[2].setSpellName("");
				character.getClasepj().setNombre("");
				character.setPiezasCobre(Integer.parseInt(""));
				character.setPiezasPlata(Integer.parseInt(""));
				character.setPiezasOro(Integer.parseInt(""));
				character.setPiezasPlatino(Integer.parseInt(""));
				character.setPiezasElectrum(Integer.parseInt(""));
				character.setEquipo("");
				character.setTesoro("");
				character.setIdiomas("");
				character.setRasgosPersonalidad("");
				character.setIdeales("");
				character.setVinculos("");
				character.setDefectos("");
				character.getRaza().setNombre("");
				character.getSubraza().setNombre("");
				*/
				
				storeOrLoadProperties("store", character, "");			
			}
		});
		bStoreProperties.setBounds(300, 10, 120, 42);
		panel_4.add(bStoreProperties);
		
		JButton bLoadProperties = new JButton("Load");
		//Rodear de un if que chequeé si se puede hacer el load
		bLoadProperties.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				storeOrLoadProperties("load", null, "QuimiMalo");
			}
		});
		bLoadProperties.setBounds(150, 10, 130, 42);
		panel_4.add(bLoadProperties);
		
		
		/*
		//Si el score es 20 no se podra sumar mas
		if (pruebaStr.getScore()<21) {
			btnNewButton.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent arg0) {
							
			}
			});
		
		}*/
		
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
				objetoP.setProperty("Engaño" + Integer.toString(i), Integer.toString(character.getEnganyo()));
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
				
				System.out.println("Character saved.");

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
				character.setEnganyo(Integer.parseInt(objetoP.getProperty("Engaño")));
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
					
				System.out.println("Character loaded.");
				
				i=200;
			}
		}
	}
	}		
}