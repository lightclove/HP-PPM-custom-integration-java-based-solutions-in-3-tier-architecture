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
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "", propOrder = {"login", "employeesCount"})
/*    */ @XmlRootElement(name = "GetNewEmployeesTopN")
/*    */ public class GetNewEmployeesTopN
/*    */ {
/*    */   @XmlElementRef(name = "login", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<String> login;
/*    */   protected Integer employeesCount;
/*    */   
/*    */   public JAXBElement<String> getLogin() {
/* 53 */     return this.login;
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
/*    */   public void setLogin(JAXBElement<String> paramJAXBElement) {
/* 65 */     this.login = paramJAXBElement;
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
/*    */   public Integer getEmployeesCount() {
/* 77 */     return this.employeesCount;
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
/*    */   public void setEmployeesCount(Integer paramInteger) {
/* 89 */     this.employeesCount = paramInteger;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetNewEmployeesTopN.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */