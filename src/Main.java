import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int age = getAge();
//        System.out.print("Your age is " + age);

        Object[] userDetail = getUserDetails();
        String name = (String) userDetail[0];
        String surname = (String) userDetail[1];
        int age = (int) userDetail[2];

        System.out.print(name + " " + surname + " " + age);
    }

    public static int getAge() {
        System.out.print("Enter you age: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static Object[] getUserDetails() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter you name: ");
        String name = input.next();

        System.out.print("Enter you surname: ");
        String surname = input.next();

        System.out.print("Enter you age: ");
        int age = input.nextInt();

        Object[] obj = new Object[3];
        obj[0] = name;
        obj[1] = surname;
        obj[2] = age;

        return obj;
    }
}