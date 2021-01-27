import java.util.ArrayList;

public class FuegoArtificialPack implements FuegoArtificial{

    private ArrayList<FuegoArtificial> fuegosArtificiales;

    public FuegoArtificialPack(ArrayList<FuegoArtificial> fuegosArtificiales) {
        setFuegosArtificiales(fuegosArtificiales);
    }

    public ArrayList<FuegoArtificial> getFuegosArtificiales() {
        return fuegosArtificiales;
    }

    public void setFuegosArtificiales(ArrayList<FuegoArtificial> fuegosArtificiales) {
        this.fuegosArtificiales = fuegosArtificiales;
    }

    @Override
    public void explotar() {
        for(FuegoArtificial fuegoArtificial: fuegosArtificiales) fuegoArtificial.explotar();
    }

    @Override
    public String toString() {
        String fuegos = "FuegoArtificialPack{";
        for(FuegoArtificial fuegoArtificial: fuegosArtificiales){
            fuegos += fuegoArtificial.toString();
        }
        fuegos += "}";
        return fuegos;
    }
}
