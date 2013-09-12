

/* First created by JCasGen Wed Sep 11 21:49:03 EDT 2013 */
package edu.cmu.cs.cvaughn.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import edu.cmu.cs.cvaughn.hw1.Base.Annotation;


/** a question to be answered
 * Updated by JCasGen Wed Sep 11 22:27:25 EDT 2013
 * XML source: /home/callie/git/hw1-cvaughn/hw1-cvaughn/src/main/resources/hw1-cvaughn-typesystem.xml
 * @generated */
public class Question extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Question.class);
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
  protected Question() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Question(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Question(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Question(JCas jcas, int begin, int end) {
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

  /** getter for tokenContent - gets the content of the question in Tokens
   * @generated */
  public FSArray getTokenContent() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenContent == null)
      jcasType.jcas.throwFeatMissing("tokenContent", "edu.cmu.cs.cvaughn.hw1.Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenContent)));}
    
  /** setter for tokenContent - sets the content of the question in Tokens 
   * @generated */
  public void setTokenContent(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenContent == null)
      jcasType.jcas.throwFeatMissing("tokenContent", "edu.cmu.cs.cvaughn.hw1.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenContent, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for tokenContent - gets an indexed value - the content of the question in Tokens
   * @generated */
  public Token getTokenContent(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenContent == null)
      jcasType.jcas.throwFeatMissing("tokenContent", "edu.cmu.cs.cvaughn.hw1.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenContent), i);
    return (Token)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenContent), i)));}

  /** indexed setter for tokenContent - sets an indexed value - the content of the question in Tokens
   * @generated */
  public void setTokenContent(int i, Token v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_tokenContent == null)
      jcasType.jcas.throwFeatMissing("tokenContent", "edu.cmu.cs.cvaughn.hw1.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenContent), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_tokenContent), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: ngramContent

  /** getter for ngramContent - gets the content of the question in N-grams
   * @generated */
  public FSArray getNgramContent() {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngramContent == null)
      jcasType.jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Question");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngramContent)));}
    
  /** setter for ngramContent - sets the content of the question in N-grams 
   * @generated */
  public void setNgramContent(FSArray v) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngramContent == null)
      jcasType.jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Question");
    jcasType.ll_cas.ll_setRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngramContent, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for ngramContent - gets an indexed value - the content of the question in N-grams
   * @generated */
  public Ngram getNgramContent(int i) {
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngramContent == null)
      jcasType.jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngramContent), i);
    return (Ngram)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngramContent), i)));}

  /** indexed setter for ngramContent - sets an indexed value - the content of the question in N-grams
   * @generated */
  public void setNgramContent(int i, Ngram v) { 
    if (Question_Type.featOkTst && ((Question_Type)jcasType).casFeat_ngramContent == null)
      jcasType.jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Question");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngramContent), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((Question_Type)jcasType).casFeatCode_ngramContent), i, jcasType.ll_cas.ll_getFSRef(v));}
  }

    