import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> numList = new ArrayList();
		
		for (int num : arr) {
		    if (numList.isEmpty()) {
		        numList.add(num);
		    }
		    else if (numList.get(numList.size() - 1) != num) {
		        numList.add(num);
		    }
		}
        
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}