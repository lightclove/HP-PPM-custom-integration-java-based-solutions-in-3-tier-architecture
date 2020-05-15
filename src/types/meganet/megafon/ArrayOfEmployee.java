/*    */ package types.meganet.megafon;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlElement;
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
/*    */ @XmlType(name = "ArrayOfEmployee", propOrder = {"employee"})
/*    */ public class ArrayOfEmployee
/*    */ {
/*    */   @XmlElement(name = "Employee", nillable = true)
/*    */   protected List<Employee> employee;
/*    */   
/*    */   public List<Employee> getEmployee() {
/* 63 */     if (this.employee == null) {
/* 64 */       this.employee = new ArrayList<Employee>();
/*    */     }
/* 66 */     return this.employee;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\types\meganet\megafon\ArrayOfEmployee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */