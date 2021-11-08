package dao.imp;

import dao.CourseDao;
import models.Course;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseDaoImpl implements CourseDao<Course> {


    private final EntityManager entityManager;

    @Autowired
    public CourseDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Course> findAll() {
        return entityManager.createQuery("FROM Course c", Course.class).getResultList();
    }

    @Override
    @Transactional
    public Course findById(int id) {
        return entityManager.find(Course.class, id);
    }

    @Override
    @Transactional
    public Course saveToDatabase(Course object) {
        return entityManager.merge(object);
    }

    @Override
    @Transactional
    public void deleteFromDatabase(int id) {
        Course course = entityManager.find(Course.class,id);
        if(course != null){
            entityManager.remove(course);
        }

    }

    @Override
    @Transactional
    public void updateOnDatabase(Course object) {
        entityManager.merge(object);
    }
}
