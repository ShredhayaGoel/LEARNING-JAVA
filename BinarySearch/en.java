package BinarySearch;


    
class Student {
    // private data members
    private String name;
    private int age;

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setAge(int age) {
        this.age = age;
    }

    // getter method
    public int getAge() {
        return age;
    }
}

public class en {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Rahul");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

