package ma.oracle.apps.cx.realestate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.sql.Blob;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.servlet.*;
import javax.servlet.http.*;

import javax.sql.DataSource;
public class ProjImgServlet extends HttpServlet {
    @SuppressWarnings("compatibility:8459861126902885084")
    private static final long serialVersionUID = 1L;
    private static final String CONTENT_TYPE = "image/gif; charset=utf-8";

       public void init(ServletConfig config) throws ServletException {
           super.init(config);
       }

    @SuppressWarnings("oracle.jdeveloper.java.nested-assignment")
    public void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException,
                                                              IOException {
           

           response.setContentType(CONTENT_TYPE);
           String imageId = request.getParameter("id");
           OutputStream os = response.getOutputStream();
           Connection conn = null;
           try {
               Context ctx = new InitialContext();            
               conn = getOracleConnection();
               PreparedStatement statement =
                   conn.prepareStatement("SELECT IMAGE_ID ID,IMAGE_CONTENT PIC" +
                                         " from XXMA_RS_PROJECT_IMAGES " +
                                         "WHERE IMAGE_ID = ?");
               statement.setInt(1, new Integer(imageId));
               ResultSet rs = statement.executeQuery();

               if (rs.next()) {
                Blob blob;
                blob = rs.getBlob("PIC");
                BufferedInputStream in = new BufferedInputStream(blob.getBinaryStream());
                   int b;
                   byte[] buffer = new byte[10240];
                   while ((b = in.read(buffer, 0, 10240)) != -1) {
                       os.write(buffer, 0, b);
                   }
                   os.close();
               }
           } catch (Exception e) {
               System.out.println(e);
           } finally {
               try {
                   if (conn != null) {
                       conn.close();
                   }
               } catch (SQLException sqle) {
                   System.out.println("SQLException error");
               }
           }
       }
       public static Connection getOracleConnection() throws Exception {
         String driver = "oracle.jdbc.driver.OracleDriver";
         String url = "jdbc:oracle:thin:@192.168.1.8:1521:VIS";
         String username = "apps";
         String password = "Applmgr_admin8";

         Class.forName(driver); // load Oracle driver
         Connection conn = DriverManager.getConnection(url, username, password);
         return conn;
       }
}

