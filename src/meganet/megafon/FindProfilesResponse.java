/*    */ package meganet.megafon;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
/*    */ import javax.xml.bind.annotation.XmlType;
/*    */ import org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfstringstring;
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
/*    */ @XmlType(name = "", propOrder = {"findProfilesResult"})
/*    */ @XmlRootElement(name = "FindProfilesResponse")
/*    */ public class FindProfilesResponse
/*    */ {
/*    */   @XmlElementRef(name = "FindProfilesResult", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<ArrayOfKeyValuePairOfstringstring> findProfilesResult;
/*    */   
/*    */   public JAXBElement<ArrayOfKeyValuePairOfstringstring> getFindProfilesResult() {
/* 51 */     return this.findProfilesResult;
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
/*    */   public void setFindProfilesResult(JAXBElement<ArrayOfKeyValuePairOfstringstring> paramJAXBElement) {
/* 63 */     this.findProfilesResult = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\FindProfilesResponse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */