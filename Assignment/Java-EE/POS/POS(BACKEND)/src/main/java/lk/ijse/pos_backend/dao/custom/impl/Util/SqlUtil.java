package lk.ijse.pos_backend.dao.custom.impl.Util;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: Vishal Sandakelum,
 * @Runtime version: 11.0.11+9-b1341.60 amd64
 **/

public class SqlUtil {
    private static Connection con = null;
    public static Connection getConnection() throws NamingException, SQLException {
        Context initialContext = new InitialContext();
        DataSource dataSource = (DataSource) initialContext.lookup("java:comp/env/DBCP");

        return dataSource.getConnection();
    }

    public static <T>T execute(String sql, Object... args) throws SQLException, NamingException {
        try {
            con = SqlUtil.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                pstm.setObject((i + 1), args[i]);
            }

            if (sql.startsWith("SELECT") || sql.startsWith("select")) {
                return (T) pstm.executeQuery();
            } else {
                return (T) new Boolean(pstm.executeUpdate() > 0);
            }
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            if (sql.startsWith("SELECT") || sql.startsWith("select")){
            }else {
                if(con!=null){
                    con.close();
                }
            }
        }
    }

    public static void CloseConnection(){
        try {
            if(con!=null){
                con.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
