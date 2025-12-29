
package com.example.subjectmanagement.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.subjectmanagement.model.Subject;
import com.example.subjectmanagement.repository.SubjectRepository;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository repository;

    public Subject saveSubject(Subject subject) {
        return repository.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return repository.findAll();
    }

    public Subject updateSubject(int id, Subject subject) {
        Subject existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setCode(subject.getCode());
            existing.setName(subject.getName());
            return repository.save(existing);
        }
        return null;
    }

    public void deleteSubject(int id) {
        repository.deleteById(id);
    }
}
