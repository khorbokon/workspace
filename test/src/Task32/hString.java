package Task32;

public class hString
{
    public static int wordsInPhrase (String st){
        int count_st = 0;

        st = st.trim();
        System.out.println("Phrase: ");
        System.out.println(st);

        for (int i=0; i<(st.length()-1); i++){
            if ((st.charAt(i) ==' ') && (st.charAt(i) != st.charAt(i+1))){
                count_st++;
            }
        }
        return count_st;
    }


    public static void main(String[] args) {

        // task: Count words in phrase
        String st ="   just    few words and a lot of spases in the end     ";
        int count_st = wordsInPhrase(st);

        System.out.print(" Words count is: ");
        System.out.println(count_st+1);
        System.out.print("\r");

    }

}
