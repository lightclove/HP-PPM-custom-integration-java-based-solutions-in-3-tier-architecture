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
/*    */ @XmlType(name = "", propOrder = {"getNewEmployeesForPeriodResult"})
/*    */ @XmlRootElement(name = "GetNewEmployeesForPeriodResponse")
/*    */ public class GetNewEmployeesForPeriodResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetNewEmployeesForPeriodResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<ArrayOfOrgDepartment> getNewEmployeesForPeriodResult;
/*    */   
/*    */   public JAXBElement<ArrayOfOrgDepartment> getGetNewEmployeesForPeriodResult() {
/* 51 */     return this.getNewEmployeesForPeriodResult;
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
/*    */   public void setGetNewEmployeesForPeriodResult(JAXBElement<ArrayOfOrgDepartment> paramJAXBElement) {
/* 63 */     this.getNewEmployeesForPeriodResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetNewEmployeesForPeriodResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */