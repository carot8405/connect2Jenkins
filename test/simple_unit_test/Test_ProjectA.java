/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_unit_test;

import jenkins_demo_project.ProjectA;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author DELL
 */
public class Test_ProjectA {
    
    @Test
    public void test_MethodReturn1(){
        ProjectA a = new ProjectA();
        Assert.assertEquals("Test Failed", 1, a.methodReturn1());
    }
    
    @Test
    public void test_MethodReturn2(){
        ProjectA a = new ProjectA();
        Assert.assertEquals("Test Failed", 2, a.methodReturn2());
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
