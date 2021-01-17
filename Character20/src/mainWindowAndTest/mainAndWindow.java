package mainWindowAndTest;

import clasesCriatura.*;
import database.CharacterDB;
import database.CharacterDBException;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import mainWindowAndTest.CreationWindow;

public class mainAndWindow extends JFrame {

	private JFrame frame;
	private static CharacterDB characterDB;
	private static JTextField textFieldStr;
	private static JTextField textFieldDex;
	private static JTextField textFieldCon;
	private static JTextField textFieldInt;
	private static JTextField textFieldWis;
	private static JTextField textFieldCar;
	private static JTextField textFieldAcrobacias;
	private static JTextField textFieldAtletismo;
	private static JTextField textFieldArcana;
	private static JTextField textFieldEnganyo;
	private static JTextField textFieldHistoria;
	private static JTextField textFieldInterpretacion;
	private static JTextField textFieldIntimidacion;
	private static JTextField textFieldInvestigacion;
	private static JTextField textFieldJuegoManos;
	private static JTextField textFieldMedicina;
	private static JTextField textFieldNaturaleza;
	private static JTextField textFieldPercepcion;
	private static JTextField textFieldPerspicacia;
	private static JTextField textFieldPersuasion;
	private static JTextField textFieldReligion;
	private static JTextField textFieldSigilo;
	private static JTextField textFieldSupervivencia;
	private static JTextField textFieldAnimales;
	private static JTextField textFieldAC;
	private static JTextField textFieldIniciativa;
	private static JTextField textFieldSpeed;
	private static JTextField textFieldPuntosGolpe;
	private static JTextField textFieldVidaTemporal;
	private static JTextField textFieldDadosGolpe;
	private static JTextField textFieldArma1;
	private static JTextField textFieldDanyoTipo1;
	private static JTextField textFieldBonificador1;
	private static JTextField textFieldArma2;
	private static JTextField textFieldArma3;
	private static JTextField textFieldDanyoTipo2;
	private static JTextField textFieldDanyoTipo3;
	private static JTextField textFieldBonificador2;
	private static JTextField textFieldBonificador3;
	private static JTextField textFieldIntroduceTuNombre;
	private static JLabel lStrMod;
	private static JLabel lDexMod;
	private static JLabel lConMod;
	private static JLabel lIntMod;
	private static JLabel lWisMod;
	private static JLabel lCarMod;
	private static JCheckBox checkBoxAcrobacias;
	private static JCheckBox checkBoxAtletismo;
	private static JCheckBox checkBoxArcana;
	private static JCheckBox checkBoxJuegoManos;
	private static JCheckBox checkBoxMedicina;
	private static JCheckBox checkBoxIntimidacion;
	private static JCheckBox checkBoxNaturaleza;
	private static JCheckBox checkBoxPersuasion;
	private static JCheckBox checkBoxInvestigacion;
	private static JCheckBox checkBoxPerspicacia;
	private static JCheckBox checkBoxHistoria;
	private static JCheckBox checkBoxEnganyo;
	private static JCheckBox checkBoxInterpretacion;
	private static JCheckBox checkBoxPercepcion;
	private static JCheckBox checkBoxReligion;
	private static JCheckBox checkBoxSigilo;
	private static JCheckBox checkBoxSupervivencia;
	private static JCheckBox checkBoxAnimales;
	private static JLabel lStrSave;
	private static JLabel lDexSave;
	private static JLabel lConSave;
	private static JLabel lIntSave;
	private static JLabel lWisSave;
	private static JLabel lCarSave;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Metodo que maneja un fichero properties que guarda las veces que se ha usado la aplicacion.
					timesOpenProperties();
					mainAndWindow window = new mainAndWindow();
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
	public mainAndWindow() {
		//Metodo para inicializar la ventana
		initialize();
		actualizar();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//La variable Personaje almacena la informacion que se muestra en la ventana
		Personaje character = new Personaje();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1626, 949);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 22, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 147, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textFieldStr = new JTextField();
		textFieldStr.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldStr.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldStr.setText("18");
		textFieldStr.setBounds(40, 30, 65, 45);
		lStrMod = new JLabel(Integer.toString(character.getStr().getModifier()));
		lStrSave =  new JLabel(Integer.toString(character.getStrsave()));
		textFieldAtletismo = new JTextField();
		panel.add(textFieldStr);
		textFieldStr.setColumns(14);
		
		
		lStrMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lStrMod.setHorizontalAlignment(SwingConstants.CENTER);
		lStrMod.setBounds(115, 30, 65, 45);
		panel.add(lStrMod);
		
		JLabel lStr = new JLabel("FUERZA");
		lStr.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lStr.setHorizontalAlignment(SwingConstants.CENTER);
		lStr.setBounds(80, 80, 110, 30);
		panel.add(lStr);
		
		
		lStrSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lStrSave.setHorizontalAlignment(SwingConstants.CENTER);
		lStrSave.setBounds(180, 30, 65, 45);
		panel.add(lStrSave);
		
		JLabel lMod = new JLabel("(Mods)");
		lMod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lMod.setHorizontalAlignment(SwingConstants.CENTER);
		lMod.setBounds(115, 15, 65, 14);
		panel.add(lMod);
		
		JLabel LSaves = new JLabel("(Saves)");
		LSaves.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LSaves.setHorizontalAlignment(SwingConstants.CENTER);
		LSaves.setBounds(180, 15, 65, 14);
		panel.add(LSaves);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 168, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 293, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textFieldDex = new JTextField();
		textFieldDex.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldDex.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDex.setText("15");
		textFieldDex.setBounds(40, 30, 65, 45);
		lDexMod = new JLabel(Integer.toString(character.getDex().getModifier()));
		lDexSave = new JLabel(Integer.toString(character.getDexsave()));
			
		panel_1.add(textFieldDex);
		textFieldDex.setColumns(10);
		
		
		lDexMod.setHorizontalAlignment(SwingConstants.CENTER);
		lDexMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lDexMod.setBounds(115, 30, 65, 45);
		panel_1.add(lDexMod);
		
		JLabel lDex = new JLabel("DESTREZA");
		lDex.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lDex.setBounds(60, 80, 150, 30);
		panel_1.add(lDex);
		
		lDexSave.setHorizontalAlignment(SwingConstants.CENTER);
		lDexSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lDexSave.setBounds(180, 30, 65, 45);
		panel_1.add(lDexSave);
		
