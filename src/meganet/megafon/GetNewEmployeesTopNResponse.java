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
/*    */ @XmlType(name = "", propOrder = {"getNewEmployeesTopNResult"})
/*    */ @XmlRootElement(name = "GetNewEmployeesTopNResponse")
/*    */ public class GetNewEmployeesTopNResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetNewEmployeesTopNResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<ArrayOfOrgDepartment> getNewEmployeesTopNResult;
/*    */   
/*    */   public JAXBElement<ArrayOfOrgDepartment> getGetNewEmployeesTopNResult() {
/* 51 */     return this.getNewEmployeesTopNResult;
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
/*    */   public void setGetNewEmployeesTopNResult(JAXBElement<ArrayOfOrgDepartment> paramJAXBElement) {
/* 63 */     this.getNewEmployeesTopNResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetNewEmployeesTopNResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */