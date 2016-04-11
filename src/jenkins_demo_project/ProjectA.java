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
public class ProjectA {
    public int methodReturn1(){
        return 1;
    }
    
    public int methodReturn2(){
        return methodReturn1() + 1;
    }
}
