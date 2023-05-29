package square;

public class SquarePeg {
    //Variaveis e construtores
    private double width;
    public SquarePeg(double width){
        this.width = width;
    }

    //retornar a largura
    public double getWidth(){
        return width;
    }
    //Retornar o resultado do quadrado
    public double getSquare(){
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
