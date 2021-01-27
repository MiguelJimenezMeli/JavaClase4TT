import java.util.ArrayList;

public class Evento {
    private String organizador;
    private ArrayList<Persona> invitados;
    private final ArrayList<FuegoArtificial> fuegosArtificiales;

    public Evento(String organizador) {
        setOrganizador(organizador);
        invitados = new ArrayList<>();
        fuegosArtificiales = new ArrayList<>();
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public void mostrarFuegosArtificiales() {
        System.out.println(fuegosArtificiales);
    }

    public void addInvitado(Persona p) { invitados.add(p); }

    public void addFuegoArtificial(FuegoArtificial fuegoArtificial){
        fuegosArtificiales.add(fuegoArtificial);
    }

    public void apagaVelas()
    {
        activarFuegosArtificiales();
        repartirTorta();

    }

    private void activarFuegosArtificiales(){
        for (FuegoArtificial fuegoArtificial: fuegosArtificiales) fuegoArtificial.explotar();
    }

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
