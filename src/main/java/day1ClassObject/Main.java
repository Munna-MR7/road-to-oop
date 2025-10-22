package day1ClassObject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> person = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            Person p = new Person();
            //Scanner scc = new Scanner(System.in);

            System.out.println("Enter name: ");
            p.name = sc.nextLine();

            System.out.println("Enter age: ");
            p.age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter address: ");
            p.address = sc.nextLine();

            person.add(p);

            //System.out.println(p);
//            p.introduce();

        }
        for(Person p : person){
            System.out.println(p);
            p.introduce();
        }
    }
}
