package leetCode.array;

import java.util.Arrays;
import java.util.List;

public class MatchingItem {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int matchNo=0;
        int search = switch (ruleKey) {
            case "color" -> 1;
            case "name" -> 2;
            default -> 0;
        };

        for(int i=0;i<items.size();++i){
            List<String> item=items.get(i);
            if(item.get(search).equals(ruleValue)){
                matchNo++;
            }

        }
    return matchNo;
    }


}
