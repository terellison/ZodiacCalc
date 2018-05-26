package zodiacSigns;

public class Libra extends Zodiac {
	private String name = "Libra";
	@Override
	public boolean isZodiac(Month month, int day) {
		// TODO Auto-generated method stub
		return month == Month.SEPTEMBER && (day >= 23 && day <= 30) || month == Month.OCTOBER && day <= 22;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
