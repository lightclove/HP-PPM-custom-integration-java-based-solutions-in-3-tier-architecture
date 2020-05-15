/*     */ package meganet.megafon;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name = "", propOrder = {"depId", "linkCurrentDep", "urlorgstruct"})
/*     */ @XmlRootElement(name = "BuildDepartmentPathProfile")
/*     */ public class BuildDepartmentPathProfile
/*     */ {
/*     */   protected Integer depId;
/*     */   protected Boolean linkCurrentDep;
/*     */   @XmlElementRef(name = "urlorgstruct", namespace = "http://megafon.meganet", type = JAXBElement.class)
/*     */   protected JAXBElement<String> urlorgstruct;
/*     */   
/*     */   public Integer getDepId() {
/*  56 */     return this.depId;
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
/*     */   public void setDepId(Integer paramInteger) {
/*  68 */     this.depId = paramInteger;
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
/*     */   public Boolean isLinkCurrentDep() {
/*  80 */     return this.linkCurrentDep;
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
/*     */   public void setLinkCurrentDep(Boolean paramBoolean) {
/*  92 */     this.linkCurrentDep = paramBoolean;
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
/*     */   public JAXBElement<String> getUrlorgstruct() {
/* 104 */     return this.urlorgstruct;
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
/*     */   public void setUrlorgstruct(JAXBElement<String> paramJAXBElement) {
/* 116 */     this.urlorgstruct = paramJAXBElement;
/*     */   }
/*     */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\BuildDepartmentPathProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */