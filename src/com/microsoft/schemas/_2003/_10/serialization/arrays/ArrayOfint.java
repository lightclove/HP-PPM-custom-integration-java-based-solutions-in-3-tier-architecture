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
/*    */ @XmlType(name = "ArrayOfint", propOrder = {"_int"})
/*    */ public class ArrayOfint
/*    */ {
/*    */   @XmlElement(name = "int", type = Integer.class)
/*    */   protected List<Integer> _int;
/*    */   
/*    */   public List<Integer> getInt() {
/* 63 */     if (this._int == null) {
/* 64 */       this._int = new ArrayList<Integer>();
/*    */     }
/* 66 */     return this._int;
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\com\microsoft\schemas\_2003\_10\serialization\arrays\ArrayOfint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */