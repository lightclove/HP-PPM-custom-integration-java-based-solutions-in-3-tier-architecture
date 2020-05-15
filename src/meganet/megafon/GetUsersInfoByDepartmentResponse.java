/*    */ package meganet.megafon;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import types.meganet.megafon.ArrayOfEmployee;
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
/*    */ @XmlType(name = "", propOrder = {"getUsersInfoByDepartmentResult"})
/*    */ @XmlRootElement(name = "GetUsersInfoByDepartmentResponse")
/*    */ public class GetUsersInfoByDepartmentResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetUsersInfoByDepartmentResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<ArrayOfEmployee> getUsersInfoByDepartmentResult;
/*    */   
/*    */   public JAXBElement<ArrayOfEmployee> getGetUsersInfoByDepartmentResult() {
/* 51 */     return this.getUsersInfoByDepartmentResult;
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
/*    */   public void setGetUsersInfoByDepartmentResult(JAXBElement<ArrayOfEmployee> paramJAXBElement) {
/* 63 */     this.getUsersInfoByDepartmentResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetUsersInfoByDepartmentResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */