/*
 * This file was automatically generated by EvoSuite
 * Sun May 19 00:25:11 GMT 2024
 */

package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.Employee;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Employee_ESTest extends Employee_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Employee employee0 = new Employee();
      employee0.setTitle("z(#1^R E");
      String string0 = employee0.getTitle();
      assertEquals("z(#1^R E", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Employee employee0 = new Employee();
      employee0.setTitle("");
      String string0 = employee0.getTitle();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Employee employee0 = new Employee();
      employee0.name = "";
      String string0 = employee0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Employee employee0 = new Employee();
      employee0.imgPath = "z(#1^R E";
      String string0 = employee0.getImgPath();
      assertEquals("z(#1^R E", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Employee employee0 = new Employee();
      employee0.setImgPath("");
      String string0 = employee0.getImgPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Employee employee0 = new Employee();
      String string0 = employee0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Employee employee0 = new Employee();
      employee0.setName("/q7");
      String string0 = employee0.getName();
      assertEquals("/q7", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Employee employee0 = new Employee();
      String string0 = employee0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Employee employee0 = new Employee();
      String string0 = employee0.getImgPath();
      assertNull(string0);
  }
}
