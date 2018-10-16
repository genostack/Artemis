/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 13:30:52 GMT 2018
 */

package uk.ac.sanger.artemis.circular;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import java.awt.HeadlessException;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.circular.DNADraw;
import uk.ac.sanger.artemis.circular.GeneticMarker;
import uk.ac.sanger.artemis.components.SelectionViewer;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class GeneticMarker_ESTest extends GeneticMarker_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DNADraw dNADraw0 = new DNADraw();
      StringVector stringVector0 = SelectionViewer.getBaseSummary("pEc");
      GeneticMarker geneticMarker0 = null;
      try {
        geneticMarker0 = new GeneticMarker(dNADraw0, stringVector0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to uk.ac.sanger.artemis.circular.Block
         //
         verifyException("uk.ac.sanger.artemis.circular.GeneticMarker$MarkerTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stack<DefaultTableModel> stack0 = new Stack<DefaultTableModel>();
      DNADraw dNADraw0 = new DNADraw();
      stack0.add((DefaultTableModel) null);
      GeneticMarker geneticMarker0 = null;
      try {
        geneticMarker0 = new GeneticMarker(dNADraw0, stack0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.circular.GeneticMarker$MarkerTableModel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        GeneticMarker.setUpColorButton((Color) null);
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
      StringVector stringVector0 = StringVector.getStrings("", "");
      GeneticMarker geneticMarker0 = null;
      try {
        geneticMarker0 = new GeneticMarker((DNADraw) null, stringVector0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}