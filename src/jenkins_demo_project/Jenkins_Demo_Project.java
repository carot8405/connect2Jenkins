/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenkins_demo_project;

/**
 *
 * @author DELL
 */
public class Jenkins_Demo_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProjectB b = new ProjectB();
        System.out.println(b.methodCalledFromPrjA());
    }
    
}
