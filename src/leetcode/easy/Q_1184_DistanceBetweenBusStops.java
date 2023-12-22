package leetcode.easy;

public class Q_1184_DistanceBetweenBusStops {

    public static void main(String[] args) {

    }

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockWise = 0;
        int totalDistance = 0;

        for(int i = 0; i < distance.length; i++){
            if(start < destination && (i >= start && i < destination)){
                clockWise += distance[i];
            }

            if(start > destination && (i >= start || i < destination)){
                clockWise += distance[i];
            }

            totalDistance += distance[i];
        }

        return Math.min(clockWise, totalDistance - clockWise);
    }
}
