package enums;

public enum Season {
	SPRING("Pavasaris"), SUMMER("Vasara"), AUTUMN("Ruduo"), WINTER("Žiema"); // objektai!

	private String translation;

	private Season(String translation) {
		this.translation = translation;
	}

	public String getTranslation() {
		return translation;
	}

}
