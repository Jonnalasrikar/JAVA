class practiceset2 {
  public static void main(String args[]) {
    String name = "Jonnala Srikar    Reddy";
    name = name.toLowerCase();
    System.out.println(name);
    name = name.replace(" ", "_");
    System.out.println(name);
    System.out.println("Dear" + " " + name + " " + "Thanks a lot");
    String letter = "Dear <|name|>, Thanks a lot!";
    letter = letter.replace("<|name|>", "Srikar Jonnala");
    System.out.println(letter);

    String myString = "This string     contains      double and triple spaces";
    System.out.println(myString.indexOf("  "));
    System.out.println(myString.indexOf("   "));
    String myletter = "Dear srikar,\n\tThis java course is very nice.\n\tThanks a lot!";
    System.out.println(myletter);
  }
}