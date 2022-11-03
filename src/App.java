import model.Empleado;
import model.Empresa;

public class App {
    public static void main(String[] args) throws Exception {
        Empleado empleado = new Empleado();
        empleado.start();
        Empresa empresa = new Empresa();
        empresa.start();        
    }
}
