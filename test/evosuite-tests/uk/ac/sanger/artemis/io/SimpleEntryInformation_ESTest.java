/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 12 15:34:43 GMT 2018
 */

package uk.ac.sanger.artemis.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.io.BlastEntryInformation;
import uk.ac.sanger.artemis.io.EntryInformation;
import uk.ac.sanger.artemis.io.InvalidKeyException;
import uk.ac.sanger.artemis.io.InvalidQualifierException;
import uk.ac.sanger.artemis.io.InvalidRelationException;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.KeyVector;
import uk.ac.sanger.artemis.io.MSPcrunchEntryInformation;
import uk.ac.sanger.artemis.io.Qualifier;
import uk.ac.sanger.artemis.io.QualifierInfo;
import uk.ac.sanger.artemis.io.SimpleEntryInformation;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SimpleEntryInformation_ESTest extends SimpleEntryInformation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      assertFalse(simpleEntryInformation0.useEMBLFormat());
      
      simpleEntryInformation0.setEMBLFormat(true);
      boolean boolean0 = simpleEntryInformation0.useEMBLFormat();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      blastEntryInformation0.getUserKeys();
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Qualifier qualifier0 = new Qualifier(".clklTab");
      InvalidQualifierException invalidQualifierException0 = new InvalidQualifierException((String) null, qualifier0);
      blastEntryInformation0.fixException(invalidQualifierException0);
      blastEntryInformation0.getQualifierInfo(".clklTab");
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      QualifierInfo qualifierInfo0 = new QualifierInfo("", (-5159), (KeyVector) null, (KeyVector) null, true);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      blastEntryInformation0.getQualifierInfo("");
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      QualifierInfo qualifierInfo0 = new QualifierInfo("", (-5159), (KeyVector) null, (KeyVector) null, true);
      Key key0 = new Key("");
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      // Undeclared exception!
      try { 
        blastEntryInformation0.isValidQualifier(key0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      QualifierInfo qualifierInfo0 = new QualifierInfo("}", (-1), (KeyVector) null, (KeyVector) null, false);
      mSPcrunchEntryInformation0.addQualifierInfo(qualifierInfo0);
      // Undeclared exception!
      try { 
        mSPcrunchEntryInformation0.isValidQualifier((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      blastEntryInformation0.addKey(key0);
      Key key1 = new Key((String) null, true);
      // Undeclared exception!
      try { 
        blastEntryInformation0.isRequiredQualifier(key1, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.Key", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      Qualifier qualifier0 = new Qualifier();
      InvalidQualifierException invalidQualifierException0 = new InvalidQualifierException("", qualifier0);
      // Undeclared exception!
      try { 
        mSPcrunchEntryInformation0.fixException(invalidQualifierException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      // Undeclared exception!
      try { 
        blastEntryInformation0.addQualifierInfo((QualifierInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleEntryInformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      KeyVector keyVector0 = new KeyVector();
      keyVector0.add((Object) "misc_feature");
      QualifierInfo qualifierInfo0 = new QualifierInfo("misc_feature", 2814, keyVector0, keyVector0, false);
      // Undeclared exception!
      try { 
        simpleEntryInformation0.addQualifierInfo(qualifierInfo0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to uk.ac.sanger.artemis.io.Key
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleEntryInformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      // Undeclared exception!
      try { 
        simpleEntryInformation0.addKey((Key) null);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - adding a null object
         //
         verifyException("uk.ac.sanger.artemis.util.FastVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = null;
      try {
        simpleEntryInformation0 = new SimpleEntryInformation((EntryInformation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleEntryInformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      blastEntryInformation0.getAllQualifierInfo();
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      blastEntryInformation0.getAllQualifierInfo();
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      mSPcrunchEntryInformation0.getQualifierInfo((String) null);
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      Key key1 = blastEntryInformation0.getDefaultKey();
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("M,46 W", key1);
      blastEntryInformation0.fixException(invalidRelationException0);
      KeyVector keyVector0 = new KeyVector(key1);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      assertEquals("misc_feature", key1.getKeyString());
      
      boolean boolean0 = blastEntryInformation0.isValidKey(key0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      Key key1 = blastEntryInformation0.getDefaultKey();
      KeyVector keyVector0 = new KeyVector(key1);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      assertEquals(12, key1.length());
      
      boolean boolean0 = blastEntryInformation0.isValidKey(key0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = Key.CDS;
      blastEntryInformation0.isValidKey(key0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("");
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("o,DIR] E", key0);
      blastEntryInformation0.fixException(invalidRelationException0);
      blastEntryInformation0.getValidKeys();
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      blastEntryInformation0.getValidKeys();
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = Key.CDS;
      Key key1 = blastEntryInformation0.getDefaultKey();
      blastEntryInformation0.addKey(key1);
      assertEquals("misc_feature", key1.toString());
      
      blastEntryInformation0.addKey(key0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      boolean boolean0 = mSPcrunchEntryInformation0.useEMBLFormat();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = Key.CDS;
      Qualifier qualifier0 = new Qualifier(" used with conflicting types");
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("region", key0, qualifier0);
      blastEntryInformation0.fixException(invalidRelationException0);
      blastEntryInformation0.fixException(invalidRelationException0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      Key key1 = blastEntryInformation0.getDefaultKey();
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("M,46 W", key1);
      blastEntryInformation0.fixException(invalidRelationException0);
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      Key key2 = blastEntryInformation0.getDefaultKey();
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertEquals(12, key2.length());
      assertTrue(key2.equals((Object)key1));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      boolean boolean0 = blastEntryInformation0.isValidKey(key0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      StringVector stringVector0 = new StringVector();
      stringVector0.add("}+UPQ;nC{PX_");
      Qualifier qualifier0 = new Qualifier("", stringVector0);
      InvalidQualifierException invalidQualifierException0 = new InvalidQualifierException("svkAa,~", qualifier0);
      blastEntryInformation0.fixException(invalidQualifierException0);
      boolean boolean0 = blastEntryInformation0.isRequiredQualifier(key0, "!VE");
      assertFalse(boolean0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertEquals(12, key0.length());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      boolean boolean0 = blastEntryInformation0.isRequiredQualifier(key0, "M,46 W");
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      Key key1 = blastEntryInformation0.getDefaultKey();
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("M,46 W", key1);
      blastEntryInformation0.fixException(invalidRelationException0);
      assertEquals(12, key1.length());
      
      boolean boolean0 = blastEntryInformation0.isRequiredQualifier(key0, "M,46 W");
      assertFalse(boolean0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = blastEntryInformation0.getDefaultKey();
      blastEntryInformation0.addKey(key0);
      boolean boolean0 = blastEntryInformation0.isRequiredQualifier(key0, (String) null);
      assertFalse(boolean0);
      assertEquals("misc_feature", key0.getKeyString());
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      Key key0 = Key.CDS;
      QualifierInfo qualifierInfo0 = new QualifierInfo("}", (-1), (KeyVector) null, (KeyVector) null, false);
      mSPcrunchEntryInformation0.addQualifierInfo(qualifierInfo0);
      boolean boolean0 = mSPcrunchEntryInformation0.isValidQualifier(key0, "");
      assertFalse(boolean0);
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      boolean boolean0 = blastEntryInformation0.isValidQualifier(key0, "M,46 W");
      assertTrue(boolean0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      Key key1 = blastEntryInformation0.getDefaultKey();
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("M,46 W", key1);
      blastEntryInformation0.fixException(invalidRelationException0);
      assertEquals(12, key1.length());
      
      boolean boolean0 = blastEntryInformation0.isValidQualifier(key0, "M,46 W");
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("M,46 W", key0);
      blastEntryInformation0.fixException(invalidRelationException0);
      boolean boolean0 = blastEntryInformation0.isValidQualifier(key0, "M,46 W");
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation();
      Key key0 = simpleEntryInformation0.getDefaultKey();
      Qualifier qualifier0 = new Qualifier("");
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("region", key0, qualifier0);
      simpleEntryInformation0.fixException(invalidRelationException0);
      assertEquals(12, key0.length());
      
      boolean boolean0 = simpleEntryInformation0.isValidQualifier("");
      assertTrue(boolean0);
      assertFalse(simpleEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      boolean boolean0 = mSPcrunchEntryInformation0.isValidQualifier("[_'RZr+E+@");
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      QualifierInfo qualifierInfo0 = new QualifierInfo(" used with conflicting types", 0, (KeyVector) null, (KeyVector) null, true);
      mSPcrunchEntryInformation0.addQualifierInfo(qualifierInfo0);
      boolean boolean0 = mSPcrunchEntryInformation0.isValidQualifier("h>0>=^");
      assertFalse(boolean0);
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      Key key0 = new Key("h>0>=^", true);
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("Cannot extend a symbolic allele", key0);
      mSPcrunchEntryInformation0.fixException(invalidRelationException0);
      KeyVector keyVector0 = mSPcrunchEntryInformation0.getSortedValidKeys();
      QualifierInfo qualifierInfo0 = new QualifierInfo(" used with conflicting types", 0, keyVector0, keyVector0, true);
      mSPcrunchEntryInformation0.addQualifierInfo(qualifierInfo0);
      StringVector stringVector0 = mSPcrunchEntryInformation0.getRequiredQualifiers(key0);
      assertNotNull(stringVector0);
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = Key.CDS;
      blastEntryInformation0.getRequiredQualifiers(key0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      Key key0 = new Key("h>0>=^", true);
      QualifierInfo qualifierInfo0 = new QualifierInfo(" used with conflicting types", 0, (KeyVector) null, (KeyVector) null, true);
      mSPcrunchEntryInformation0.addQualifierInfo(qualifierInfo0);
      StringVector stringVector0 = mSPcrunchEntryInformation0.getRequiredQualifiers(key0);
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
      assertNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      Key key1 = blastEntryInformation0.getDefaultKey();
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      StringVector stringVector0 = blastEntryInformation0.getValidQualifierNames(key1);
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNull(stringVector0);
      assertEquals(12, key1.length());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      Key key0 = new Key("h>0>=^", true);
      mSPcrunchEntryInformation0.getValidQualifierNames(key0);
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      StringVector stringVector0 = blastEntryInformation0.getValidQualifierNames(key0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertNotNull(stringVector0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      mSPcrunchEntryInformation0.getSortedValidKeys();
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      Key key1 = blastEntryInformation0.getDefaultKey();
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("M,46 W", key1);
      blastEntryInformation0.fixException(invalidRelationException0);
      assertEquals(12, key1.length());
      
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      KeyVector keyVector1 = blastEntryInformation0.getValidKeys();
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertEquals(2, keyVector1.size());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("M,46 W", key0);
      blastEntryInformation0.fixException(invalidRelationException0);
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("M,46 W", 130, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      blastEntryInformation0.getValidKeys();
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = Key.CDS;
      Qualifier qualifier0 = new Qualifier(" used with conflicting types");
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("region", key0, qualifier0);
      blastEntryInformation0.fixException(invalidRelationException0);
      QualifierInfo qualifierInfo0 = blastEntryInformation0.getQualifierInfo(" used with conflicting types");
      assertNotNull(qualifierInfo0);
      
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
      assertFalse(qualifierInfo0.isOnceOnly());
      assertEquals(1, qualifierInfo0.getType());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      KeyVector keyVector0 = new KeyVector();
      QualifierInfo qualifierInfo0 = new QualifierInfo("Ij{-*#dDN~W}&O#b", 0, keyVector0, keyVector0, false);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      QualifierInfo qualifierInfo1 = new QualifierInfo("Ij{-*#dDN~W}&O#b", 3, keyVector0, keyVector0, true);
      try { 
        blastEntryInformation0.addQualifierInfo(qualifierInfo1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // qualifier Ij{-*#dDN~W}&O#b used with conflicting types
         //
         verifyException("uk.ac.sanger.artemis.io.SimpleEntryInformation", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      QualifierInfo qualifierInfo0 = new QualifierInfo(" used with conflicting types", 0, (KeyVector) null, (KeyVector) null, true);
      mSPcrunchEntryInformation0.addQualifierInfo(qualifierInfo0);
      mSPcrunchEntryInformation0.addQualifierInfo(qualifierInfo0);
      assertFalse(mSPcrunchEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("");
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("o,DIR] E", key0);
      blastEntryInformation0.fixException(invalidRelationException0);
      InvalidKeyException invalidKeyException0 = new InvalidKeyException((String) null, (Key) null);
      // Undeclared exception!
      try { 
        blastEntryInformation0.fixException(invalidKeyException0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // internal error - adding a null object
         //
         verifyException("uk.ac.sanger.artemis.util.FastVector", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key("h.yu", false);
      InvalidRelationException invalidRelationException0 = new InvalidRelationException("M,46 W", key0);
      blastEntryInformation0.fixException(invalidRelationException0);
      blastEntryInformation0.addKey(key0);
      assertFalse(blastEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      Key key0 = new Key("", false);
      mSPcrunchEntryInformation0.addKey(key0);
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation(mSPcrunchEntryInformation0);
      Key key1 = simpleEntryInformation0.getDefaultKey();
      assertFalse(simpleEntryInformation0.useEMBLFormat());
      assertSame(key1, key0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      BlastEntryInformation blastEntryInformation0 = new BlastEntryInformation();
      Key key0 = new Key((String) null, false);
      KeyVector keyVector0 = new KeyVector(key0);
      QualifierInfo qualifierInfo0 = new QualifierInfo("internal error - unexpected exception: ", 62, keyVector0, keyVector0, true);
      blastEntryInformation0.addQualifierInfo(qualifierInfo0);
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation(blastEntryInformation0);
      assertFalse(simpleEntryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      EntryInformation entryInformation0 = SimpleEntryInformation.getDefaultEntryInformation();
      Key key0 = entryInformation0.getDefaultKey();
      entryInformation0.addKey(key0);
      assertEquals("misc_feature", key0.getKeyString());
      
      KeyVector keyVector0 = entryInformation0.getUserKeys();
      QualifierInfo qualifierInfo0 = new QualifierInfo("internal error - unexpected exception: ", 2577, keyVector0, keyVector0, true);
      entryInformation0.addQualifierInfo(qualifierInfo0);
      entryInformation0.addQualifierInfo(qualifierInfo0);
      assertFalse(entryInformation0.useEMBLFormat());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MSPcrunchEntryInformation mSPcrunchEntryInformation0 = new MSPcrunchEntryInformation();
      SimpleEntryInformation simpleEntryInformation0 = new SimpleEntryInformation(mSPcrunchEntryInformation0);
      assertFalse(simpleEntryInformation0.useEMBLFormat());
  }
}