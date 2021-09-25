package FilesHandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Hero.Hero;
import IO.Utility;

public interface FileHandler {
	public String heroesFileName = "HeroesList.txt";
	public static boolean CreateAndOpenHeroesFile() {
		try {
		File heroesListFile = new File(heroesFileName);
		heroesListFile.createNewFile();
		return true;
		}catch(IOException e) {
			System.out.println("error : an error occured while opening or creating the file");
			return false;
		}
	}
	public static boolean AddHeroToFile(Hero hero) {
		boolean isSuccessful = CreateAndOpenHeroesFile();
		if(isSuccessful) {
			try {
				FileWriter heroesWriter= new FileWriter(heroesFileName,true);
				heroesWriter.write(hero.getFormatedHeroDetails() + Utility.createHeroesSeperator());
				heroesWriter.close();
				return true;
			}catch(IOException e) {
				System.out.println("error : error creating file writer");
				return false;
			}
		}
		return false;
	}
}
