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
/*     */ @XmlType(name = "", propOrder = {"login", "startdate", "enddate"})
/*     */ @XmlRootElement(name = "GetNewEmployeesForPeriod")
/*     */ public class GetNewEmployeesForPeriod
/*     */ {
/*     */   @XmlElementRef(name = "login", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*     */   protected JAXBElement<String> login;
/*     */   @XmlSchemaType(name = "dateTime")
/*     */   protected XMLGregorianCalendar startdate;
/*     */   @XmlSchemaType(name = "dateTime")
/*     */   protected XMLGregorianCalendar enddate;
/*     */   
/*     */   public JAXBElement<String> getLogin() {
/*  60 */     return this.login;
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
/*  72 */     this.login = paramJAXBElement;
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
/*     */   public XMLGregorianCalendar getStartdate() {
/*  84 */     return this.startdate;
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
/*     */   public void setStartdate(XMLGregorianCalendar paramXMLGregorianCalendar) {
/*  96 */     this.startdate = paramXMLGregorianCalendar;
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
/*     */   public XMLGregorianCalendar getEnddate() {
/* 108 */     return this.enddate;
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
/*     */   public void setEnddate(XMLGregorianCalendar paramXMLGregorianCalendar) {
/* 120 */     this.enddate = paramXMLGregorianCalendar;
/*     */   }
/*     */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetNewEmployeesForPeriod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */