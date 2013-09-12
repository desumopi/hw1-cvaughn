
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
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 1, 2, or 3-gram
 * Updated by JCasGen Wed Sep 11 22:27:25 EDT 2013
 * @generated */
public class Ngram_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Ngram_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Ngram_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Ngram(addr, Ngram_Type.this);
  			   Ngram_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Ngram(addr, Ngram_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Ngram.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.cvaughn.hw1.Ngram");
 
  /** @generated */
  final Feature casFeat_beginnning;
  /** @generated */
  final int     casFeatCode_beginnning;
  /** @generated */ 
  public int getBeginnning(int addr) {
        if (featOkTst && casFeat_beginnning == null)
      jcas.throwFeatMissing("beginnning", "edu.cmu.cs.cvaughn.hw1.Ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_beginnning);
  }
  /** @generated */    
  public void setBeginnning(int addr, int v) {
        if (featOkTst && casFeat_beginnning == null)
      jcas.throwFeatMissing("beginnning", "edu.cmu.cs.cvaughn.hw1.Ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_beginnning, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ending;
  /** @generated */
  final int     casFeatCode_ending;
  /** @generated */ 
  public int getEnding(int addr) {
        if (featOkTst && casFeat_ending == null)
      jcas.throwFeatMissing("ending", "edu.cmu.cs.cvaughn.hw1.Ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_ending);
  }
  /** @generated */    
  public void setEnding(int addr, int v) {
        if (featOkTst && casFeat_ending == null)
      jcas.throwFeatMissing("ending", "edu.cmu.cs.cvaughn.hw1.Ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_ending, v);}
    
  
 
  /** @generated */
  final Feature casFeat_content;
  /** @generated */
  final int     casFeatCode_content;
  /** @generated */ 
  public int getContent(int addr) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Ngram");
    return ll_cas.ll_getRefValue(addr, casFeatCode_content);
  }
  /** @generated */    
  public void setContent(int addr, int v) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Ngram");
    ll_cas.ll_setRefValue(addr, casFeatCode_content, v);}
    
   /** @generated */
  public String getContent(int addr, int i) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Ngram");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_content), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_content), i);
  return ll_cas.ll_getStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_content), i);
  }
   
  /** @generated */ 
  public void setContent(int addr, int i, String v) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Ngram");
    if (lowLevelTypeChecks)
      ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_content), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_content), i);
    ll_cas.ll_setStringArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_content), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_n;
  /** @generated */
  final int     casFeatCode_n;
  /** @generated */ 
  public int getN(int addr) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "edu.cmu.cs.cvaughn.hw1.Ngram");
    return ll_cas.ll_getIntValue(addr, casFeatCode_n);
  }
  /** @generated */    
  public void setN(int addr, int v) {
        if (featOkTst && casFeat_n == null)
      jcas.throwFeatMissing("n", "edu.cmu.cs.cvaughn.hw1.Ngram");
    ll_cas.ll_setIntValue(addr, casFeatCode_n, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Ngram_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_beginnning = jcas.getRequiredFeatureDE(casType, "beginnning", "uima.cas.Integer", featOkTst);
    casFeatCode_beginnning  = (null == casFeat_beginnning) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_beginnning).getCode();

 
    casFeat_ending = jcas.getRequiredFeatureDE(casType, "ending", "uima.cas.Integer", featOkTst);
    casFeatCode_ending  = (null == casFeat_ending) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ending).getCode();

 
    casFeat_content = jcas.getRequiredFeatureDE(casType, "content", "uima.cas.StringArray", featOkTst);
    casFeatCode_content  = (null == casFeat_content) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_content).getCode();

 
    casFeat_n = jcas.getRequiredFeatureDE(casType, "n", "uima.cas.Integer", featOkTst);
    casFeatCode_n  = (null == casFeat_n) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_n).getCode();

  }
}



    