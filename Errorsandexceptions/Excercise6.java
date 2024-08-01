/*
custom calculator-you have to create custom calculator  which throws the following exceptions and operations:
1.addition(+)
2.subtraction(-)
3.multiplication(*)
4.division(/)

which throws following exceptions:
1.invalid input ex:8&9
2.division by zero ex:9/0
3.max input exception: if the any of the input is grater than 100000
4.max multipler reached exception-don't allow the multipler to be greater than 7000
*/

class Excercise6 {
  public static void main(String args[])
      throws InvalidInputException, cannotDivideByException, maxInputException, maxMultiplyInputException {
    customCalculator c = new customCalculator();
    // c.add(8, 7);
    // c.divide(9, 0);
    c.multiply(7200, 2);
  }
}

class customCalculator {
  double add(double a, double b) throws InvalidInputException, maxInputException {
    if (a > 100000 || b > 100000) {
      throw new maxInputException();
    }
    if (a == 8 || b == 9) {
      throw new InvalidInputException();
    }
    return a + b;
  }

  double substract(double a, double b) throws maxInputException {
    if (a > 100000 || b > 100000) {
      throw new maxInputException();
    }
    return a - b;
  }

  double multiply(double a, double b) throws maxInputException, maxMultiplyInputException {
    if (a > 100000 || b > 100000) {
      throw new maxInputException();
    } else if (a > 7000 || b > 7000) {
      throw new maxMultiplyInputException();
    }
    return a * b;
  }

  double divide(double a, double b) throws cannotDivideByException, maxInputException {
    if (a > 100000 || b > 100000) {
      throw new maxInputException();
    }
    if (b == 0) {
      throw new cannotDivideByException();
    }
    return a / b;
  }
}

class InvalidInputException extends Exception {
  @Override
  public String toString() {
    return "Invalid input";
  }

  public String getMessage() {
    return "Invalid input";
  }
}

class cannotDivideByException extends Exception {
  @Override
  public String toString() {
    return "cannot divide by zero";
  }

  public String getMessage() {
    return "cannot divide by zero";
  }
}

class maxInputException extends Exception {
  @Override
  public String toString() {
    return "Max input reached";
  }

  public String getMessage() {
    return "Max input reached";
  }
}

class maxMultiplyInputException extends Exception {
  @Override
  public String toString() {
    return "Max multiple reached";
  }

  public String getMessage() {
    return "Max multiple reached";
  }
}