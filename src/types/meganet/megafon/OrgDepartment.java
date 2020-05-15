/*     */ package types.meganet.megafon;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
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
/*     */ @XmlType(name = "OrgDepartment", propOrder = {"childDepartments", "company", "contentOwner", "departmentName", "hasChild", "id", "parentId", "rootID"})
/*     */ public class OrgDepartment
/*     */ {
/*     */   @XmlElementRef(name = "ChildDepartments", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<ArrayOfOrgDepartment> childDepartments;
/*     */   @XmlElementRef(name = "Company", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> company;
/*     */   @XmlElementRef(name = "ContentOwner", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<Employee> contentOwner;
/*     */   @XmlElementRef(name = "DepartmentName", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> departmentName;
/*     */   @XmlElement(name = "HasChild")
/*     */   protected Boolean hasChild;
/*     */   @XmlElement(name = "ID")
/*     */   protected Integer id;
/*     */   @XmlElement(name = "ParentId")
/*     */   protected Integer parentId;
/*     */   @XmlElement(name = "RootID")
/*     */   protected Integer rootID;
/*     */   
/*     */   public JAXBElement<ArrayOfOrgDepartment> getChildDepartments() {
/*  77 */     return this.childDepartments;
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
/*     */   public void setChildDepartments(JAXBElement<ArrayOfOrgDepartment> paramJAXBElement) {
/*  89 */     this.childDepartments = paramJAXBElement;
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
/*     */   public JAXBElement<String> getCompany() {
/* 101 */     return this.company;
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
/*     */   public void setCompany(JAXBElement<String> paramJAXBElement) {
/* 113 */     this.company = paramJAXBElement;
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
/*     */   public JAXBElement<Employee> getContentOwner() {
/* 125 */     return this.contentOwner;
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
/*     */   public void setContentOwner(JAXBElement<Employee> paramJAXBElement) {
/* 137 */     this.contentOwner = paramJAXBElement;
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
/*     */   public JAXBElement<String> getDepartmentName() {
/* 149 */     return this.departmentName;
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
/*     */   public void setDepartmentName(JAXBElement<String> paramJAXBElement) {
/* 161 */     this.departmentName = paramJAXBElement;
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
/*     */   public Boolean isHasChild() {
/* 173 */     return this.hasChild;
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
/*     */   public void setHasChild(Boolean paramBoolean) {
/* 185 */     this.hasChild = paramBoolean;
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
/*     */   public Integer getID() {
/* 197 */     return this.id;
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
/*     */   public void setID(Integer paramInteger) {
/* 209 */     this.id = paramInteger;
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
/*     */   public Integer getParentId() {
/* 221 */     return this.parentId;
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
/*     */   public void setParentId(Integer paramInteger) {
/* 233 */     this.parentId = paramInteger;
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
/*     */   public Integer getRootID() {
/* 245 */     return this.rootID;
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
/*     */   public void setRootID(Integer paramInteger) {
/* 257 */     this.rootID = paramInteger;
/*     */   }
/*     */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\types\meganet\megafon\OrgDepartment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */