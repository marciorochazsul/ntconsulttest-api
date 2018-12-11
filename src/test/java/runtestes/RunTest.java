package runtestes;

import java.io.IOException;

import suitetest.AllTests;





public class RunTest {

       
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

      
        org.junit.runner.JUnitCore.runClasses(

        		AllTests.class

        );
    }
}