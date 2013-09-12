
/* First created by JCasGen Wed Sep 11 21:49:03 EDT 2013 */
package edu.cmu.cs.cvaughn.hw1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import edu.cmu.cs.cvaughn.hw1.Base.Annotation_Type;

/** an answer to the question
 * Updated by JCasGen Wed Sep 11 21:49:11 EDT 2013
 * @generated */
public class Answer_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Answer_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Answer_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Answer(addr, Answer_Type.this);
  			   Answer_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Answer(addr, Answer_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Answer.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.cvaughn.hw1.Answer");
 
  /** @generated */
  final Feature casFeat_tokenContent;
  /** @generated */
  final int     casFeatCode_tokenContent;
  /** @generated */ 
  public int getTokenContent(int addr) {
        if (featOkTst && casFeat_tokenContent == null)
      jcas.throwFeatMissing("tokenContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokenContent);
  }
  /** @generated */    
  public void setTokenContent(int addr, int v) {
        if (featOkTst && casFeat_tokenContent == null)
      jcas.throwFeatMissing("tokenContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokenContent, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ngramContent;
  /** @generated */
  final int     casFeatCode_ngramContent;
  /** @generated */ 
  public int getNgramContent(int addr) {
        if (featOkTst && casFeat_ngramContent == null)
      jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ngramContent);
  }
  /** @generated */    
  public void setNgramContent(int addr, int v) {
        if (featOkTst && casFeat_ngramContent == null)
      jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    ll_cas.ll_setRefValue(addr, casFeatCode_ngramContent, v);}
    
   /** @generated */
  public int getNgramContent(int addr, int i) {
        if (featOkTst && casFeat_ngramContent == null)
      jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngramContent), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngramContent), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngramContent), i);
  }
   
  /** @generated */ 
  public void setNgramContent(int addr, int i, int v) {
        if (featOkTst && casFeat_ngramContent == null)
      jcas.throwFeatMissing("ngramContent", "edu.cmu.cs.cvaughn.hw1.Answer");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngramContent), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_ngramContent), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_ngramContent), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_score;
  /** @generated */
  final int     casFeatCode_score;
  /** @generated */ 
  public double getScore(int addr) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "edu.cmu.cs.cvaughn.hw1.Answer");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_score);
  }
  /** @generated */    
  public void setScore(int addr, double v) {
        if (featOkTst && casFeat_score == null)
      jcas.throwFeatMissing("score", "edu.cmu.cs.cvaughn.hw1.Answer");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_score, v);}
    
  
 
  /** @generated */
  final Feature casFeat_isRight;
  /** @generated */
  final int     casFeatCode_isRight;
  /** @generated */ 
  public boolean getIsRight(int addr) {
        if (featOkTst && casFeat_isRight == null)
      jcas.throwFeatMissing("isRight", "edu.cmu.cs.cvaughn.hw1.Answer");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isRight);
  }
  /** @generated */    
  public void setIsRight(int addr, boolean v) {
        if (featOkTst && casFeat_isRight == null)
      jcas.throwFeatMissing("isRight", "edu.cmu.cs.cvaughn.hw1.Answer");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isRight, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Answer_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokenContent = jcas.getRequiredFeatureDE(casType, "tokenContent", "uima.cas.FSList", featOkTst);
    casFeatCode_tokenContent  = (null == casFeat_tokenContent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenContent).getCode();

 
    casFeat_ngramContent = jcas.getRequiredFeatureDE(casType, "ngramContent", "uima.cas.FSArray", featOkTst);
    casFeatCode_ngramContent  = (null == casFeat_ngramContent) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ngramContent).getCode();

 
    casFeat_score = jcas.getRequiredFeatureDE(casType, "score", "uima.cas.Double", featOkTst);
    casFeatCode_score  = (null == casFeat_score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_score).getCode();

 
    casFeat_isRight = jcas.getRequiredFeatureDE(casType, "isRight", "uima.cas.Boolean", featOkTst);
    casFeatCode_isRight  = (null == casFeat_isRight) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isRight).getCode();

  }
}



    