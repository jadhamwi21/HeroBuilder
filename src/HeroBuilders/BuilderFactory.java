package HeroBuilders;
public interface BuilderFactory {
	static String  STRENGTH = "Strength";
	static String  AGILITY = "Agility";
	static String  INTELLIGENCE = "Intelligence";
	public static boolean isInvalidSelection(String str) {
		return str.equals("invalid");
	}
	public static String NumberToBuilderType(int Number) {
		switch(Number) {
		case 1:
			return STRENGTH;
		case 2:
			return AGILITY;
		case 3:
			return INTELLIGENCE;
		default:
			return "invalid";
		}
	}
	public static Builder Factory(String type) {
		if(type == STRENGTH)
			return new StrengthHeroBuilder();
		else if(type == AGILITY)
			return new AgilityHeroBuilder();
		else if(type == INTELLIGENCE)
			return new IntelligenceHeroBuilder();
		else
			return null;
	}
}
