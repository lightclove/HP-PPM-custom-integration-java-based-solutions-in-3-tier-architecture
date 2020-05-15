import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.servlet.http.HttpServlet;
import javax.sql.DataSource;

public class Tran_PPM extends HttpServlet {
    public static Context initialContext;

    public static Context envContext;

    public static DataSource ds = null;

    public static void main(String[] args) throws NamingException, SQLException, ClassNotFoundException {
        int iK1 = 0;
        String SFile = "";
        String PFile = "";
        for (int len1 = args.length; iK1 < len1; iK1++) {
            if (args[iK1].equalsIgnoreCase("-f")) {
                if (iK1 + 1 == args.length) {
                    System.err.println("No .csv file specified!");
                    System.exit(1);
                }
                SFile = new String(args[++iK1]);
                System.out.println("csv file specified: " + SFile);
            } else if (args[iK1].equalsIgnoreCase("-p")) {
                if (iK1 + 1 == args.length) {
                    System.err.println("No .properties file specified!");
                    System.exit(1);
                }
                PFile = new String(args[++iK1]);
                System.out.println("properties file specified: " + PFile);
            }
        }
        String url = null;
        Connection conn = null;
        if (PFile.isEmpty()) {
            PFile = "." + File.separator + "Tran_PPM.properties";
            System.out.println("no .properites file specified, using default one: " + PFile);
        }
        File FileProp = new File(PFile);
        try {
            InputStream IP_Prop = new FileInputStream(FileProp);
            Properties props = new Properties();
            try {
                props.load(IP_Prop);
                System.out.println(props.getProperty("Class4Connect"));
                Class.forName(props.getProperty("Class4Connect"));
                url = props.getProperty("Url4Connect");
                conn = DriverManager.getConnection(url, props.getProperty("User4Connect"), props.getProperty("Pass4Connect"));
                try {
                    File FileSVC = null;
                    if (SFile.equalsIgnoreCase("")) {
                        System.out.println("Key -f not found");
                        System.out.println("System use property file");
                        System.out.println(props.getProperty("Path2File"));
                        FileSVC = new File(props.getProperty("Path2File"));
                    } else {
                        System.out.println(SFile);
                        FileSVC = new File(SFile);
                    }
                    InputStreamReader asd = new InputStreamReader(new FileInputStream(FileSVC), "utf-8");
                    BufferedReader in = new BufferedReader(asd);
                    String Answer = in.readLine();
                    int Chet = 0;
                    int ChetAll = 0;
                    while (Answer != null) {
                        String[] MasAns = Answer.split(props.getProperty("SEPARATOR", ":"));
                        for (int NumTab = 1; NumTab <= Integer.decode(props.getProperty("ColTable", "1")).intValue(); NumTab++) {
                            String[] MasReq = props.getProperty("Atr4Table" + NumTab).split(props.getProperty("SEPARATOR", ":"));
                            String Req = "INSERT INTO " + props.getProperty("NameTable" + NumTab) + " ( " + props.getProperty("ColName4Table" + NumTab) + " ) " + " VALUES (";
                            for (int i = 0; i < MasReq.length; i++) {
                                if (i != 0)
                                    Req = String.valueOf(Req) + " , ";
                                if (MasReq[i].indexOf("%") != -1) {
                                    MasReq[i] = MasReq[i].substring(MasReq[i].indexOf("%") + 1, MasReq[i].indexOf("%", MasReq[i].indexOf("%") + 1));
                                } else {
                                    MasReq[i] = MasAns[Integer.decode(MasReq[i]).intValue()];
                                }
                                if (MasReq[i].equalsIgnoreCase(""))
                                    MasReq[i] = "NULL";
                                if (MasReq[i].equalsIgnoreCase("NULL")) {
                                    Req = String.valueOf(Req) + MasReq[i];
                                } else {
                                    Req = String.valueOf(Req) + "'" + MasReq[i].getBytes("cp1251") + "'";
                                }
                            }
                            Req = String.valueOf(Req) + ")";
                            if (SQLcom(Req, conn))
                                Chet++;
                            ChetAll++;
                        }
                        Answer = in.readLine();
                    }
                    System.out.println("Value : " + Chet + " / " + ChetAll);
                } catch (FileNotFoundException e) {
                    System.out.println("CSV file not found");
                }
            } catch (IOException e) {
                System.out.println("Properties file not valid");
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Properties file not found");
        }
    }

    private static boolean SQLcom(String q, Connection con) throws SQLException {
        Statement st = con.createStatement();
        try {
            st.execute(q);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(q);
            return false;
        }
    }
}
