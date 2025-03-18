package raisetech.StudentManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raisetech.StudentManagement.data.Student;
import raisetech.StudentManagement.data.StudentCourses;
import raisetech.StudentManagement.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> searchStudentList() {
        return repository.StudentListSearch();


        //年齢が３０代のみの人を抽出する。
        //抽出したリストをコントローラーに返す
    }

    public List<StudentCourses> searchStudentCourseList() {
        return repository.StudentCourseListSearch();

        //Javaコースのコース情報のみを抽出する。
        //抽出したリストをコンローラーに返す
    }
}
