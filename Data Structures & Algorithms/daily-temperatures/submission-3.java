public class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Pair> stack = new Stack<>();

        for(int i=0;i<n;i++){
            int t = temperatures[i];
            while(!stack.isEmpty() && t > stack.peek().first){
                Pair pair = stack.pop();
                res[pair.second] = i - pair.second;
            }
            stack.push(new Pair(t, i));
        }
        return res;
    }
}
