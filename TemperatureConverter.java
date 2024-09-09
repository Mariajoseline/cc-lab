import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");

        int choice = scanner.nextInt();

        System.out.print("Enter the temperature to convert: ");
        double temperature = scanner.nextDouble();

        switch (choice) {
            case 1:
                double fahrenheitFromCelsius = celsiusToFahrenheit(temperature);
                System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", temperature, fahrenheitFromCelsius);
                break;
            case 2:
                double kelvinFromCelsius = celsiusToKelvin(temperature);
                System.out.printf("%.2f Celsius is %.2f Kelvin%n", temperature, kelvinFromCelsius);
                break;
            case 3:
                double celsiusFromFahrenheit = fahrenheitToCelsius(temperature);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", temperature, celsiusFromFahrenheit);
                break;
            case 4:
                double kelvinFromFahrenheit = fahrenheitToKelvin(temperature);
                System.out.printf("%.2f Fahrenheit is %.2f Kelvin%n", temperature, kelvinFromFahrenheit);
                break;
            case 5:
                double celsiusFromKelvin = kelvinToCelsius(temperature);
                System.out.printf("%.2f Kelvin is %.2f Celsius%n", temperature, celsiusFromKelvin);
                break;
            case 6:
                double fahrenheitFromKelvin = kelvinToFahrenheit(temperature);
                System.out.printf("%.2f Kelvin is %.2f Fahrenheit%n", temperature, fahrenheitFromKelvin);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }

    // Conversion methods
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
}
