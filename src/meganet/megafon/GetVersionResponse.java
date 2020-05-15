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
/*    */ @XmlType(name = "", propOrder = {"getVersionResult"})
/*    */ @XmlRootElement(name = "GetVersionResponse")
/*    */ public class GetVersionResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetVersionResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<String> getVersionResult;
/*    */   
/*    */   public JAXBElement<String> getGetVersionResult() {
/* 50 */     return this.getVersionResult;
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
/*    */   public void setGetVersionResult(JAXBElement<String> paramJAXBElement) {
/* 62 */     this.getVersionResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetVersionResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */