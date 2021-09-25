package Main;

import HeroBuilders.*;
import Stages.Stages;
import Hero.Hero;
public class Main {
	public static void main(String[] args) {
		while(true) {
		Builder generatedBuilder = Stages.FirstStage();
		Hero buildedHero = Stages.BuildStage(generatedBuilder);
		Stages.StoreStage(buildedHero);
		}
	}
}
