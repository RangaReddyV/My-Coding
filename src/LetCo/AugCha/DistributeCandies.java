package LetCo.AugCha;

public class DistributeCandies {

    public int[] distributeCandies(int candies, int num_people) {
        int[] distCandies = new int[num_people];
        int count = 0;
        int i = 1;
        while (candies > 0) {
            if (count > num_people - 1)
                count = 0;
            if (candies > i)
                distCandies[count] = distCandies[count] + i;
            else
                distCandies[count] = distCandies[count] + candies;

            candies = candies - i;
            i++;
            count++;
        }
        return distCandies;
    }

    public static void main(String[] args) {

    }
}
