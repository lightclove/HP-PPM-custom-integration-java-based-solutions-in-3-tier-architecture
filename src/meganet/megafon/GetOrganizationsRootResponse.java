/*    */ package meganet.megafon;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import types.meganet.megafon.ArrayOfOrgDepartment;
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
/*    */ @XmlType(name = "", propOrder = {"getOrganizationsRootResult"})
/*    */ @XmlRootElement(name = "GetOrganizationsRootResponse")
/*    */ public class GetOrganizationsRootResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetOrganizationsRootResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<ArrayOfOrgDepartment> getOrganizationsRootResult;
/*    */   
/*    */   public JAXBElement<ArrayOfOrgDepartment> getGetOrganizationsRootResult() {
/* 51 */     return this.getOrganizationsRootResult;
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
/*    */   public void setGetOrganizationsRootResult(JAXBElement<ArrayOfOrgDepartment> paramJAXBElement) {
/* 63 */     this.getOrganizationsRootResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetOrganizationsRootResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */