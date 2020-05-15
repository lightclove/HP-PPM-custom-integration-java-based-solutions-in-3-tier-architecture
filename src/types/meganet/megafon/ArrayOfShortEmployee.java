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
/*    */ @XmlType(name = "ArrayOfShortEmployee", propOrder = {"shortEmployee"})
/*    */ public class ArrayOfShortEmployee
/*    */ {
/*    */   @XmlElement(name = "ShortEmployee", nillable = true)
/*    */   protected List<ShortEmployee> shortEmployee;
/*    */   
/*    */   public List<ShortEmployee> getShortEmployee() {
/* 63 */     if (this.shortEmployee == null) {
/* 64 */       this.shortEmployee = new ArrayList<ShortEmployee>();
/*    */     }
/* 66 */     return this.shortEmployee;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\types\meganet\megafon\ArrayOfShortEmployee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */