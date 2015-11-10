import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersistenciaNominas {
ArrayList<Nomina>nominas;
    
    public PersistenciaNominas(){
        nominas=new ArrayList<Nomina>();
    }
    
    public void guardar (Nomina nomina) throws Exception {
        File file=new File("D:\\Nominas");
        if(file.exists())nominas=BuscarTodo();
        FileOutputStream a=new FileOutputStream(file);
        ObjectOutputStream x=new ObjectOutputStream (a);
        nominas.add(nomina);
        x.writeObject(x);
        x.close();
        
    }
    
    public ArrayList <Nomina>BuscarTodo()throws Exception {
        File file=new File("D:\\Nominas");
        FileInputStream N=new FileInputStream(file);
        ObjectInputStream m=new ObjectInputStream(N);
        nominas=(ArrayList<Nomina>)m.readObject();
        return nominas;
    }
    
    public Nomina buscarPorId(int id) throws Exception {
       Nomina b=new Nomina();
        nominas=BuscarTodo();
        b=nominas.get(id);
        return b;
    }
    
    
}
    
    
    
