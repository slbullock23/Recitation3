import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x:"); // creates a user input for x
        System.out.println("Enter y:"); // creates a user input for y
        int x = scan.nextInt(); // scans x for an integer
        int y = scan.nextInt(); // scans y for an integer

        Circle circle16 = new Circle(16.0); // creates circle16 with a radius 16
        circle16.setLocation(new Point(x, y)); // sets the location of circle16 as (x,y)
        Circle circle40 = new Circle(40.0); // creates circle40 with a radius 40
        circle40.setLocation(new Point(14, 12)); // sets the location of circle40 as (14,12)

        if (circle16.intersects(circle40)) // if circle16 intersects with circle40
        {
            System.out.println("Circles intersect!"); // print circles intersect
        } else // else condiiton
        {
            System.out.println("Circles do not intersect!"); // print circles do not intersect
        }
    }
}
