import java.util.*;
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        int n = start.length;
        Arrays.sort(start);
        Arrays.sort(end);
        int rooms = 0;
         int maxRooms = 0;
         int i = 0, j = 0;
         while (i < n && j < n) {
             if (start[i] < end[j]) {
                 rooms++;
                 maxRooms = Math.max(maxRooms, rooms);
                 i++;
             } else {
                 rooms--;
                 j++;
             }
         }
         return maxRooms;
    }
}
