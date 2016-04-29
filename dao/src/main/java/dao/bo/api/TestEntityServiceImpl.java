package dao.bo.api;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Main Service for {@link TestEntityBO} CRUD operations.
 *
 * @author Andrew Khilkevich
 */
@Component
@Transactional
public class TestEntityServiceImpl implements TestEntityService {

    @PersistenceContext(unitName = "vallen")
    private EntityManager entityManager;

    @Override
    public TestEntityBO createEntity(final TestEntityBO entity) throws TestEntityServiceException {
        if (null == entity)
            throw new IllegalArgumentException("Entity to creation is null");
        try {
            entityManager.persist(entity);
            return entity;
        } catch (Exception e) {
	        System.out.print(e.getMessage());
            throw new TestEntityServiceException("Creating entity with Id=" + entity.getId() + " fail, because" + e.getMessage());
        }
    }

    @Override
    public TestEntityBO getEntity(final String id) throws TestEntityServiceException {
        if(null == id)
            throw new IllegalArgumentException("Entity Id is null");
        try {
            return entityManager.find(TestEntityBO.class, id);
        } catch (Exception e) {
            throw new TestEntityServiceException("Get entity with Id=" + id + " fail, because" + e.getMessage());
        }

    }

    @Override
    @SuppressWarnings("unchecked")
    public List<TestEntityBO> getAllEntities() throws TestEntityServiceException {
        try {
            return (List<TestEntityBO>) entityManager.createQuery("SELECT TestEntityBO entity from " + TestEntityBO.class.getSimpleName()).getResultList();
        } catch (Exception e) {
            throw new TestEntityServiceException("Get list of entities fail, because" + e.getMessage());
        }
    }

    @Override
    public TestEntityBO editEntity(final TestEntityBO entity) throws TestEntityServiceException {
        if(null == entity)
            throw new IllegalArgumentException("Updated entity is null");
        try {
            return entityManager.merge(entity);
        } catch (Exception e) {
            throw new TestEntityServiceException("Update entity with Id=" + entity.getId() + " fail, because" + e.getMessage());
        }
    }


    @Override
    public TestEntityBO deleteEntity(final String id) throws TestEntityServiceException {
        if(null == id || id.isEmpty())
            throw new IllegalArgumentException("Entity to delete Id is empty");
        try {
            final TestEntityBO entityBO = entityManager.find(TestEntityBO.class, id);
            entityManager.remove(entityBO);
            return entityBO;
        } catch (Exception e) {
            throw new TestEntityServiceException("Deleting entity with Id=" + id + " fail, because" + e.getMessage());
        }

    }
}
