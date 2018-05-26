package zodiacSigns;

public class Capricorn extends Zodiac {
	private String name = "Capricorn";
	@Override
	public boolean isZodiac(Month month, int day) {
		// TODO Auto-generated method stub
		return month == Month.DECEMBER && (day >= 22 && day <= 31) || month == Month.JANUARY && day <= 19;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
