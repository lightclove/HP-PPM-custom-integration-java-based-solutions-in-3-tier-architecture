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
/*    */ @XmlType(name = "", propOrder = {"getOrgStructureNameByIdResult"})
/*    */ @XmlRootElement(name = "GetOrgStructureNameByIdResponse")
/*    */ public class GetOrgStructureNameByIdResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetOrgStructureNameByIdResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<String> getOrgStructureNameByIdResult;
/*    */   
/*    */   public JAXBElement<String> getGetOrgStructureNameByIdResult() {
/* 50 */     return this.getOrgStructureNameByIdResult;
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
/*    */   public void setGetOrgStructureNameByIdResult(JAXBElement<String> paramJAXBElement) {
/* 62 */     this.getOrgStructureNameByIdResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetOrgStructureNameByIdResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */