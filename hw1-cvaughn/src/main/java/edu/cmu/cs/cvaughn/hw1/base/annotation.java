

/* First created by JCasGen Tue Sep 10 22:20:39 EDT 2013 */
package edu.cmu.cs.cvaughn.hw1.base;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Base annotation type for hw1 for software engineering
 * Updated by JCasGen Tue Sep 10 22:20:39 EDT 2013
 * XML source: /home/callie/Documents/Courses/SoftwareEngineering/workspace/hw1-cvaughn/src/main/resources/hw1-cvaughn-typesystem.xml
 * @generated */
public class annotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(annotation.class);
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
  protected annotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public annotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public annotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public annotation(JCas jcas, int begin, int end) {
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
     
}

    