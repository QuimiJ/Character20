package mainAndWindow;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class CreationWindow extends JFrame {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreationWindow frame = new CreationWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Sumas y restas de botones
	 */
	public static void botonSuma(JLabel LabelPointsLeft, int Score) {
		String PointsLeft = LabelPointsLeft.getText();
		int Points = Integer.parseInt(PointsLeft);
		switch (Score) {
		case 8:
			Points--;
			if (Points < 0) {
				LabelPointsLeft.setForeground(Color.RED);
			}  	break;
			
		case 9:
			Points--;
			if (Points < 0) {
				LabelPointsLeft.setForeground(Color.RED);
			}	break;
			
		case 10:
			Points--;
			if (Points < 0) {
				LabelPointsLeft.setForeground(Color.RED);
			}   break;
		
		case 11:
			Points--;
			if (Points < 0) {
				LabelPointsLeft.setForeground(Color.RED);
			}	break;
			
		case 12:
			Points--; 
			if (Points < 0) {
				LabelPointsLeft.setForeground(Color.RED);
			}	break;
			
		case 13:
			Points = Points-2;
			if (Points < 0) {
				LabelPointsLeft.setForeground(Color.RED);
			}	break;
		
		case 14:
			Points = Points-2; 
			if (Points < 0) {
				LabelPointsLeft.setForeground(Color.RED);
			}	break;
	};
	
	PointsLeft = String.valueOf(Points);
	LabelPointsLeft.setText(PointsLeft);
	}
	
	public static void botonResta(JLabel LabelPointsLeft, int Score) {
		String PointsLeft = LabelPointsLeft.getText();
		int Points = Integer.parseInt(PointsLeft);
		switch (Score) {	
		case 9:
			Points++;
			if (Points > 0) {
				LabelPointsLeft.setForeground(Color.BLACK);
			}	break;
			
		case 10:
			Points++;
			if (Points > 0) {
				LabelPointsLeft.setForeground(Color.BLACK);
			}	break;
		
		case 11:
			Points++;
			if (Points > 0) {
				LabelPointsLeft.setForeground(Color.BLACK);
			}	break;
			
		case 12:
			Points++;
			if (Points > 0) {
				LabelPointsLeft.setForeground(Color.BLACK);
			}	break;
			
		case 13:
			Points++;
			if (Points > 0) {
				LabelPointsLeft.setForeground(Color.BLACK);
			}	break;
		
		case 14:
			Points = Points+2;
			if (Points > 0) {
				LabelPointsLeft.setForeground(Color.BLACK);
			}	break;
			
		case 15:
			Points = Points+2;
			if (Points > 0) {
				LabelPointsLeft.setForeground(Color.BLACK);
			}	break;
	};
	
	PointsLeft = String.valueOf(Points);
	LabelPointsLeft.setText(PointsLeft);
	}

	/**
	 * Create the frame.
	 */
	public CreationWindow() {
		getContentPane().setBackground(SystemColor.info);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		//PANEL RAZAS Y CLASES
		JPanel panelRaceClass = new JPanel();
		panelRaceClass.setBackground(new Color(240, 240, 240));
		getContentPane().add(panelRaceClass, "RaceClass");
		panelRaceClass.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Race :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(209, 133, 45, 22);
		panelRaceClass.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Subrace :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(209, 172, 66, 13);
		panelRaceClass.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Class :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(209, 208, 45, 13);
		panelRaceClass.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Background :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(209, 242, 103, 17);
		panelRaceClass.add(lblNewLabel_3);
		
		JComboBox comboRace = new JComboBox();
		comboRace.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboRace.setMaximumRowCount(9);
		comboRace.setModel(new DefaultComboBoxModel(new String[] {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Half-Orc", "Halfling", "Human", "Tiefling"}));
		comboRace.setBackground(SystemColor.controlHighlight);
		comboRace.setBounds(300, 131, 112, 26);
		String RaceSelected = (String)comboRace.getSelectedItem();
		panelRaceClass.add(comboRace);
		
		JComboBox comboSubrace = new JComboBox();
		comboSubrace.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboSubrace.setBackground(SystemColor.controlHighlight);
		comboSubrace.setBounds(300, 165, 112, 26);
		if (RaceSelected == "Dwarf") {
			comboSubrace.setModel(new DefaultComboBoxModel(new String[] {"Hill", "Mountain"}));
			
		}
		panelRaceClass.add(comboSubrace);
		
		JComboBox comboClass = new JComboBox();
		comboClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboClass.setModel(new DefaultComboBoxModel(new String[] {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Warlock", "Wizard"}));
		comboClass.setMaximumRowCount(12);
		comboClass.setBackground(SystemColor.controlHighlight);
		comboClass.setBounds(300, 201, 112, 26);
		String ClassSelected = (String)comboClass.getSelectedItem();
		panelRaceClass.add(comboClass);
		
		JComboBox comboBackground = new JComboBox();
		comboBackground.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBackground.setModel(new DefaultComboBoxModel(new String[] {"Acolyte", "Charlatan", "Criminal", "Entertainer", "Folk Hero", "Guild Artisan", "Hermit", "Noble", "Outlander", "Sage", "Sailor", "Soldier", "Urchin"}));
		comboBackground.setMaximumRowCount(11);
		comboBackground.setBackground(SystemColor.controlHighlight);
		comboBackground.setBounds(300, 237, 112, 26);
		String BackgroundSelected = (String)comboBackground.getSelectedItem();
		panelRaceClass.add(comboBackground);
		
		//PANEL ABILITY SCORES
		
		JPanel panelAbilityScores = new JPanel();
		panelAbilityScores.setBackground(SystemColor.control);
		getContentPane().add(panelAbilityScores, "Ability Scores");
		panelAbilityScores.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Ability Scores Before Racial Bonus:");
		lblNewLabel_4.setBounds(177, 86, 210, 13);
		panelAbilityScores.add(lblNewLabel_4);
		
		//Puntos
		JLabel LabelRemaining = new JLabel("Remaining");
		LabelRemaining.setBounds(141, 148, 62, 13);
		panelAbilityScores.add(LabelRemaining);
				
		JLabel LabelPoints = new JLabel("Points:");
		LabelPoints.setBounds(151, 159, 52, 13);
		panelAbilityScores.add(LabelPoints);
				
		final JLabel LabelPointsLeft = new JLabel("27");
		String PointsLeft = LabelPointsLeft.getText();
		int Points = Integer.parseInt(PointsLeft);
		LabelPointsLeft.setFont(new Font("Tahoma", Font.PLAIN, 25));
		LabelPointsLeft.setBounds(161, 176, 52, 36);
		panelAbilityScores.add(LabelPointsLeft);
		
		//Strength
		JLabel LabelStr = new JLabel("Strength");
		LabelStr.setBounds(231, 125, 74, 13);
		panelAbilityScores.add(LabelStr);
		
		final JLabel LabelStrNum = new JLabel("8");
		LabelStrNum.setHorizontalAlignment(SwingConstants.CENTER);
		LabelStrNum.setBounds(364, 125, 23, 13);
		panelAbilityScores.add(LabelStrNum);
		
		JButton BtnStrUp = new JButton("+");
		BtnStrUp.setBounds(315, 121, 44, 21);
		BtnStrUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String StrNum = LabelStrNum.getText();
				int StrScore = Integer.parseInt(StrNum);
				if (StrScore < 15) {
					botonSuma(LabelPointsLeft, StrScore);
					StrScore++;
					StrNum = String.valueOf(StrScore);
					LabelStrNum.setText(StrNum);
				};
			}
		});
		panelAbilityScores.add(BtnStrUp);
		
		JButton BtnStrDown = new JButton("-");
		BtnStrDown.setBounds(393, 121, 44, 21);
		BtnStrDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String StrNum = LabelStrNum.getText();
				int StrScore = Integer.parseInt(StrNum);
				if (StrScore > 8) {
					botonResta(LabelPointsLeft, StrScore);
					StrScore--;
					StrNum = String.valueOf(StrScore);
					LabelStrNum.setText(StrNum);
				};
			}
		});
		panelAbilityScores.add(BtnStrDown);
		
		//Dexterity
		JLabel LabelDex = new JLabel("Dexterity");
		LabelDex.setBounds(231, 148, 74, 13);
		panelAbilityScores.add(LabelDex);
		
		final JLabel LabelDexNum = new JLabel("8");
		LabelDexNum.setHorizontalAlignment(SwingConstants.CENTER);
		LabelDexNum.setBounds(364, 148, 23, 13);
		panelAbilityScores.add(LabelDexNum);
		
		JButton BtnDexUp = new JButton("+");
		BtnDexUp.setBounds(315, 144, 44, 21);
		BtnDexUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String DexNum = LabelDexNum.getText();
				int DexScore = Integer.parseInt(DexNum);
				if (DexScore < 15) {
					botonSuma(LabelPointsLeft, DexScore);
					DexScore++;
					DexNum = String.valueOf(DexScore);
					LabelDexNum.setText(DexNum);
				};
			}
		});
		panelAbilityScores.add(BtnDexUp);
		
		JButton BtnDexDown = new JButton("-");
		BtnDexDown.setBounds(393, 144, 44, 21);
		BtnDexDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String DexNum = LabelDexNum.getText();
				int DexScore = Integer.parseInt(DexNum);
				if (DexScore > 8) {
					botonResta(LabelPointsLeft, DexScore);
					DexScore--;
					DexNum = String.valueOf(DexScore);
					LabelDexNum.setText(DexNum);
				};
			}
		});
		panelAbilityScores.add(BtnDexDown);
		
		//Constitution
		JLabel LabelCon = new JLabel("Constitution");
		LabelCon.setBounds(231, 171, 74, 13);
		panelAbilityScores.add(LabelCon);
		
		final JLabel LabelConNum = new JLabel("8");
		LabelConNum.setHorizontalAlignment(SwingConstants.CENTER);
		LabelConNum.setBounds(364, 171, 23, 13);
		panelAbilityScores.add(LabelConNum);
		
		JButton BtnConUp = new JButton("+");
		BtnConUp.setBounds(315, 167, 44, 21);
		BtnConUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ConNum = LabelConNum.getText();
				int ConScore = Integer.parseInt(ConNum);
				if (ConScore < 15) {
					botonSuma(LabelPointsLeft, ConScore);
					ConScore++;
					ConNum = String.valueOf(ConScore);
					LabelConNum.setText(ConNum);
				};
			}
		});
		panelAbilityScores.add(BtnConUp);
		
		JButton BtnConDown = new JButton("-");
		BtnConDown.setBounds(393, 167, 44, 21);
		BtnConDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ConNum = LabelConNum.getText();
				int ConScore = Integer.parseInt(ConNum);
				if (ConScore > 8) {
					botonResta(LabelPointsLeft, ConScore);
					ConScore--;
					ConNum = String.valueOf(ConScore);
					LabelConNum.setText(ConNum);
				};
			}
		});
		panelAbilityScores.add(BtnConDown);
		
		//Intelligence
		JLabel LabelInt = new JLabel("Intelligence");
		LabelInt.setBounds(231, 194, 74, 13);
		panelAbilityScores.add(LabelInt);
		
		final JLabel LabelIntNum = new JLabel("8");
		LabelIntNum.setHorizontalAlignment(SwingConstants.CENTER);
		LabelIntNum.setBounds(364, 194, 23, 13);
		panelAbilityScores.add(LabelIntNum);
		
		JButton BtnIntUp = new JButton("+");
		BtnIntUp.setBounds(315, 190, 44, 21);
		BtnIntUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IntNum = LabelIntNum.getText();
				int IntScore = Integer.parseInt(IntNum);
				if (IntScore < 15) {
					botonSuma(LabelPointsLeft, IntScore);
					IntScore++;
					IntNum = String.valueOf(IntScore);
					LabelIntNum.setText(IntNum);
				};
			}
		});
		panelAbilityScores.add(BtnIntUp);
		
		JButton BtnIntDown = new JButton("-");
		BtnIntDown.setBounds(393, 190, 44, 21);
		BtnIntDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String IntNum = LabelIntNum.getText();
				int IntScore = Integer.parseInt(IntNum);
				if (IntScore > 8) {
					botonResta(LabelPointsLeft, IntScore);
					IntScore--;
					IntNum = String.valueOf(IntScore);
					LabelIntNum.setText(IntNum);
				};
			}
		});
		panelAbilityScores.add(BtnIntDown);
		
		//Wisdom
		JLabel LabelWis = new JLabel("Wisdom");
		LabelWis.setBounds(231, 217, 74, 13);
		panelAbilityScores.add(LabelWis);
		
		final JLabel LabelWisNum = new JLabel("8");
		LabelWisNum.setHorizontalAlignment(SwingConstants.CENTER);
		LabelWisNum.setBounds(364, 217, 23, 13);
		panelAbilityScores.add(LabelWisNum);
		
		JButton BtnWisUp = new JButton("+");
		BtnWisUp.setBounds(315, 213, 44, 21);
		BtnWisUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WisNum = LabelWisNum.getText();
				int WisScore = Integer.parseInt(WisNum);
				if (WisScore < 15) {
					botonSuma(LabelPointsLeft, WisScore);
					WisScore++;
					WisNum = String.valueOf(WisScore);
					LabelWisNum.setText(WisNum);
				};
			}
		});
		panelAbilityScores.add(BtnWisUp);
		
		JButton BtnWisDown = new JButton("-");
		BtnWisDown.setBounds(393, 213, 44, 21);
		BtnWisDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WisNum = LabelWisNum.getText();
				int WisScore = Integer.parseInt(WisNum);
				if (WisScore > 8) {
					botonResta(LabelPointsLeft, WisScore);
					WisScore--;
					WisNum = String.valueOf(WisScore);
					LabelWisNum.setText(WisNum);
				};
			}
		});
		panelAbilityScores.add(BtnWisDown);
		
		//Charisma
		JLabel LabelCha = new JLabel("Charisma");
		LabelCha.setBounds(231, 240, 74, 13);
		panelAbilityScores.add(LabelCha);
		
		final JLabel LabelChaNum = new JLabel("8");
		LabelChaNum.setHorizontalAlignment(SwingConstants.CENTER);
		LabelChaNum.setBounds(364, 240, 23, 13);
		panelAbilityScores.add(LabelChaNum);
		
		JButton BtnChaUp = new JButton("+");
		BtnChaUp.setBounds(315, 236, 44, 21);
		BtnChaUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ChaNum = LabelChaNum.getText();
				int ChaScore = Integer.parseInt(ChaNum);
				if (ChaScore < 15) {
					botonSuma(LabelPointsLeft, ChaScore);
					ChaScore++;
					ChaNum = String.valueOf(ChaScore);
					LabelChaNum.setText(ChaNum);
				};
			}
		});
		panelAbilityScores.add(BtnChaUp);

		JButton BtnChaDown = new JButton("-");
		BtnChaDown.setBounds(393, 236, 44, 21);
		BtnChaDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ChaNum = LabelChaNum.getText();
				int ChaScore = Integer.parseInt(ChaNum);
				if (ChaScore > 8) {
					botonResta(LabelPointsLeft, ChaScore);
					ChaScore--;
					ChaNum = String.valueOf(ChaScore);
					LabelChaNum.setText(ChaNum);
				};
			}
		});
		panelAbilityScores.add(BtnChaDown);
		
		//PANEL PROFICIENCIES
		JPanel panelProficiencies = new JPanel();
		panelProficiencies.setBackground(SystemColor.control);
		getContentPane().add(panelProficiencies, "Proficiencies");
		panelProficiencies.setLayout(null);
		
		JCheckBox CheckAcrobatics = new JCheckBox("Acrobatics");
		CheckAcrobatics.setBounds(216, 43, 134, 18);
		panelProficiencies.add(CheckAcrobatics);
		
		JCheckBox CheckAnimal = new JCheckBox("Animal Handling");
		CheckAnimal.setBounds(216, 58, 134, 18);
		panelProficiencies.add(CheckAnimal);
		
		JCheckBox CheckArcana = new JCheckBox("Arcana");
		CheckArcana.setBounds(216, 73, 134, 18);
		panelProficiencies.add(CheckArcana);
		
		JCheckBox CheckAthletics = new JCheckBox("Athletics");
		CheckAthletics.setBounds(216, 88, 134, 18);
		panelProficiencies.add(CheckAthletics);
		
		JCheckBox CheckDeception = new JCheckBox("Deception");
		CheckDeception.setBounds(216, 103, 134, 18);
		panelProficiencies.add(CheckDeception);
		
		JCheckBox CheckHistory = new JCheckBox("History");
		CheckHistory.setBounds(216, 118, 134, 18);
		panelProficiencies.add(CheckHistory);
		
		JCheckBox CheckInsight = new JCheckBox("Insight");
		CheckInsight.setBounds(216, 133, 134, 18);
		panelProficiencies.add(CheckInsight);
		
		JCheckBox CheckIntimidation = new JCheckBox("Intimidation");
		CheckIntimidation.setBounds(216, 148, 134, 18);
		panelProficiencies.add(CheckIntimidation);
		
		JCheckBox CheckInvestigation = new JCheckBox("Investigation");
		CheckInvestigation.setBounds(216, 163, 134, 18);
		panelProficiencies.add(CheckInvestigation);
		
		JCheckBox CheckMedicine = new JCheckBox("Medicine");
		CheckMedicine.setBounds(216, 178, 134, 18);
		panelProficiencies.add(CheckMedicine);
		
		JCheckBox CheckNature = new JCheckBox("Nature");
		CheckNature.setBounds(216, 193, 134, 18);
		panelProficiencies.add(CheckNature);
		
		JCheckBox CheckPerception = new JCheckBox("Perception");
		CheckPerception.setBounds(216, 208, 134, 18);
		panelProficiencies.add(CheckPerception);
		
		JCheckBox CheckPerformance = new JCheckBox("Performance");
		CheckPerformance.setBounds(216, 223, 134, 18);
		panelProficiencies.add(CheckPerformance);
		
		JCheckBox CheckPersuasion = new JCheckBox("Persuasion");
		CheckPersuasion.setBounds(216, 238, 134, 18);
		panelProficiencies.add(CheckPersuasion);
		
		JCheckBox CheckReligion = new JCheckBox("Religion");
		CheckReligion.setBounds(216, 253, 134, 18);
		panelProficiencies.add(CheckReligion);
		
		JCheckBox CheckSleight = new JCheckBox("Sleight of Hand");
		CheckSleight.setBounds(216, 268, 134, 18);
		panelProficiencies.add(CheckSleight);
		
		JCheckBox CheckStealth = new JCheckBox("Stealth");
		CheckStealth.setBounds(216, 283, 134, 18);
		panelProficiencies.add(CheckStealth);
		
		JCheckBox CheckSurvival = new JCheckBox("Survival");
		CheckSurvival.setBounds(216, 298, 134, 18);
		panelProficiencies.add(CheckSurvival);
		
		//PANEL OPCIONES DE CLASE
		
		ButtonGroup clericGroup = new ButtonGroup();
		
		JPanel panelClericOptions = new JPanel();
		panelClericOptions.setBackground(SystemColor.control);
		getContentPane().add(panelClericOptions, "Class Options");
		panelClericOptions.setLayout(null);
		
		final JLabel labelSubDetail = new JLabel("");
		labelSubDetail.setHorizontalAlignment(SwingConstants.CENTER);
		labelSubDetail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelSubDetail.setBounds(174, 332, 279, 65);
		panelClericOptions.add(labelSubDetail);
		
		JRadioButton rdbtnClericArcana = new JRadioButton("Arcana");
		rdbtnClericArcana.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericArcana.setBounds(264, 48, 83, 20);
		clericGroup.add(rdbtnClericArcana);
		rdbtnClericArcana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Detect Magic, Magic Missile <br> Arcana Skill <br> Gain Two Wizard Cantrip  <html>");
			}
		});
		panelClericOptions.add(rdbtnClericArcana);
		
		JRadioButton rdbtnClericDeath = new JRadioButton("Death");
		rdbtnClericDeath.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericDeath.setBounds(264, 70, 83, 20);
		clericGroup.add(rdbtnClericDeath);
		rdbtnClericDeath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: False Life, Ray of Sickness <br> Martial Weapon Proficiency <br> Gain a Necromancy Cantrip<html>");
			}
		});
		panelClericOptions.add(rdbtnClericDeath);
		
		JRadioButton rdbtnClericForge = new JRadioButton("Forge");
		rdbtnClericForge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericForge.setBounds(264, 92, 83, 20);
		rdbtnClericForge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Identify, Searing Smite <br> Heavy Armor, Smith Tool Proficiency <br> Imbue your gear with magic <html>");
			}
		});
		clericGroup.add(rdbtnClericForge);
		panelClericOptions.add(rdbtnClericForge);
		
		JRadioButton rdbtnClericGrave = new JRadioButton("Grave");
		rdbtnClericGrave.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericGrave.setBounds(264, 114, 70, 20);
		clericGroup.add(rdbtnClericGrave);
		rdbtnClericGrave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Bane, False Life <br> Heal the dying more effectively <br> Sense nearby undead <html>");
			}
		});
		panelClericOptions.add(rdbtnClericGrave);
		
		JRadioButton rdbtnClericKnowledge = new JRadioButton("Knowledge");
		rdbtnClericKnowledge.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericKnowledge.setBounds(264, 136, 100, 20);
		rdbtnClericKnowledge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Command, Identify <br> Two Extra Languages <br> Two knowledge skills with double proficiency bonus <html>");
			}
		});
		clericGroup.add(rdbtnClericKnowledge);
		panelClericOptions.add(rdbtnClericKnowledge);
		
		JRadioButton rdbtnClericLife = new JRadioButton("Life");
		rdbtnClericLife.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericLife.setBounds(264, 158, 70, 20);
		clericGroup.add(rdbtnClericLife);
		rdbtnClericLife.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Bless, Cure Wounds <br> Heavy Armor Proficiency <br> More Potent Healing Spells <html>");
			}
		});
		panelClericOptions.add(rdbtnClericLife);
		
		JRadioButton rdbtnClericLight = new JRadioButton("Light");
		rdbtnClericLight.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericLight.setBounds(264, 180, 100, 20);
		clericGroup.add(rdbtnClericLight);
		rdbtnClericLight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Burning Hands, Fearie Fire <br> Bonus Cantrip: Light <br> Impose Disadvanatge when attacked <html>");
			}
		});
		panelClericOptions.add(rdbtnClericLight);
		
		JRadioButton rdbtnClericNature = new JRadioButton("Nature");
		rdbtnClericNature.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericNature.setBounds(264, 202, 83, 20);
		clericGroup.add(rdbtnClericNature);
		rdbtnClericNature.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Animal Friendship, Speak with Animals <br> Heavy Armor Proficicency <br> Gain a Druid Cantrip and a Skill <html>");
			}
		});
		panelClericOptions.add(rdbtnClericNature);
		
		JRadioButton rdbtnClericOrder = new JRadioButton("Order");
		rdbtnClericOrder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericOrder.setBounds(264, 224, 83, 20);
		clericGroup.add(rdbtnClericOrder);
		rdbtnClericOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Command, Heroism <br> Heavy Armor and Social Skill Proficiency <br> Giant Attacks When Spellcasting <html>");
			}
		});
		panelClericOptions.add(rdbtnClericOrder);
		
		JRadioButton rdbtnClericTempest = new JRadioButton("Tempest");
		rdbtnClericTempest.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericTempest.setBounds(264, 246, 83, 20);
		clericGroup.add(rdbtnClericTempest);
		rdbtnClericTempest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Fog Cloud, Thunderwave <br> Heavy Armor and Martial Weapon Proficiencies <br> Shock attacker with Lightning <html>");
			}
		});
		panelClericOptions.add(rdbtnClericTempest);
		
		JRadioButton rdbtnClericTrickery = new JRadioButton("Trickery");
		rdbtnClericTrickery.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericTrickery.setBounds(264, 268, 83, 20);
		clericGroup.add(rdbtnClericTrickery);
		rdbtnClericTrickery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Charm Person, Disguise Self <br> Grant an Ally Advantage on Stealth <html>");
			}
		});
		panelClericOptions.add(rdbtnClericTrickery);
		
		JRadioButton rdbtnClericWar = new JRadioButton("War");
		rdbtnClericWar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnClericWar.setBounds(264, 290, 83, 20);
		clericGroup.add(rdbtnClericWar);
		rdbtnClericWar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelSubDetail.setText("<html>Bonus Spells: Divine Favor, Shield of Faith <br> Heavy Armor and Martial Weapon Proficiencies <br> Attack as a Bonus Action <html>");
			}
		});
		panelClericOptions.add(rdbtnClericWar);
		
		//PANEL EQUIPMENT
		JPanel panelClericEquipment = new JPanel();
		panelClericEquipment.setBackground(SystemColor.control);
		getContentPane().add(panelClericEquipment, "Equipment");
		panelClericEquipment.setLayout(null);
		
		JLabel LabelSelect1 = new JLabel("\u2022 Select:");
		LabelSelect1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelSelect1.setBounds(237, 48, 103, 13);
		panelClericEquipment.add(LabelSelect1);
		
		JRadioButton rdbtnMace = new JRadioButton("Mace");
		rdbtnMace.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnMace.setBounds(237, 67, 103, 21);
		panelClericEquipment.add(rdbtnMace);
		
		JRadioButton rdbtnWarhammer = new JRadioButton("Warhammer");
		rdbtnWarhammer.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnWarhammer.setBounds(237, 85, 103, 21);
		panelClericEquipment.add(rdbtnWarhammer);
		
		JLabel LabelSelect2 = new JLabel("\u2022 Select:");
		LabelSelect2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelSelect2.setBounds(237, 120, 103, 13);
		panelClericEquipment.add(LabelSelect2);
		
		JRadioButton rdbtnScaleMail = new JRadioButton("Scale mail");
		rdbtnScaleMail.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnScaleMail.setBounds(237, 139, 103, 21);
		panelClericEquipment.add(rdbtnScaleMail);
		
		JRadioButton rdbtnLeatherArmor = new JRadioButton("Leather armor");
		rdbtnLeatherArmor.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnLeatherArmor.setBounds(237, 157, 103, 21);
		panelClericEquipment.add(rdbtnLeatherArmor);
		
		JLabel LabelSelect3 = new JLabel("\u2022 Select:");
		LabelSelect3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelSelect3.setBounds(237, 192, 103, 13);
		panelClericEquipment.add(LabelSelect3);
		
		JRadioButton rdbtnLightCrossbow = new JRadioButton("Light crossbow, bolts (20)");
		rdbtnLightCrossbow.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnLightCrossbow.setBounds(237, 211, 143, 21);
		panelClericEquipment.add(rdbtnLightCrossbow);
		
		JRadioButton rdbtnSimpleWeapon = new JRadioButton("Simple Weapon");
		rdbtnSimpleWeapon.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnSimpleWeapon.setBounds(237, 229, 103, 21);
		panelClericEquipment.add(rdbtnSimpleWeapon);
		
		JLabel LabelSelect4 = new JLabel("\u2022 Select:");
		LabelSelect4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelSelect4.setBounds(237, 264, 103, 13);
		panelClericEquipment.add(LabelSelect4);
		
		JRadioButton rdbtnPriest = new JRadioButton("Priest's pouch");
		rdbtnPriest.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnPriest.setBounds(237, 283, 143, 21);
		panelClericEquipment.add(rdbtnPriest);
		
		JRadioButton rdbtnExplorer = new JRadioButton("Explorer's pack");
		rdbtnExplorer.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rdbtnExplorer.setBounds(237, 301, 103, 21);
		panelClericEquipment.add(rdbtnExplorer);
		
		JLabel LabelShield = new JLabel("\u2022 Shield");
		LabelShield.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelShield.setBounds(237, 336, 103, 13);
		panelClericEquipment.add(LabelShield);
		
		JLabel LabelSymbol = new JLabel("\u2022 Holy symbol");
		LabelSymbol.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelSymbol.setBounds(237, 352, 103, 21);
		panelClericEquipment.add(LabelSymbol);
		
		//PANEL NAME
		
		JPanel panelName = new JPanel();
		panelName.setBackground(SystemColor.control);
		getContentPane().add(panelName, "Name");
		panelName.setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(252, 162, 116, 19);
		panelName.add(textField);
		textField.setColumns(10);
		
		JLabel LabelName = new JLabel("Name");
		LabelName.setBounds(293, 189, 36, 13);
		panelName.add(LabelName);
		
		//PANEL FINISH
		
		JPanel panelFinish = new JPanel();
		panelFinish.setBackground(SystemColor.control);
		getContentPane().add(panelFinish, "Finish");
		panelFinish.setLayout(null);
		
		JLabel LabelFinish = new JLabel("Finish Creation?");
		LabelFinish.setForeground(SystemColor.textHighlight);
		LabelFinish.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LabelFinish.setBounds(182, 134, 132, 21);
		panelFinish.add(LabelFinish);
		
		//esto no funciona como debe, necesita hilos
		JLabel LabelResult = new JLabel(RaceSelected + " "+ ClassSelected + " "+BackgroundSelected);
		LabelResult.setBounds(182, 165, 216, 13);
		panelFinish.add(LabelResult);
		
		JButton DoneButton = new JButton("Done");
		DoneButton.setBounds(192, 188, 85, 21);
		DoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panelFinish.add(DoneButton);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 495);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//BOTONES DE MENU
		
		//Boton Clase y raza
		JButton raceClassButton = new JButton("Race & Class");
		raceClassButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(getContentPane().getLayout());
				c.show(getContentPane(), "RaceClass");
			}
		});
		menuBar.add(raceClassButton);
		
		//Boton Scores
		JButton scoresButton = new JButton("Ability Scores");
		scoresButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(getContentPane().getLayout());
				c.show(getContentPane(), "Ability Scores");
			}
		});
		menuBar.add(scoresButton);
		
		//Boton Proficiencies
		JButton proficienciesButton = new JButton("Proficiencies");
		proficienciesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(getContentPane().getLayout());
				c.show(getContentPane(), "Proficiencies");
			}
		});
		menuBar.add(proficienciesButton);
		
		//Boton ClassOption
		JButton classOptionButton = new JButton("Class Options");
		classOptionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(getContentPane().getLayout());
				c.show(getContentPane(), "Class Options");
			}
		});
		menuBar.add(classOptionButton);
		
		//Boton Equipment
		JButton equipmentButton = new JButton("Equipment");
		equipmentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(getContentPane().getLayout());
				c.show(getContentPane(), "Equipment");
			}
		});
		menuBar.add(equipmentButton);
		
		//boton Name
		JButton nameButton = new JButton("Name");
		nameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(getContentPane().getLayout());
				c.show(getContentPane(), "Name");
			}
		});
		menuBar.add(nameButton);
		
		//Boton Finish
		JButton finishButton = new JButton("Finish");
		finishButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c=(CardLayout)(getContentPane().getLayout());
				c.show(getContentPane(), "Finish");
			}
		});
		menuBar.add(finishButton);
	}
}
