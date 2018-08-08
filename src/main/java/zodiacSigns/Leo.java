package zodiacSigns;

public class Leo extends Zodiac {
	private String name = "Leo";
	@Override
	public boolean isZodiac(Month month, int day) {
		// TODO Auto-generated method stub
		return month == Month.JULY && (day >= 23 && day <= 31) || month == Month.AUGUST && day <= 22;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
