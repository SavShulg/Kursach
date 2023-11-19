public class Main {
    private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Hideo", "Kadzima", "Legenda",
                3000, 1);
        employees[1] = new Employee("Hideo1", "Kadzima1", "Legenda1",
                11100, 3);
        employees[2] = new Employee("Hideo2", "Kadzima2", "Legenda2",
                1200, 6);
        employees[3] = new Employee("Hideo3", "Kadzima3", "Legenda3",
                1300, 3);
        employees[4] = new Employee("Hideo4", "Kadzima4", "Legenda4",
                31500, 4);
        employees[5] = new Employee("Hideo5", "Kadzima5", "Legenda5",
                1550, 1);
        employees[6] = new Employee("Hideo6", "Kadzima6", "Legenda6",
                77400, 4);
        employees[7] = new Employee("Hideo7", "Kadzima7", "Legenda7",
                43300, 3);
        employees[8] = new Employee("Hideo8", "Kadzima8", "Legenda8",
                98700, 2);
        employees[9] = new Employee("Hideo9", "Kadzima9", "Legenda9",
                12334500, 1);

        printEmployees();
        System.out.println(sumSalary());
        System.out.println(minSalary());
        System.out.println(maxSalary());
        System.out.println(averageSalary());
        printEmloyeeFIO();
    }
    private static void printEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee);
            
        }
    }

    private static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
            
        }
        return sum;
    }
    private static Employee minSalary () {
        int index = 0;
        int minSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }private static Employee maxSalary () {
        int index = 0;
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }
    private static double averageSalary() {
        return (double) sumSalary() / employees.length;
    }
    private static void printEmloyeeFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName() + " " + employee.getFirstName() + " " + employee.getMiddleName());

        }
    }
}