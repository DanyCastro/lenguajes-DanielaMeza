import java.io.Serializable;

public class Empleado {

    private String Nombre;
    private String Paterno;
    private long SeguroSocial;
    private float SueldoBase;
    private int HorasExtra;

    public Empleado(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPaterno() {
        return Paterno;
    }

    public long getSeguroSocial() {
        return SeguroSocial;
    }

    public float getSueldoBase() {
        return SueldoBase;
    }

    public int getHorasExtra() {
        return HorasExtra;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public void setSeguroSocial(long SeguroSocial) {
        this.SeguroSocial = SeguroSocial;
    }

    public void setSueldoBase(float SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public void setHorasExtra(int HorasExtra) {
        this.HorasExtra = HorasExtra;
    }
    
}
