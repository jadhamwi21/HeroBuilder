package HeroBuilders;

import Hero.Hero;

public abstract class Builder {
	Hero currentBuildingHero = new Hero();
	public Builder setHeroName(String name) {
		currentBuildingHero.setHeroName(name);
		return this;
	}
	public Builder setHeroSpeed(int speed) {
		currentBuildingHero.setHeroSpeed(speed);
		return this;
	}
	public Builder setHeroIntelligence(int intelligence) {
		currentBuildingHero.setHeroIntelligence(intelligence);
		return this;
	}
	public Builder setHeroStrength(int strength) {
		currentBuildingHero.setHeroStrength(strength);
		return this;
	}
	public Builder setHeroAgility(int agility) {
		currentBuildingHero.setHeroAgility(agility);
		return this;
	}
	public Builder setHeroSide(String side) {
		currentBuildingHero.setHeroSide(side);
		return this;
	}
	public Hero getHero() {
		return currentBuildingHero;
	}
	public abstract void setHeroPrimaryAttribute();
}
