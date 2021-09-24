Public class reverse {
  public static void main(String[] args) {

    String str01 = "program", reverseStr01 = "";
    
    int str01Length = str.length();

    for (int i = (str01Length - 1); i >=0; --i) {
      reverseStr01 = reverseStr01 + str.charAt(i);
    }

    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str01 + " is a Palindrome String.");
    }
    else {
      System.out.println(str01 + " is not a Palindrome String.");
    }
  }
}
