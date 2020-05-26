
class MoveZeros {
    /*
    Easy.
    Given two strings S and T, return if they are equal when both are typed
    into empty text editors. # means a backspace character.
    */
    public boolean backspaceCompare(String S, String T) {
      int length = (Math.max(S.length(), T.length()));
      int sPoint = 0;
      int tPoint = 0;
      char[] sChars = S.toCharArray();
      char[] tChars = T.toCharArray();
      for (int i = 0; i < length; i++) {
          if (i < S.length()) {
              if (sChars[i] != '#') {
                  sChars[sPoint] = sChars[i];
                  sPoint ++;
              } else {
                  if (sPoint > 0) sPoint--;
              }
          }
          if (i < T.length()) {
              if (tChars[i] != '#') {
                  tChars[tPoint] = tChars[i];
                  tPoint ++;
              } else {
                  if (tPoint > 0) tPoint--;
              }
          }
      }
      S = String.valueOf(sChars).substring(0, sPoint);
      T = String.valueOf(tChars).substring(0, tPoint);
      System.out.println(S);
      System.out.println(T);
      if (S.equals(T)) return true;
      return false;
    }
}
