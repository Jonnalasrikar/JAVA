class StringMethods {
  public static void main(String args[]) {
    String a = "Srikar"; // strings are immutable
    // String b = new String("JONNALA");
    System.out.println(a);
    System.out.println(a.length());
    String b = a.toUpperCase();
    System.out.println(b);
    System.out.println(a.toLowerCase());

    String name = "       jonnala         ";
    System.out.println(name);
    System.out.println(name.trim());// removes the leading and trailing spaces

    String college = "kalasalingam";
    System.out.println(college.substring(2));
    System.out.println(college.substring(0));
    System.out.println(college.substring(1, 3)); // start is included and end is excluded

    System.out.println(college.replace('l', 's'));// replaces the all the occurances old char with new char and returns
    System.out.println(college.replace("l", "sri"));
    System.out.println(college.startsWith("s"));
    System.out.println(college.endsWith("am"));

    System.out.println(college.charAt(2));

    // indexOf returns the index of the first occurance of the char
    System.out.println(college.indexOf("m"));// if match is not available it returns -1
    System.out.println(college.indexOf("j"));

    String m = "Harryrryahah";
    System.out.println(m.indexOf("rry", 4));// start
    // lastIndexOf() returns the last index of the given string
    System.out.println(m.lastIndexOf("ah"));
    System.out.println(m.lastIndexOf("ah", 7));
    System.out.println(college.equals("kalasalingam"));
    System.out.println(college.equalsIgnoreCase("KALASalingam"));
  }
}
