

/* First created by JCasGen Wed Sep 11 21:49:03 EDT 2013 */
package edu.cmu.cs.cvaughn.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;
import org.apache.uima.jcas.cas.StringArray;


/** 1, 2, or 3-gram
 * Updated by JCasGen Wed Sep 11 21:49:11 EDT 2013
 * XML source: /home/callie/git/hw1-cvaughn/hw1-cvaughn/src/main/resources/hw1-cvaughn-typesystem.xml
 * @generated */
public class Ngram extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Ngram.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Ngram() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Ngram(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Ngram(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Ngram(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: beginnning

  /** getter for beginnning - gets Marks beginning index of N-gram
   * @generated */
  public int getBeginnning() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_beginnning == null)
      jcasType.jcas.throwFeatMissing("beginnning", "edu.cmu.cs.cvaughn.hw1.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_beginnning);}
    
  /** setter for beginnning - sets Marks beginning index of N-gram 
   * @generated */
  public void setBeginnning(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_beginnning == null)
      jcasType.jcas.throwFeatMissing("beginnning", "edu.cmu.cs.cvaughn.hw1.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_beginnning, v);}    
   
    
  //*--------------*
  //* Feature: ending

  /** getter for ending - gets Marks ending index of the N-gram
   * @generated */
  public int getEnding() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_ending == null)
      jcasType.jcas.throwFeatMissing("ending", "edu.cmu.cs.cvaughn.hw1.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_ending);}
    
  /** setter for ending - sets Marks ending index of the N-gram 
   * @generated */
  public void setEnding(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_ending == null)
      jcasType.jcas.throwFeatMissing("ending", "edu.cmu.cs.cvaughn.hw1.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_ending, v);}    
   
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets String content of the N-gram -- each String in the array is one gram in the N-gram
   * @generated */
  public StringArray getContent() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Ngram");
    return (StringArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_content)));}
    
  /** setter for content - sets String content of the N-gram -- each String in the array is one gram in the N-gram 
   * @generated */
  public void setContent(StringArray v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Ngram");
    jcasType.ll_cas.ll_setRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_content, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for content - gets an indexed value - String content of the N-gram -- each String in the array is one gram in the N-gram
   * @generated */
  public String getContent(int i) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_content), i);
    return jcasType.ll_cas.ll_getStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_content), i);}

  /** indexed setter for content - sets an indexed value - String content of the N-gram -- each String in the array is one gram in the N-gram
   * @generated */
  public void setContent(int i, String v) { 
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Ngram");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_content), i);
    jcasType.ll_cas.ll_setStringArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Ngram_Type)jcasType).casFeatCode_content), i, v);}
   
    
  //*--------------*
  //* Feature: n

  /** getter for n - gets The length (n) of the N-gram
   * @generated */
  public int getN() {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "edu.cmu.cs.cvaughn.hw1.Ngram");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_n);}
    
  /** setter for n - sets The length (n) of the N-gram 
   * @generated */
  public void setN(int v) {
    if (Ngram_Type.featOkTst && ((Ngram_Type)jcasType).casFeat_n == null)
      jcasType.jcas.throwFeatMissing("n", "edu.cmu.cs.cvaughn.hw1.Ngram");
    jcasType.ll_cas.ll_setIntValue(addr, ((Ngram_Type)jcasType).casFeatCode_n, v);}    
  }

    