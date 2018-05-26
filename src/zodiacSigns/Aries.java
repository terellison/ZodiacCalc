package zodiacSigns;
public class Aries extends Zodiac {
	private String name = "Aries";
	@Override
	public boolean isZodiac(Month month, int day) {
		return month == Month.MARCH && (day >= 21 && day <= 31) || month == Month.APRIL && day <= 19;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
