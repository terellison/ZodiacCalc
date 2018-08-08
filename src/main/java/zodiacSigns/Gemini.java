package zodiacSigns;

public class Gemini extends Zodiac {
	private String name = "Gemini";
	@Override
	public boolean isZodiac(Month month, int day) {
		// TODO Auto-generated method stub
		return month == Month.MAY && (day >= 21 && day <= 31) || month == Month.JUNE && day <= 20;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
