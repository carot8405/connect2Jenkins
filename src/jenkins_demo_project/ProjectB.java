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
public class ProjectB {
    
    public int methodCalledFromPrjA(){
        ProjectA a = new ProjectA();
        return a.methodReturn1() + a.methodReturn2();
    }
}
