package ua.training.model.dao.impl;

import ua.training.model.dao.RecordDao;
import ua.training.model.entity.Record;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCRecordDao implements RecordDao {
    private Connection connection;

    JDBCRecordDao(Connection connection) {
        this.connection = connection;
    }

    public void create(Record record) {
        try (PreparedStatement ps = connection.prepareStatement("INSERT INTO recordbook(firstName,loginData)" +
                "VALUES (?,?)")) {
            ps.setString(1, record.getFirstName());
            ps.setString(2, record.getLogin());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    public Record findById(int id) {
        try (PreparedStatement ps = connection.prepareStatement("SELECT *FROM recordbook WHERE id=?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Record result = extractFromResultSet(rs);
                return result;
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return null;
    }

    private Record extractFromResultSet(ResultSet rs) throws SQLException {
        Record result = new Record();
        result.setId(rs.getInt("id"));
        result.setFirstName(rs.getString("firstName"));
        result.setLogin(rs.getString("loginData"));
        return result;
    }

    public List<Record> findAll() {
        List<Record> resultList = new ArrayList<>();
        try (Statement ps = connection.createStatement()) {
            ResultSet rs = ps.executeQuery("SELECT *  FROM recordbook");
            while (rs.next()) {
                Record result = extractFromResultSet(rs);
                resultList.add(result);
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return resultList;
    }

    public void update(Record record) {
        try (PreparedStatement ps = connection.prepareStatement("UPDATE recordbook set firstName = ?,loginData = ?" +
                "WHERE id = ?")) {
            ps.setString(1, record.getFirstName());
            ps.setString(2, record.getLogin());
            ps.setInt(3, record.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                "DELETE FROM recordBook WHERE id=?")){
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }

    }
}
