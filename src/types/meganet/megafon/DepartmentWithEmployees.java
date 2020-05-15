/*    */ package types.meganet.megafon;
/*    */ 
/*    */ import javax.xml.bind.JAXBElement;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElementRef;
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
/*    */ @XmlType(name = "DepartmentWithEmployees", propOrder = {"department", "employees"})
/*    */ public class DepartmentWithEmployees
/*    */ {
/*    */   @XmlElementRef(name = "Department", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*    */   protected JAXBElement<OrgDepartment> department;
/*    */   @XmlElementRef(name = "Employees", namespace = "http://megafon.meganet.types", type = JAXBElement.class)
/*    */   protected JAXBElement<ArrayOfEmployee> employees;
/*    */   
/*    */   public JAXBElement<OrgDepartment> getDepartment() {
/* 52 */     return this.department;
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
/*    */   public void setDepartment(JAXBElement<OrgDepartment> paramJAXBElement) {
/* 64 */     this.department = paramJAXBElement;
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
/*    */   public JAXBElement<ArrayOfEmployee> getEmployees() {
/* 76 */     return this.employees;
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
/*    */   public void setEmployees(JAXBElement<ArrayOfEmployee> paramJAXBElement) {
/* 88 */     this.employees = paramJAXBElement;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\types\meganet\megafon\DepartmentWithEmployees.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */