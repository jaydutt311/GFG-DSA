class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n = deadline.length;
        int[][] jobs = new int[n][2];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = deadline[i];
            jobs[i][1] = profit[i];
        }
        Arrays.sort(jobs, (a, b) -> b[1] - a[1]);
        int maxDeadline = 0;
        for (int d : deadline) {
            maxDeadline = Math.max(maxDeadline, d);
        }
        boolean[] slot = new boolean[maxDeadline + 1];
        int jobsDone = 0;
        int totalProfit = 0;
        for (int[] job : jobs) {
            int d = job[0];
            int p = job[1];
            for (int j = d; j > 0; j--) {
                if (!slot[j]){
                    slot[j] = true;
                    jobsDone++;
                    totalProfit += p;
                    break;
                }
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(jobsDone);
        result.add(totalProfit);
        return result;
     }
}
