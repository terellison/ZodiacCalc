package zodiacSigns;
public class Taurus extends Zodiac {
	private String name = "Taurus";
	@Override
	public boolean isZodiac(Month month, int day) {
		// TODO Auto-generated method stub
		return month == Month.APRIL && (day >= 20 && day <= 30) || month == Month.MAY && day <= 20;
	}
	@Override
	public String toString() {
		return this.name;
	}
}
