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
/*    */ @XmlType(name = "", propOrder = {"helloWorldResult"})
/*    */ @XmlRootElement(name = "HelloWorldResponse")
/*    */ public class HelloWorldResponse
/*    */ {
/*    */   @XmlElementRef(name = "HelloWorldResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<String> helloWorldResult;
/*    */   
/*    */   public JAXBElement<String> getHelloWorldResult() {
/* 50 */     return this.helloWorldResult;
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
/*    */   public void setHelloWorldResult(JAXBElement<String> paramJAXBElement) {
/* 62 */     this.helloWorldResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\HelloWorldResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */