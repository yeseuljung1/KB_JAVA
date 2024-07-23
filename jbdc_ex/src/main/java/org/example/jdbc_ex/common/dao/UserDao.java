package org.example.jdbc_ex.common.dao;

import org.scoula.jdbc_ex.domain.UserVO;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

// DAO : DATA ACCESS OBJECT-> 테이블에 대한 CRUD연산을 처리하는 인터페이스
public interface UserDao {
    // 회원 등록 /새로운 사용자 등록 (CRUD 중 C)
    int create(UserVO user) throws SQLException;
    // 회원 목록 조회 / 모든 사용자 목록 조회(CRUD 중 R)
    List<UserVO> getList() throws SQLException;
    // 회원 정보 조회 /특정 사용자 정보 조회(CRUD 중 R)
    Optional<UserVO> get(String id) throws SQLException;
    // 회원 수정 / 사용자의 정보 수정 (CRUD 중 U)
    int update(UserVO user) throws SQLException;
    // 회원 삭제 / 특정 사용자 삭제 (CRUD 중 D)
    int delete(String id) throws SQLException;
}
