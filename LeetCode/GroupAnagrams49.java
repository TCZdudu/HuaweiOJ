import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.*;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        String[] temp;
        String key;
        Map<String, List<String>> res = new HashMap<>();
        for (String str:strs) {
            temp = str.split("");
            Arrays.sort(temp);
            key = String.join("", temp);
            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
