/*
 * This file was automatically generated by EvoSuite
 * Fri Jun 08 18:17:24 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.ActMain;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ActMain_ESTest extends ActMain_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        ActMain.validateStartupArguments(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ActMain.validateStartupArguments(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ActMain actMain0 = null;
      try {
        actMain0 = new ActMain();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        ActMain.validateStartupArguments(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("uk.ac.sanger.artemis.components.ActMain$4");
      byte[] byteArray0 = new byte[7];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      String[] stringArray0 = new String[7];
      stringArray0[0] = "fB~#[cW(,DUZHS<='mQ";
      stringArray0[1] = "uk.ac.sanger.artemis.components.ActMain$4";
      // Undeclared exception!
      try { 
        ActMain.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = " have been flipped to match the sequences";
      stringArray0[1] = "http%\"9";
      stringArray0[2] = "";
      stringArray0[3] = "ftpuk.ac.sanger.artemis.components.ActMain$3";
      // Undeclared exception!
      try { 
        ActMain.validateStartupArguments(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "fB~#[cW(,DUZHS<='mQ";
      stringArray0[1] = "uk.ac.sanger.artemis.components.ActMain$4";
      stringArray0[2] = "y$9P'9Iy4Cr*n-j";
      stringArray0[3] = "[0r8t0OUB]*,J,!";
      stringArray0[4] = " is not a valid URL.";
      stringArray0[5] = "";
      stringArray0[6] = "or";
      // Undeclared exception!
      try { 
        ActMain.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        ActMain.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      boolean boolean0 = ActMain.makeMultiComparator((JFrame) null, (InputStreamProgressListener) null, objectArray0);
      assertTrue(boolean0);
  }
}
