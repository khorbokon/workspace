package Task33;

public class hString
{
    public static int wordsInPhrase (String st){
        int count_st = 0;
        st = st.trim();
        for (int i=0; i<(st.length()-1); i++){
            if ((st.charAt(i) ==' ') && (st.charAt(i) != st.charAt(i+1))){
                count_st++;
            }
        }
        return count_st;
    }

    public static int symbolsCountInSpecWord (String st, int requiredWordNumber) {
        int symbolsCount = 0;
        int currentWordNumber = 0;
        st = st.trim();
        for (int j = 0; j < (st.length() - 1); j++) {
            if ((st.charAt(j) != ' ') || (j == st.length())) {
                symbolsCount++;
            }
            if ((st.charAt(j) == ' ')) {
                currentWordNumber++;
                if (currentWordNumber == requiredWordNumber) {
                    break;}
                symbolsCount = 0;
                if ((st.charAt(j) == ' ') && (st.charAt(j + 1) == ' ')) {
                    currentWordNumber--;}
            }
        }
        int wordsAmount = wordsInPhrase(st);
        wordsAmount ++;
        if (wordsAmount < requiredWordNumber){
            symbolsCount = 0;
        }
        return (symbolsCount);
    }

    // task: symbols in word by given index
    public static void main(String[] args) {

        String st =" just few  words  and a lot of spases in the end      ";
        int count_st = wordsInPhrase(st);

        System.out.println("Phrase: ");
        System.out.println(st);

        int requiredWordNumber =5;
        int symbolsCount =0;
        symbolsCount = symbolsCountInSpecWord(st, requiredWordNumber);
        if (symbolsCount == 0){
            System.out.print(" No data to dysplay. There only ");
            System.out.print(count_st+1);
            System.out.print(" words in phrase. But required word number is ");
            System.out.println(requiredWordNumber);
            System.out.print("\r");
        }
        else {
            System.out.print(" There ");
            System.out.print(symbolsCount);
            System.out.print(" symbol(s) in word with index ");
            System.out.println(requiredWordNumber);
            System.out.print("\r");
        }
    }

}
