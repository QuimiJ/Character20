package Properties;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class AdminCharacters {
	public static void main(String[] args) {
		Properties objetoP = new Properties();
		
		try {
			objetoP.load(new FileInputStream("characters.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int i = 0;		
		for (i = 0; i < 200; i++) {
			if (objetoP.getProperty("Number" + Integer.toString(i)) == null) {
				objetoP.setProperty("Number" + Integer.toString(i), Integer.toString(i));
				objetoP.setProperty("Str" + Integer.toString(i), "");
				objetoP.setProperty("Dex" + Integer.toString(i), "");
				objetoP.setProperty("Con" + Integer.toString(i), "");
				objetoP.setProperty("Int" + Integer.toString(i), "");
				objetoP.setProperty("Wis" + Integer.toString(i), "");
				objetoP.setProperty("Char" + Integer.toString(i), "");
				objetoP.setProperty("MaxHitPoints" + Integer.toString(i), "");
				objetoP.setProperty("WeaponOne" + Integer.toString(i), "");
				objetoP.setProperty("WeaponTwo" + Integer.toString(i), "");
				objetoP.setProperty("WeaponThree" + Integer.toString(i), "");
				objetoP.setProperty("Spells" + Integer.toString(i), "");
				objetoP.setProperty("Copper" + Integer.toString(i), "");
				objetoP.setProperty("Silver" + Integer.toString(i), "");
				objetoP.setProperty("Gold" + Integer.toString(i), "");
				objetoP.setProperty("Platinum" + Integer.toString(i), "");
				objetoP.setProperty("Electrum" + Integer.toString(i), "");
				objetoP.setProperty("Equipment" + Integer.toString(i), "");
				objetoP.setProperty("Proficiencies" + Integer.toString(i), "");
				objetoP.setProperty("Languages" + Integer.toString(i), "");
				objetoP.setProperty("PersonalityTraits" + Integer.toString(i), "");
				objetoP.setProperty("Ideals" + Integer.toString(i), "");
				objetoP.setProperty("Bonds" + Integer.toString(i), "");
				objetoP.setProperty("Flaws" + Integer.toString(i), "");
				objetoP.setProperty("ClassFeatures" + Integer.toString(i), "");
				objetoP.setProperty("RaceFeatures" + Integer.toString(i), "");
				objetoP.setProperty("Allies&Organizations" + Integer.toString(i), "");
				objetoP.setProperty("Backstory" + Integer.toString(i), "");
				objetoP.setProperty("Treasure" + Integer.toString(i), "");
				try {
					objetoP.store(new FileWriter("characters.properties"), "Operation" + objetoP.getProperty("Number" + Integer.toString(i)));
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				i=200;
			}
		}
		
	}
}