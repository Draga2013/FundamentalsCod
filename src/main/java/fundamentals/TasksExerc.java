package fundamentals;

import java.util.Scanner;

public class TasksExerc {
    public static final float pi = (float) Math.PI;
    int x = 10;
    static int y = 1;
//    Write an application that will read diameter of a circle (variable of type float)
//    and calculate perimeter of given circle. Firstly, assume π = 3.14. Later,
//    use value of π from built-in Math class
//    The perimeter is

    public static void circleParametre(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter");
        float diameter = scanner.nextFloat();
        System.out.println("The perimeter is : " +diameter * pi);

    }
}
