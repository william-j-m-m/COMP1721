public class MeanValue {
  public static double meanValue(double[] data) {
    double total = 0;
    double arrLength = data.length;

    for (int n = 0; n < arrLength; n++) {
      total += data[n];
    }

    return total / arrLength;

  }

  public static void main(String[] args) {
    if (args.length == 0) {
      System.err.println("Usage: java MeanValue <values...>");
      System.exit(1);
    }
    else {
      double[] doubleArray = new double[args.length];

      for (int n = 0; n < args.length; n++) {
        doubleArray[n] = Double.parseDouble(args[n]);
      }

      System.out.printf("Mean value = %.3f\n", meanValue(doubleArray));

    }
  }
}
