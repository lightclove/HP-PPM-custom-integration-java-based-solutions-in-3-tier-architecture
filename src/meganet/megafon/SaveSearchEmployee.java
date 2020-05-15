/*     */ package meganet.megafon;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
/*     */ import javax.xml.bind.annotation.XmlRootElement;
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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "", propOrder = {"loginName", "accountName", "search", "isSearch"})
/*     */ @XmlRootElement(name = "SaveSearchEmployee")
/*     */ public class SaveSearchEmployee
/*     */ {
/*     */   @XmlElementRef(name = "LoginName", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*     */   protected JAXBElement<String> loginName;
/*     */   @XmlElementRef(name = "AccountName", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*     */   protected JAXBElement<String> accountName;
/*     */   @XmlElementRef(name = "Search", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*     */   protected JAXBElement<String> search;
/*     */   @XmlElement(name = "IsSearch")
/*     */   protected Integer isSearch;
/*     */   
/*     */   public JAXBElement<String> getLoginName() {
/*  63 */     return this.loginName;
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
/*     */   public void setLoginName(JAXBElement<String> paramJAXBElement) {
/*  75 */     this.loginName = paramJAXBElement;
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
/*     */   public JAXBElement<String> getAccountName() {
/*  87 */     return this.accountName;
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
/*     */   public void setAccountName(JAXBElement<String> paramJAXBElement) {
/*  99 */     this.accountName = paramJAXBElement;
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
/*     */   public JAXBElement<String> getSearch() {
/* 111 */     return this.search;
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
/*     */   public void setSearch(JAXBElement<String> paramJAXBElement) {
/* 123 */     this.search = paramJAXBElement;
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
/*     */   public Integer getIsSearch() {
/* 135 */     return this.isSearch;
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
/*     */   public void setIsSearch(Integer paramInteger) {
/* 147 */     this.isSearch = paramInteger;
/*     */   }
/*     */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\SaveSearchEmployee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */