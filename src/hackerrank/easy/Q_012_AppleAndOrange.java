package hackerrank.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_012_AppleAndOrange {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nHouse location starts at  ");
        int s = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("House location ends at  ");
        int t = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("\nApple tree is located at  ");
        int a = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("Orange tree is located at  ");
        int b = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("\nEnter the Number of apples ");
        int a1 = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> apples = new ArrayList<>();

        for (int i = 0; i < a1; i++){
            System.out.println("Enter the " + (i + 1) + " apple distance ");
            int dis = Integer.parseInt(bufferedReader.readLine());
            apples.add(dis);
        }

        System.out.println("\nEnter the Number of oranges ");
        int o1 = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> oranges = new ArrayList<>();

        for (int i = 0; i < o1; i++){
            System.out.println("Enter the " + (i + 1) + " orange distance ");
            int dis = Integer.parseInt(bufferedReader.readLine());
            oranges.add(dis);
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }

    private static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int apple = 0, orange = 0;
        for (int i = 0; i < apples.size(); i++){
            int distance = a + apples.get(i);
            if(distance >= s && distance <= t){
                apple++;
            }
        }
        System.out.println("\nNumber of apples land on House are " + apple);
        for (int i = 0; i < oranges.size(); i++){
            int distance = b + oranges.get(i);
            if(distance >= s && distance <= t){
                orange++;
            }
        }
        System.out.println("Number of Oranges land on House are " + orange);
    }

}
