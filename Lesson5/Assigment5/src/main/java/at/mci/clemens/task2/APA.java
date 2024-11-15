/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Clemens
 */
public class APA extends abstractSubject {

    private List<AbstractObserver> observers;
    private String newsPaperText;

    public APA() {
        this.observers = new ArrayList<>();
    }
    
    
    @Override
    public void attach(AbstractObserver o) {
        if (o == null){
            throw new NullPointerException("Cant add observer that is null");
        }else{
            this.observers.add(o);
        }
    }

    @Override
    public void detach(AbstractObserver o) {
        if(o == null){
            throw new NullPointerException("Cant remove observer that is null");
        }else{
            this.observers.remove(o);
        }
    }

    @Override
    public void notifyOther() {
            for (AbstractObserver o : this.observers){
                o.update(this.newsPaperText);
            }
    }
    
    public void releasePaper(String text){
        this.newsPaperText = text;
        this.notifyOther();
    }
}
