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
/*    */ 
/*    */ 
/*    */ @XmlAccessorType(XmlAccessType.FIELD)
/*    */ @XmlType(name = "", propOrder = {"rootDepId", "maxHierarchyLevel"})
/*    */ @XmlRootElement(name = "GetFlatDepartmentCollection")
/*    */ public class GetFlatDepartmentCollection
/*    */ {
/*    */   protected Integer rootDepId;
/*    */   protected Integer maxHierarchyLevel;
/*    */   
/*    */   public Integer getRootDepId() {
/* 50 */     return this.rootDepId;
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
/*    */   public void setRootDepId(Integer paramInteger) {
/* 62 */     this.rootDepId = paramInteger;
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
/*    */   public Integer getMaxHierarchyLevel() {
/* 74 */     return this.maxHierarchyLevel;
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
/*    */   public void setMaxHierarchyLevel(Integer paramInteger) {
/* 86 */     this.maxHierarchyLevel = paramInteger;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\GetFlatDepartmentCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */