/*     */ package meganet.megafon;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
/*     */ import javax.xml.bind.annotation.XmlSchemaType;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "", propOrder = {"login", "date", "full"})
/*     */ @XmlRootElement(name = "GetBirthday")
/*     */ public class GetBirthday
/*     */ {
/*     */   @XmlElementRef(name = "login", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*     */   protected JAXBElement<String> login;
/*     */   @XmlSchemaType(name = "dateTime")
/*     */   protected XMLGregorianCalendar date;
/*     */   protected Boolean full;
/*     */   
/*     */   public JAXBElement<String> getLogin() {
/*  59 */     return this.login;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLogin(JAXBElement<String> paramJAXBElement) {
/*  71 */     this.login = paramJAXBElement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public XMLGregorianCalendar getDate() {
/*  83 */     return this.date;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDate(XMLGregorianCalendar paramXMLGregorianCalendar) {
/*  95 */     this.date = paramXMLGregorianCalendar;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Boolean isFull() {
/* 107 */     return this.full;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFull(Boolean paramBoolean) {
/* 119 */     this.full = paramBoolean;
/*     */   }
/*     */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetBirthday.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */