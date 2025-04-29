package acuario;

public class Tortuga extends AnimalAcuario{
    // Atributos
    private String tipoCaparazon;
    private int tiempoBuceoMax;
    private double tempIdealAgua;
    private boolean requiereLuzUV;
    private int horasDescansoDiario;
    private String comportamiento;
    private String numIdentificacion;

    // Constructor vacío
    public Tortuga() {
    }

    // Constructor sobrecargado
    // En Tortuga.java
public Tortuga(boolean vivo, String nombreCientifico, String nombrePersonal, 
              String[] alimentosValidos, String sexo, boolean embarazo,
              String tipoCaparazon, int tiempoBuceoMax, double tempIdealAgua, 
              boolean requiereLuzUV, int horasDescansoDiario, String comportamiento, 
              String numIdentificacion) {
    super(vivo, nombreCientifico, nombrePersonal, alimentosValidos, sexo, embarazo);
    this.tipoCaparazon = tipoCaparazon;
    this.tiempoBuceoMax = tiempoBuceoMax;
    this.tempIdealAgua = tempIdealAgua;
    this.requiereLuzUV = requiereLuzUV;
    this.horasDescansoDiario = horasDescansoDiario;
    this.comportamiento = comportamiento;
    this.numIdentificacion = numIdentificacion;
}

    // Métodos
    public void ponerHuevos() {
        System.out.println(getNombrePersonal() + " está poniendo huevos");
    }

    public void interactuarVisitantes() {
        System.out.println("Tortuga interactuando con visitantes");
    }

    public void limpiarCaparazon() {
        System.out.println("Limpiando caparazón");
    }

    public void cambiarTanque() {
        System.out.println("Cambiando de tanque");
    }

    public boolean revisarQuitina() {
        System.out.println("Revisando quitina del caparazón");
        return true;
    }

    // Getters y Setters

    public String getTipoCaparazon() {
        return tipoCaparazon;
    }

    public void setTipoCaparazon(String tipoCaparazon) {
        this.tipoCaparazon = tipoCaparazon;
    }

    public int getTiempoBuceoMax() {
        return tiempoBuceoMax;
    }

    public void setTiempoBuceoMax(int tiempoBuceoMax) {
        this.tiempoBuceoMax = tiempoBuceoMax;
    }

    public double getTempIdealAgua() {
        return tempIdealAgua;
    }

    public void setTempIdealAgua(double tempIdealAgua) {
        this.tempIdealAgua = tempIdealAgua;
    }

    public boolean isRequiereLuzUV() {
        return requiereLuzUV;
    }

    public void setRequiereLuzUV(boolean requiereLuzUV) {
        this.requiereLuzUV = requiereLuzUV;
    }

    public int getHorasDescansoDiario() {
        return horasDescansoDiario;
    }

    public void setHorasDescansoDiario(int horasDescansoDiario) {
        this.horasDescansoDiario = horasDescansoDiario;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    public void setNumIdentificacion(String numIdentificacion) {
        this.numIdentificacion = numIdentificacion;
    }
    

}