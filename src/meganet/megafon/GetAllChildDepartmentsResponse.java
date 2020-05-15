/*    */ package meganet.megafon;
/*    */ 
/*    */ import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
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
/*    */ @XmlType(name = "", propOrder = {"getAllChildDepartmentsResult"})
/*    */ @XmlRootElement(name = "GetAllChildDepartmentsResponse")
/*    */ public class GetAllChildDepartmentsResponse
/*    */ {
/*    */   @XmlElementRef(name = "GetAllChildDepartmentsResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<ArrayOfint> getAllChildDepartmentsResult;
/*    */   
/*    */   public JAXBElement<ArrayOfint> getGetAllChildDepartmentsResult() {
/* 51 */     return this.getAllChildDepartmentsResult;
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
/*    */   public void setGetAllChildDepartmentsResult(JAXBElement<ArrayOfint> paramJAXBElement) {
/* 63 */     this.getAllChildDepartmentsResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetAllChildDepartmentsResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */