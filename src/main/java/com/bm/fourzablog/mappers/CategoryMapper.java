package com.bm.fourzablog.mappers;

import com.bm.fourzablog.dto.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet rs, int index) throws SQLException {
        Category category = new Category();
        category.setId(rs.getInt("Id"));
        category.setName(rs.getString("Name"));

        return category;
    }

}