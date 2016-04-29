package dao.bo.api;


import dao.shared.MainDaoService;

import java.util.List;

/**
 * Main {@link TestEntityBO} CRUD service.
 *
 * @author Andrew khilkevich
 */
public interface TestEntityService extends MainDaoService {

    /**
     * Create new {@link TestEntityBO}
     *
     * @param entity
     *      new {@link TestEntityBO}
     * @return
     *      created {@link dao.shared.EntityVO}
     * @throws TestEntityServiceException
     */
    public TestEntityBO createEntity (final TestEntityBO entity) throws TestEntityServiceException;

    /**
     * Get one entity by String id.
     *
     * @param id
     *      String id
     * @return
     *      {@link TestEntityBO}
     * @throws TestEntityServiceException
     */
    public TestEntityBO getEntity (final String id) throws TestEntityServiceException;

    /**
     * Get all entities.
     *
     * @return
     *      {@link java.util.List} of {@link TestEntityBO}
     * @throws TestEntityServiceException
     */
    public List<TestEntityBO> getAllEntities () throws TestEntityServiceException;

    /**
     * Edit one entity by String id.
     *
     * @param entity
     *      {@link TestEntityBO}
     * @return
     *      edited {@link TestEntityBO}
     * @throws TestEntityServiceException
     */
    public TestEntityBO editEntity (final TestEntityBO entity) throws TestEntityServiceException;

    /**
     * Delete entity by String id.
     *
     * @param id
     *      String id
     * @return
     *      deleted {@link TestEntityBO}
     * @throws TestEntityServiceException
     */
    public TestEntityBO deleteEntity (final String id) throws TestEntityServiceException;
}
