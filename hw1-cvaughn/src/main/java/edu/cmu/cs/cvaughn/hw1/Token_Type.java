
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

/** token, bounded by space and/or punctuation
 * Updated by JCasGen Wed Sep 11 22:27:25 EDT 2013
 * @generated */
public class Token_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.cs.cvaughn.hw1.Token");
 
  /** @generated */
  final Feature casFeat_beginning;
  /** @generated */
  final int     casFeatCode_beginning;
  /** @generated */ 
  public int getBeginning(int addr) {
        if (featOkTst && casFeat_beginning == null)
      jcas.throwFeatMissing("beginning", "edu.cmu.cs.cvaughn.hw1.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_beginning);
  }
  /** @generated */    
  public void setBeginning(int addr, int v) {
        if (featOkTst && casFeat_beginning == null)
      jcas.throwFeatMissing("beginning", "edu.cmu.cs.cvaughn.hw1.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_beginning, v);}
    
  
 
  /** @generated */
  final Feature casFeat_ending;
  /** @generated */
  final int     casFeatCode_ending;
  /** @generated */ 
  public int getEnding(int addr) {
        if (featOkTst && casFeat_ending == null)
      jcas.throwFeatMissing("ending", "edu.cmu.cs.cvaughn.hw1.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_ending);
  }
  /** @generated */    
  public void setEnding(int addr, int v) {
        if (featOkTst && casFeat_ending == null)
      jcas.throwFeatMissing("ending", "edu.cmu.cs.cvaughn.hw1.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_ending, v);}
    
  
 
  /** @generated */
  final Feature casFeat_content;
  /** @generated */
  final int     casFeatCode_content;
  /** @generated */ 
  public String getContent(int addr) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_content);
  }
  /** @generated */    
  public void setContent(int addr, String v) {
        if (featOkTst && casFeat_content == null)
      jcas.throwFeatMissing("content", "edu.cmu.cs.cvaughn.hw1.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_content, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_beginning = jcas.getRequiredFeatureDE(casType, "beginning", "uima.cas.Integer", featOkTst);
    casFeatCode_beginning  = (null == casFeat_beginning) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_beginning).getCode();

 
    casFeat_ending = jcas.getRequiredFeatureDE(casType, "ending", "uima.cas.Integer", featOkTst);
    casFeatCode_ending  = (null == casFeat_ending) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ending).getCode();

 
    casFeat_content = jcas.getRequiredFeatureDE(casType, "content", "uima.cas.String", featOkTst);
    casFeatCode_content  = (null == casFeat_content) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_content).getCode();

  }
}



    