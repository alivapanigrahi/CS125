public class CS125Practice {
  public static void main (String args[]) {
    // HW 1| Welcome to CS 125!
    System.out.println("Hello, CS 125!")

    // HW 2| Basic Math: Area of Rug
    int width = 10;
    int height = 8;
    System.out.println(width * height);

    // HW 3| Conditional Logic: Should Tom Brady Retire?
    int tomBradyAge = 50;
    if (tomBradyAge >= 50) {
      System.out.println("Tom Brady should retire");
    } else {
      System.out.println("Tom Brady will still beat you")
    }

    // HW 4| Java Primitive Types
    int count = 8;
    double temperature = 34.3;
    char letter = 'A';
    boolean isCS125Awesome = true;

    // HW 5| Simple Conditional Expressions: Which is Bigger?
    boolean print = true;
    int x = 10;
    int y = 5;
    if (print) {
      if (x > y) {
        System.out.println("Bigger");
      } else {
        System.out.println("Smaller");
      }
    }

    // HW 6| Simple Conditional Expressions: the Center of the Universe
    double latitude = 40.113906;
    double longitude = -88.224778;
    if (latitude = 40.113906 && longitude = -88.224778) {
      System.out.println("Working on CS 125");
    } else {
      System.out.println("Taking a break");
    }

    // HW 7| Simple Conditional Expressions: Time to Semester
    long currentTime = 1535378400;
    if (currentTime >= 1535378400 && currentTime <= 1545343200) {
      System.out.println("Fall 2018");
    } else if (currentTime >= 1547474400 && currentTime <= 1557525600) {
      System.out.println("Spring 2019");
    }

    // HW 8| Compound Conditional Expressions: Your Letter Grade
    double percent = 100.0;
    if (percent > 90.0) {
      System.out.println('E');
    } else if (percent > 80.0) {
      System.out.println('V');
    } else if (percent > 70.0) {
      System.out.println('S');
    } else if (percent > 60.0) {
      System.out.println('N');
    } else {
      System.out.println('U');
    }

    // HW 9| Compound Conditional Expressions: Largest of Three
    int first = 10;
    int second = 20;
    int third = 30;
    if(first > second && first > third) {
      System.out.println(first);
    } else if (second > first && second > third) {
      System.out.println(second);
    } else if (third > first && third > second) {
      System.out.println(third);
    } else {
      System.out.println(first);
    }

    // HW 10| Victory Loop
    int i = 0;
    int repeat = 10;
    while (i < repeat) {
      System.out.println("victory");
      i++;
    }

    // HW 11| Array Sum
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;
    for (int i: numbers) {
      sum += i;
    }
    System.out.println(sum);

    // HW 12| Basic Array Usage
    int[] numbers = {0, 8, 9, 4, 5};
    double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
    System.out.println(values[0]);

    // HW 13| Array Maximum
  }
}
