import java.util.Scanner;
public class StringChallenges
	{

		static Scanner userInput = new Scanner(System.in);
		static boolean repeat = true;
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				Scanner userIntPut = new Scanner(System.in);
				
				do
					{
						System.out.println("Please pick a challenge you would like to see! \n "
								+ "1) Use Inside Voice \n"
								+ "2) Print Vertical text \n"
								+ "3) Count the Vowels");
						int userChoice = userIntPut.nextInt();
						switch (userChoice)
						{
							case 1:
								useInsideVoice();
								break;
							case 2:
								printVerticalText();
								break;
							case 3:
								countVowels();
								break;
							default:
								break;
						}
						askToRepeat(repeat);
					}
				while(repeat);
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
			if(vowelCounter != 1)
				{
					System.out.println("There were "+vowelCounter+" vowels in that text.");
				}
			else
				{
					System.out.println("There was "+vowelCounter+" vowel in that text.");
				}
		}
		public static boolean askToRepeat(boolean repeat)
		{
			System.out.println("That was fun! Would you like to play again? (yes/no)");
			String answer = userInput.nextLine();
			if (answer.contains)
			return true;
		}

	}
