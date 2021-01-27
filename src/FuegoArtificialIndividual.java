public class FuegoArtificialIndividual implements FuegoArtificial{
    private String ruido;

    public FuegoArtificialIndividual(String ruido) {
        setRuido(ruido);
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }

    @Override
    public void explotar() {
        System.out.println(getRuido());
    }

    @Override
    public String toString() {
        return "FuegoArtificialIndividual{" + "ruido='" + ruido + '}';
    }
}
