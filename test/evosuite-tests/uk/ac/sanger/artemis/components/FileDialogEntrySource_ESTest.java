/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 12:05:09 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.FileDialogEntrySource;
import uk.ac.sanger.artemis.io.PartialSequence;
import uk.ac.sanger.artemis.sequence.Bases;
import uk.ac.sanger.artemis.util.InputStreamProgressListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FileDialogEntrySource_ESTest extends FileDialogEntrySource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource((JFrame) null, inputStreamProgressListener0);
      String string0 = fileDialogEntrySource0.getSourceName();
      assertEquals("Filesystem", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      doReturn("&(D3").when(inputStreamProgressListener0).toString();
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource((JFrame) null, inputStreamProgressListener0);
      InputStreamProgressListener inputStreamProgressListener1 = fileDialogEntrySource0.getInputStreamProgressListener();
      assertSame(inputStreamProgressListener1, inputStreamProgressListener0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource((JFrame) null, inputStreamProgressListener0);
      // Undeclared exception!
      try { 
        fileDialogEntrySource0.getEntry(true);
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Permission Denied
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource((JFrame) null, inputStreamProgressListener0);
      boolean boolean0 = fileDialogEntrySource0.isFullEntrySource();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InputStreamProgressListener inputStreamProgressListener0 = mock(InputStreamProgressListener.class, new ViolatedAssumptionAnswer());
      FileDialogEntrySource fileDialogEntrySource0 = new FileDialogEntrySource((JFrame) null, inputStreamProgressListener0);
      Short short0 = new Short((short)2386);
      Integer integer0 = JLayeredPane.DRAG_LAYER;
      PartialSequence partialSequence0 = new PartialSequence((char[]) null, 0, 0, short0, integer0);
      Bases bases0 = new Bases(partialSequence0);
      // Undeclared exception!
      try { 
        fileDialogEntrySource0.getEntry(bases0, true);
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Permission Denied
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}