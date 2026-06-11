import java.util.*;
public class StringDupe {
    public static void main(String[] args) {
        String sentence = ("This is Training  session,the training session is on java DSA,java is a high level programming language");
        String[] arr= sentence.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<>();

        for(String word:arr){
            uniqueWords.add(word.toLowerCase());
        }
        System.out.println(uniqueWords);
     }
}
