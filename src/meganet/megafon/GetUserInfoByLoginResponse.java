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
/*    */ @XmlType(name = "", propOrder = {"getUserInfoByLoginResult"})
/*    */ @XmlRootElement(name = "GetUserInfoByLoginResponse")
/*    */ public class GetUserInfoByLoginResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetUserInfoByLoginResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<Employee> getUserInfoByLoginResult;
/*    */   
/*    */   public JAXBElement<Employee> getGetUserInfoByLoginResult() {
/* 51 */     return this.getUserInfoByLoginResult;
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
/*    */   public void setGetUserInfoByLoginResult(JAXBElement<Employee> paramJAXBElement) {
/* 63 */     this.getUserInfoByLoginResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetUserInfoByLoginResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */