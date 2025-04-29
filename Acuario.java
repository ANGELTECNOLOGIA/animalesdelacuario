package acuario;

public class Acuario {

    public static void main(String[] args) {
        // Datos para el constructor
        boolean vivo = true;
        String nombreCientifico = "Chelonia mydas";
        String nombrePersonal = "Manuelita";
        String[] alimentosValidos = {"Algas", "Calamar", "Lechuga"};
        String sexo = "Hembra";
        boolean embarazo = false;
        String tipoCaparazon = "Queratina dura";
        int tiempoBuceoMax = 45;
        double tempIdealAgua = 26.5;
        boolean requiereLuzUV = true;
        int horasDescansoDiario = 6;
        String comportamiento = "Sociable";
        String numIdentificacion = "TORT-001";

        // Crear la tortuga con el constructor sobrecargado
        Tortuga tortuga = new Tortuga(
                vivo, nombreCientifico, nombrePersonal, alimentosValidos, sexo, embarazo,
                tipoCaparazon, tiempoBuceoMax, tempIdealAgua, requiereLuzUV,
                horasDescansoDiario, comportamiento, numIdentificacion
        );

        // Usar métodos
        tortuga.ponerHuevos();
        System.out.println(tortuga.mostrarInformacion());
    }
}
