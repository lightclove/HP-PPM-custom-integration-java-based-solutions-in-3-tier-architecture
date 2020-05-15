/*     */ package types.meganet.megafon;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
/*     */ import javax.xml.bind.annotation.XmlType;
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
/*     */ @XmlType(name = "ShortEmployee", propOrder = {"name", "empId", "login"})
/*     */ public class ShortEmployee
/*     */ {
/*     */   @XmlElementRef(name = "Name", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> name;
/*     */   @XmlElementRef(name = "emp_id", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> empId;
/*     */   @XmlElementRef(name = "login", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> login;
/*     */   
/*     */   public JAXBElement<String> getName() {
/*  56 */     return this.name;
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
/*     */   public void setName(JAXBElement<String> paramJAXBElement) {
/*  68 */     this.name = paramJAXBElement;
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
/*     */   public JAXBElement<String> getEmpId() {
/*  80 */     return this.empId;
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
/*     */   public void setEmpId(JAXBElement<String> paramJAXBElement) {
/*  92 */     this.empId = paramJAXBElement;
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
/*     */   public JAXBElement<String> getLogin() {
/* 104 */     return this.login;
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
/* 116 */     this.login = paramJAXBElement;
/*     */   }
/*     */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\types\meganet\megafon\ShortEmployee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */