import java.util.Scanner;

public class Task1_TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");

        double temperature = sc.nextDouble();

        System.out.print("Enter unit of measurement (Celsius, Fahrenheit, or Kelvin): ");
        String originalUnit = sc.next().toLowerCase();

        convertAndDisplayTemperatures(temperature, originalUnit);
        sc.close();
    }

    private static void convertAndDisplayTemperatures(double temperature, String originalUnit) {
        switch (originalUnit) {
            case "celsius":
                displayConvertedTemperatures(temperature, "Celsius" );
                break;
            case "fahrenheit":
                displayConvertedTemperatures2(temperature, "Fahrenheit");
                break;
            case "kelvin":
                displayConvertedTemperatures3(temperature, "Kelvin");
                break;
            default:
                System.out.println("Invalid unit of measurement. Please enter Celsius, Fahrenheit, or Kelvin.");
        }
    }

    public static void displayConvertedTemperatures(double temperature, String originalUnit) {
        double convertedValue1=  (temperature * 9 / 5) + 32;
        double convertedValue2= temperature + 273.15;
        System.out.println(temperature + " " + originalUnit + " is equivalent to:");
        System.out.println(convertedValue1 + " Fahrenheit");
        System.out.println(convertedValue2 + " Kelvin");
    }

    public static void displayConvertedTemperatures2(double temperature, String originalUnit) 
    {
        double convertedValue3=  (temperature - 32) * 5 / 9;
        double convertedValue4= (temperature - 32) * 5 / 9 + 273.15;
        System.out.println(temperature + " " + originalUnit + " is equivalent to:");
        System.out.println(convertedValue3 + " celsius");
        System.out.println(convertedValue4 + " Kelvin");
    }
    public static void displayConvertedTemperatures3(double temperature, String originalUnit) 
    {
        double convertedValue5=  temperature - 273.15;
        double convertedValue6= (temperature - 273.15) * 9 / 5 + 32;
        System.out.println(temperature + " " + originalUnit + " is equivalent to:");
        System.out.println(convertedValue5 + " celsius");
        System.out.println(convertedValue6 + " fahrenheit");
    }
}
