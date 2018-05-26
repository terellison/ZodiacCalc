package zodiacCalc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

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


public class TestZodiac {
	private static ArrayList<Zodiac> signs = new ArrayList<>();
	private static Map<String, Month> monthToEnum = new HashMap<>();
	
	@Before
	public void Before() {

		/* Collections loading code lifted from MainApp.java */
		
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
	
	@Test
	public void testMap() {
		// Test monthToEnum Map<String, Month>
		assertEquals(true, monthToEnum.containsKey("April"));
		assertEquals(Month.JANUARY, monthToEnum.get("January"));
		assertEquals(false, monthToEnum.containsKey("This is NOT a Month"));
		assertEquals(Month.OCTOBER, monthToEnum.get("October"));
	}
	
	@Test
	public void testZodiac() {
		for(Zodiac e: signs) {
			if(e.isZodiac(Month.APRIL, 1)) {
				assertEquals("Aries", e.toString());
			}
			else if(e.isZodiac(Month.OCTOBER, 14)) {
				assertEquals("Libra", e.toString());
			}
			else if(e.isZodiac(Month.JANUARY, 24)) {
				assertEquals("Aquarius", e.toString());
			}
		}
	}

}
