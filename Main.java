import java.util.Scanner;
import converter.CelsiusConverter;
import converter.FahrenheitConverter;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите температуру: ");
    double temperature = scanner.nextDouble();
    System.out.println("Выберите единицу измерения (C/F): ");
    String unit = scanner.next();
    if (unit.equalsIgnoreCase("C")) {
      CelsiusConverter converter = new CelsiusConverter();
      System.out.println(converter.convert(temperature) + "F");
    } else if (unit.equalsIgnoreCase("F")) {
      FahrenheitConverter converter = new FahrenheitConverter();
      System.out.println(converter.convert(temperature) + "C");
    } else {
      System.out.println("Неверная единица измерения");
    }
  }
}