import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

// This coding challenge is from HackerRank https://www.hackerrank.com
// 
// Given an array of integers, this program calculates the respective mean, median, and mode. If the array has more than one modal value then the smallest integer is chosen.
// Written by Gavin Dunnett
public class MeanMedianMode {

    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		System.out.println("// Given an array of integers, this program calculates the respective mean, median, and mode. If the array has more than one modal value then the smallest integer is chosen.");

        List<Integer> x = new ArrayList<>();
        
        Scanner sc = new Scanner(new File("input04.txt"));
        final int N = sc.nextInt();
        while (sc.hasNextInt()) x.add(sc.nextInt());

		System.out.println("Number of integers given: " + x.size());
        
        Collections.sort(x);
        
        float mean = 0f;
        float sum = 0f;
        for (Integer i : x) sum += i;
        mean = sum / N;
        System.out.format("%.1f\n", mean);
        
        float median = 0f;       
        if (N%2 != 0) {
            median = x.get(N/2);
        } else {
            int a = (N/2) - 1;
            int b = a + 1;
            median = (x.get(a) + x.get(b)) / 2.0f;
        }
        System.out.format("%.1f\n", median);
        
        int mode = 0;
        HashMap<Integer, Integer> xBuckets = new HashMap<>();
        for (Integer i : x) {
            int oldVal = xBuckets.getOrDefault(i, 0);
            xBuckets.put(i, oldVal + 1);
        }
        int fullestBucketValue = Collections.max(xBuckets.values());
        List<Integer> fullestBucketList = new ArrayList<>();
        for (Integer key : xBuckets.keySet()) {
            if ( xBuckets.get(key) == fullestBucketValue) {
                fullestBucketList.add(key);
            }
        }
        mode = Collections.min(fullestBucketList);
        System.out.println(mode);        
    }
}