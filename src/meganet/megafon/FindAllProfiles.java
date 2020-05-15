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
/*    */ @XmlType(name = "", propOrder = {"productKey", "name"})
/*    */ @XmlRootElement(name = "FindAllProfiles")
/*    */ public class FindAllProfiles
/*    */ {
/*    */   @XmlElementRef(name = "ProductKey", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<String> productKey;
/*    */   @XmlElementRef(name = "Name", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*    */   protected JAXBElement<String> name;
/*    */   
/*    */   public JAXBElement<String> getProductKey() {
/* 54 */     return this.productKey;
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
/*    */   public void setProductKey(JAXBElement<String> paramJAXBElement) {
/* 66 */     this.productKey = paramJAXBElement;
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
/*    */   public JAXBElement<String> getName() {
/* 78 */     return this.name;
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
/*    */   public void setName(JAXBElement<String> paramJAXBElement) {
/* 90 */     this.name = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\FindAllProfiles.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */