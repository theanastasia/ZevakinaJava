package lesson4;

public class Main {
    public static void main(String[] args) {

        Employee mainEmployee = new Employee("Петров Петр Петрович", "Президент", "89999999994", 100000, 100);

        System.out.println("Главный на Земле: " + mainEmployee.getFullName() + ", " + mainEmployee.getPosition());

        Employee[] employees = {
        new Employee("Зевакина Анастасия Александровна", "Управляющий ресторана", "89999999999", 50000, 48),
        new Employee("Сидоров Петр Анатольевич", "Заместитель управляющего ресторана", "89999999998", 40000, 41),
        new Employee("Кузьмин Иван Георгиевич", "Бармен", "89999999997", 30000, 25),
        new Employee("Герасимова Дарья Юрьевна", "Официант", "89999999996", 20000, 21),
        new Employee("Зиновьев Олег Александрович", "Охранник", "89999999995", 10000, 55),
        };

        for (Employee employee : employees)
            if (employee.getAge() > 40) {
                System.out.println(employee.getFullInfo());
            }
    }
}