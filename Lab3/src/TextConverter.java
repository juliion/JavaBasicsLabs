import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashSet;

public class TextConverter {
    public String convertToSetAndSort(String text) {
        String[] arrayOfWords = text.split(" ");
        Set setOfWords = new HashSet(Arrays.asList(arrayOfWords));
        TreeSet sortedSetOfWords = new TreeSet(setOfWords);
        String joinedSetOfWords = String.join(" ", sortedSetOfWords);
        return joinedSetOfWords;
    }
}
