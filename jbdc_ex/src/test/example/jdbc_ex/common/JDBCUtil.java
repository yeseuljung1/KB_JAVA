package org.example.jdbc_ex.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    static Connection conn = null;

    static {...}
    public static Connection getConnection(){
        return conn;
    }
    public static void close() {
        try {
            if (conn != null) {
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    //    정적 초기화 블록을 사용해서 JDBC 드라이버를 로드하고 데이터베이스 연결 설정
    static {
          try{
        Properties prop = new Properties();
        prop.load(JDBCUtil.class.getResourceAsStream("/application.propertiles"))
        
//       프로퍼티 파일에서 드라이버 url 사용자 id 비밀번호 가져옴
        String driver = prop.getProperty("driver");
        String url = prop.getProperty("url");
        String id = prop.getProperty("id");
        String password = prop.getProperty("password");

//        MySQL JDBC 드라이버 로드
              Class.forName(driver);
//              DriverManager을 사용해서 데이터베이스 연결 객체 생성
              conn = DriverManager.getConnection(url, id, password);
              
          }catch(
       Exception e)
    {
//        예외 발생 시 스택 트레이스를 출력
        e.printStackTrace();
       }
   }
}
