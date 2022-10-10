public class Main {
    private static Employee[] employees = new Employee[9];


    public static void main(String[] args) {

        employees[0] = new Employee("Мишуань", "Михайлович", "Каменев", 1, 67300);
        employees[1] = new Employee("Тони", "Владимирович", "Орлов", 1, 78500);
        employees[2] = new Employee("Вадюня", "Сергеевич", "Маркаров", 2, 71150);
        employees[3] = new Employee("Эм", "Михайлович", "Каменев", 2, 67300);
        employees[4] = new Employee("Вано", "Сергеевич", "Чирвин", 3, 85123);
        employees[5] = new Employee("Киря", "Эдуардович", "Хейккинен", 3, 75436);
        employees[6] = new Employee("Кареша", "Владимирович", "Буртыненко", 4, 77387);
        employees[7] = new Employee("Даня", "Владимирович", "Буртыненко", 4, 75642);
        employees[8] = new Employee("Дяхон", "Викторович", "Гнебедин", 5, 83675);

        System.out.println("Самый хорошо оплачиваемый работник - "+findTheBestPaidWorker()+
                ", с зарплатой в "+findMaxWage()+" руб.");
        System.out.println("Самый плохо оплачиваемый работник - "+findTheWorstPaidWorker()+
                ", с зарплатой в "+findMinWage()+" руб.");
        Main.fullName();
        Main.printInformation();
        System.out.println("Суммарные затраты на зарплаты сотрудникам = " + Main.totalWage() + " руб. в месяц.");
        System.out.println("Наименьшая зарплата среди сотрудников = " + Main.findMinWage() + " руб.");
        System.out.println("Средняя зарплата на предприятии = " + Main.middleWage() + " руб.");

    }

    private static int findMaxWage() {
        int wage = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getWage() > wage) {
                wage = employees[i].getWage();
            }
        }
        return wage;
    }

    private static String findTheBestPaidWorker() {
        String bestWorker = null;
        int wage = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getWage() > wage) {
                wage = employees[i].getWage();
                bestWorker = employees[i].getFullName();
            }
        }
        return bestWorker;
    }

    private static int findMinWage() {
        int wage = findMaxWage();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getWage() < wage) {
                wage = employees[i].getWage();
            }
        }
        return wage;
    }

    private static String findTheWorstPaidWorker() {
        String worstPaidWorker = null;
        int wage = findMaxWage();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getWage() < wage) {
                wage=employees[i].getWage();
                worstPaidWorker = employees[i].getFullName();
            }
        }
        return worstPaidWorker;
    }

    private static int middleWage() {
        int wage = totalWage() / employees.length;
        return wage;
    }

    private static void printInformation() {
        for (Employee employee : employees) {
            System.out.println("Карточка сотрудника: " + employee.toString());
        }
    }

    private static void fullName() {
        for (Employee employee : employees) {
            System.out.println("Ф.И.О. сотрудника: " + employee.getFullName());}
    }



    private static int totalWage() {
        int totalSum = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSum = totalSum + employees[i].getWage();
            if (i == employees.length - 1) ;
        }
        return totalSum;
    }

}