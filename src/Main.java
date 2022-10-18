public class Main {
    public static void main(String[] args) {
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var weightDifference = (weightFirstBoxer - weightSecondBoxer) * (-1);
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");


    }
}