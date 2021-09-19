package Personas;
public class Estudiante extends Persona{
    private double codigo;
    private String programa;
    public Estudiante(double codigo, String programa, double identificacion, String nombres, String apellidos) {
        super(identificacion, nombres, apellidos);
        this.codigo = codigo;
        this.programa = programa;
    }
    public Estudiante(double codigo, String programa) {
        this.codigo = codigo;
        this.programa = programa;
    }
    public double getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getPrograma() {
        return programa;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
