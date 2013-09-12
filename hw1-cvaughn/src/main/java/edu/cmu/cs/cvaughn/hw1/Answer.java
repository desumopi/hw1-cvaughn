

/* First created by JCasGen Wed Sep 11 21:49:03 EDT 2013 */
package edu.cmu.cs.cvaughn.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.FSList;
import edu.cmu.cs.cvaughn.hw1.Base.Annotation;


/** a potential answer to the question
 * Updated by JCasGen Wed Sep 11 22:27:25 EDT 2013
 * XML source: /home/callie/git/hw1-cvaughn/hw1-cvaughn/src/main/resources/hw1-cvaughn-typesystem.xml
 * @generated */
public class Answer extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Answer.class);
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
  protected Answer() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Answer(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Answer(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Answer(JCas jcas, int begin, int end) {
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
  //* Feature: tokenContent

  /** getter for tokenContent - gets the content of the answer in Tokens
   * @generated */
  public FSList getTokenContent() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenContent == null)
      jcasType.jcas.throwFeatMissing("tokenContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenContent)));}
    
  /** setter for tokenContent - sets the content of the answer in Tokens 
   * @generated */
  public void setTokenContent(FSList v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_tokenContent == null)
      jcasType.jcas.throwFeatMissing("tokenContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_tokenContent, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: ngramContent

  /** getter for ngramContent - gets the content of the answer in N-grams
   * @generated */
  public FSArray getNgramContent() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngramContent == null)
      jcasType.jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngramContent)));}
    
  /** setter for ngramContent - sets the content of the answer in N-grams 
   * @generated */
  public void setNgramContent(FSArray v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngramContent == null)
      jcasType.jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    jcasType.ll_cas.ll_setRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngramContent, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngramContent - gets an indexed value - the content of the answer in N-grams
   * @generated */
  public Ngram getNgramContent(int i) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngramContent == null)
      jcasType.jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngramContent), i);
    return (Ngram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngramContent), i)));}

  /** indexed setter for ngramContent - sets an indexed value - the content of the answer in N-grams
   * @generated */
  public void setNgramContent(int i, Ngram v) { 
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_ngramContent == null)
      jcasType.jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngramContent), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Answer_Type)jcasType).casFeatCode_ngramContent), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: score

  /** getter for score - gets the score of the answer
   * @generated */
  public double getScore() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "edu.cmu.cs.cvaughn.hw1.Answer");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_score);}
    
  /** setter for score - sets the score of the answer 
   * @generated */
  public void setScore(double v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_score == null)
      jcasType.jcas.throwFeatMissing("score", "edu.cmu.cs.cvaughn.hw1.Answer");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Answer_Type)jcasType).casFeatCode_score, v);}    
   
    
  //*--------------*
  //* Feature: isRight

  /** getter for isRight - gets true if the answer is right, false if the answer is wrong
   * @generated */
  public boolean getIsRight() {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isRight == null)
      jcasType.jcas.throwFeatMissing("isRight", "edu.cmu.cs.cvaughn.hw1.Answer");
    return jcasType.ll_cas.ll_getBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isRight);}
    
  /** setter for isRight - sets true if the answer is right, false if the answer is wrong 
   * @generated */
  public void setIsRight(boolean v) {
    if (Answer_Type.featOkTst && ((Answer_Type)jcasType).casFeat_isRight == null)
      jcasType.jcas.throwFeatMissing("isRight", "edu.cmu.cs.cvaughn.hw1.Answer");
    jcasType.ll_cas.ll_setBooleanValue(addr, ((Answer_Type)jcasType).casFeatCode_isRight, v);}    
  }

    