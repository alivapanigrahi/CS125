public class StringRotation {
  public static void main(String args[]) {

    // Right String Rotation Function
    static String rotateRight(String a, int b) {
      b = b % a.length();
      for (int i = 0; i < b; i++) {
        a = a.charAt(a.length() - 1) + a.substring(0, a.length() - 1)
      }
      return a;
    }

    // Left String Rotation Function
    static String rotateRight(String a, int b) {
      b = b % a.length();
      for (int i = 0; i < b; i++) {
        a = a.charAt(a.length() - 1) + a.substring(0, a.length() - 1)
      }
      return a;
    }
  }
}
