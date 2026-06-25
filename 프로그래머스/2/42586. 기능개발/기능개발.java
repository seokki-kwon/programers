import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    List<Integer> deployDays = new ArrayList<>();
    List<Integer> deployCounts = new ArrayList<>();

    for (int i = 0; i < progresses.length; i++) {
        deployDays.add((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
    }

    int currentIndex = 0;

    while (currentIndex < progresses.length) {
        currentIndex++;

        int deployCount = 1;
        int nextIndex = currentIndex;

        while (nextIndex < progresses.length
                && deployDays.get(nextIndex) <= deployDays.get(currentIndex - 1)) {
            deployCount++;
            nextIndex++;
        }

        deployCounts.add(deployCount);
        currentIndex = nextIndex;
    }

    return deployCounts.stream().mapToInt(i->i).toArray();
    }
}