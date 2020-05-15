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
/*    */ @XmlType(name = "", propOrder = {"getDepartmentInfoResult"})
/*    */ @XmlRootElement(name = "GetDepartmentInfoResponse")
/*    */ public class GetDepartmentInfoResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetDepartmentInfoResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<OrgDepartment> getDepartmentInfoResult;
/*    */   
/*    */   public JAXBElement<OrgDepartment> getGetDepartmentInfoResult() {
/* 51 */     return this.getDepartmentInfoResult;
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
/*    */   public void setGetDepartmentInfoResult(JAXBElement<OrgDepartment> paramJAXBElement) {
/* 63 */     this.getDepartmentInfoResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetDepartmentInfoResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */