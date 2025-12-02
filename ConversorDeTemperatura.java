import java.util.Scanner;



public class ConversorTemperatura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        // Entrada da temperatura em Celsius

        System.out.print("Digite a temperatura em graus Celsius: ");

        double celsius = input.nextDouble();



        // Conversões

        double fahrenheit = (celsius * 9 / 5) + 32;

        double kelvin = celsius + 273.15;



        // Exibição dos resultados

        System.out.println("\nResultados da conversão:");

        System.out.printf("Temperatura em Celsius: %.2f °C%n", celsius);

        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);

        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);



        input.close();

    }

}
