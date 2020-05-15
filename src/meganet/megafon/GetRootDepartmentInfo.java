/*    */ package meganet.megafon;
/*    */ 
/*    */ import javax.xml.bind.annotation.XmlAccessType;
/*    */ import javax.xml.bind.annotation.XmlAccessorType;
/*    */ import javax.xml.bind.annotation.XmlRootElement;
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
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "", propOrder = {"includeSubDep"})
/*    */ @XmlRootElement(name = "GetRootDepartmentInfo")
/*    */ public class GetRootDepartmentInfo
/*    */ {
/*    */   protected Boolean includeSubDep;
/*    */   
/*    */   public Boolean isIncludeSubDep() {
/* 47 */     return this.includeSubDep;
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
/*    */   public void setIncludeSubDep(Boolean paramBoolean) {
/* 59 */     this.includeSubDep = paramBoolean;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetRootDepartmentInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */