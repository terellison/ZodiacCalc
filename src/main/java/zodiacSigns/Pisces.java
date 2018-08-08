package zodiacSigns;
public class Pisces extends Zodiac {
	private String name = "Pisces";
	@Override
	public boolean isZodiac(Month month, int day) {
		return month == Month.FEBRUARY && (day >= 19 && day <= 29) || month == Month.MARCH && day <= 20;
	}
	@Override
	public String toString() {
		return name;
	}
}
