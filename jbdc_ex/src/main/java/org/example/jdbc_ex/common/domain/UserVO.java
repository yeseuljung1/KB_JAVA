package org.example.jdbc_ex.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserVO {
    private String id;
    private String password;
    private String name;
    private String role;

}
