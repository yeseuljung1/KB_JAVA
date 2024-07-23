package org.example.jdbc_ex.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    static Connection conn = null;

    // 정적 초기화 블록을 사용해서 JDBC 드라이버를 로드하고 데이터베이스 연결 설정
    static {
        try {
            // application.properties 파일에서 드라이버, URL, 사용자 ID, 비밀번호 가져오기
            Properties prop = new Properties();
            prop.load(JDBCUtil.class.getResourceAsStream("/application.properties"));

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String id = prop.getProperty("id");
            String password = prop.getProperty("password");

            // MySQL JDBC 드라이버 로드
            Class.forName(driver);
            // DriverManager을 사용해서 데이터베이스 연결 객체 생성
            conn = DriverManager.getConnection(url, id, password);
        } catch (SQLException e) {
            // SQL 예외 처리
            e.printStackTrace();
        } catch (Exception e) {
            // 기타 예외 처리
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    public static void close() {
        try {
            if (conn != null) {
                // 데이터베이스 연결 객체 닫기
                conn.close();
                conn = null;
            }
        } catch (SQLException e) {
            // SQL 예외 처리
            e.printStackTrace();
        }
    }
}
