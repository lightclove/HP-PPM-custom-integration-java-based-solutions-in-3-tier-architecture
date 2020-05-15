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
/*    */ @XmlType(name = "", propOrder = {"getRootDepartmentIdResult"})
/*    */ @XmlRootElement(name = "GetRootDepartmentIdResponse")
/*    */ public class GetRootDepartmentIdResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetRootDepartmentIdResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<String> getRootDepartmentIdResult;
/*    */   
/*    */   public JAXBElement<String> getGetRootDepartmentIdResult() {
/* 50 */     return this.getRootDepartmentIdResult;
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
/*    */   public void setGetRootDepartmentIdResult(JAXBElement<String> paramJAXBElement) {
/* 62 */     this.getRootDepartmentIdResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetRootDepartmentIdResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */