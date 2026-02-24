package ArraysAndHashing;

//O(n^2)
public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            for(int j = i; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i]){
                    result[i] = j - i;
                    break;
                }
            }
        }
        return result;
    }
}

//public int[] dailyTemperatures(int[] temperatures) {
//    Stack<Integer> stack = new Stack<>();
//    int[] result = new int[temperatures.length];
//
//    for (int i = 0; i < temperatures.length; i++) {
//        while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
//            int idx = stack.pop();
//            result[idx] = i - idx;
//        }
//        stack.push(i);
//    }
//
//    return result;
//}