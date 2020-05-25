public class Solution {
  public static int solution(int[] x, int[] y) {
        if (x == null || y == null) return 0;
        if (x.length == 0 && y.length == 0) return 0;
        if (x.length == y.length) return 0;

        int xVal = 0;
        int yVal = 0;
        int shortestLength = 0;

        if (x.length > y.length) {
            shortestLength = y.length;
            xVal += x[x.length-1];
        } else {
            shortestLength = x.length;
            yVal += y[y.length-1];
        }

        for (int i = 0; i < shortestLength; i++) {
            xVal += x[i];
            yVal += y[i];
        }

        if (x.length > y.length) {
            return xVal - yVal;
        } else {
            return yVal - xVal;
        }
      }


  public static void main(String[] args) {
        int[] nums = new int[] {14, 27, 1, 4, 2, 50, 3, 1};
        int[] nums2 = new int[] {2, 4, -4, 3, 1, 1, 14, 27, 50};
        System.out.println(Solution.solution(nums, nums2));
      }
}
