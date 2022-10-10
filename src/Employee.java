public class Employee {

    private String name;
    private String patronymic;
    private String surname;
    private int department;
    private int wage;
    private static int num;
    private int id;

    public Employee(String name, String patronymic, String surname, int department, int wage) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.department = department;
        this.wage = wage;
        this.id = num++;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public int getDepartment() {
        return department;
    }

    public int getWage() {
        return wage;
    }

    public int getId() {
        return id;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String toString() {
        return "(" +
                "Имя - " + getName() + " " + getPatronymic() + " " + getSurname() +
                ". Департамент - " + getDepartment() +
                ". Оклад - " + getWage() + ")";
    }

    public String getFullName() {
        return getName() + " " + getPatronymic() + " " + getSurname();
    }
}
