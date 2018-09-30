package Lesson5;

public class Employee {

    static String type = "Сотрудник";
    String surname;
    String name;
    String middleName;
    String position;
    String email;
    long phone;
    int salary;
    int age;

    public Employee(String _surname, String _name, String _middleName, String _position, String _email,
                    long _phone, int _salary, int _age) {
        surname = _surname;
        name = _name;
        middleName = _middleName;
        position = _position;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }

    void info() {
        if(age > 40) {
            System.out.println(surname + " " + name + " " + middleName + " " + position + " " + email +
                    " " + phone + " " + salary + " " + age);
        }
    }
}

class veter {
    public static void main(String[] args) {
        Employee[] mass1 = {
                new Employee("Вейде", "Виктор", "Андреевич",
                "Машинист крана автомобильного", "veideviktor@gmail.com",
                89324327000L, 70000, 24),
                new Employee("Иванов", "Иван", "Иванович",
                "Слесарь по ремонту ДВС", "ivanonv@mail.ru",
                89324300000L, 40000, 54),
                new Employee("Рябов", "Александр", "Александрович",
                "Механик", "sansan@yandex.ru",
                89324320010L, 80000, 59),
                new Employee("Бурганов", "Азат", "Казимович",
                "Начальник автокалонны", "azatkazim@gmail.com",
                89325360000L, 90000, 65),
                new Employee("Боева", "Анна", "Андреевна",
                "Диспетчер", "boevaanna@gmail.com",
                89224427000L, 40000, 22)};
        for (Employee a:mass1){

            a.info();
        }
    }
}