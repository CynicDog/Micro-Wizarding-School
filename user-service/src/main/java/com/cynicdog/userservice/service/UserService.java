package com.cynicdog.userservice.service;

import com.cynicdog.userservice.entity.Professor;
import com.cynicdog.userservice.entity.Student;
import com.cynicdog.userservice.entity.User;
import com.cynicdog.userservice.repository.CourseRepository;
import com.cynicdog.userservice.repository.PetRepository;
import com.cynicdog.userservice.repository.UserRepository;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = Logger.getLogger(UserService.class);

    private final UserRepository userRepository;
    private final PetRepository petRepository;
    private final CourseRepository courseRepository;

    public UserService(UserRepository userRepository, PetRepository petRepository, CourseRepository courseRepository) {
        this.userRepository = userRepository;
        this.petRepository = petRepository;
        this.courseRepository = courseRepository;
    }

    public void insertStudent(Student student) {
        userRepository.save(student);
    }

    public void insertProfessor(Professor professor) {
        userRepository.save(professor);
    }

    public User getUserByFullName(String fullName) {

        String[] partsArray = fullName.split("(?=\\p{Upper})");

        String firstName = partsArray.length > 0 ? partsArray[0] : null;
        String middleName = partsArray.length > 1 ? partsArray[1] : null;
        String lastName = partsArray.length > 2 ? partsArray[2] : null;

        logger.info(fullName + ", " + middleName + ", " + lastName);

        return userRepository.findByFirstNameAndMiddleNameAndLastName(firstName, middleName, lastName).orElse(null);
    }
}
