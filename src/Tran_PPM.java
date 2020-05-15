/*
From: ¬ишневский —танислав 
Sent: Monday, June 04, 2012 5:35 PM
To: —утырин јлександр
Subject: SRC
ѕуть: /export/PPM/Extensions/CSV-pump
*/
import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;

import java.util.Properties;

import javax.naming.Context;

import javax.naming.NamingException;

import javax.servlet.http.HttpServlet;


public class Tran_PPM  extends HttpServlet{

            /**
             * @param args
             */        //public static ;
                        public static Context initialContext;
                        public static Context envContext;
                        public static DataSource ds = null;
            public static void main(String[] args) throws NamingException, SQLException, ClassNotFoundException {
            
                        int iK1 = 0;
                        String SFile = "";
                        
                        // PATCH
                        String PFile = "";  // stores the name of the .properties file, if specified
                        // /PATCH                        
                        
						//String vName = "";//то что передаетс€ в метод main, с параметром -p, с исключением
						//args: test.csv
                        for(int len1= args.length; iK1 < len1; iK1++) // parse input data
                        { 
                                   if(args[iK1].equalsIgnoreCase("-f")) // ≈сли строка args совпала(равна) с "-f" то
                                   {
                                               if(iK1 + 1 == args.length) // и достигнут конец массива args
                                               {
                                            	   		   // PATCH
                                                           System.err.println("No .csv file specified!"); //выводим ошибку, иначе
                                                           //printUsage();
                                                           System.exit(1);
                                                          // /PATCH
                                               }
                                               SFile = new String(args[++iK1]);  //создаем и выводим строку SFile = " ./test.csv"                                        
                                               System.out.println("csv file specified: " + SFile); //
                                   
                                   // PATCH
                                   } else if(args[iK1].equalsIgnoreCase("-p")) {
                                       if(iK1 + 1 == args.length) // и достигнут конец массива args
                                       {
                                            System.err.println("No .properties file specified!"); //выводим ошибку, иначе
                                            System.exit(1);
                                       }

                                       PFile = new String(args[++iK1]);  //создаем и выводим строку SFile = " ./test.csv"                                        
                                       System.out.println("properties file specified: " + PFile); //
                                   }
                                // /PATCH                                	   
                        }           
                        //if(args[iK1].equalsIgnoreCase("-password"))
                                               
                        //Class.forName("oracle.jdbc.driver.OracleDriver");
                        //---------------------------------------
                         
                            //
                            // or
                            // DriverManager.registerDriver
                            //        (new oracle.jdbc.driver.OracleDriver());

                                String url = null; //
                            //               jdbc:oracle:thin:@//host:port/service
                            // or
                            // String url = "jdbc:oracle:thin:@server.local:1521:prodsid";
                            //               jdbc:oracle:thin:@host:port:SID
                            //
                            //  SID  - System ID of the Oracle server database instance.
                                   //         By default, Oracle Database 10g Express Edition
                                   //         creates one database instance called XE.
                                   //         ex : String url = "jdbc:oracle:thin:@myhost:1521:xe";



                            Connection conn = null;

                        
                        
                        /*
            initialContext = new InitialContext();
                            
                            envContext = (Context) initialContext.lookup("java:comp/env");
                            ds = (DataSource) envContext.lookup("jdbc/AOCDBSolid");
                            System.out.println("CPT DEBUG3: " + ds.toString() );
      
        */

//*********************************************************************************************************************************************
                         // PATCH
                        if(PFile.isEmpty()) { // if -p .properties file is not specified, take the default value
                        	PFile = "." + File.separator + "Tran_PPM.properties";
                        	System.out.println("no .properites file specified, using default one: " + PFile);
                        }
                            
                        File FileProp = new File(PFile); 
                        // /PATCH
                        
						/*
						File FileProp  = new File("." + File.separator + vName + ".properties")
						//vName передаем через командную строку: -f test.csv -p vName.properties
						
						*/
						/*
						int iK2 = 0;
						for(int len2= args.length; iK2 < len2; iK2++) // parse .properties file
                        { 
                                   if(args[iK1].equalsIgnoreCase("-p")) //
                                   {
                                               if(iK1 + 1 == args.length) //выход за границы массива?
                                               {
                                                           System.err.println("No file");
                                                           //printUsage();
                                                           //System.exit(1);
                                               }
                                               SFile = new String(args[++iK1]);  //???                                        
                                               System.out.println("File: " + SFile); //в цикле передаем им€ файла -параметр args в main(), парсинг(разбор) имени?
                                               
                                   } //else
                        } 
							*/
//*********************************************************************************************************************************************      
						try {
                                   
                                   
                                   InputStream IP_Prop = new FileInputStream (FileProp);
                                   Properties props = new Properties();
                    try {
                                               props.load( IP_Prop);
                                               System.out.println(props.getProperty("Class4Connect"));
                                               Class.forName(props.getProperty("Class4Connect"));
                                               url = props.getProperty("Url4Connect");
                                               conn = DriverManager.getConnection(url,props.getProperty("User4Connect"),props.getProperty("Pass4Connect"));
                                               //"jdbc:solid://192.168.221.40:1329";
                                               try
                                               {
                                                           File FileSVC = null;
                                                           if (SFile.equalsIgnoreCase("")) //—равнение строк на наличие пустого имени ""
                                                           {
                                                                       System.out.println("Key -f not found");
                                                                       System.out.println("System use property file");
                                                                       System.out.println(props.getProperty("Path2File"));
                                                                       FileSVC = new File (props.getProperty("Path2File"));
                                                           } else 
                                                           {           
                                                                       System.out.println(SFile);
                                                                       FileSVC = new File (SFile);
                                                           }
                                                           //OutputStreamWriter asd = new OutputStreamWriter(out, "cp1251");
                                                           InputStreamReader asd = new InputStreamReader (new FileInputStream (FileSVC), "utf-8");
                                                           //DataInput DataSVC =  new DataInputStream(asd);
                                                           BufferedReader in = new BufferedReader(asd);
                                                            
                                                           String Answer =  in.readLine();
                                                            //System.out.println(Answer);
                                                            int Chet = 0;
                                                            int ChetAll = 0;
                                                           while ( Answer != null)
                                                           {           
                                                                        //Answer = new String ( Answer.getBytes("cp1251"));
                                                                        //System.out.println(Answer);
                                                                        String [] MasAns = Answer.split(props.getProperty("SEPARATOR",":")); 
                                                                        
                                                                        //InpStreamReader  = new InputStreamReader (new FileInputStream (FileSVC), "utf-8");
                                                                        for (int NumTab = 1; NumTab <= Integer.decode(props.getProperty("ColTable","1")); NumTab++)
                                                                        {          
                                                                                   String [] MasReq = props.getProperty("Atr4Table"+NumTab).split(props.getProperty("SEPARATOR",":"));
                                                                                   //INSERT INTO KNTA_USER_SECURITY_INT VALUES (1,'165','ghfghfgh','999','lol','hello')
                                                                                   String Req = "INSERT INTO "+ props.getProperty("NameTable"+NumTab) +" ( " +props.getProperty("ColName4Table"+NumTab) + " ) "+ " VALUES (" ;
                                                                                   for (int i =0; i < MasReq.length; i++)
                                                                                   {
                                                                                                          if (i != 0)
                                                                                                                       Req = Req + " , ";
                                                                                                          if (MasReq[i].indexOf("%")!=(-1))
                                                                                                          {
                                                                                                                      MasReq[i] = MasReq[i].substring(MasReq[i].indexOf("%")+1, MasReq[i].indexOf("%",MasReq[i].indexOf("%")+1)); 
                                                                                                                      /*try
                                                                                                                      {
                                                                                                                      MasReq[i] = new String (MasReq[i].getBytes(props.getProperty("CodeIn")),props.getProperty("CodeOut"));
                                                                                                          //Hello
                                                                                                                      }
                                                                                                                      catch     (IOException e) {e.printStackTrace();}
                                                                                                                      */
                                                                                                          }           
                                                                                                          else
                                                                                                          {
                                                                                                                      MasReq[i] = MasAns[Integer.decode(MasReq[i])];
                                                                                                          }
                                                                                                          /*
                                                                                                           if (props.getProperty("T"+NumTab + MasReq[i]) != null)
                                                                                                           {
                                                                                                                       int Pos = Integer.decode(props.getProperty("T" + NumTab + MasReq[i]));
                                                                                                                       MasReq[i] = MasAns[Pos];
                                                                                                                       //System.out.println(MasReq[i]);
                                                                                                           }
                                                                                                           
                                                                                                           */
                                                                                                                      
                                                                                                          if (MasReq[i].equalsIgnoreCase(""))
                                                                                                                      MasReq[i] = "NULL";
                                                                                                           if (MasReq[i].equalsIgnoreCase("NULL"))
																											{                     
																												Req = Req + MasReq[i];
                                                                                                            }
                                                                                                           else
                                                                                                                                  {
                                                                                                                                              Req = Req +"'"+ MasReq[i].getBytes("cp1251")+"'";
                                                                                                                                  }
                                                                                                                                  
                                                                                   }
                                                                                   Req = Req + ")";
                                                                                   
                                                                                   //Req = new String (Req .getBytes(props.getProperty("CodeIn")),props.getProperty("CodeOut"));
                                                                                   //String Req = "ADD "+ props.getProperty("Name4Table1")+ "(" ;
                                                                                  //System.out.println(Req);
                                                                                  
                                                                                  if (SQLcom(Req, conn))
                                                                                              Chet++;
                                                                                  ChetAll++;
                                                                                  // THIS
                                                                       }
                                                                        Answer =  in.readLine();
                                                           }
                                                           System.out.println("Value : " + Chet  + " / " + ChetAll);
                                                           
                                               
                                               } catch (FileNotFoundException e) {
                                               // TODO Auto-generated catch block
                                                           System.out.println("CSV file not found"); 
                                               }
                                               
                                   } catch (IOException e) {
                                               // TODO Auto-generated catch block
                                               System.out.println("Properties file not valid");
                                               e.printStackTrace();
                                   }
                        } catch (FileNotFoundException e) {
                                   // TODO Auto-generated catch block
                                   System.out.println("Properties file not found"); 
                        }
                        
                        
                        //InputStream asd = null;
                        //asd.
                        
                        
            }
            private static boolean SQLcom(String q, Connection con) throws SQLException {
                        //Connection con = ds.getConnection();
                        
                        
                        Statement st = con.createStatement();
                        //ResultSet result = null;
                        //String q = "CREATE TABLE AOCRULE1 (ID varchar, RuleName varchar, URLTriggersRedirectionToAoCTemplate varchar, URLTriggersEventBasedCharging varchar,RG varchar,RGType varchar, AoCTemplate varchar, AoCType varchar)";
                                               //CREATE TABLE AOCRULE1 (ID varchar, RuleName varchar, URLTriggersRedirectionToAoCTemplate varchar, URLTriggersEventBasedCharging varchar,RG varchar,RGType varchar, AoCTemplate varchar, AoCType varchar)
                                               //CREATE TABLE AOCTEMPLATE1 (ID varchar, TemplateName varchar, AoCSite varchar, Type varchar)
                        //outss.println(q);
                        try 
                        {
                                   
                        /*result = */(st).execute(q);//.executeQuery(q);
                        return true;
                        }
                        catch (Exception e) 
                        { 
                                   
                                   System.out.println(e);
                                   System.out.println(q);
                                   return false;
                        //          e.printStackTrace();
                        }
                        //con.close();
                        //con = null;
            }

}
