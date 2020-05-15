/*    */ package org.datacontract.schemas._2004._07.system_collections;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlElementDecl;
/*    */ import javax.xml.bind.annotation.XmlRegistry;
/*    */ import javax.xml.namespace.QName;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @XmlRegistry
/*    */ public class ObjectFactory
/*    */ {
/* 27 */   private static final QName _ArrayOfKeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "ArrayOfKeyValuePairOfstringstring");
/* 28 */   private static final QName _KeyValuePairOfstringstring_QNAME = new QName("http://schemas.datacontract.org/2004/07/System.Collections.Generic", "KeyValuePairOfstringstring");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ArrayOfKeyValuePairOfstringstring createArrayOfKeyValuePairOfstringstring() {
/* 42 */     return new ArrayOfKeyValuePairOfstringstring();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public KeyValuePairOfstringstring createKeyValuePairOfstringstring() {
/* 50 */     return new KeyValuePairOfstringstring();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "ArrayOfKeyValuePairOfstringstring")
/*    */   public JAXBElement<ArrayOfKeyValuePairOfstringstring> createArrayOfKeyValuePairOfstringstring(ArrayOfKeyValuePairOfstringstring paramArrayOfKeyValuePairOfstringstring) {
/* 59 */     return new JAXBElement<ArrayOfKeyValuePairOfstringstring>(_ArrayOfKeyValuePairOfstringstring_QNAME, ArrayOfKeyValuePairOfstringstring.class, null, paramArrayOfKeyValuePairOfstringstring);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/System.Collections.Generic", name = "KeyValuePairOfstringstring")
/*    */   public JAXBElement<KeyValuePairOfstringstring> createKeyValuePairOfstringstring(KeyValuePairOfstringstring paramKeyValuePairOfstringstring) {
/* 68 */     return new JAXBElement<KeyValuePairOfstringstring>(_KeyValuePairOfstringstring_QNAME, KeyValuePairOfstringstring.class, null, paramKeyValuePairOfstringstring);
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\org\datacontract\schemas\_2004\_07\system_collections\ObjectFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */