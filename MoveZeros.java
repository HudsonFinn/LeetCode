
class MoveZeros {
    /*
    Easy.
    Given an array nums, write a function to move all 0's to the end of it
    while maintaining the relative order of the non-zero elements.
    */
    public void moveZeros(int[] nums) {
      int position = 0;
      int value = 0;
      for (int i = 0; i < nums.length; i++) {
          if (nums[i] != 0) {
              value = nums[i];
              nums[i] = 0;
              nums[position] = value;
              position++;
          }
      }
    }

    public static void main(String[] args) {
      MoveZeros test = new MoveZeros();
      int[] nums = new int[] {0,1,0,3,12};
      test.moveZeros(nums);
    }
}
