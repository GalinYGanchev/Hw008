public class Main {

	public static void main(String[] args) {
		
        String firstWord = "Carwash";
        String secondWord = "Car";
       

        String fullPhrase = firstWord + " " + secondWord;
        System.out.println("The two words are : " + fullPhrase);
        boolean blnFound = firstWord.contains(secondWord);
        System.out.println("First Word contains Second Word? : " + blnFound);
        
	}
}
