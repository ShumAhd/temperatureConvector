package converter;

public class FahrenheitConverter {
  public double convert(double temperature) {
    return (temperature - 32) * 5/9;
  }
}
