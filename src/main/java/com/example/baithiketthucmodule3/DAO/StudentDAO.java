package com.example.baithiketthucmodule3.DAO;

import com.example.baithiketthucmodule3.Model.Student;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    static Connection connection = ConnectionMySql.getConnection();

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "select * from hocsinh";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                LocalDate dateOfBirth = resultSet.getDate("dateOfBirth").toLocalDate();
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                int classroom = Integer.parseInt(resultSet.getString("classroom"));
                students.add(new Student(id, name, dateOfBirth, address, phone, email, classroom));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public static boolean edit(Student student) {
        String sql = "update hocsinh set name=?, dateOfBirth=?, address=?, phone=?, email=?, classroom=? where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(7,student.getId());
            preparedStatement.setString(1, student.getName());
            preparedStatement.setDate(2, student.getDateOfBirth());
            preparedStatement.setString(3, student.getAddress());
            preparedStatement.setString(4, student.getPhone());
            preparedStatement.setString(5, student.getEmail());
            preparedStatement.setInt(6, student.getClassroom());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static Student findStudentById(int id) {
        String sql = "select * from hocsinh where id=" + id;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();
            String name = resultSet.getString("name");
            LocalDate dateOfBirth = resultSet.getDate("dateOfBirth").toLocalDate();
            String address = resultSet.getString("address");
            String phone = resultSet.getString("phone");
            String email = resultSet.getString("email");
            int classroom = Integer.parseInt(resultSet.getString("classroom"));
            return new Student(id, name,dateOfBirth, address, phone, email, classroom);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void deleteStudent(int id) {
        String sql = "Delete from hocsinh where id=" + id;
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean save(Student student) {
        String sql = "INSERT INTO hocsinh VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement =connection.prepareStatement(sql);
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setDate(3, student.getDateOfBirth());
            preparedStatement.setString(4, student.getAddress());
            preparedStatement.setString(5, student.getPhone());
            preparedStatement.setString(6, student.getEmail());
            preparedStatement.setInt(7, student.getClassroom());
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static List<Student> search(String str) {
        List<Student> resultSearchs = new ArrayList<>();
        String sql = "SELECT * FROM hocsinh WHERE name like " + "'%"+str+"%'";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                LocalDate dateOfBirth = resultSet.getDate("dateOfBirth").toLocalDate();
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                int classroom = Integer.parseInt(resultSet.getString("classroom"));
                resultSearchs.add(new Student(id, name, dateOfBirth, address, phone, email, classroom));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSearchs;
    }
}
