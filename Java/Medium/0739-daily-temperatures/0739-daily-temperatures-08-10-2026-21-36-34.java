class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] waitDays = new int[temperatures.length];
        Deque<Integer> daysQ = new ArrayDeque<>();

        for (int i = 0; i < waitDays.length; i++) {
            while (!daysQ.isEmpty() && temperatures[daysQ.peek()] < temperatures[i]) {
                waitDays[daysQ.peek()] = i - daysQ.pop();
            }
            daysQ.push(i);
        }
        return waitDays;
    }
}