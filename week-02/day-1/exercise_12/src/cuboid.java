import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This exerise will print out the surface area and volume of a cubicle;");
        System.out.println("Enter length of 1st edge:");

        double edge1 = input.nextDouble();

        System.out.println("Enter length of 2st edge:");

        double edge2 = input.nextDouble();

        System.out.println("Enter length of 3st edge:");

        double edge3 = input.nextDouble();

        double surface = (edge1*edge2) + (edge1*edge3) + (edge2*edge3);
        double volume = edge1*edge2*edge3;

        System.out.println("The surface of the cubicle is " + surface + ".");
        System.out.println("The volume of the cubicle is " + volume + ".");
    }
}
