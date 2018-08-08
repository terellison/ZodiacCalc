package zodiacSigns;

public class Cancer extends Zodiac {
	private String name = "Cancer";
	@Override
	public boolean isZodiac(Month month, int day) {
		// TODO Auto-generated method stub
		return month == Month.JUNE && (day >= 21 && day <= 30) || month == Month.JULY && day <= 22;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
