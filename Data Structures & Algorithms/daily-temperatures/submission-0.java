class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int prevDay =  st.pop();
                ans[prevDay] = i-prevDay;
            }
            st.push(i);
        }
        return ans;
    }
}
