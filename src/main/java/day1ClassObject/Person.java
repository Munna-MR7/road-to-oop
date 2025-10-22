package day1ClassObject;
public class Person {
    String name;
    int age;
    String address;
    void introduce(){//String name, String address
        System.out.println();

        System.out.println("I am " + name + ", I Live in " + address);

    }
    @Override
    public String toString(){
        return "Person{" +
                "name = " +name + "\n"+
                ", age = " + age + "\n"+
                ", address = " + address +
                "}";
    }
}

