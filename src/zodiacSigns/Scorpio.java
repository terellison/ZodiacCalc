package zodiacSigns;

public class Scorpio extends Zodiac {
	private String name = "Scorpio";
	@Override
	public boolean isZodiac(Month month, int day) {
		// TODO Auto-generated method stub
		return month == Month.OCTOBER && (day >= 23 && day <= 31) || month == Month.NOVEMBER && day <= 21;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
