package zodiacSigns;
public class Aquarius extends Zodiac {
	private String name = "Aquarius";
	@Override
	public boolean isZodiac(Month month, int day) {
		return month == Month.JANUARY && (day >= 20 && day <= 31) || month == Month.FEBRUARY && day <= 18;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
