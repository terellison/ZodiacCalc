package zodiacCalc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import zodiacSigns.Aquarius;
import zodiacSigns.Aries;
import zodiacSigns.Cancer;
import zodiacSigns.Capricorn;
import zodiacSigns.Gemini;
import zodiacSigns.Leo;
import zodiacSigns.Libra;
import zodiacSigns.Month;
import zodiacSigns.Pisces;
import zodiacSigns.Sagittarius;
import zodiacSigns.Scorpio;
import zodiacSigns.Taurus;
import zodiacSigns.Virgo;
import zodiacSigns.Zodiac;
public class MainApp {
	private static ArrayList<Zodiac> signs = new ArrayList<>();
	private static Map<String, Month> monthToEnum = new HashMap<>();
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String monthString = "";
		String sign = "";
		int date = 0;
		Month month;
		loadCollections();
		System.out.println("What is your birth month?: ");
		monthString = input.next();
		String cleanMonth = cleanedMonth(monthString);
		while(!monthToEnum.containsKey(cleanMonth)) {
			System.out.println("\nSorry, that is not a valid month, please enter your birth month again (Enter the full birth month).\n");
			System.out.println("What is your birth month?: ");
			monthString = input.next();
			cleanMonth = cleanedMonth(monthString);
		}
		System.out.println("\nGreat! and what day of " + cleanMonth + " were you born on?: ");
		date = input.nextInt();
		while(date < 1 || date > 31) {
			System.out.println("\nSorry, the date you entered does not exist. Please try again.\n");
			System.out.println("What day of " + cleanMonth + " were you born on?: ");
			date = input.nextInt();
		}
		month = monthToEnum.get(cleanMonth);
		for(Zodiac e: signs) {
			if(e.isZodiac(month, date)) {
				sign = e.toString();
			}
		}
		System.out.println("\nYour zodiac sign is " + sign);
		input.close();
	}
	
	private static void loadCollections() {
		
		// Load months onto Map
		monthToEnum.put("January", Month.JANUARY);
		monthToEnum.put("February", Month.FEBRUARY);
		monthToEnum.put("March", Month.MARCH);
		monthToEnum.put("April", Month.APRIL);
		monthToEnum.put("May", Month.MAY);
		monthToEnum.put("June", Month.JUNE);
		monthToEnum.put("July", Month.JULY);
		monthToEnum.put("August", Month.AUGUST);
		monthToEnum.put("September", Month.SEPTEMBER);
		monthToEnum.put("October", Month.OCTOBER);
		monthToEnum.put("November", Month.NOVEMBER);
		monthToEnum.put("December", Month.DECEMBER);
		
		//Load signs into ArrayList
		signs.add(new Aquarius());
		signs.add(new Aries());
		signs.add(new Cancer());
		signs.add(new Capricorn());
		signs.add(new Gemini());
		signs.add(new Leo());
		signs.add(new Libra());
		signs.add(new Pisces());
		signs.add(new Sagittarius());
		signs.add(new Scorpio());
		signs.add(new Taurus());
		signs.add(new Virgo());
	}
	
	private static String cleanedMonth(String unclean) {
		return (Character.toUpperCase(unclean.charAt(0))) + unclean.substring(1, unclean.length());
	}
}
