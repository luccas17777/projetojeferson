package round;

public class RoundHole {
    //variaveis e construtor
    private double radius;

    public RoundHole(double radius){
        this.radius = radius;
    }

    //Método para retornar o raio
    public double getRadius(){
        return radius;
    }

    //Retorna se é falso ou verdadeiro
    public boolean fits(RoundPeg peg){
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}
