package acuario;

public class AnimalAcuario {

    // Atributos
    private boolean vivo;
    private String nombreCientifico;
    private String nombrePersonal;
    private String[] alimentosValidos;
    private String sexo;
    private boolean embarazo;

// Constructor vacío
    public AnimalAcuario() {
        this.vivo = true;
        this.nombreCientifico = "Desconocido";
        this.nombrePersonal = "Desconocido";
        this.alimentosValidos = new String[]{"Camarones", "Sardina", "Arenque", "Calamar", "Molusco"};
        this.sexo = "Indefinido";
        this.embarazo = false;
    }

    // Constructor sobrecargado
    public AnimalAcuario(boolean vivo, String nombreCientifico, String nombrePersonal, String[] alimentosValidos, String sexo, boolean embarazo) {
        this.vivo = vivo;
        this.nombreCientifico = nombreCientifico;
        this.nombrePersonal = nombrePersonal;
        this.alimentosValidos = alimentosValidos;
        this.sexo = sexo;
        this.embarazo = embarazo;
    }
    
    // Métodos
    public void alimentar() {
        System.out.println("Alimentando al animal: " + nombreCientifico);
    }
    
    public String checarSalud() {
        return "Chequeo de salud para " + nombreCientifico;
    }
    
    public String mostrarInformacion() {
        return "Nombre: " + nombrePersonal + " | Científico: " + nombreCientifico;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }
    
    // Getters y Setters
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    public String[] getAlimentosValidos() {
        return alimentosValidos;
    }

    public void setAlimentosValidos(String[] alimentosValidos) {
        this.alimentosValidos = alimentosValidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isEmbarazo() {
        return embarazo;
    }

    public void setEmbarazo(boolean embarazo) {
        this.embarazo = embarazo;
    }
}   
    