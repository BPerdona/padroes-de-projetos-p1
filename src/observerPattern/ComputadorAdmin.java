package observerPattern;

import strategy.Computador;

import java.util.ArrayList;
import java.util.List;

public class ComputadorAdmin implements Observable{
    private String nomeAdmin;
    private List<Observer> observers = new ArrayList<Observer>();

    public ComputadorAdmin(String nomeAdmin){
        super();
        this.nomeAdmin=nomeAdmin;
    }

    @Override
    public void addObserver(Observer observer) {
        getObservers().add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        getObservers().remove(observer);
    }

    @Override
    public void notify(int numeroMaquina, String message) {
        //Percorrendo lista e verificando o numero da maquina utilizando o CastS
        for(Observer o : observers){
            if(((Computador)o).getNumeroMaquina() == numeroMaquina){
                o.notify(this, message);
            }
        }
    }

    @Override
    public void notifyAll(String message){
        for (Observer o : observers){
            o.notify(this, message);
        }
    }

    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
