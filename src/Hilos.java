
public class Hilos extends Thread{
    Callback callback;
    public Hilos(Callback callback){
        this.callback = callback;
    }

    @Override
    public void run() {
        int time =(int) (Math.random()*(8000-1000+1)+1000);
        try{
            sleep(time);
            callback.acaba(getName()+" ha dormido por "+time);
            time = (int) (Math.random()*(6000-2000+1)+2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

