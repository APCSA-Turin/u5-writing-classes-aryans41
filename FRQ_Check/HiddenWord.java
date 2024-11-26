package FRQ_Check;
public class HiddenWord {
    private String hiddenWord;

   public HiddenWord(String word) {
       hiddenWord = word;
   }

   public String getHint(String guess) {
       String hint = ""; 
       for (int i = 0; i < guess.length(); i++) {
           String wordChar = hiddenWord.substring(i, i+1); 
           String guessChar = guess.substring(i, i+1);
           if (wordChar.equals(guessChar)) { 
               hint += guessChar;
           } else if (hiddenWord.indexOf(guessChar) != -1) {
               hint += "+";
           } else {
               hint += "*";
           }
       }
    return hint;
   }
}
