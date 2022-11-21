public class Main {

    public static void main(String[] args) {

        BmiService service = new BmiService();
        int weight = 60; //measure in kg
        double height = 1.7; //measure in meters
        double total = Math.round(service.calculate(weight,height) * 100)/100.0; //round to .00

        System.out.println(total);
    }
}
