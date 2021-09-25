package IO;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import HeroBuilders.Builder;
public class Utility {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void ShowPrompt(String msg) {
		System.out.println(msg);
	}
	public static String ReadString(String msg) {
		ShowPrompt(msg);
		return scanner.nextLine();
	}
	public static int ReadInteger(String msg) {
		Integer InputValue = null;
		while(InputValue == null) {
			ShowPrompt(msg);
			try {
				InputValue = Integer.valueOf(scanner.nextInt());
			}catch(InputMismatchException e) {
				InputValue = null;
				ShowPrompt("The Input Should Be A Number");
			}
			scanner.nextLine();
		}
		return Integer.valueOf(InputValue);
	}
	public static String createHeroesSeperator() {
		char[] Dashes = new char[75];
		Arrays.fill(Dashes,'-');
		String result = String.valueOf(Dashes);
		return result + "\n";
	}
	public static Builder AddHeroProps(Builder builder) {
		String HeroName = ReadString("Hero Name :");
		int HeroSpeed = ReadInteger("Hero Speed :");
		int IntAttributes = ReadInteger("Hero Intillegence Attribute : ");
		int StrAttributes = ReadInteger("Hero Strength Attribute : ");
		int AgiAttributes = ReadInteger("Hero Agility Attribute : ");
		String HeroSide = ReadString("Hero Side :");
		builder.setHeroName(HeroName);
		builder.setHeroSpeed(HeroSpeed);
		builder.setHeroAgility(AgiAttributes);
		builder.setHeroStrength(StrAttributes);
		builder.setHeroIntelligence(IntAttributes);
		builder.setHeroSide(HeroSide);
		return builder;
		
	}
}
