package example;

import adapter.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        //Objetos inicializados
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        //Mensagem para dizer que encaixa passando pela condição
        if (hole.fits(rpeg)){
            System.out.printf("Round peg r5 fits round hole r5.");
        }
        //Objetos inicializados
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        //Objetos inicializados
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        //Enviando mensagem através da condição
        if (hole.fits(smallSqPegAdapter)){
            System.out.println("Square peg w2 fits round hole r5.");
        }
        //Outra condição para enviar a mensagem
        if (!hole.fits(largeSqPegAdapter)){
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
