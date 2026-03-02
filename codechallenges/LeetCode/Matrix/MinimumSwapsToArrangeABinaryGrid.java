package Matrix;

public class MinimumSwapsToArrangeABinaryGrid {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int[] zeroes = new int[n];
        for(int i = 0; i < n; ++i){
            int counter = 0;
            for(int j = n - 1; j >= 0; --j){
                if(grid[i][j] != 0) break;
                counter++;
            }
            zeroes[i] = counter;
        }
        int numNeeded  = n - 1;
        int ans = 0;
        while(numNeeded > 0){
            boolean flag = false;
            for(int i = n - numNeeded - 1; i < n; ++i){
                if(zeroes[i] >= numNeeded){
                    int temp = zeroes[i];
                    for(int k = i; k > n - numNeeded - 1; --k)
                        zeroes[k] = zeroes[k - 1];
                    zeroes[n - numNeeded - 1] = temp;
                    flag = true;
                    ans += i - (n - numNeeded - 1);
                    break;
                }
            }
            if(!flag) return -1;
            numNeeded--;
        }
        return ans;

    }
}
