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
/*    */ @XmlType(name = "", propOrder = {"findOrganizationProfileResult"})
/*    */ @XmlRootElement(name = "FindOrganizationProfileResponse")
/*    */ public class FindOrganizationProfileResponse
/*    */ {
/*    */   @XmlElementRef(name = "FindOrganizationProfileResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<OrgDepartment> findOrganizationProfileResult;
/*    */   
/*    */   public JAXBElement<OrgDepartment> getFindOrganizationProfileResult() {
/* 51 */     return this.findOrganizationProfileResult;
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
/*    */   public void setFindOrganizationProfileResult(JAXBElement<OrgDepartment> paramJAXBElement) {
/* 63 */     this.findOrganizationProfileResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\FindOrganizationProfileResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */