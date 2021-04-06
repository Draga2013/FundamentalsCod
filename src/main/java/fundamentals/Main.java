package fundamentals;

public class Main {
    public static void main(String[] args) {
//        static vs non static fields and methods
        TasksExerc tasksExerc1 = new TasksExerc();
        TasksExerc tasksExerc2 = new TasksExerc();
        System.out.println("x = " + tasksExerc1.x);
        System.out.println("y = " + tasksExerc1.y);
        System.out.println("y = " + tasksExerc2.y);
        tasksExerc1.x = 22;
        TasksExerc.y = 3;
        System.out.println("x1 = " + tasksExerc1.x);
        System.out.println("x2 = " + tasksExerc2.x);
        System.out.println("y1 = " + tasksExerc1.y);
        System.out.println("y2 = " + tasksExerc2.y);

//        Task1

        tasksExerc1.circleParametre();
    }
}
