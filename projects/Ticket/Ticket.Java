import java.util.Random;

public class Ticket{

    Random random = new Random();
    private int id= random;
    private long createdTS;
    private long payedTS;
    
     public Ticket(long createdTS) {
        this.id = random.nextInt(1000000,9999999);
        this.createdTS = createdTS;
    }

    public int getId() {
        return id;
    }

    public long getcreatedTS(){
        return createdTS;
    }

    public void toString();




}