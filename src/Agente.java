import java.util.Random;


public class Agente extends Thread {
    private SalaFumadores sala;
    private Random r;
    public Agente(SalaFumadores sala){
        this.sala = sala;
        r= new Random();
    }
    public void run (){
        while(true){
            sala.colocar(r.nextInt(3)+1);
        }
    }
}