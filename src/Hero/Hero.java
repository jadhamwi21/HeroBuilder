package Hero;

public class Hero {
	protected String heroName;
	protected int heroSpeed;
	protected String heroPrimaryAttribute;
	protected int heroIntelligence;
	protected int heroStrength;
	protected int heroAgility;
	protected String heroSide;
	public void setHeroName(String name) {
		this.heroName = name;
	}
	public void setHeroSpeed(int speed) {
		this.heroSpeed = speed;
	}
	public void setHeroIntelligence(int intelligence) {
		this.heroIntelligence = intelligence;
	}
	public void setHeroStrength(int strength) {
		this.heroStrength = strength;
	}
	public void setHeroAgility(int agility) {
		this.heroAgility = agility;
	}
	public void setHeroSide(String side) {
		this.heroSide = side;
	}
	public String getFormatedHeroDetails() {
		return String.format("Hero Name : %s\nHero Speed : %d\nHero Primary Attribute : %s\nHero Attributes(Strength - Agility - Intelligence) : %d - %d - %d\nHero Side : %s\n",heroName,heroSpeed,heroPrimaryAttribute,heroStrength,heroAgility,heroIntelligence,heroSide);
	}
	public void setHeroPrimaryAttribute(String primaryAttribute) {
		this.heroPrimaryAttribute = primaryAttribute;
	}
}
