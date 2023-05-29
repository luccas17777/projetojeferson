package adapter;

import round.RoundPeg;
import square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    //Variaveis e construtor
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    //Método para retornar o raio
    @Override
    public double getRadius(){
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
