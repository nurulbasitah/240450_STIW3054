/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgtry;

/**
 *
 * @author hp
 */
public class Try extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Thread(new Try()).start();
    }

   // @Override
    public void run() {
         int count= 5;
        try {
            for ( int x = 1; x <=20; x++) { 
               System.out.print(count);
                sleep(500);
                count+=5;
                if(count%2!=0)
                    System.out.print("A");
                System.out.println();
            } 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
