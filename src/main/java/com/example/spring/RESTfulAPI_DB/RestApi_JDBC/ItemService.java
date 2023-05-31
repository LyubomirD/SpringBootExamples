package com.example.spring.RESTfulAPI_DB.RestApi_JDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class ItemService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ItemService(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<ItemModel> getAllItems() {
        return jdbcTemplate.query("SELECT * FROM items;", new BeanPropertyRowMapper<>(ItemModel.class));
    }

    public ItemModel getItemById(Integer id) {
        return jdbcTemplate.queryForObject("SELECT * FROM items WHERE id = ?", new BeanPropertyRowMapper<>(ItemModel.class), id);
    }

    public ItemModel createItem(ItemModel item) {
        String sql = "INSERT INTO items (name, description) VALUES (?, ?)";
        jdbcTemplate.update(sql, item.getName(), item.getDescription());

        return item;
    }

    public ItemModel updateItem(Integer id, ItemModel item) {
        String sql = "UPDATE items SET name = ?, description = ? WHERE id = ?";
        int rowsUpdated = jdbcTemplate.update(sql, item.getName(), item.getDescription(), id);
        if (rowsUpdated > 0) {
            item.setId(id);
            return item;
        } else {
            return null;
        }
    }

    public boolean deleteItem(Integer id) {
        String sql = "DELETE FROM items WHERE id = ?";
        int rowsDeleted = jdbcTemplate.update(sql, id);
        return rowsDeleted > 0;
    }

    public boolean deleteInBetweenItems(Integer startId, Integer lastId) {
        String sql = "DELETE FROM items WHERE id BETWEEN ? AND ?";
        int rowsDeletedInBetween = jdbcTemplate.update(sql, startId, lastId);
        return rowsDeletedInBetween > 0;
    }
}
