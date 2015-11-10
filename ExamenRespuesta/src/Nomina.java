import java.io.Serializable;

public class Nomina implements Serializable{
    private String Empleado;
    private Departamento departamento;

    public Nomina() {
    }

    public Nomina(String Empleado) {
        this.Empleado = Empleado;
    }

    public String getEmpleado() {
        return Empleado;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    
    

    
}
