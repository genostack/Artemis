/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:09:44 GMT 2018
 */

package uk.ac.sanger.artemis.components.alignment;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.FeatureVector;
import uk.ac.sanger.artemis.components.alignment.BamView;
import uk.ac.sanger.artemis.components.alignment.GroupBamFrame;
import uk.ac.sanger.artemis.components.alignment.MappedReads;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class MappedReads_ESTest extends MappedReads_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FeatureVector featureVector0 = new FeatureVector();
      MappedReads mappedReads0 = null;
      try {
        mappedReads0 = new MappedReads((BamView) null, featureVector0, 14, true, true, false, false);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FeatureVector featureVector0 = new FeatureVector();
      MappedReads mappedReads0 = null;
      try {
        mappedReads0 = new MappedReads((BamView) null, featureVector0, false, false, false);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MappedReads mappedReads0 = null;
      try {
        mappedReads0 = new MappedReads((BamView) null, (GroupBamFrame) null, (-2993), (-2993), (-2993), false, false);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
