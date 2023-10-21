package com.userServiceProject.repository.mapper;

import com.userServiceProject.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User(
                rs.getLong("user_id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getInt("age"),
                rs.getString("address"),
                (rs.getDate("joining_date") != null) ? rs.getDate("joining_date").toLocalDate() : null,
                rs.getBoolean("status")
        );
        return user;
    }
}

