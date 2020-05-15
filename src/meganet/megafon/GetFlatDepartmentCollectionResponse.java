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
/*    */ @XmlType(name = "", propOrder = {"getFlatDepartmentCollectionResult"})
/*    */ @XmlRootElement(name = "GetFlatDepartmentCollectionResponse")
/*    */ public class GetFlatDepartmentCollectionResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetFlatDepartmentCollectionResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<ArrayOfOrgDepartment> getFlatDepartmentCollectionResult;
/*    */   
/*    */   public JAXBElement<ArrayOfOrgDepartment> getGetFlatDepartmentCollectionResult() {
/* 51 */     return this.getFlatDepartmentCollectionResult;
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
/*    */   public void setGetFlatDepartmentCollectionResult(JAXBElement<ArrayOfOrgDepartment> paramJAXBElement) {
/* 63 */     this.getFlatDepartmentCollectionResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetFlatDepartmentCollectionResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */