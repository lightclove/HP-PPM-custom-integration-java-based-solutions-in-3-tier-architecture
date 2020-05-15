/*     */ package types.meganet.megafon;
/*     */ 
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlElementRef;
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
/*     */ @XmlType(name = "Employee", propOrder = {"birthDay", "cellPhone", "department", "departmentId", "firstName", "grade", "id", "inDate", "internalPhone", "jobIoName", "jobTitle", "lastName", "login", "manager", "midName", "phone", "photo", "userName", "workEMail", "ioDepartmentId"})
/*     */ public class Employee
/*     */ {
/*     */   @XmlElement(name = "BirthDay")
/*     */   @XmlSchemaType(name = "dateTime")
/*     */   protected XMLGregorianCalendar birthDay;
/*     */   @XmlElementRef(name = "CellPhone", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> cellPhone;
/*     */   @XmlElementRef(name = "Department", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<OrgDepartment> department;
/*     */   @XmlElementRef(name = "DepartmentId", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<Integer> departmentId;
/*     */   @XmlElementRef(name = "FirstName", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> firstName;
/*     */   @XmlElementRef(name = "Grade", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> grade;
/*     */   @XmlElement(name = "Id")
/*     */   protected Integer id;
/*     */   @XmlElement(name = "InDate")
/*     */   @XmlSchemaType(name = "dateTime")
/*     */   protected XMLGregorianCalendar inDate;
/*     */   @XmlElementRef(name = "InternalPhone", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> internalPhone;
/*     */   @XmlElementRef(name = "JobIoName", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> jobIoName;
/*     */   @XmlElementRef(name = "JobTitle", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> jobTitle;
/*     */   @XmlElementRef(name = "LastName", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> lastName;
/*     */   @XmlElementRef(name = "Login", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> login;
/*     */   @XmlElementRef(name = "Manager", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<Employee> manager;
/*     */   @XmlElementRef(name = "MidName", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> midName;
/*     */   @XmlElementRef(name = "Phone", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> phone;
/*     */   @XmlElementRef(name = "Photo", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> photo;
/*     */   @XmlElementRef(name = "UserName", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> userName;
/*     */   @XmlElementRef(name = "WorkEMail", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<String> workEMail;
/*     */   @XmlElementRef(name = "ioDepartmentId", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*     */   protected JAXBElement<Integer> ioDepartmentId;
/*     */   
/*     */   public XMLGregorianCalendar getBirthDay() {
/* 129 */     return this.birthDay;
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
/*     */   public void setBirthDay(XMLGregorianCalendar paramXMLGregorianCalendar) {
/* 141 */     this.birthDay = paramXMLGregorianCalendar;
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
/*     */   public JAXBElement<String> getCellPhone() {
/* 153 */     return this.cellPhone;
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
/*     */   public void setCellPhone(JAXBElement<String> paramJAXBElement) {
/* 165 */     this.cellPhone = paramJAXBElement;
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
/*     */   public JAXBElement<OrgDepartment> getDepartment() {
/* 177 */     return this.department;
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
/*     */   public void setDepartment(JAXBElement<OrgDepartment> paramJAXBElement) {
/* 189 */     this.department = paramJAXBElement;
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
/*     */   public JAXBElement<Integer> getDepartmentId() {
/* 201 */     return this.departmentId;
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
/*     */   public void setDepartmentId(JAXBElement<Integer> paramJAXBElement) {
/* 213 */     this.departmentId = paramJAXBElement;
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
/*     */   public JAXBElement<String> getFirstName() {
/* 225 */     return this.firstName;
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
/*     */   public void setFirstName(JAXBElement<String> paramJAXBElement) {
/* 237 */     this.firstName = paramJAXBElement;
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
/*     */   public JAXBElement<String> getGrade() {
/* 249 */     return this.grade;
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
/*     */   public void setGrade(JAXBElement<String> paramJAXBElement) {
/* 261 */     this.grade = paramJAXBElement;
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
/*     */   public Integer getId() {
/* 273 */     return this.id;
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
/*     */   public void setId(Integer paramInteger) {
/* 285 */     this.id = paramInteger;
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
/*     */   public XMLGregorianCalendar getInDate() {
/* 297 */     return this.inDate;
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
/*     */   public void setInDate(XMLGregorianCalendar paramXMLGregorianCalendar) {
/* 309 */     this.inDate = paramXMLGregorianCalendar;
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
/*     */   public JAXBElement<String> getInternalPhone() {
/* 321 */     return this.internalPhone;
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
/*     */   public void setInternalPhone(JAXBElement<String> paramJAXBElement) {
/* 333 */     this.internalPhone = paramJAXBElement;
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
/*     */   public JAXBElement<String> getJobIoName() {
/* 345 */     return this.jobIoName;
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
/*     */   public void setJobIoName(JAXBElement<String> paramJAXBElement) {
/* 357 */     this.jobIoName = paramJAXBElement;
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
/*     */   public JAXBElement<String> getJobTitle() {
/* 369 */     return this.jobTitle;
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
/*     */   public void setJobTitle(JAXBElement<String> paramJAXBElement) {
/* 381 */     this.jobTitle = paramJAXBElement;
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
/*     */   public JAXBElement<String> getLastName() {
/* 393 */     return this.lastName;
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
/*     */   public void setLastName(JAXBElement<String> paramJAXBElement) {
/* 405 */     this.lastName = paramJAXBElement;
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
/* 417 */     return this.login;
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
/* 429 */     this.login = paramJAXBElement;
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
/*     */   public JAXBElement<Employee> getManager() {
/* 441 */     return this.manager;
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
/*     */   public void setManager(JAXBElement<Employee> paramJAXBElement) {
/* 453 */     this.manager = paramJAXBElement;
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
/*     */   public JAXBElement<String> getMidName() {
/* 465 */     return this.midName;
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
/*     */   public void setMidName(JAXBElement<String> paramJAXBElement) {
/* 477 */     this.midName = paramJAXBElement;
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
/*     */   public JAXBElement<String> getPhone() {
/* 489 */     return this.phone;
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
/*     */   public void setPhone(JAXBElement<String> paramJAXBElement) {
/* 501 */     this.phone = paramJAXBElement;
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
/*     */   public JAXBElement<String> getPhoto() {
/* 513 */     return this.photo;
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
/*     */   public void setPhoto(JAXBElement<String> paramJAXBElement) {
/* 525 */     this.photo = paramJAXBElement;
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
/*     */   public JAXBElement<String> getUserName() {
/* 537 */     return this.userName;
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
/*     */   public void setUserName(JAXBElement<String> paramJAXBElement) {
/* 549 */     this.userName = paramJAXBElement;
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
/*     */   public JAXBElement<String> getWorkEMail() {
/* 561 */     return this.workEMail;
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
/*     */   public void setWorkEMail(JAXBElement<String> paramJAXBElement) {
/* 573 */     this.workEMail = paramJAXBElement;
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
/*     */   public JAXBElement<Integer> getIoDepartmentId() {
/* 585 */     return this.ioDepartmentId;
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
/*     */   public void setIoDepartmentId(JAXBElement<Integer> paramJAXBElement) {
/* 597 */     this.ioDepartmentId = paramJAXBElement;
/*     */   }
/*     */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\types\meganet\megafon\Employee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */