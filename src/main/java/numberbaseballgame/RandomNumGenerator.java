package numberbaseballgame;

import java.util.HashSet;
import java.util.Set;

public class RandomNumGenerator {

    public String generateRandomNum() {
        Set<Integer> set = new HashSet<>();

        while (set.size() < 3) {
            int randomNum = getRandomNum();
            set.add(randomNum);
        }

        return setToString(set);
    }

    private String setToString(Set<Integer> set) {
        String randomNums = "";
        for (Integer num : set) {
            randomNums += String.valueOf(num);
        }
        return randomNums;
    }

    private int getRandomNum() {
        int randomNum;
        do {
            randomNum = (int) (Math.random() * 10) % 10;
        } while (!validateRange(randomNum));
        return randomNum;
    }

    private boolean validateRange(int randomNum) {
        if(randomNum == 0) {
            return false;
        }
        return true;
    }
}
