import java.util.Scanner;

public class SensorDataAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter humidity percentage: ");
        double humidity = scanner.nextDouble();

        String status;
        String message;

        if (temperature > 35 && humidity > 80) {
            status = "ALERT";
            message = "High temperature and humidity detected!";
        } 
        else if (temperature > 35) {
            status = "ALERT";
            message = "High temperature detected!";
        } 
        else if (humidity > 80) {
            status = "ALERT";
            message = "High humidity detected!";
        } 
        else {
            status = "NORMAL";
            message = "Environmental conditions are normal.";
        }

        System.out.println("\n--- Sensor Analysis Result ---");
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Humidity: " + humidity + " %");
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);

        scanner.close();
    }
}