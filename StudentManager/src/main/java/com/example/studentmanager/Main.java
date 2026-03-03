package com.example.studentmanager;
public class Main {

    public static void main(String[] args) {

        // Khởi tạo StudentManager<Student>
        StudentManager<Student> manager = new StudentManager<>();

        // Thêm ít nhất 3 sinh viên
        manager.add(new Student("S01", "An", 3.5));
        manager.add(new Student("S02", "Binh", 3.8));
        manager.add(new Student("S03", "Chi", 3.2));

        // Duyệt danh sách và in ra toàn bộ sinh viên
        System.out.println("Danh sách sinh viên:");

        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
    }
}