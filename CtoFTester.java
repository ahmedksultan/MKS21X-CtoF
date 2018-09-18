public class CtoFTester {
     public static void main (String [] args) {
          //final results go here
          //celsiusToFahrenheit = 50.0
          //fahrenheitToCelsius = 35.0
          //Tejas gave me the idea for adding the degrees!
          System.out.println(celsiusToFahrenheit(10.0) + " ºF");
          System.out.println(fahrenheitToCelsius(95.0) + " ºC");
     }
     public static double celsiusToFahrenheit(double c) {
          return ((c * 9 / 5) + 32);
     }
     public static double fahrenheitToCelsius(double f) {
          return ((f - 32) * 5 / 9);
     }
}
