package utilities;

import java.sql.*;

public class SQLConnect {

    private Connection con = null;
    private Statement stmt = null;

    public SQLConnect(DBTypes dbtype, String dbName){
        switch (dbtype){
            case mysql:
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection(
                            "jdbc:mysql://test.medis.mersys.io:33306/" + dbName,
                            "technostudy",
                            "zhTPis0l9#$&");
                    stmt = con.createStatement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case sqlite:
                break;
            case oracle:
                break;
        }
    }

    public ResultSet getResults(String sqlString) throws SQLException {
        return stmt.executeQuery(sqlString);
    }

    public void close() throws SQLException {
        if (con != null)
            con.close();

        if (stmt != null)
            stmt.close();
    }
}
