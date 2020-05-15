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
/*    */ @XmlType(name = "", propOrder = {"getChildDepartmentsResult"})
/*    */ @XmlRootElement(name = "GetChildDepartmentsResponse")
/*    */ public class GetChildDepartmentsResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetChildDepartmentsResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<ArrayOfOrgDepartment> getChildDepartmentsResult;
/*    */   
/*    */   public JAXBElement<ArrayOfOrgDepartment> getGetChildDepartmentsResult() {
/* 51 */     return this.getChildDepartmentsResult;
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
/*    */   public void setGetChildDepartmentsResult(JAXBElement<ArrayOfOrgDepartment> paramJAXBElement) {
/* 63 */     this.getChildDepartmentsResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetChildDepartmentsResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */