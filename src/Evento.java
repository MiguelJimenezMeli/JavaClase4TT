import java.util.ArrayList;

public class Evento {
    private String organizador;
    private ArrayList<Persona> invitados;
    //private ArrayList<> fuegosArtificiales;


    public Evento(String organizador) {
        setOrganizador(organizador);
        invitados = new ArrayList<>();
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public void addInvitado(Persona p) { invitados.add(p); }

    public void apagaVelas()
    {
        activarFugosArtificiales();
        repartirTorta();

    }

    private void activarFugosArtificiales(){}

    private void repartirTorta()
    {
        System.out.println("Torta para " + invitados.size() + " invitados");
        for (Persona p: invitados)
        {
            p.comerTorta();
        }
    }

    @Override
    public String toString() { return "Evento de " + getOrganizador(); }
}
