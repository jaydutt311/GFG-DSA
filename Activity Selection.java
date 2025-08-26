
class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        if (n == 0) return 0;
        if (n == 1) return 1;
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++){
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }
        Arrays.sort(activities, (a, b) -> {
            if (a[1] == b[1]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
    });
    int count = 1;
    int lastFinish = activities[0][1];
    for (int i = 1; i < n; i++){
        if (activities[i][0] > lastFinish){
            count++;
            lastFinish = activities[i][1];
        }
    }
    return count;
}
}
