/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 12:06:30 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import java.io.File;
import java.util.HashMap;
import java.util.Properties;
import javax.swing.JFormattedTextField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.ProjectProperty;
import uk.ac.sanger.artemis.components.Splash;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class ProjectProperty_ESTest extends ProjectProperty_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      File file0 = MockFile.createTempFile("XUA*x-_aFV>", "|B`\"bNvJU~& `");
      MockFile mockFile0 = new MockFile(file0, "XUA*x-_aFV>");
      HashMap<String, HashMap<String, String>> hashMap0 = new HashMap<String, HashMap<String, String>>();
      hashMap0.put("=d8", (HashMap<String, String>) null);
      ProjectProperty.writeProperties(mockFile0, hashMap0);
      assertEquals(0L, mockFile0.getTotalSpace());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, HashMap<String, String>> hashMap0 = new HashMap<String, HashMap<String, String>>();
      // Undeclared exception!
      try { 
        ProjectProperty.writeProperties((File) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.ProjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        ProjectProperty.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ProjectProperty.getProjectMap((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.components.ProjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ProjectProperty projectProperty0 = null;
      try {
        projectProperty0 = new ProjectProperty((Splash) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ProjectProperty projectProperty0 = null;
      try {
        projectProperty0 = new ProjectProperty();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Properties properties0 = new Properties();
      HashMap<String, HashMap<String, String>> hashMap0 = (HashMap<String, HashMap<String, String>>)ProjectProperty.getProjectMap(properties0);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      hashMap1.put("Assertion failure: Ran out of indexers for symbols", "Rg0@i\"a7lO>");
      hashMap0.put("Rg0@i\"a7lO>", hashMap1);
      MockFile mockFile0 = new MockFile("KY|M=@");
      ProjectProperty.writeProperties(mockFile0, hashMap0);
      assertEquals(85L, mockFile0.length());
      assertEquals(1392409281320L, mockFile0.lastModified());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("project.KY|M=@", "project.KY|M=@");
      HashMap<String, HashMap<String, String>> hashMap0 = (HashMap<String, HashMap<String, String>>)ProjectProperty.getProjectMap(properties0);
      assertEquals(0, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.setProperty("_=NgXlRf5qm", ",");
      HashMap<String, HashMap<String, String>> hashMap0 = (HashMap<String, HashMap<String, String>>)ProjectProperty.getProjectMap(properties0);
      assertTrue(hashMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Properties properties0 = new Properties();
      HashMap<String, HashMap<String, String>> hashMap0 = (HashMap<String, HashMap<String, String>>)ProjectProperty.getProjectMap(properties0);
      MockFile mockFile0 = new MockFile("KY|M=@");
      ProjectProperty.writeProperties(mockFile0, hashMap0);
      assertFalse(mockFile0.exists());
      assertEquals(0L, mockFile0.lastModified());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Properties properties0 = new Properties();
      JFormattedTextField jFormattedTextField0 = new JFormattedTextField(properties0);
      properties0.put(jFormattedTextField0, jFormattedTextField0);
      // Undeclared exception!
      try { 
        ProjectProperty.getProjectMap(properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.JFormattedTextField cannot be cast to java.lang.String
         //
         verifyException("uk.ac.sanger.artemis.components.ProjectProperty", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ProjectProperty.writeProperties();
  }
}