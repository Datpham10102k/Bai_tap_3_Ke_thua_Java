//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(2.0f, 3.0f);
        System.out.println("Point: " + p1);

        MoveablePoint mp1 = new MoveablePoint(2.0f, 3.0f, 0.5f, 1.0f);
        System.out.println("Before move: " + mp1);

        mp1.move();
        System.out.println("After move: " + mp1);
    }
}