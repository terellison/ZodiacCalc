package zodiacSigns;

public class Virgo extends Zodiac {
	private String name = "Virgo";
	@Override
	public boolean isZodiac(Month month, int day) {
		// TODO Auto-generated method stub
		return month == Month.AUGUST && (day >= 23 && day <= 31) || month == Month.SEPTEMBER && day <= 22;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
