/*    */ package meganet.megafon;
/*    */ 
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URL;
/*    */ import java.util.logging.Logger;
/*    */ import javax.xml.namespace.QName;
/*    */ import javax.xml.ws.Service;
/*    */ import javax.xml.ws.WebEndpoint;
/*    */ import javax.xml.ws.WebServiceClient;
/*    */ import javax.xml.ws.WebServiceFeature;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @WebServiceClient(name = "MegaService", targetNamespace = "http://megafon.meganet", wsdlLocation = "https://services.meganet.megafon.ru/SSLMegaWCF/MegaService.svc?WSDL")
/*    */ public class MegaService
/*    */   extends Service
/*    */ {
/*    */   private static final URL MEGASERVICE_WSDL_LOCATION;
/* 26 */   private static final Logger logger = Logger.getLogger(MegaService.class.getName());
/*    */   
/*    */   static {
/* 29 */     URL uRL = null;
/*    */     
/*    */     try {
/* 32 */       URL uRL1 = MegaService.class.getResource(".");
/* 33 */       uRL = new URL(uRL1, "https://services.meganet.megafon.ru/SSLMegaWCF/MegaService.svc?WSDL");
/* 34 */     } catch (MalformedURLException malformedURLException) {
/* 35 */       logger.warning("Failed to create URL for the wsdl Location: 'https://services.meganet.megafon.ru/SSLMegaWCF/MegaService.svc?WSDL', retrying as a local file");
/* 36 */       logger.warning(malformedURLException.getMessage());
/*    */     } 
/* 38 */     MEGASERVICE_WSDL_LOCATION = uRL;
/*    */   }
/*    */   
/*    */   public MegaService(URL paramURL, QName paramQName) {
/* 42 */     super(paramURL, paramQName);
/*    */   }
/*    */   
/*    */   public MegaService() {
/* 46 */     super(MEGASERVICE_WSDL_LOCATION, new QName("http://megafon.meganet", "MegaService"));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @WebEndpoint(name = "WSHttpBinding_IMegaService")
/*    */   public IMegaService getWSHttpBindingIMegaService() {
/* 56 */     return getPort(new QName("http://megafon.meganet", "WSHttpBinding_IMegaService"), IMegaService.class);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @WebEndpoint(name = "WSHttpBinding_IMegaService")
/*    */   public IMegaService getWSHttpBindingIMegaService(WebServiceFeature... paramVarArgs) {
/* 68 */     return getPort(new QName("http://megafon.meganet", "WSHttpBinding_IMegaService"), IMegaService.class, paramVarArgs);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @WebEndpoint(name = "WebHttpBinding_IMegaService")
/*    */   public IMegaService getWebHttpBindingIMegaService() {
/* 78 */     return getPort(new QName("http://megafon.meganet", "WebHttpBinding_IMegaService"), IMegaService.class);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @WebEndpoint(name = "WebHttpBinding_IMegaService")
/*    */   public IMegaService getWebHttpBindingIMegaService(WebServiceFeature... paramVarArgs) {
/* 90 */     return getPort(new QName("http://megafon.meganet", "WebHttpBinding_IMegaService"), IMegaService.class, paramVarArgs);
/*    */   }
/*    */ }


/* Location:              C:\Users\adm\Documents\PPM (1)\PPM-client_lib\PPM-client_lib\MegaWCF.jar!\meganet\megafon\MegaService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */