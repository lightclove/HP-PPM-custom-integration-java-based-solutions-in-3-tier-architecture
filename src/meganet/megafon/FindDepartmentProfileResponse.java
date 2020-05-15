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
/*    */ @XmlType(name = "", propOrder = {"findDepartmentProfileResult"})
/*    */ @XmlRootElement(name = "FindDepartmentProfileResponse")
/*    */ public class FindDepartmentProfileResponse
/*    */ {
/*    */   @XmlElementRef(name = "FindDepartmentProfileResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<OrgDepartment> findDepartmentProfileResult;
/*    */   
/*    */   public JAXBElement<OrgDepartment> getFindDepartmentProfileResult() {
/* 51 */     return this.findDepartmentProfileResult;
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
/*    */   public void setFindDepartmentProfileResult(JAXBElement<OrgDepartment> paramJAXBElement) {
/* 63 */     this.findDepartmentProfileResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\FindDepartmentProfileResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */