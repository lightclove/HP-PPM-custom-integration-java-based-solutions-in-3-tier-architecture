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
/*    */ @XmlType(name = "ArrayOfOrgDepartment", propOrder = {"orgDepartment"})
/*    */ public class ArrayOfOrgDepartment
/*    */ {
/*    */   @XmlElement(name = "OrgDepartment", nillable = true)
/*    */   protected List<OrgDepartment> orgDepartment;
/*    */   
/*    */   public List<OrgDepartment> getOrgDepartment() {
/* 63 */     if (this.orgDepartment == null) {
/* 64 */       this.orgDepartment = new ArrayList<OrgDepartment>();
/*    */     }
/* 66 */     return this.orgDepartment;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\types\meganet\megafon\ArrayOfOrgDepartment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */