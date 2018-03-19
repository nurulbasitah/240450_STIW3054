/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class MyTest {
    
    public static void main (String [] args){
    System.out.println(Thread.currentThread().getName());
    MyThread t1 = new MyThread();
    t1.start(); 
    MyThreadThread t2 = new MyThreadThread();
    t2.start();
    }
    
}
