import com.sun.tools.javac.util.List;
import org.w3c.dom.events.EventException;

import java.util.ArrayList;
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

    private static void createFuegosArtificiales(Evento e){
        FuegoArtificial fuegoIndiv1 = new FuegoArtificialIndividual("pum");
        FuegoArtificial fuegoIndiv2 = new FuegoArtificialIndividual("puf");
        FuegoArtificial fuegoIndiv3 = new FuegoArtificialIndividual("pam");
        FuegoArtificial fuegoIndiv4 = new FuegoArtificialIndividual("bum");
        FuegoArtificial fuegoIndiv5 = new FuegoArtificialIndividual("bam");
        FuegoArtificial fuegoIndiv6 = new FuegoArtificialIndividual("pim");

        ArrayList<FuegoArtificial> listaFuegos1 = new ArrayList<>(List.of(fuegoIndiv2, fuegoIndiv3));
        ArrayList<FuegoArtificial> listaFuegos2 = new ArrayList<>(List.of(fuegoIndiv4, fuegoIndiv5));

        FuegoArtificial fuegoPack1 = new FuegoArtificialPack(listaFuegos1);
        FuegoArtificial fuegoPack2 = new FuegoArtificialPack(listaFuegos2);

        ArrayList<FuegoArtificial> listaFuegos3 = new ArrayList<>(List.of(fuegoPack2, fuegoIndiv6));
        FuegoArtificial fuegoPack3 = new FuegoArtificialPack(listaFuegos3);

        e.addFuegoArtificial(fuegoIndiv1);
        e.addFuegoArtificial(fuegoPack1);
        e.addFuegoArtificial(fuegoPack3);

        e.mostrarFuegosArtificiales();
    }


    public static void main(String[] args) {
        Evento evento = new Evento("Marte Group S.A.");
        createInvitados(evento);
        createFuegosArtificiales(evento);
        System.out.println("Inicia " + evento);
        System.out.println("La chiqui apaga las velas, la viejita aun sopla!!!");
        evento.apagaVelas();
        System.out.println("Finaliza " + evento);
    }
}
