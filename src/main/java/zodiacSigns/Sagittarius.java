package zodiacSigns;

public class Sagittarius extends Zodiac {
	private String name = "Sagittarius";
	@Override
	public boolean isZodiac(Month month, int day) {
		// TODO Auto-generated method stub
		return month == Month.NOVEMBER && (day >= 22 && day <= 30) || month == Month.DECEMBER && day <= 21;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
