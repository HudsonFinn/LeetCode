
class HappyNumber {
    /*
    Easy.
    A happy number is a number defined by the following process:
    Starting with any positive integer, replace the number by the sum of the
    squares of its digits, and repeat the process until the number equals 1
    (where it will stay), or it loops endlessly in a cycle which does not
    include 1. Those numbers for which this process ends in 1 are happy numbers.

    Return True if n is a happy number, and False if not.
    */
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int current = n;
        n = 0;
        while (n != 1) {
            n = 0;u
            while (current >= 1) {
                int val = current % 10;
                n += (val * val);
                current /= 10;
            }
            current = n;
            if (set.contains(n)) return false;
            set.add(current);
        }
        return true;
    }

    public static void main(String[] args) {
      HappyNumber test = new HappyNumber();
      test.isHappy(2);
    }
}
