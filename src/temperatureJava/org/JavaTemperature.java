package temperatureJava.org;
import java.util.Arrays;
import java.util.Collection;

public class JavaTemperature {
    public static void main(String[] args) {

        // Array delle temperature in gradi Celsius degli ultimi sette giorni
        double[] temperatureCelsius = {12.3, 10.2, 13.2, 11.2, 11.4, 14.2, 15.5};

        // Calcola temperatura minima, massima e media in gradi Celsius
        double minTemperature = Arrays.stream(temperatureCelsius).min().orElse(Double.NaN);
        double maxTemperature = Arrays.stream(temperatureCelsius).max().orElse(Double.NaN);
        double avgTemperature = Arrays.stream(temperatureCelsius).average().orElse(Double.NaN);

        // Stampa a video le temperature in gradi Celsius
        System.out.println("Temperatures in degrees Celsius:");
        System.out.println("Minimal: " + minTemperature + "°C");
        System.out.println("Maximum: " + maxTemperature + "°C");
        System.out.println("Average: " + avgTemperature + "°C");

        // Converto le temperature in Fahrenheit e stampo a video
        System.out.println("\nTemperatures in degrees Fahrenheit:");
        Arrays.stream(temperatureCelsius)
                .map(celsius -> (celsius * 9/5) + 32)
                .forEach(tempFahrenheit -> System.out.println(tempFahrenheit + "°F"));


        }
    }





