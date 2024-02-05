public class CheckPassword {
  public static boolean longEnough(String password) {
    int length = password.length();

    return (length >= 12);
  }

  public static boolean atLeastTwoDigits(String password) {
    int numDigits = 0;
    // .toCharArray() was found on https://stackoverflow.com/questions/2451650/how-do-i-apply-the-for-each-loop-to-every-character-in-a-string#:~:text=forEach(i%20%2D%3E%20System.,the%20characters%20in%20a%20String%20.
    for (char character : password.toCharArray()) {
      if (Character.isDigit(character)) {
        numDigits++;
      }
      if (numDigits >= 2) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    String inputtedPassword = "";
    try {
      inputtedPassword = args[0];
    }
    catch (Exception e) {
      System.err.println("Usage: java CheckPassword <password>");
      System.exit(1);
    }

    if (longEnough(inputtedPassword) && atLeastTwoDigits(inputtedPassword)) {
      System.out.println("Password is valid");
    }
    else {
      System.out.println("Password is not valid");
      System.exit(1);
    }
  }
}
