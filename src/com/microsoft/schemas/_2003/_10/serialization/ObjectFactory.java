/*     */ package com.microsoft.schemas._2003._10.serialization;
/*     */ 
/*     */ import java.math.BigDecimal;
/*     */ import java.math.BigInteger;
/*     */ import javax.xml.bind.JAXBElement;
/*     */ import javax.xml.bind.annotation.XmlElementDecl;
/*     */ import javax.xml.bind.annotation.XmlRegistry;
/*     */ import javax.xml.datatype.Duration;
/*     */ import javax.xml.datatype.XMLGregorianCalendar;
/*     */ import javax.xml.namespace.QName;
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
/*     */ @XmlRegistry
/*     */ public class ObjectFactory
/*     */ {
/*  31 */   private static final QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
/*  32 */   private static final QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
/*  33 */   private static final QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
/*  34 */   private static final QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
/*  35 */   private static final QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
/*  36 */   private static final QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
/*  37 */   private static final QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
/*  38 */   private static final QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
/*  39 */   private static final QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
/*  40 */   private static final QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
/*  41 */   private static final QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
/*  42 */   private static final QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
/*  43 */   private static final QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
/*  44 */   private static final QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
/*  45 */   private static final QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
/*  46 */   private static final QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
/*  47 */   private static final QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
/*  48 */   private static final QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
/*  49 */   private static final QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
/*  50 */   private static final QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
/*  51 */   private static final QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
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
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
/*     */   public JAXBElement<String> createAnyURI(String paramString) {
/*  66 */     return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
/*     */   public JAXBElement<Integer> createChar(Integer paramInteger) {
/*  75 */     return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, paramInteger);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
/*     */   public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar paramXMLGregorianCalendar) {
/*  84 */     return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, paramXMLGregorianCalendar);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
/*     */   public JAXBElement<QName> createQName(QName paramQName) {
/*  93 */     return new JAXBElement<QName>(_QName_QNAME, QName.class, null, paramQName);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
/*     */   public JAXBElement<Integer> createUnsignedShort(Integer paramInteger) {
/* 102 */     return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, paramInteger);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
/*     */   public JAXBElement<Float> createFloat(Float paramFloat) {
/* 111 */     return new JAXBElement<Float>(_Float_QNAME, Float.class, null, paramFloat);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
/*     */   public JAXBElement<Long> createLong(Long paramLong) {
/* 120 */     return new JAXBElement<Long>(_Long_QNAME, Long.class, null, paramLong);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
/*     */   public JAXBElement<Short> createShort(Short paramShort) {
/* 129 */     return new JAXBElement<Short>(_Short_QNAME, Short.class, null, paramShort);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
/*     */   public JAXBElement<byte[]> createBase64Binary(byte[] paramArrayOfbyte) {
/* 138 */     return (JAXBElement)new JAXBElement<byte>(_Base64Binary_QNAME, (Class)byte[].class, null, paramArrayOfbyte);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
/*     */   public JAXBElement<Byte> createByte(Byte paramByte) {
/* 147 */     return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, paramByte);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
/*     */   public JAXBElement<Boolean> createBoolean(Boolean paramBoolean) {
/* 156 */     return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, paramBoolean);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
/*     */   public JAXBElement<Short> createUnsignedByte(Short paramShort) {
/* 165 */     return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, paramShort);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
/*     */   public JAXBElement<Object> createAnyType(Object paramObject) {
/* 174 */     return new JAXBElement(_AnyType_QNAME, Object.class, null, paramObject);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
/*     */   public JAXBElement<Long> createUnsignedInt(Long paramLong) {
/* 183 */     return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, paramLong);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
/*     */   public JAXBElement<Integer> createInt(Integer paramInteger) {
/* 192 */     return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, paramInteger);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
/*     */   public JAXBElement<BigDecimal> createDecimal(BigDecimal paramBigDecimal) {
/* 201 */     return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, paramBigDecimal);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
/*     */   public JAXBElement<Double> createDouble(Double paramDouble) {
/* 210 */     return new JAXBElement<Double>(_Double_QNAME, Double.class, null, paramDouble);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
/*     */   public JAXBElement<String> createGuid(String paramString) {
/* 219 */     return new JAXBElement<String>(_Guid_QNAME, String.class, null, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
/*     */   public JAXBElement<Duration> createDuration(Duration paramDuration) {
/* 228 */     return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, paramDuration);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
/*     */   public JAXBElement<String> createString(String paramString) {
/* 237 */     return new JAXBElement<String>(_String_QNAME, String.class, null, paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
/*     */   public JAXBElement<BigInteger> createUnsignedLong(BigInteger paramBigInteger) {
/* 246 */     return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, paramBigInteger);
/*     */   }
/*     */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\com\microsoft\schemas\_2003\_10\serialization\ObjectFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */