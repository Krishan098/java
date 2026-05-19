/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package org.yourcompany.yourproject;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
/**
 *
 * @author hp
 */
public class TestProjectTest {
    public TestProjectTest() {
    }

    /**
     * Test of main method, of class TestProject.
     */
    @Disabled@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TestProject.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of extractCommonElements method, of class TestProject.
     */
    @Test
    public void testExtractCommonElements() {
        System.out.println("extractCommonElements");
        List<Integer> list1 = Arrays.asList(31,20,15,17);
        List<Integer> list2 = Arrays.asList(20,19,17,45);
        List<Integer> expResult = Arrays.asList(17,20);
        List<Integer> result = TestProject.extractCommonElements(list1, list2);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}