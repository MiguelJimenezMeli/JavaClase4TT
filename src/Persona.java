import java.util.Random;

public class Persona {
    private String nombre;
    private boolean esMeli;


    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public boolean isEsMeli() { return esMeli; }

    public void setEsMeli(boolean esMeli) { this.esMeli = esMeli; }

    public Persona(String nombre, boolean esMeli) {
        setNombre(nombre);
        setEsMeli(esMeli);
    }

    public void comerTorta()
    {
        try
        {
            System.out.println(getNombre() + " esta comiendo...");
            Random random = new Random();
            Thread.sleep(1000 * random.nextInt(5));
            if (isEsMeli()) {
                System.out.println("Viva la Chiqui!!");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
