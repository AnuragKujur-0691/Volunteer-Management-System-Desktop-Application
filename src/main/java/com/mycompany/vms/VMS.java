/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vms;



/**
 *
 * @author indrajeet
 */
public class VMS {

    public static void main(String[] args) {
        SplashScreen obj=new SplashScreen();
        obj.setVisible(true);
        try{
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(10);
                obj.p1.setValue(i);
                
                
                if(i==100)
                {
                    
                    obj.setVisible(false);
//                    new Login().setVisible(true);
                    Home hm=new Home();
                    hm.setVisible(true);
                }
            }
        }
        catch(InterruptedException e)
        {
        }
    }
}
