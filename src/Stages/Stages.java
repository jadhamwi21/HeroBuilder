package Stages;

import HeroBuilders.*;
import IO.Utility;
import FilesHandler.FileHandler;
import Hero.Hero;

public class Stages {
	public static Builder FirstStage() {
		int SelectedHeroType = Utility.ReadInteger("Select The Type Of Hero You Want To Buld\n1 - Strength\n2 - Agility\n3 - Intelligence");
		String BuilderType = BuilderFactory.NumberToBuilderType(SelectedHeroType);
		// If The User Input Was Invalid Keep Retrying With The Input
		while(BuilderFactory.isInvalidSelection(BuilderType) == true) {
			Utility.ShowPrompt("Invalid Selection, Please Retry");
			SelectedHeroType = Utility.ReadInteger("Select The Type Of Hero You Want To Buld\n1 - Strength\n2 - Agility\n3 - Intelligence");
			BuilderType = BuilderFactory.NumberToBuilderType(SelectedHeroType);
			}
		return BuilderFactory.Factory(BuilderType);
		}
	public static Hero BuildStage(Builder selectedBuilder) {
		selectedBuilder.setHeroPrimaryAttribute();
		selectedBuilder = Utility.AddHeroProps(selectedBuilder);
		return selectedBuilder.getHero();
	}
	public static void StoreStage(Hero hero) {
		boolean StoringSuccessful = FileHandler.AddHeroToFile(hero);
		if(StoringSuccessful) {
			System.out.printf("Successfully Saved Your Hero.\nHero Details :\n%s",hero.getFormatedHeroDetails());
		}
	}
}
