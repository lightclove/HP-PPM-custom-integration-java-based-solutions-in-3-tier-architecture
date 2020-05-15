/*    */ package com.microsoft.schemas._2003._10.serialization.arrays;
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
/*    */ @XmlType(name = "ArrayOfstring", propOrder = {"string"})
/*    */ public class ArrayOfstring
/*    */ {
/*    */   @XmlElement(nillable = true)
/*    */   protected List<String> string;
/*    */   
/*    */   public List<String> getString() {
/* 63 */     if (this.string == null) {
/* 64 */       this.string = new ArrayList<String>();
/*    */     }
/* 66 */     return this.string;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\com\microsoft\schemas\_2003\_10\serialization\arrays\ArrayOfstring.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */