package lesson4;

public class Employee {
    private String fullName;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    String getFullName() {
        return fullName;
    }

    String getPosition() {
        return position;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    int getSalary() {
        return (int) salary;
    }

    int getAge() { return (int) age; }

    String getFullInfo() {
        return this.fullName + ", " + this.position + ", " + this.phoneNumber + ", " + this.salary + ", " + this.age;
    }
}