		JPanel panel_1_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1_1, 324, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1_1, 449, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1_1, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		textFieldCon = new JTextField();
		textFieldCon.setText("14");
		textFieldCon.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldCon.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCon.setBounds(40, 30, 65, 45);
		lConMod = new JLabel(Integer.toString( character.getDex().getModifier()));
		lConSave = new JLabel(Integer.toString(character.getConsave()));
		panel_1_1.add(textFieldCon);
		textFieldCon.setColumns(10);
		
		lConMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lConMod.setHorizontalAlignment(SwingConstants.CENTER);
		lConMod.setBounds(115, 30, 65, 45);
		panel_1_1.add(lConMod);
		
		JLabel lCon = new JLabel("CONSTITUCION");
		lCon.setHorizontalAlignment(SwingConstants.CENTER);
		lCon.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lCon.setBounds(20, 80, 230, 30);
		panel_1_1.add(lCon);
		
		lConSave.setHorizontalAlignment(SwingConstants.CENTER);
		lConSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lConSave.setBounds(180, 30, 65, 45);
		panel_1_1.add(lConSave);
		
		JPanel panel_1_1_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1_1_1, 460, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1_1_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1_1_1, 585, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1_1_1, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		textFieldInt = new JTextField();
		textFieldInt.setText("8");
		textFieldInt.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInt.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldInt.setBounds(40, 30, 65, 45);
		lIntMod = new JLabel(Integer.toString(character.getIntel().getModifier()));
		lIntSave = new JLabel(Integer.toString(character.getIntsave()));
		panel_1_1_1.add(textFieldInt);
		textFieldInt.setColumns(10);
		
		lIntMod.setHorizontalAlignment(SwingConstants.CENTER);
		lIntMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lIntMod.setBounds(115, 30, 65, 45);
		panel_1_1_1.add(lIntMod);
		
		JLabel lInt = new JLabel("INTELIGENCIA");
		lInt.setHorizontalAlignment(SwingConstants.CENTER);
		lInt.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lInt.setBounds(20, 80, 230, 30);
		panel_1_1_1.add(lInt);
		
		lIntSave.setHorizontalAlignment(SwingConstants.CENTER);
		lIntSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lIntSave.setBounds(180, 30, 65, 45);
		panel_1_1_1.add(lIntSave);
		
		JPanel panel_1_1_1_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1_1_1_1, 606, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1_1_1_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1_1_1_1, 731, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1_1_1_1, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		textFieldWis = new JTextField();
		textFieldWis.setText("16");
		textFieldWis.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldWis.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldWis.setBounds(40, 30, 65, 45);
		lWisMod = new JLabel(Integer.toString(character.getWis().getModifier()));
		lWisSave = new JLabel(Integer.toString(character.getWissave()));
		panel_1_1_1_1.add(textFieldWis);
		textFieldWis.setColumns(10);
		
		lWisMod.setHorizontalAlignment(SwingConstants.CENTER);
		lWisMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lWisMod.setBounds(115, 30, 65, 45);
		panel_1_1_1_1.add(lWisMod);
		
		JLabel lWis = new JLabel("SABIDURIA");
		lWis.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lWis.setHorizontalAlignment(SwingConstants.CENTER);
		lWis.setBounds(20, 80, 230, 30);
		panel_1_1_1_1.add(lWis);
		
		lWisSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lWisSave.setHorizontalAlignment(SwingConstants.CENTER);
		lWisSave.setBounds(180, 30, 65, 45);
		panel_1_1_1_1.add(lWisSave);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1_1_1_1_1, 752, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1_1_1_1_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1_1_1_1_1, 877, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1_1_1_1_1, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setLayout(null);
		
		textFieldCar = new JTextField();
		textFieldCar.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCar.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldCar.setText("8");
		textFieldCar.setBounds(40, 30, 65, 45);
		lCarMod = new JLabel(Integer.toString(character.getCha().getModifier()));
		lCarSave = new JLabel("(-1)");
		panel_1_1_1_1_1.add(textFieldCar);
		textFieldCar.setColumns(10);
		
		lCarMod.setHorizontalAlignment(SwingConstants.CENTER);
		lCarMod.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lCarMod.setBounds(115, 30, 64, 45);
		panel_1_1_1_1_1.add(lCarMod);
		
		JLabel lCha = new JLabel("CARISMA");
		lCha.setHorizontalAlignment(SwingConstants.CENTER);
		lCha.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lCha.setBounds(20, 80, 230, 30);
		panel_1_1_1_1_1.add(lCha);
		
