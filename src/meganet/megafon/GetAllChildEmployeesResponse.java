/*    */ package meganet.megafon;
/*    */ 
/*    */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
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
/*    */ @XmlType(name = "", propOrder = {"getAllChildEmployeesResult"})
/*    */ @XmlRootElement(name = "GetAllChildEmployeesResponse")
/*    */ public class GetAllChildEmployeesResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetAllChildEmployeesResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<ArrayOfstring> getAllChildEmployeesResult;
/*    */   
/*    */   public JAXBElement<ArrayOfstring> getGetAllChildEmployeesResult() {
/* 51 */     return this.getAllChildEmployeesResult;
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
/*    */   public void setGetAllChildEmployeesResult(JAXBElement<ArrayOfstring> paramJAXBElement) {
/* 63 */     this.getAllChildEmployeesResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetAllChildEmployeesResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */