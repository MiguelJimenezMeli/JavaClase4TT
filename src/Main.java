import java.util.Random;

public class Main {

    private static void createInvitados(Evento e)
    {
        int maxInvitados = 100;
        Random random = new Random();
        for(int i = 1; i < random.nextInt(maxInvitados); i++)
        {
            e.addInvitado(new Persona("Invitado-"+i,i%2 == 0));
        }
    }


    public static void main(String[] args) {
        Evento evento = new Evento("Marte Group S.A.");
        createInvitados(evento);
        System.out.println("Inicia " + evento);
        System.out.println("La chiqui apaga las velas, la viejita aun sopla!!!");
        evento.apagaVelas();
        System.out.println("Finaliza " + evento);
    }
}
