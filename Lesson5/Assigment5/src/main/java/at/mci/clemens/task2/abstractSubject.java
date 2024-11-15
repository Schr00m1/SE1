/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package at.mci.clemens.task2;

/**
 *
 * @author Clemens
 */
public abstract class abstractSubject {
    abstract public void attach(AbstractObserver o);
    abstract public void detach (AbstractObserver o);
    abstract public void notifyOther();
}
