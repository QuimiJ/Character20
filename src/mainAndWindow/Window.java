package mainAndWindow;

//segundo intento
import clasesCriatura.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

	private JFrame frame;
	private JTextField TextField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField txtd;
	private JTextField txtGranHacha;
	private JTextField txtd_1;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_28;

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
		
		TextField = new JTextField();
		TextField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		TextField.setHorizontalAlignment(SwingConstants.CENTER);
		TextField.setText("18");
		TextField.setBounds(40, 30, 65, 45);
		final JLabel lblNewLabel = new JLabel("(4)");
		final JLabel lblNewLabel_13 = new JLabel("(6)");
		textField_6 = new JTextField();
		TextField.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					String stat = TextField.getText();
					int numero, modificador;
					numero = Integer.parseInt(stat);
					modificador = generateMod(numero);
					String modificable = Integer.toString(modificador);
					lblNewLabel.setText("(" + modificador + ")");
					lblNewLabel_13.setText("(" + modificador + ")");
					if (modificador >= 0) {
						textField_6.setText("+" + modificable);
					}else {
						textField_6.setText(modificable);
					}
					
				}catch(NumberFormatException i){
					
					System.out.println("Error de combersion numerico");
				}
				
			}
			
		});
		panel.add(TextField);
		TextField.setColumns(14);
		
		
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(115, 30, 65, 45);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FUERZA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(80, 80, 110, 30);
		panel.add(lblNewLabel_1);
		
		
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_13.setBounds(180, 30, 65, 45);
		panel.add(lblNewLabel_13);
		
		JLabel lblNewLabl = new JLabel("Saves");
		lblNewLabl.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabl.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabl.setBounds(180, 15, 65, 14);
		panel.add(lblNewLabl);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 168, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 293, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("15");
		textField.setBounds(40, 30, 65, 45);
		final JLabel lblNewLabel_2 = new JLabel("(3)");
		final JLabel lblNewLabel_14 = new JLabel("(3)");
		textField.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			try {
				String stat = textField.getText();
				int numero, modificador;
				numero = Integer.parseInt(stat);
				modificador = generateMod(numero);
				String modificable = Integer.toString(modificador);
				int modificador2 = modificador + 10;
				String modificable2 = Integer.toString(modificador2);
				lblNewLabel_2.setText("(" + modificador + ")");
				lblNewLabel_14.setText("(" + modificador + ")");
				if (modificador >= 0) {
					textField_13.setText("+" + modificable);
					textField_20.setText("+" + modificable);
					textField_23.setText(modificable2);
					textField_24.setText("+" + modificable);
				}else {
					textField_13.setText(modificable);
					textField_20.setText(modificable);
					textField_23.setText(modificable2);
					textField_24.setText(modificable);
				}
				
			}catch(NumberFormatException i){
				
				System.out.println("Error de combersion numerico");
			}
		}
			
		});

			
		panel_1.add(textField);
		textField.setColumns(10);
		
		
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(115, 30, 65, 45);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTREZA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_3.setBounds(60, 80, 150, 30);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_14.setBounds(180, 30, 65, 45);
		panel_1.add(lblNewLabel_14);
		
		JPanel panel_1_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1_1, 324, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1_1, 449, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1_1, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setText("14");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(40, 30, 65, 45);
		panel_1_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("(2)");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(115, 30, 65, 45);
		panel_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CONSTITUCION");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_5.setBounds(20, 80, 230, 30);
		panel_1_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_15 = new JLabel("(2)");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_15.setBounds(180, 30, 65, 45);
		panel_1_1.add(lblNewLabel_15);
		
		JPanel panel_1_1_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1_1_1, 460, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1_1_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1_1_1, 585, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1_1_1, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setText("8");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_2.setBounds(40, 30, 65, 45);
		panel_1_1_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("(-1)");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_6.setBounds(115, 30, 65, 45);
		panel_1_1_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("INTELIGENCIA");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_7.setBounds(20, 80, 230, 30);
		panel_1_1_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_12 = new JLabel("(+1)");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_12.setBounds(180, 30, 65, 45);
		panel_1_1_1.add(lblNewLabel_12);
		
		JPanel panel_1_1_1_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1_1_1_1, 606, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1_1_1_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1_1_1_1, 731, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1_1_1_1, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		textField_3 = new JTextField();
		textField_3.setText("16");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_3.setBounds(40, 30, 65, 45);
		panel_1_1_1_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("(+3)");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_8.setBounds(115, 30, 65, 45);
		panel_1_1_1_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("SABIDURIA");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(20, 80, 230, 30);
		panel_1_1_1_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_16 = new JLabel("(+3)");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_16.setBounds(180, 30, 65, 45);
		panel_1_1_1_1.add(lblNewLabel_16);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1_1_1_1_1, 752, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1_1_1_1_1, 20, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1_1_1_1_1, 877, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1_1_1_1_1, 290, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField_4.setText("8");
		textField_4.setBounds(40, 30, 65, 45);
		panel_1_1_1_1_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("(-1)");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_10.setBounds(115, 30, 64, 45);
		panel_1_1_1_1_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("CARISMA");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.ITALIC, 30));
		lblNewLabel_11.setBounds(20, 80, 230, 30);
		panel_1_1_1_1_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_17 = new JLabel("(-1)");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_17.setBounds(180, 30, 65, 45);
		panel_1_1_1_1_1.add(lblNewLabel_17);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 22, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 330, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 222, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 720, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("EXITOS");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setBounds(40, 40, 80, 25);
		panel_2.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("FALLOS");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_19.setBounds(40, 90, 80, 25);
		panel_2.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("SALVACIONES");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_20.setBounds(47, 134, 300, 30);
		panel_2.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("CONTRA MUERTE");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setBounds(47, 165, 300, 30);
		panel_2.add(lblNewLabel_21);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(165, 41, 21, 23);
		panel_2.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(235, 41, 21, 23);
		panel_2.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(305, 41, 21, 23);
		panel_2.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setBounds(165, 91, 21, 23);
		panel_2.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.setBounds(235, 91, 21, 23);
		panel_2.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("");
		radioButton_5.setBounds(305, 91, 21, 23);
		panel_2.add(radioButton_5);
		
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
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("+2");
		textField_5.setBounds(40, 27, 25, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		
		textField_6.setText("+5");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(40, 57, 25, 20);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("-1");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(40, 87, 25, 20);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("-1");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(40, 117, 25, 20);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("-1");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(40, 147, 25, 20);
		panel_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("+2");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(40, 177, 25, 20);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("+1");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setColumns(10);
		textField_11.setBounds(40, 207, 25, 20);
		panel_3.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("+2");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		textField_12.setBounds(40, 237, 25, 20);
		panel_3.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("-1");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		textField_13.setBounds(40, 267, 25, 20);
		panel_3.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("+2");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setColumns(10);
		textField_14.setBounds(40, 297, 25, 20);
		panel_3.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("+2");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setColumns(10);
		textField_15.setBounds(40, 327, 25, 20);
		panel_3.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("+7");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setColumns(10);
		textField_16.setBounds(40, 357, 25, 20);
		panel_3.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("+1");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(10);
		textField_17.setBounds(40, 387, 25, 20);
		panel_3.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("+2");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		textField_18.setBounds(40, 417, 25, 20);
		panel_3.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("+3");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setColumns(10);
		textField_19.setBounds(40, 447, 25, 20);
		panel_3.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("+2");
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setColumns(10);
		textField_20.setBounds(40, 477, 25, 20);
		panel_3.add(textField_20);
		
		JLabel lblNewLabel_23 = new JLabel("Acrobacias (SAB)");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23.setBounds(100, 27, 270, 20);
		panel_3.add(lblNewLabel_23);
		
		JLabel lblNewLabel_23_1 = new JLabel("Atletismo (FUE)");
		lblNewLabel_23_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_1.setBounds(100, 57, 270, 20);
		panel_3.add(lblNewLabel_23_1);
		
		JLabel lblNewLabel_23_2 = new JLabel("Conocimiento Arcano(INT)");
		lblNewLabel_23_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_2.setBounds(100, 87, 270, 20);
		panel_3.add(lblNewLabel_23_2);
		
		JLabel lblNewLabel_23_3 = new JLabel("Enga\u00F1o (CAR)");
		lblNewLabel_23_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_3.setBounds(100, 117, 270, 20);
		panel_3.add(lblNewLabel_23_3);
		
		JLabel lblNewLabel_23_4 = new JLabel("Historia (INT)");
		lblNewLabel_23_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_4.setBounds(100, 147, 270, 20);
		panel_3.add(lblNewLabel_23_4);
		
		JLabel lblNewLabel_23_5 = new JLabel("Interpretacion (CAR)");
		lblNewLabel_23_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_5.setBounds(100, 177, 270, 20);
		panel_3.add(lblNewLabel_23_5);
		
		JLabel lblNewLabel_23_6 = new JLabel("Intimidacion (CAR)");
		lblNewLabel_23_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_6.setBounds(100, 207, 270, 20);
		panel_3.add(lblNewLabel_23_6);
		
		JLabel lblNewLabel_23_7 = new JLabel("Investigacion (INT)");
		lblNewLabel_23_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_7.setBounds(100, 237, 270, 20);
		panel_3.add(lblNewLabel_23_7);
		
		JLabel lblNewLabel_23_8 = new JLabel("Juego de Manos (DES)");
		lblNewLabel_23_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_8.setBounds(100, 267, 270, 20);
		panel_3.add(lblNewLabel_23_8);
		
		JLabel lblNewLabel_23_9 = new JLabel("Medicina (SAB)");
		lblNewLabel_23_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_9.setBounds(100, 297, 270, 20);
		panel_3.add(lblNewLabel_23_9);
		
		JLabel lblNewLabel_23_10 = new JLabel("Naturaleza (INT)");
		lblNewLabel_23_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_10.setBounds(100, 327, 270, 20);
		panel_3.add(lblNewLabel_23_10);
		
		JLabel lblNewLabel_23_11 = new JLabel("Percepcion (SAB)");
		lblNewLabel_23_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_11.setBounds(100, 357, 270, 20);
		panel_3.add(lblNewLabel_23_11);
		
		JLabel lblNewLabel_23_12 = new JLabel("Perspicacia (SAB)");
		lblNewLabel_23_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_12.setBounds(100, 387, 270, 20);
		panel_3.add(lblNewLabel_23_12);
		
		JLabel lblNewLabel_23_13 = new JLabel("Persuasion (CAR)");
		lblNewLabel_23_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_13.setBounds(100, 417, 270, 20);
		panel_3.add(lblNewLabel_23_13);
		
		JLabel lblNewLabel_23_14 = new JLabel("Religion (INT)");
		lblNewLabel_23_14.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_14.setBounds(100, 447, 270, 20);
		panel_3.add(lblNewLabel_23_14);
		
		JLabel lblNewLabel_23_15 = new JLabel("Sigilo (DES)");
		lblNewLabel_23_15.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_15.setBounds(100, 477, 270, 20);
		panel_3.add(lblNewLabel_23_15);
		
		JCheckBox checkBox_15_1 = new JCheckBox("");
		checkBox_15_1.setSelected(true);
		checkBox_15_1.setBounds(15, 507, 21, 23);
		panel_3.add(checkBox_15_1);
		
		JCheckBox checkBox_15_2 = new JCheckBox("");
		checkBox_15_2.setBounds(15, 537, 21, 23);
		panel_3.add(checkBox_15_2);
		
		textField_21 = new JTextField();
		textField_21.setText("+3");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setColumns(10);
		textField_21.setBounds(40, 507, 25, 20);
		panel_3.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setText("+3");
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setColumns(10);
		textField_22.setBounds(40, 537, 25, 20);
		panel_3.add(textField_22);
		
		JLabel lblNewLabel_23_15_1 = new JLabel("Supervivencia (SAB)");
		lblNewLabel_23_15_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_15_1.setBounds(100, 508, 270, 20);
		panel_3.add(lblNewLabel_23_15_1);
		
		JLabel lblNewLabel_23_15_2 = new JLabel("Trato con Animales (SAB)");
		lblNewLabel_23_15_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_23_15_2.setBounds(100, 537, 270, 20);
		panel_3.add(lblNewLabel_23_15_2);
		
		JPanel panel_2_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2_1, 22, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2_1, 760, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2_1, 442, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2_1, 1150, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_24 = new JLabel("clase de armadura");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setBounds(10, 20, 110, 30);
		panel_2_1.add(lblNewLabel_24);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textField_23.setText("17");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setBounds(10, 55, 110, 110);
		panel_2_1.add(textField_23);
		textField_23.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("Iniciativa");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25.setBounds(140, 20, 110, 30);
		panel_2_1.add(lblNewLabel_25);
		
		textField_24 = new JTextField();
		textField_24.setText("+3");
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textField_24.setColumns(10);
		textField_24.setBounds(140, 55, 110, 110);
		panel_2_1.add(textField_24);
		
		JLabel lblNewLabel_25_1 = new JLabel("Velocidad");
		lblNewLabel_25_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_25_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_25_1.setBounds(270, 20, 110, 30);
		panel_2_1.add(lblNewLabel_25_1);
		
		textField_25 = new JTextField();
		textField_25.setText("30");
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textField_25.setColumns(10);
		textField_25.setBounds(270, 55, 110, 110);
		panel_2_1.add(textField_25);
		
		JLabel lblNewLabel_24_1 = new JLabel("Puntos de Golpe");
		lblNewLabel_24_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24_1.setBounds(10, 235, 110, 30);
		panel_2_1.add(lblNewLabel_24_1);
		
		JLabel lblNewLabel_24_1_1 = new JLabel("PG Temporales");
		lblNewLabel_24_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24_1_1.setBounds(140, 235, 110, 30);
		panel_2_1.add(lblNewLabel_24_1_1);
		
		JLabel lblNewLabel_24_1_2 = new JLabel("Dados de Golpe");
		lblNewLabel_24_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_24_1_2.setBounds(270, 235, 110, 30);
		panel_2_1.add(lblNewLabel_24_1_2);
		
		textField_26 = new JTextField();
		textField_26.setText("81");
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textField_26.setColumns(10);
		textField_26.setBounds(10, 270, 110, 110);
		panel_2_1.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setText("0");
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 65));
		textField_27.setColumns(10);
		textField_27.setBounds(140, 270, 110, 110);
		panel_2_1.add(textField_27);
		
		txtd = new JTextField();
		txtd.setText("1D12");
		txtd.setHorizontalAlignment(SwingConstants.CENTER);
		txtd.setFont(new Font("Tahoma", Font.PLAIN, 35));
		txtd.setColumns(10);
		txtd.setBounds(270, 270, 110, 110);
		panel_2_1.add(txtd);
		
		JPanel panel_2_1_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2_1_1, 507, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2_1_1, 760, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2_1_1, 877, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_2_1_1, 1150, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		JLabel lblNewLabel_26 = new JLabel("ARMAS Y EQUIPO");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setBounds(20, 340, 350, 30);
		panel_2_1_1.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Nombre");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_27.setBounds(10, 10, 90, 15);
		panel_2_1_1.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("Bonificador");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_28.setBounds(160, 10, 70, 15);
		panel_2_1_1.add(lblNewLabel_28);
		
		JLabel lblNewLabel_27_1 = new JLabel("Danyo/Tipo");
		lblNewLabel_27_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_27_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_27_1.setBounds(240, 10, 140, 15);
		panel_2_1_1.add(lblNewLabel_27_1);
		
		txtGranHacha = new JTextField();
		txtGranHacha.setText("Gran hacha");
		txtGranHacha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGranHacha.setBounds(10, 35, 140, 20);
		panel_2_1_1.add(txtGranHacha);
		txtGranHacha.setColumns(10);
		
		txtd_1 = new JTextField();
		txtd_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtd_1.setText("1d12+4 (d.cortante)");
		txtd_1.setColumns(10);
		txtd_1.setBounds(240, 35, 140, 20);
		panel_2_1_1.add(txtd_1);
		
		textField_30 = new JTextField();
		textField_30.setText("+6");
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_30.setColumns(10);
		textField_30.setBounds(170, 35, 50, 20);
		panel_2_1_1.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(10, 65, 140, 20);
		panel_2_1_1.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(10, 95, 140, 20);
		panel_2_1_1.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(240, 65, 140, 20);
		panel_2_1_1.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(240, 95, 140, 20);
		panel_2_1_1.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(170, 65, 50, 20);
		panel_2_1_1.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(170, 95, 50, 20);
		panel_2_1_1.add(textField_36);
		
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
		
		JLabel lblNewLabel_26_1 = new JLabel("PERSONAJE");
		lblNewLabel_26_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_26_1.setBounds(20, 210, 350, 20);
		panel_2_1_2.add(lblNewLabel_26_1);
		
		JLabel lblNewLabel_29 = new JLabel("Nombre:");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_29.setBounds(20, 10, 60, 20);
		panel_2_1_2.add(lblNewLabel_29);
		
		textField_28 = new JTextField();
		textField_28.setToolTipText("introduce tu nombre..");
		textField_28.setBounds(90, 10, 280, 20);
		panel_2_1_2.add(textField_28);
		textField_28.setColumns(10);
		
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
		
		JLabel lblNewLabel_26_2 = new JLabel("RASGOS Y ATRIBUTOS");
		lblNewLabel_26_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_26_2.setBounds(20, 480, 350, 20);
		panel_2_1_2_1.add(lblNewLabel_26_2);
		
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
		
		JButton btnNewButton = new JButton("Editor de Personaje\r\n");
		btnNewButton.setBounds(0, 10, 130, 42);
		panel_4.add(btnNewButton);
		
		JButton btnLoad = new JButton("Cargar");
		btnLoad.setBounds(150, 10, 130, 42);
		panel_4.add(btnLoad);
		
		JButton btnAlmacenar = new JButton("Almacenar");
		btnAlmacenar.setBounds(300, 10, 120, 42);
		panel_4.add(btnAlmacenar);
		
		JButton btnFuturoUso = new JButton("Futuro uso");
		btnFuturoUso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFuturoUso.setBounds(150, 55, 130, 42);
		panel_4.add(btnFuturoUso);
		
		JButton btnNewButton_1_1 = new JButton("Crear Personaje\r\n");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(0, 55, 130, 42);
		panel_4.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Futuro uso");
		btnNewButton_1_2.setBounds(300, 55, 120, 42);
		panel_4.add(btnNewButton_1_2);
		
		/*COSAS PARA EL ACTION LISTENER
		//IMPORTANTE
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
		Stat pruebaCar = new Stat();
		pruebaCar.setScore(13);
				
		//Si el score es 20 no se podra sumar mas
		if (pruebaStr.getScore()<21) {
			btnNewButton.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent arg0) {
							
			}
			});
		
		}*/
	}
	
	public int generateMod(int score) {
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

}