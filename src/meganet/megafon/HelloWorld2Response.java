/*    */ package meganet.megafon;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "", propOrder = {"helloWorld2Result"})
/*    */ @XmlRootElement(name = "HelloWorld2Response")
/*    */ public class HelloWorld2Response
/*    */ {
/*    */   @XmlElementRef(name = "HelloWorld2Result", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<String> helloWorld2Result;
/*    */   
/*    */   public JAXBElement<String> getHelloWorld2Result() {
/* 50 */     return this.helloWorld2Result;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setHelloWorld2Result(JAXBElement<String> paramJAXBElement) {
/* 62 */     this.helloWorld2Result = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\HelloWorld2Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */