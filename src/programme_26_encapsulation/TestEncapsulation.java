package programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //Setting values of the variables
        obj.setName("Jitesh");
        obj.setAge(25);
        obj.setRollNo(53);
        //Displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's Rollno: " + obj.getRollNo());
        //Direct access of rollNo is not possible due to encapsulation
    }
}