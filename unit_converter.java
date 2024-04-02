import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputValue;
        String inputUnit, outputUnit;
        
        System.out.print("Enter the value to convert: ");
        inputValue = scanner.nextDouble();
        System.out.print("Enter the input unit (m, km, ft, in, mi): ");
        inputUnit = scanner.next();
        System.out.print("Enter the output unit (m, km, ft, in, mi): ");
        outputUnit = scanner.next();
        
        double result = convert(inputValue, inputUnit, outputUnit);
        System.out.println("Result: " + result + " " + outputUnit);
        
        scanner.close();
    }
    
    public static double convert(double value, String inputUnit, String outputUnit) {
        double result = 0;
        // Convert to meters
        switch (inputUnit) {
            case "m":
                result = value;
                break;
            case "km":
                result = value * 1000;
                break;
            case "ft":
                result = value * 0.3048;
                break;
            case "in":
                result = value * 0.0254;
                break;
            case "mi":
                result = value * 1609.34;
                break;
            default:
                System.out.println("Invalid input unit.");
        }
        
        // Convert from meters to desired output unit
        switch (outputUnit) {
            case "m":
                return result;
            case "km":
                return result / 1000;
            case "ft":
                return result / 0.3048;
            case "in":
                return result / 0.0254;
            case "mi":
                return result / 1609.34;
            default:
                System.out.println("Invalid output unit.");
                return 0;
        }
    }
}
