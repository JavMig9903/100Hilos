public class PpalClass implements Callback {
    final int maximo = 100;
    Hilos[] Hilo = new Hilos[maximo];

    public PpalClass(){
        int i = 0;
        int j = 0;
        for (i = 1; i<6; i++){
            System.out.println("La iteración "+i);

            for (j = 0; j<maximo;j++){
                Hilos hilo = new Hilos(this);
                hilo.setName("El Hilo "+(j+1)+" :");
                hilo.start();
                Hilo[j] = hilo;
            }

            for(Hilos k:Hilo){
                try{
                    k.join();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
    public void acaba(String acaba) {
        System.out.println(acaba);
    }
}
