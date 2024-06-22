
public class StopWatch {
    private long startTime;
    private long endTime;
    private boolean running;

    public StopWatch(){
        this.running = false;
    }

    public void start(){
        if(running){
            System.out.println("Stop warch is running");
        }
        else{
            startTime = System.currentTimeMillis();
            this.running = true;
            System.out.println("watch is running");
        }
    }

    public void stop(){
        if(!running){
            System.out.println("StopWatch ios not running");
        }
        endTime = System.currentTimeMillis();
        this.running = false;
        long elapses = endTime - startTime;
        System.out.println("elapses time is: " + elapses + " ms");
        this.reset();
    }

    private void reset(){
        this.startTime = 0;
        this.endTime = 0;
    }
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();

        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        sw.stop();
    }
}
