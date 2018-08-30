import java.util.Scanner;
public class StringChallenges
	{

		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				useInsideVoice();
				printVerticalText();
				countVowels();
			}
		public static void useInsideVoice()
		{
			System.out.println("Please enter some text.");
			String textToChange = userInput.nextLine();
			
			String firstLetter = textToChange.substring(0,1);
			String textToLower = textToChange.substring(1,textToChange.length());
			
			firstLetter = firstLetter.toUpperCase();
			textToLower = textToLower.toLowerCase();
			
			System.out.println(firstLetter + textToLower);
		}
		public static void printVerticalText()
		{
			System.out.println("Enter some text for me to make vertical!");
			String horizText = userInput.nextLine();
			
			for (int i = 0; i < horizText.length(); i++)
				{
					System.out.println(horizText.substring(i, i+1));
				}
		}
		public static void countVowels()
		{
			System.out.println("Enter some text and I'll count how many vowels are in it!");
			String textToCount = userInput.nextLine();
			int vowelCounter = 0;
			
			for (int i = 0; i < textToCount.length(); i++)
				{
					String letterToTest = textToCount.substring(i, i + 1);
					if ((letterToTest.equalsIgnoreCase("a")) || (letterToTest.equalsIgnoreCase("e")) || (letterToTest.equalsIgnoreCase("i")) || (letterToTest.equalsIgnoreCase("o")) || (letterToTest.equalsIgnoreCase("u")))
						{
							vowelCounter = vowelCounter + 1;
							//System.out.println(textToCount.substring(i, i+1));
						}
				}
			System.out.println("There were "+vowelCounter+" vowel(s) in that text.");
		}

	}
