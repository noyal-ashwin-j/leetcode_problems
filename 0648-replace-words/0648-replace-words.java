import java.util.*;

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {

        Set<String> set = new HashSet<>(dictionary);
        String[] arr = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {

            String replace = arr[i];
            for (int j = 1; j <= replace.length(); j++) {

                String newWord = replace.substring(0, j);

                if (set.contains(newWord)) {
                    replace = newWord;
                    break;
                }
            }

            sb.append(replace);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}