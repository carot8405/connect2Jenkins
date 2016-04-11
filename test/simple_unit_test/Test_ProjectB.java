/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_unit_test;

import jenkins_demo_project.ProjectB;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class Test_ProjectB {
    
    @Test
    public void test_methodCalledFromPrjA() {
        ProjectB b = new ProjectB();
        assertEquals("Test Failed", 3, b.methodCalledFromPrjA());
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
