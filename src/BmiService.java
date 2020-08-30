public class BmiService {
    double calculate(int height, int weight) {
        double HeightInMeters = (double) height / 100;
        double BMI = weight / Math.pow(HeightInMeters, 2);
        return BMI;
    }
}