		lCarSave.setHorizontalAlignment(SwingConstants.CENTER);
		lCarSave.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lCarSave.setBounds(180, 30, 65, 45);
		panel_1_1_1_1_1.add(lCarSave);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 22, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 330, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 222, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 720, SpringLayout.WEST, frame.getContentPane());
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
		lSalvaciones.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lSalvaciones.setBounds(47, 134, 300, 30);
		panel_2.add(lSalvaciones);
		
		JLabel lContraMuerte = new JLabel("CONTRA MUERTE");
		lContraMuerte.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
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
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 287, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 330, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, 877, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 720, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_22 = new JLabel("HABILIDADES");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_22.setBounds(20, 560, 350, 30);
		panel_3.add(lblNewLabel_22);
		
		checkBoxAcrobacias = new JCheckBox("");
		checkBoxAcrobacias.setBounds(15, 27, 21, 23);
		panel_3.add(checkBoxAcrobacias);
		
		checkBoxAtletismo = new JCheckBox("");
		checkBoxAtletismo.setBounds(15, 57, 21, 23);
		panel_3.add(checkBoxAtletismo);
		
		checkBoxArcana = new JCheckBox("");
		checkBoxArcana.setBounds(15, 87, 21, 23);
		panel_3.add(checkBoxArcana);
		
		checkBoxJuegoManos = new JCheckBox("");
		checkBoxJuegoManos.setBounds(15, 267, 21, 23);
		panel_3.add(checkBoxJuegoManos);
		
		checkBoxMedicina = new JCheckBox("");
		checkBoxMedicina.setBounds(15, 297, 21, 23);
		panel_3.add(checkBoxMedicina);
		
		checkBoxIntimidacion = new JCheckBox("");
		checkBoxIntimidacion.setBounds(15, 207, 21, 23);
		panel_3.add(checkBoxIntimidacion);
		
		checkBoxNaturaleza = new JCheckBox("");
		checkBoxNaturaleza.setBounds(15, 327, 21, 23);
		panel_3.add(checkBoxNaturaleza);
		
		checkBoxPersuasion = new JCheckBox("");
		checkBoxPersuasion.setBounds(15, 417, 21, 23);
		panel_3.add(checkBoxPersuasion);
		
		checkBoxInvestigacion = new JCheckBox("");
		checkBoxInvestigacion.setBounds(15, 237, 21, 23);
		panel_3.add(checkBoxInvestigacion);
		
		checkBoxPerspicacia = new JCheckBox("");
		checkBoxPerspicacia.setBounds(15, 387, 21, 23);
		panel_3.add(checkBoxPerspicacia);
		
		checkBoxHistoria = new JCheckBox("");
		checkBoxHistoria.setBounds(15, 147, 21, 23);
		panel_3.add(checkBoxHistoria);
		
		checkBoxEnganyo = new JCheckBox("");
		checkBoxEnganyo.setBounds(15, 117, 21, 23);
		panel_3.add(checkBoxEnganyo);
		
		checkBoxInterpretacion = new JCheckBox("");
		checkBoxInterpretacion.setBounds(15, 177, 21, 23);
		panel_3.add(checkBoxInterpretacion);
		
		checkBoxPercepcion = new JCheckBox("");
		
		checkBoxPercepcion.setBounds(15, 357, 21, 23);
		panel_3.add(checkBoxPercepcion);
		
		checkBoxReligion = new JCheckBox("");
		checkBoxReligion.setBounds(15, 447, 21, 23);
		panel_3.add(checkBoxReligion);
		
		checkBoxSigilo = new JCheckBox("");
		checkBoxSigilo.setBounds(15, 477, 21, 23);
		panel_3.add(checkBoxSigilo);
		
		textFieldAcrobacias = new JTextField();
		textFieldAcrobacias.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAcrobacias.setText("+2");
		textFieldAcrobacias.setBounds(40, 27, 25, 20);
		panel_3.add(textFieldAcrobacias);
		textFieldAcrobacias.setColumns(10);
		
		
		textFieldAtletismo.setText("+5");
		textFieldAtletismo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAtletismo.setColumns(10);
		textFieldAtletismo.setBounds(40, 57, 25, 20);
		panel_3.add(textFieldAtletismo);
		
		textFieldArcana = new JTextField();
		textFieldArcana.setText("-1");
		textFieldArcana.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldArcana.setColumns(10);
		textFieldArcana.setBounds(40, 87, 25, 20);
		panel_3.add(textFieldArcana);
		
		textFieldEnganyo = new JTextField();
		textFieldEnganyo.setText("-1");
		textFieldEnganyo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldEnganyo.setColumns(10);
		textFieldEnganyo.setBounds(40, 117, 25, 20);
		panel_3.add(textFieldEnganyo);
		
		textFieldHistoria = new JTextField();
		textFieldHistoria.setText("-1");
		textFieldHistoria.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldHistoria.setColumns(10);
		textFieldHistoria.setBounds(40, 147, 25, 20);
		panel_3.add(textFieldHistoria);
		
		textFieldInterpretacion = new JTextField();
		textFieldInterpretacion.setText("+2");
		textFieldInterpretacion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInterpretacion.setColumns(10);
		textFieldInterpretacion.setBounds(40, 177, 25, 20);
		panel_3.add(textFieldInterpretacion);
		
		textFieldIntimidacion = new JTextField();
		textFieldIntimidacion.setText("+1");
		textFieldIntimidacion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIntimidacion.setColumns(10);
		textFieldIntimidacion.setBounds(40, 207, 25, 20);
		panel_3.add(textFieldIntimidacion);
		
		textFieldInvestigacion = new JTextField();
		textFieldInvestigacion.setText("+2");
		textFieldInvestigacion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldInvestigacion.setColumns(10);
		textFieldInvestigacion.setBounds(40, 237, 25, 20);
		panel_3.add(textFieldInvestigacion);
		
		textFieldJuegoManos = new JTextField();
		textFieldJuegoManos.setText("-1");
		textFieldJuegoManos.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldJuegoManos.setColumns(10);
		textFieldJuegoManos.setBounds(40, 267, 25, 20);
		panel_3.add(textFieldJuegoManos);
		
		textFieldMedicina = new JTextField();
		textFieldMedicina.setText("+2");
		textFieldMedicina.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMedicina.setColumns(10);
		textFieldMedicina.setBounds(40, 297, 25, 20);
		panel_3.add(textFieldMedicina);
		
		textFieldNaturaleza = new JTextField();
		textFieldNaturaleza.setText("+2");
		textFieldNaturaleza.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNaturaleza.setColumns(10);
		textFieldNaturaleza.setBounds(40, 327, 25, 20);
		panel_3.add(textFieldNaturaleza);
		
		textFieldPercepcion = new JTextField();
		textFieldPercepcion.setText("+7");
		textFieldPercepcion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPercepcion.setColumns(10);
		textFieldPercepcion.setBounds(40, 357, 25, 20);
		panel_3.add(textFieldPercepcion);
		
		textFieldPerspicacia = new JTextField();
		textFieldPerspicacia.setText("+1");
		textFieldPerspicacia.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPerspicacia.setColumns(10);
		textFieldPerspicacia.setBounds(40, 387, 25, 20);
		panel_3.add(textFieldPerspicacia);
		
		textFieldPersuasion = new JTextField();
		textFieldPersuasion.setText("+2");
		textFieldPersuasion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPersuasion.setColumns(10);
		textFieldPersuasion.setBounds(40, 417, 25, 20);
		panel_3.add(textFieldPersuasion);
		
		textFieldReligion = new JTextField();
		textFieldReligion.setText("+3");
		textFieldReligion.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldReligion.setColumns(10);
		textFieldReligion.setBounds(40, 447, 25, 20);
		panel_3.add(textFieldReligion);
		
		textFieldSigilo = new JTextField();
		textFieldSigilo.setText("+2");
		textFieldSigilo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSigilo.setColumns(10);
		textFieldSigilo.setBounds(40, 477, 25, 20);
		panel_3.add(textFieldSigilo);
		
		JLabel lAcrobacias = new JLabel("Acrobacias (DES)");
		lAcrobacias.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lAcrobacias.setBounds(100, 27, 270, 20);
		panel_3.add(lAcrobacias);
		
		JLabel lAtletismo = new JLabel("Atletismo (FUE)");
		lAtletismo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lAtletismo.setBounds(100, 57, 270, 20);
		panel_3.add(lAtletismo);
		
		JLabel lArcana = new JLabel("Conocimiento Arcano(INT)");
		lArcana.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lArcana.setBounds(100, 87, 270, 20);
		panel_3.add(lArcana);
		
		JLabel lEnganyo = new JLabel("Enga\u00F1o (CAR)");
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
		
		checkBoxSupervivencia = new JCheckBox("");
		checkBoxSupervivencia.setBounds(15, 507, 21, 23);
		panel_3.add(checkBoxSupervivencia);
		
		checkBoxAnimales = new JCheckBox("");
		checkBoxAnimales.setBounds(15, 537, 21, 23);
		panel_3.add(checkBoxAnimales);
		
		textFieldSupervivencia = new JTextField();
		textFieldSupervivencia.setText("+3");
		textFieldSupervivencia.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSupervivencia.setColumns(10);
		textFieldSupervivencia.setBounds(40, 507, 25, 20);
		panel_3.add(textFieldSupervivencia);
		
		textFieldAnimales = new JTextField();
		textFieldAnimales.setText("+3");
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
		springLayout.putConstraint(SpringLayout.NORTH, panel_2_1, 22, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2_1, 760, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2_1, 442, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2_1, 1150, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lAC = new JLabel("clase de armadura");
		lAC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lAC.setHorizontalAlignment(SwingConstants.CENTER);
		lAC.setBounds(10, 20, 110, 30);
		panel_2_1.add(lAC);
		
		textFieldAC = new JTextField();
		textFieldAC.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textFieldAC.setText("17");
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
		textFieldIniciativa.setText("+3");
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
		textFieldSpeed.setText("30");
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
		textFieldPuntosGolpe.setText("81");
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
		
		textFieldDadosGolpe = new JTextField();
		textFieldDadosGolpe.setText("1D12");
		textFieldDadosGolpe.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDadosGolpe.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textFieldDadosGolpe.setColumns(10);
		textFieldDadosGolpe.setBounds(270, 270, 110, 110);
		panel_2_1.add(textFieldDadosGolpe);
		
		JPanel panel_2_1_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2_1_1, 507, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2_1_1, 760, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2_1_1, 877, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2_1_1, 1150, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel lArmasEquipo = new JLabel("ARMAS Y EQUIPO");
		lArmasEquipo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
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
		textFieldArma1.setText(character.getArmas().get(0).getNombre());
		textFieldArma1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldArma1.setBounds(10, 35, 140, 20);
		panel_2_1_1.add(textFieldArma1);
		textFieldArma1.setColumns(10);
		
		textFieldDanyoTipo1 = new JTextField(character.getArmas().get(0).getDanyo() + "   " + character.getArmas().get(0).getTipo());
		textFieldDanyoTipo1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldDanyoTipo1.setText(character.getArmas().get(0).getDanyo() + "   " + character.getArmas().get(0).getTipo());
		textFieldDanyoTipo1.setColumns(10);
		textFieldDanyoTipo1.setBounds(240, 35, 140, 20);
		panel_2_1_1.add(textFieldDanyoTipo1);
		
		textFieldBonificador1 = new JTextField();
		textFieldBonificador1.setText("");
		textFieldBonificador1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldBonificador1.setColumns(10);
		textFieldBonificador1.setBounds(170, 35, 50, 20);
		panel_2_1_1.add(textFieldBonificador1);
		
		textFieldArma2 = new JTextField(character.getArmas().get(1).getNombre());
		textFieldArma2.setColumns(10);
		textFieldArma2.setBounds(10, 65, 140, 20);
		panel_2_1_1.add(textFieldArma2);
		
		textFieldArma3 = new JTextField(character.getArmas().get(2).getNombre());
		textFieldArma3.setColumns(10);
		textFieldArma3.setBounds(10, 95, 140, 20);
		panel_2_1_1.add(textFieldArma3);
		
		textFieldDanyoTipo2 = new JTextField(character.getArmas().get(1).getDanyo() + "   " + character.getArmas().get(1).getTipo());
		textFieldDanyoTipo2.setColumns(10);
		textFieldDanyoTipo2.setBounds(240, 65, 140, 20);
		panel_2_1_1.add(textFieldDanyoTipo2);
		
		textFieldDanyoTipo3 = new JTextField(character.getArmas().get(2).getDanyo() + "   " + character.getArmas().get(2).getTipo());
		textFieldDanyoTipo3.setColumns(10);
		textFieldDanyoTipo3.setBounds(240, 95, 140, 20);
		panel_2_1_1.add(textFieldDanyoTipo3);
		
		textFieldBonificador2 = new JTextField();
		textFieldBonificador2.setColumns(10);
		textFieldBonificador2.setBounds(170, 65, 50, 20);
		panel_2_1_1.add(textFieldBonificador2);
		
		textFieldBonificador3 = new JTextField();
		textFieldBonificador3.setColumns(10);
		textFieldBonificador3.setBounds(170, 95, 50, 20);
		panel_2_1_1.add(textFieldBonificador3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 125, 370, 210);
		panel_2_1_1.add(textPane);
		
		JPanel panel_2_1_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2_1_2, 22, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2_1_2, 1190, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2_1_2, 252, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2_1_2, 1580, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2_1_2);
		panel_2_1_2.setLayout(null);
		
		JLabel lPersonaje = new JLabel("PERSONAJE");
		lPersonaje.setHorizontalAlignment(SwingConstants.CENTER);
		lPersonaje.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lPersonaje.setBounds(20, 210, 350, 20);
		panel_2_1_2.add(lPersonaje);
		
		JLabel lNombreDosPuntos = new JLabel("Nombre:");
		lNombreDosPuntos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lNombreDosPuntos.setBounds(20, 10, 60, 20);
		panel_2_1_2.add(lNombreDosPuntos);
		
		textFieldIntroduceTuNombre = new JTextField();
		textFieldIntroduceTuNombre.setToolTipText("introduce tu nombre..");
		textFieldIntroduceTuNombre.setBounds(90, 10, 280, 20);
		panel_2_1_2.add(textFieldIntroduceTuNombre);
		textFieldIntroduceTuNombre.setColumns(10);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setToolTipText("caracteristicas del personaje");
		textPane_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textPane_1.setBounds(20, 40, 350, 165);
		panel_2_1_2.add(textPane_1);
		
		JPanel panel_2_1_2_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2_1_2_1, 297, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2_1_2_1, 1190, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2_1_2_1, 797, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2_1_2_1, 1580, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2_1_2_1);
		panel_2_1_2_1.setLayout(null);
		
		JLabel lRasgos = new JLabel("RASGOS Y ATRIBUTOS");
		lRasgos.setHorizontalAlignment(SwingConstants.CENTER);
		lRasgos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lRasgos.setBounds(20, 480, 350, 20);
		panel_2_1_2_1.add(lRasgos);
		
		JTextPane txtpnCosasDeTortuga = new JTextPane();
		txtpnCosasDeTortuga.setText("cosas de tortuga:\r\n-Puedes atacar con tu zarpa haciendo 1d4 de da\u00F1o cortante\r\n-Puedes aguantar la respiraci\u00F3n bajo el agua durante 60 minutos\r\n-Puedes meterte dentro de tu caparaz\u00F3n usando tu acci\u00F3n reduciendo as\u00ED su velocidad a 0 teniendo desventaja en tiradas de destreza y ganando ventaja en tiradas de salvaci\u00F3n de constituci\u00F3n y fuerza y ganas un mas 4 en AC. puedes salir del caparaz\u00F3n como acci\u00F3n bonus pero, no puedes tomar ninguna otra acci\u00F3n tras eso.\r\n-bueno es supervivencia \r\n\r\ncosas de b\u00E1rbaro:\r\n-2 veces al dia ganas ventaja en checks y salvaciones de fuerza y recibes un +2 en  ataques a mele y resistencia contra da\u00F1o contundente penetrante y cortante\r\n-Tienes 17 de constituci\u00F3n cuando no llevas nada de armadura\r\n-Ataque temerario puedes dejar de lado toda preocupaci\u00F3n por tu defensa y atacar con una firme convicci\u00F3n. Una vez atacas por primera vez en tu turno puedes decidir atacar de forma temeraria, esto te dar\u00E1 ventaja en ataques a mele que usan fuerza, pero los ataques contra ti tendr\u00E1s desventaja hasta el siguiente turno.\r\n\r\ncosas de pescador:\r\n-Puedes hacer amigos contando historias y pescar lo suficientemente bien como para conseguir algo de pasta\r\n");
		txtpnCosasDeTortuga.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnCosasDeTortuga.setBounds(10, 10, 370, 460);
		panel_2_1_2_1.add(txtpnCosasDeTortuga);
		
		JPanel panel_4 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_4, 6, SpringLayout.SOUTH, panel_2_1_2_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_4, 1160, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_4, 900, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_4, 0, SpringLayout.EAST, panel_2_1_2);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton bEditor = new JButton("Editor \r\n");
		bEditor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Thread tEditor = new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							CreationWindow frame = new CreationWindow(character);
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				tEditor.start();
			}			
		});
		bEditor.setBounds(0, 10, 130, 42);
		panel_4.add(bEditor);
		
		JButton bStore = new JButton("Store");
		bStore.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {		
				getLabelsTextFields(character);
				storeOrLoadDB("store", character, "");			
			}
		});
		bStore.setBounds(80, 55, 130, 42);
		panel_4.add(bStore);
		
		JButton bLoad = new JButton("Load");
		//RODEAR de un if que chequeé si se puede hacer el load
		//Implementar un jTextField para introducir el nombre del personaje que se va a cargar
		bLoad.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				Thread tLoad = new Thread(new Runnable() {
					public void run() {
						try {
							setLabelsTextFields(storeOrLoadDB("load", character, textFieldIntroduceTuNombre.getText()));	
						} catch (Exception e) {
							System.out.println("Ha ocurrido un problema.");
						}
					}
				});
				tLoad.start();
			}
		});
		bLoad.setBounds(220, 55, 130, 42);
		panel_4.add(bLoad);
		
		JButton bBackground = new JButton("M. nocturno \r\n");
		bBackground.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Thread tBackground = new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							boolean color = false;
							color = backgroundProperties();
							if (color == true) {
								frame.getContentPane().setBackground(Color.BLACK);
							} else if (color == false) {
								frame.getContentPane().setBackground(new Color(238, 238, 238));
							}
						} catch (Exception e) {
							System.out.println("No se ha podido cambiar el color de fondo.");
						}
					}
				});
				tBackground.start();
				
			}			
		});
		bBackground.setBounds(300, 10, 120, 42);
		panel_4.add(bBackground);
		
		JButton bActualizar = new JButton("Actualizar\r\n");
		bActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread tActualizar = new Thread(new Runnable() {
					public void run() {
						try {
							actualizar();
						} catch (Exception e) {
							System.out.println("Ha ocurrido un problema.");
						}
					}
				});
				tActualizar.start();
			}
		});
		bActualizar.setBounds(150, 10, 130, 42);
		panel_4.add(bActualizar);
	}
	
	//Recibe un String operation que controla que operacion ejectuta el metodo (store o load),
	//Un Personaje character si el método va a ejecutar load (de lo contrario recibira null)
	//Y, si la operacion es store, un String nCharacter para indicar al programa el nombre del personaje a cargarse
	//El metodo devuelve un objeto Personaje para realizar load
	public static Personaje storeOrLoadDB(String operation, Personaje character, String nCharacter) {
		//Conexion a la BD con un metodo estatico.
		//(El metodo tiene los try catch pertinentes asi que no se han puesto aqui)
		connectDB();
		
		//Ambas operaciones ejecutan los metodos estaticos de la base de datos.
		//Operacion store
		if (operation == "store") {
			storeDB(character);
		}		
		//Operacion load
		else if (operation == "load") {
			character = loadDB(nCharacter);
			closeDB();
			return character;
		}
			closeDB();
			return character;
	}
	
	public static void setLabelsTextFields(Personaje character) {
		textFieldIntroduceTuNombre.setText(character.getName());
		textFieldPuntosGolpe.setText(Integer.toString(character.getLife()));
		textFieldAC.setText(Integer.toString(character.getAC()));
		textFieldSpeed.setText(Integer.toString(character.getSpeed()));
		textFieldStr.setText(Integer.toString(character.getStr().getScore()));
		textFieldDex.setText(Integer.toString(character.getDex().getScore()));
		textFieldCon.setText(Integer.toString(character.getCon().getScore()));
		textFieldInt.setText(Integer.toString(character.getIntel().getScore()));
		textFieldWis.setText(Integer.toString(character.getWis().getScore()));
		textFieldCar.setText(Integer.toString(character.getCha().getScore()));
		lStrSave.setText(Integer.toString(character.getStrsave()));
		lDexSave.setText(Integer.toString(character.getDexsave()));
		lConSave.setText(Integer.toString(character.getConsave()));
		lIntSave.setText(Integer.toString(character.getIntsave()));
		lWisSave.setText(Integer.toString(character.getWissave()));
		lCarSave.setText(Integer.toString(character.getChasave()));
		
		textFieldAcrobacias.setText(Integer.toString(character.getAcrobacias()));
		textFieldAnimales.setText(Integer.toString(character.getTratoAnimales()));
		textFieldArcana.setText(Integer.toString(character.getArcana()));
		textFieldAtletismo.setText(Integer.toString(character.getAtletismo()));
		textFieldEnganyo.setText(Integer.toString(character.getEnganyo()));
		textFieldHistoria.setText(Integer.toString(character.getHistoria()));
		textFieldPerspicacia.setText(Integer.toString(character.getPerspicacia()));
		textFieldIntimidacion.setText(Integer.toString(character.getIntimidacion()));
		textFieldInvestigacion.setText(Integer.toString(character.getInvestigacion()));
		textFieldMedicina.setText(Integer.toString(character.getMedicina()));
		textFieldNaturaleza.setText(Integer.toString(character.getNaturaleza()));
		textFieldPercepcion.setText(Integer.toString(character.getPercepcion()));
		textFieldInterpretacion.setText(Integer.toString(character.getInterpretacion()));
		textFieldPersuasion.setText(Integer.toString(character.getPersuasion()));
		textFieldReligion.setText(Integer.toString(character.getReligion()));
		textFieldJuegoManos.setText(Integer.toString(character.getJuegoManos()));
		textFieldSigilo.setText(Integer.toString(character.getSigilo()));
		textFieldSupervivencia.setText(Integer.toString(character.getSupervivencia()));
		
		//textFieldBonoCompetencia no se ha implementado en la ventana
		//textFieldBonoCompetencia.setText(Integer.toString(personaje.getBonoCompetencia()));
		textFieldIniciativa.setText(Integer.toString(character.getIniciativa()));
		
		//¿En que text field se mete el equipo?
		//character.setEquipo(objetoP.getProperty("Equipment"));
		textFieldArma1.setText(character.getArmas().get(0).getNombre());
		textFieldArma2.setText(character.getArmas().get(1).getNombre());
		textFieldArma3.setText(character.getArmas().get(2).getNombre());						
		
		textFieldDanyoTipo1.setText(character.getArmas().get(0).getDanyo() + ", " + character.getArmas().get(0).getTipo());
		textFieldDanyoTipo2.setText(character.getArmas().get(1).getDanyo() + ", " + character.getArmas().get(1).getTipo());
		textFieldDanyoTipo3.setText(character.getArmas().get(2).getDanyo() + ", " + character.getArmas().get(2).getTipo());
	}
	
	public static void getLabelsTextFields(Personaje character) {
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
		character.setHistoria(Integer.parseInt(textFieldEnganyo.getText()));
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
		character.setIniciativa(Integer.parseInt(textFieldIniciativa.getText()));
		Arma arma1 = new Arma(), arma2 = new Arma(), arma3 = new Arma();
		List<Arma> armas = new ArrayList<Arma>();
		arma1.setNombre(textFieldArma1.getText());
		arma2.setNombre(textFieldArma2.getText());
		arma3.setNombre(textFieldArma3.getText());
		arma1.setTipo(textFieldDanyoTipo1.getText());
		arma2.setTipo(textFieldDanyoTipo2.getText());
		arma3.setTipo(textFieldDanyoTipo3.getText());
		character.setArmas(armas);
	}
	
	//Suma uno a un valor de fichero properties
	public static void timesOpenProperties () {
		Properties objetoP = new Properties();
		try {
			objetoP.load(new FileInputStream("timesOpen.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (objetoP.getProperty("TimesOpen") != null) {
			objetoP.setProperty("TimesOpen", Integer.toString(1 + Integer.parseInt(objetoP.getProperty("TimesOpen"))));
		} else {
			objetoP.setProperty("TimesOpen", "1");
		}
		
		try {
			objetoP.store(new FileWriter("timesOpen.properties"), "Operation" + objetoP.getProperty("TimesOpen"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Metodo para cambiar el color de la pantalla a blanco y a negro intermitentemente
	public boolean backgroundProperties () {
		Properties objetoP = new Properties();
		boolean color = false;
		
		try {
			objetoP.load(new FileInputStream("background.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Segun el color de la pantalla, se pasa un booleano para cambiar de color el fondo de la ventana
		if (Objects.equals(objetoP.getProperty("color"), "WHITE")) {
			objetoP.setProperty("color", "BLACK");
			color = true;
		} else if (Objects.equals(objetoP.getProperty("color"), "BLACK")) {
			objetoP.setProperty("color", "WHITE");
			color = false;
		} else {		
			objetoP.setProperty("color", "BLACK");
			objetoP.setProperty("contador", "0");
			color = true;
		}
		
		//Contador para almacenar en el fichero las veces que se use el metodo
		int n = Integer.parseInt(objetoP.getProperty("contador"));
		n = n + 1;
		try {
			objetoP.store(new FileWriter("background.properties"), "Operation" + Integer.toString(n+1));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return color;
	}
	
	public static void connectDB() {
		try {
			characterDB = new CharacterDB();
			characterDB.openDB();
		} catch (CharacterDBException e) {
			System.err.println(e.getMessage());
		}
	}
	
	//Se pasa un Personaje cuyo contenido se almacena en la BD.
	public static void storeDB(Personaje character) {
		try {
			characterDB.insertDB(character);
		} catch (CharacterDBException e) {
			System.err.println(e.getMessage());
		}
	}
	
	//Se pasa un String nombre y se devuelve el Personaje de la base de datos con ese nombre.
	public static Personaje loadDB(String nombre) {
		Personaje character = new Personaje();
		
		try {
			character = characterDB.selectDB(nombre);
			return character;
			
		} catch (CharacterDBException e) {
			System.err.println(e.getMessage());
		}
		return character;
	}
	
	public static void closeDB() {
		try {
			characterDB.closeDB();
		} catch (CharacterDBException e) {
			System.err.println(e.getMessage());
		}
	}
	
	//Metodo para generar un modificador (estadistica de un Personaje) en funcion de score
	public static int generateMod(int score) {
		int modifier;
		
		switch(score) {
		case 1:
			modifier = -5;
			return modifier;
		
		case 2:
			modifier = -4;
			return modifier;
			
		case 3:
			modifier = -4;
			return modifier;
			
		case 4:
			modifier = -3;
			return modifier;
			
		case 5:
			modifier = -3;
			return modifier;
			
		case 6:
			modifier = -2;
			return modifier;
			
		case 7:
			modifier = -2;
			return modifier;
			
		case 8:
			modifier = -1;
			return modifier;
			
		case 9:
			modifier = -1;
			return modifier;
			
		case 10:
			modifier = 0;
			return modifier;
			
		case 11:
			modifier = 0;
			return modifier;
			
		case 12:
			modifier = 1;
			return modifier;
			
		case 13:
			modifier = 1;
			return modifier;
			
		case 14:
			modifier = 2;
			return modifier;
			
		case 15:
			modifier = 2;
			return modifier;
			
		case 16:
			modifier = 3;
			return modifier;
			
		case 17:
			modifier = 3;
			return modifier;
			
		case 18:
			modifier = 4;
			return modifier;
			
		case 19:
			modifier = 4;
			return modifier;
			
		case 20:
			modifier = 5;
			return modifier;
			
		case 21:
			modifier = 5;
			return modifier;	
			
		case 22:
			modifier = 6;
			return modifier;
			
		case 23:
			modifier = 6;
			return modifier;
			
		case 24:
			modifier = 7;
			return modifier;
			
		case 25:
			modifier = 7;
			return modifier;
			
		case 26:
			modifier = 8;
			return modifier;
			
		case 27:
			modifier = 8;
			return modifier;
			
		case 28:
			modifier = 9;
			return modifier;
			
		case 29:
			modifier = 9;
			return modifier;
			
		case 30:
			modifier = 10;
			return modifier;
			
		default:
			modifier = 0;
			return modifier;
		}
	}
	
	//Metodo para actualizar los textField de modifiers y saves y los comboBox de Habilidades
	public static void actualizar() {
				try {
					String stat = textFieldStr.getText();
					int numero, modificador;
					numero = Integer.parseInt(stat);
					modificador = generateMod(numero);
					String modificable = Integer.toString(modificador);
					lStrMod.setText("(" + modificador + ")");
					lStrSave.setText("(" + modificador + ")");
					if (modificador >= 0) {
						textFieldAtletismo.setText("+" + modificable);
					}else {
						textFieldAtletismo.setText(modificable);
					}
					
				}catch(NumberFormatException i){
					
					System.out.println("Error de conversion numerico");
				}

			try {
				String stat = textFieldDex.getText();
				int numero, modificador;
				numero = Integer.parseInt(stat);
				modificador = generateMod(numero);
				String modificable = Integer.toString(modificador);
				int modificador2 = modificador + 10;
				String modificable2 = Integer.toString(modificador2);
				lDexMod.setText("(" + modificador + ")");
				lDexSave.setText("(" + modificador + ")");
				if (modificador >= 0) {
					textFieldAcrobacias.setText("+" + modificable);
					textFieldJuegoManos.setText("+" + modificable);
					textFieldSigilo.setText("+" + modificable);
					textFieldAC.setText(modificable2);
					textFieldIniciativa.setText("+" + modificable);
				}else {
					textFieldAcrobacias.setText(modificable);
					textFieldJuegoManos.setText(modificable);
					textFieldSigilo.setText(modificable);
					textFieldAC.setText(modificable2);
					textFieldIniciativa.setText(modificable);
				}
				
			}catch(NumberFormatException i){
				
				System.out.println("Error de conversion numerico");
			}
		
				try {
					String stat = textFieldCon.getText();
					int numero, modificador;
					numero = Integer.parseInt(stat);
					modificador = generateMod(numero);
					String modificable = Integer.toString(modificador);
					lConMod.setText("(" + modificador + ")");
					lConSave.setText("(" + modificador + ")");
					
				}catch(NumberFormatException i){
					
					System.out.println("Error de conversion numerico");
				}
				
				try {
					String stat = textFieldInt.getText();
					int numero, modificador;
					numero = Integer.parseInt(stat);
					modificador = generateMod(numero);
					String modificable = Integer.toString(modificador);
					lIntMod.setText("(" + modificador + ")");
					lIntSave.setText("(" + modificador + ")");
					if (modificador >= 0) {
						textFieldArcana.setText("+" + modificable);
						textFieldHistoria.setText("+" + modificable);
						textFieldInvestigacion.setText("+" + modificable);
						textFieldNaturaleza.setText("+" + modificable);
						textFieldReligion.setText("+" + modificable);
					}else {
						textFieldArcana.setText(modificable);
						textFieldHistoria.setText(modificable);
						textFieldInvestigacion.setText(modificable);
						textFieldNaturaleza.setText(modificable);
						textFieldReligion.setText(modificable);
					}
					
				}catch(NumberFormatException i){
					
					System.out.println("Error de conversion numerico");
				}
			
				try {
					String stat = textFieldWis.getText();
					int numero, modificador;
					numero = Integer.parseInt(stat);
					modificador = generateMod(numero);
					String modificable = Integer.toString(modificador);
					lWisMod.setText("(" + modificador + ")");
					lWisSave.setText("(" + modificador + ")");
					if (modificador >= 0) {
						textFieldMedicina.setText("+" + modificable);
						textFieldPercepcion.setText("+" + modificable);
						textFieldPerspicacia.setText("+" + modificable);
						textFieldSupervivencia.setText("+" + modificable);
						textFieldAnimales.setText("+" + modificable);
					}else {
						textFieldAcrobacias.setText(modificable);
						textFieldMedicina.setText(modificable);
						textFieldPercepcion.setText(modificable);
						textFieldPerspicacia.setText(modificable);
						textFieldSupervivencia.setText(modificable);
						textFieldAnimales.setText(modificable);
					}
			
				}catch(NumberFormatException i){
			
					System.out.println("Error de conversion numerico");
				}	
	
				try {
					String stat = textFieldCar.getText();
					int numero, modificador;
					numero = Integer.parseInt(stat);
					modificador = generateMod(numero);
					String modificable = Integer.toString(modificador);
					lCarMod.setText("(" + modificador + ")");
					lCarSave.setText("(" + modificador + ")");
					if (modificador >= 0) {
						textFieldEnganyo.setText("+" + modificable);
						textFieldInterpretacion.setText("+" + modificable);
						textFieldIntimidacion.setText("+" + modificable);
						textFieldPersuasion.setText("+" + modificable);
					}else {
						textFieldEnganyo.setText(modificable);
						textFieldInterpretacion.setText(modificable);
						textFieldIntimidacion.setText(modificable);
						textFieldPersuasion.setText(modificable);
					}
					
				}catch(NumberFormatException i){
					
					System.out.println("Error de conversion numerico");
				}
				
			
				try {
					boolean estaLleno = checkBoxAcrobacias.isSelected();
					int numero = Integer.parseInt(textFieldAcrobacias.getText());
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldAcrobacias.setText("+" + numero);
						}else {
							textFieldAcrobacias.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldAcrobacias.setText("+" + numero);
						}else {
							textFieldAcrobacias.setText(sNumero);
						}
					}
					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxAtletismo.isSelected();
					int numero = Integer.parseInt(textFieldAtletismo.getText());
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldAtletismo.setText("+" + numero);
						}else {
							textFieldAtletismo.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldAtletismo.setText("+" + numero);
						}else {
							textFieldAtletismo.setText(sNumero);
						}
					}
					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxArcana.isSelected();
					int numero = Integer.parseInt(textFieldArcana.getText());
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldArcana.setText("+" + numero);
						}else {
							textFieldArcana.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldArcana.setText("+" + numero);
						}else {
							textFieldArcana.setText(sNumero);
						}
					}
					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxJuegoManos.isSelected();
					int numero = Integer.parseInt(textFieldJuegoManos.getText());//13
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldJuegoManos.setText("+" + numero);
						}else {
							textFieldJuegoManos.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldJuegoManos.setText("+" + numero);
						}else {
							textFieldJuegoManos.setText(sNumero);
						}
					}
					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxMedicina.isSelected();
					int numero = Integer.parseInt(textFieldMedicina.getText());//14
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldMedicina.setText("+" + numero);
						}else {
							textFieldMedicina.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldMedicina.setText("+" + numero);
						}else {
							textFieldMedicina.setText(sNumero);
						}
					}
					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxIntimidacion.isSelected();
					int numero = Integer.parseInt(textFieldIntimidacion.getText());//11
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldIntimidacion.setText("+" + numero);
						}else {
							textFieldIntimidacion.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldIntimidacion.setText("+" + numero);
						}else {
							textFieldIntimidacion.setText(sNumero);
						}
					}
					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxNaturaleza.isSelected();
					int numero = Integer.parseInt(textFieldNaturaleza.getText());//15
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldNaturaleza.setText("+" + numero);
						}else {
							textFieldNaturaleza.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldNaturaleza.setText("+" + numero);
						}else {
							textFieldNaturaleza.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxPersuasion.isSelected();
					int numero = Integer.parseInt(textFieldPersuasion.getText());//18
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldPersuasion.setText("+" + numero);
						}else {
							textFieldPersuasion.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldPersuasion.setText("+" + numero);
						}else {
							textFieldPersuasion.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxInvestigacion.isSelected();
					int numero = Integer.parseInt(textFieldInvestigacion.getText());//12
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldInvestigacion.setText("+" + numero);
						}else {
							textFieldInvestigacion.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldInvestigacion.setText("+" + numero);
						}else {
							textFieldInvestigacion.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxPerspicacia.isSelected();
					int numero = Integer.parseInt(textFieldPerspicacia.getText());//17
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldPerspicacia.setText("+" + numero);
						}else {
							textFieldPerspicacia.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldPerspicacia.setText("+" + numero);
						}else {
							textFieldPerspicacia.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxHistoria.isSelected();
					int numero = Integer.parseInt(textFieldHistoria.getText());//9
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldHistoria.setText("+" + numero);
						}else {
							textFieldHistoria.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldHistoria.setText("+" + numero);
						}else {
							textFieldHistoria.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxEnganyo.isSelected();
					int numero = Integer.parseInt(textFieldEnganyo.getText());//8
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldEnganyo.setText("+" + numero);
						}else {
							textFieldEnganyo.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldEnganyo.setText("+" + numero);
						}else {
							textFieldEnganyo.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxInterpretacion.isSelected();
					int numero = Integer.parseInt(textFieldInterpretacion.getText());//10
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldInterpretacion.setText("+" + numero);
						}else {
							textFieldInterpretacion.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldInterpretacion.setText("+" + numero);
						}else {
							textFieldInterpretacion.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxPercepcion.isSelected();
					int numero = Integer.parseInt(textFieldPercepcion.getText());//16
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldPercepcion.setText("+" + numero);
						}else {
							textFieldPercepcion.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldPercepcion.setText("+" + numero);
						}else {
							textFieldPercepcion.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxReligion.isSelected();
					int numero = Integer.parseInt(textFieldReligion.getText());//19
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldReligion.setText("+" + numero);
						}else {
							textFieldReligion.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldReligion.setText("+" + numero);
						}else {
							textFieldReligion.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxSigilo.isSelected();
					int numero = Integer.parseInt(textFieldSigilo.getText());//20
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldSigilo.setText("+" + numero);
						}else {
							textFieldSigilo.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldSigilo.setText("+" + numero);
						}else {
							textFieldSigilo.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
			
				try {
					boolean estaLleno = checkBoxSupervivencia.isSelected();
					int numero = Integer.parseInt(textFieldSupervivencia.getText());//19
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldSupervivencia.setText("+" + numero);
						}else {
							textFieldSupervivencia.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldSupervivencia.setText("+" + numero);
						}else {
							textFieldSupervivencia.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}
				
			
				try {
					boolean estaLleno = checkBoxAnimales.isSelected();
					int numero = Integer.parseInt(textFieldAnimales.getText());//19
					if(estaLleno) {
						numero = numero + 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldAnimales.setText("+" + numero);
						}else {
							textFieldAnimales.setText(sNumero);
						}
						
					}else {
						numero = numero - 2;
						String sNumero = Integer.toString(numero);
						if(numero >= 0) {
							textFieldAnimales.setText("+" + numero);
						}else {
							textFieldAnimales.setText(sNumero);
						}
					}

					
				}catch(NumberFormatException i) {
					System.out.println("Error de conversion numerico");
				}	
	}
}