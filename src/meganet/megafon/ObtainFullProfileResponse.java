/*    */ package meganet.megafon;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import types.meganet.megafon.Employee;
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
/*    */ @XmlType(name = "", propOrder = {"obtainFullProfileResult"})
/*    */ @XmlRootElement(name = "ObtainFullProfileResponse")
/*    */ public class ObtainFullProfileResponse
/*    */ {
/*    */   @XmlElementRef(name = "ObtainFullProfileResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<Employee> obtainFullProfileResult;
/*    */   
/*    */   public JAXBElement<Employee> getObtainFullProfileResult() {
/* 51 */     return this.obtainFullProfileResult;
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
/*    */   public void setObtainFullProfileResult(JAXBElement<Employee> paramJAXBElement) {
/* 63 */     this.obtainFullProfileResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\ObtainFullProfileResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */