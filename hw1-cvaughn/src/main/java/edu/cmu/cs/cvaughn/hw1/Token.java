

/* First created by JCasGen Wed Sep 11 21:49:03 EDT 2013 */
package edu.cmu.cs.cvaughn.hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.cs.cvaughn.hw1.Base.Annotation;


/** token, bounded by space and/or punctuation
 * Updated by JCasGen Wed Sep 11 21:49:11 EDT 2013
 * XML source: /home/callie/git/hw1-cvaughn/hw1-cvaughn/src/main/resources/hw1-cvaughn-typesystem.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: beginning

  /** getter for beginning - gets Marks first index of the token
   * @generated */
  public int getBeginning() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_beginning == null)
      jcasType.jcas.throwFeatMissing("beginning", "edu.cmu.cs.cvaughn.hw1.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_beginning);}
    
  /** setter for beginning - sets Marks first index of the token 
   * @generated */
  public void setBeginning(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_beginning == null)
      jcasType.jcas.throwFeatMissing("beginning", "edu.cmu.cs.cvaughn.hw1.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_beginning, v);}    
   
    
  //*--------------*
  //* Feature: ending

  /** getter for ending - gets Marks ending index of the token
   * @generated */
  public int getEnding() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_ending == null)
      jcasType.jcas.throwFeatMissing("ending", "edu.cmu.cs.cvaughn.hw1.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_ending);}
    
  /** setter for ending - sets Marks ending index of the token 
   * @generated */
  public void setEnding(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_ending == null)
      jcasType.jcas.throwFeatMissing("ending", "edu.cmu.cs.cvaughn.hw1.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_ending, v);}    
   
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets String content of the token
   * @generated */
  public String getContent() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets String content of the token 
   * @generated */
  public void setContent(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_content, v);}    
  }

    