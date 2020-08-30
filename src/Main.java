public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 190;
        int weight = 92;
        double BMI = service.calculate(height, weight);
        System.out.printf("Индкес массы тела равен %.0f ", BMI);
    }


}
