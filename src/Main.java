public class Main {
    public static void main(String[] args) {
        var totalHours = 640;
        var hoursPerEmployee = 8;
        var amountOfWorkers = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании – " + amountOfWorkers + " человек");
        var currentValueOfEmployees = amountOfWorkers + 94;
        var currentHoursPerEmployee = totalHours / currentValueOfEmployees;
        System.out.println("Если в компании работает " + currentValueOfEmployees + " человека, то всего по " + currentHoursPerEmployee + " часа работы может быть поделено между сотрудниками.");





    }
}