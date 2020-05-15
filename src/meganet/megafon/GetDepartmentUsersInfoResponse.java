/*    */ package meganet.megafon;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import types.meganet.megafon.DepartmentWithEmployees;
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
/*    */ @XmlType(name = "", propOrder = {"getDepartmentUsersInfoResult"})
/*    */ @XmlRootElement(name = "GetDepartmentUsersInfoResponse")
/*    */ public class GetDepartmentUsersInfoResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetDepartmentUsersInfoResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<DepartmentWithEmployees> getDepartmentUsersInfoResult;
/*    */   
/*    */   public JAXBElement<DepartmentWithEmployees> getGetDepartmentUsersInfoResult() {
/* 51 */     return this.getDepartmentUsersInfoResult;
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
/*    */   public void setGetDepartmentUsersInfoResult(JAXBElement<DepartmentWithEmployees> paramJAXBElement) {
/* 63 */     this.getDepartmentUsersInfoResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetDepartmentUsersInfoResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */