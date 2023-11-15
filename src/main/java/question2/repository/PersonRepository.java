package question2.repository;

import question2.entity.Person;

import java.util.List;

import java.util.List;

public interface PersonRepository<T extends Person> {
    void save(T person);
    void delete(Integer id);
    void update(T person,Integer id);
    List<T> loadAll();
    boolean contains(String firstName, String lastName);
    T findById(Integer id);
    String getEntityTableName();
    Class<T> getEntityClass();
}
