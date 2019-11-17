package enums;

public class JavaEnumTest {
	public static void main(String[] args) {
		Season season = Season.SUMMER; // finalized, static
		switch (season) {
		case SPRING:
			System.out.println("Spring");
			break;
		case SUMMER:
			System.out.println("Summer " + season.getTranslation());
			break;
		default:
			System.out.println("Winter or Fall");
		}

		System.out.println(season.name());

	}
}
