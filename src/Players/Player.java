package Players;

/**
 *
 * @author lucas
 */
public class Player {
    private int eixoX = 240;
    private int eixoY = 570;
    private int posicao = 1;
    private int numero;
    
    public Player(int numero){
        this.numero = numero;
    }

    public int getEixoX() {
        return eixoX;
    }

    public void setEixoX(int eixoX) {
        this.eixoX = eixoX;
    }

    public int getEixoY() {
        return eixoY;
    }

    public void setEixoY(int eixoY) {
        this.eixoY = eixoY;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    public int getNumero(){
        return this.numero;
    }
}
