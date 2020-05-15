/*    */ package meganet.megafon;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
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
/*    */ @XmlType(name = "", propOrder = {"buildDepartmentPathProfileResult"})
/*    */ @XmlRootElement(name = "BuildDepartmentPathProfileResponse")
/*    */ public class BuildDepartmentPathProfileResponse
/*    */ {
/*    */   @XmlElementRef(name = "BuildDepartmentPathProfileResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<String> buildDepartmentPathProfileResult;
/*    */   
/*    */   public JAXBElement<String> getBuildDepartmentPathProfileResult() {
/* 50 */     return this.buildDepartmentPathProfileResult;
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
/*    */   public void setBuildDepartmentPathProfileResult(JAXBElement<String> paramJAXBElement) {
/* 62 */     this.buildDepartmentPathProfileResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\BuildDepartmentPathProfileResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */