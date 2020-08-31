public class BmiService {
    double calculate(int height, int weight) {
        double heightInMeters = (double) height / 100;
        double bmi = weight / Math.pow(HeightInMeters, 2);
        return bmi;
    }
}
