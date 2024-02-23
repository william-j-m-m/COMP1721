import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Dataset {
    private ArrayList<Double> data = new ArrayList<Double>();

    public Dataset(String filename) throws IOException {

        try (Scanner input = new Scanner(Paths.get(filename))) {
            while (input.hasNextDouble()) {
                data.add(input.nextDouble());
            }
        }
    }

    public int size() {
        return data.size();
    }

    public double meanValue() throws ArithmeticException{
        if (size() == 0) {
            throw new ArithmeticException("Error: No Values Present");
        }
        double sum = 0;
        for (double value : data) {
            sum += value;
        }

        return sum / size();
    }
}
