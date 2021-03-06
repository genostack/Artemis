/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:46:02 GMT 2018
 */

package uk.ac.sanger.artemis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.OptionChangeEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class OptionChangeEvent_ESTest extends OptionChangeEvent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OptionChangeEvent optionChangeEvent0 = new OptionChangeEvent("", (String) null);
      String string0 = optionChangeEvent0.getOptionName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OptionChangeEvent optionChangeEvent0 = new OptionChangeEvent("", "uk.ac.sanger.artemis.ChangeEvent");
      String string0 = optionChangeEvent0.getOptionName();
      assertEquals("uk.ac.sanger.artemis.ChangeEvent", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OptionChangeEvent optionChangeEvent0 = null;
      try {
        optionChangeEvent0 = new OptionChangeEvent((Object) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // null source
         //
         verifyException("java.util.EventObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OptionChangeEvent optionChangeEvent0 = new OptionChangeEvent("", "");
      String string0 = optionChangeEvent0.getOptionName();
      assertEquals("", string0);
  }
}
