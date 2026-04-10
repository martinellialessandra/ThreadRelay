/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadrelay;

/**
 *
 * @author Alessandra Martinell
 */
public class Runner implements Runnable {
    private boolean Pausa;
    private boolean Stop;
    private int Ritardo;
    private int nRunner;
    private Listener listener;

    public Runner(int Ritardo, int nRunner, Listener listener) {
        this.Ritardo = Ritardo;
        this.nRunner = nRunner;
        this.listener = listener;
        Stop = false;
        Pausa = false;
    }
    
     /**
     * Fa avanzare la barra
     * Si ferma se "Stop" è true e si mette in pausa se "Pausa" è true
     * ha una velocità casuale
     * Alla fine segnala se ha finito
     */
    public void run(){
        for(int i = 0; i < 101; i++){
            if(Stop)return;          
                    synchronized (this) {
                if (Pausa) {
                    try {
                        wait();
                    } catch (InterruptedException ignored) {
                        System.out.println(ignored.getMessage());
                    }
                }
            }
            if (i==90){
                listener.prossimoThread(nRunner);
            }
            listener.aggiornaValori(i, nRunner);
            try{
                Thread.sleep(Ritardo);
            }catch(InterruptedException ie){
                System.out.println("Thread interrotto");
            }
        }
    }
    
    public synchronized void pausa(){
        Pausa = true;
    }
    /**
     * Metodo che riavvia il thread
     */
    public  synchronized void riprendi(){
        Pausa = false;
        notifyAll();
    }
    /**
     * Metodo che ferma completamente il thread
     */
    /**
     * ferma il thread
     * azzera la barra
     */
    public  synchronized void ferma(){
        Stop = true;
        Pausa = false;
        notifyAll();
    }
    }
