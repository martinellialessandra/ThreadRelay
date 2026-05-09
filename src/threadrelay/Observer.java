/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadrelay;

/**
 *
 * @author martinelli.alessandr
 */
public interface Observer {
    
    
    public void update(int idRunner, int posizione);
    public void corsaFinita(int idRunner);
}
