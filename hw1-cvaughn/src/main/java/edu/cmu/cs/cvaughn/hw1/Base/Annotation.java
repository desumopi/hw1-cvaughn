

/* First created by JCasGen Wed Sep 11 21:49:03 EDT 2013 */
package edu.cmu.cs.cvaughn.hw1.Base;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** Base annotation type for hw1 for software engineering
 * Updated by JCasGen Wed Sep 11 21:49:11 EDT 2013
 * XML source: /home/callie/git/hw1-cvaughn/hw1-cvaughn/src/main/resources/hw1-cvaughn-typesystem.xml
 * @generated */
public class Annotation extends org.apache.uima.jcas.tcas.Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Annotation.class);
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
  protected Annotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Annotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Annotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Annotation(JCas jcas, int begin, int end) {
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
  //* Feature: source

  /** getter for source - gets source of object
   * @generated */
  public String getSource() {
    if (Annotation_Type.featOkTst && ((Annotation_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.cs.cvaughn.hw1.Base.Annotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Annotation_Type)jcasType).casFeatCode_source);}
    
  /** setter for source - sets source of object 
   * @generated */
  public void setSource(String v) {
    if (Annotation_Type.featOkTst && ((Annotation_Type)jcasType).casFeat_source == null)
      jcasType.jcas.throwFeatMissing("source", "edu.cmu.cs.cvaughn.hw1.Base.Annotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((Annotation_Type)jcasType).casFeatCode_source, v);}    
   
    
  //*--------------*
  //* Feature: confidence

  /** getter for confidence - gets system's confidence in object
   * @generated */
  public double getConfidence() {
    if (Annotation_Type.featOkTst && ((Annotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.cs.cvaughn.hw1.Base.Annotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Annotation_Type)jcasType).casFeatCode_confidence);}
    
  /** setter for confidence - sets system's confidence in object 
   * @generated */
  public void setConfidence(double v) {
    if (Annotation_Type.featOkTst && ((Annotation_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.cs.cvaughn.hw1.Base.Annotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Annotation_Type)jcasType).casFeatCode_confidence, v);}    
  }

    