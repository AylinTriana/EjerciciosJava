package ejerciciosJava;

public class DesafioTemperatura {
    public static void main(String[] args) {

        double temperaturaEnCelsius = 25.4;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        System.out.println(temperaturaEnFahrenheit);

        int temperaturaSinDecimales = (int) (temperaturaEnCelsius * 1.8) + 32;

        System.out.println(temperaturaSinDecimales);
    }
}
