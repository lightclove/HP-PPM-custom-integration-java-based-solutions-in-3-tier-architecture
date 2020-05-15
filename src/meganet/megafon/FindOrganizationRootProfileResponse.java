/*    */ package meganet.megafon;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import types.meganet.megafon.OrgDepartment;
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
/*    */ @XmlType(name = "", propOrder = {"findOrganizationRootProfileResult"})
/*    */ @XmlRootElement(name = "FindOrganizationRootProfileResponse")
/*    */ public class FindOrganizationRootProfileResponse
/*    */ {
/*    */   @XmlElementRef(name = "FindOrganizationRootProfileResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<OrgDepartment> findOrganizationRootProfileResult;
/*    */   
/*    */   public JAXBElement<OrgDepartment> getFindOrganizationRootProfileResult() {
/* 51 */     return this.findOrganizationRootProfileResult;
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
/*    */   public void setFindOrganizationRootProfileResult(JAXBElement<OrgDepartment> paramJAXBElement) {
/* 63 */     this.findOrganizationRootProfileResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\FindOrganizationRootProfileResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */