package rest;

import dao.bo.api.TestEntityBO;
import dao.bo.api.TestEntityService;
import dao.bo.api.TestEntityServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Main Test REST Endpoint.
 *
 * @author Andrew Khilkevich
 */
@RestController
@RequestMapping("/rest")
public class MainTestEndpoint {

    /**
     * {@link TestEntityService} instance.
     */
    @Autowired
    private TestEntityService testEntityService;

    /**
     * Get entity.
     *
     * @param entityId
     *      String id
     * @return
     *      {@link TestEntityBO}
     */
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET, produces = "application/json")
    public TestEntityBO getEntity(@PathVariable("id")final String entityId) {
        try {
            return testEntityService.getEntity(entityId);
        } catch (final TestEntityServiceException e) {
            //TODO: some reaction here
            return null;
        }
    }

    /**
     * Create entity.
     *
     * @param entity
     *      {@link TestEntityBO}
     * @return
     *      created {@link TestEntityBO}
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public TestEntityBO createEntity (final TestEntityBO entity) {
        try {
            return testEntityService.createEntity(entity);
        } catch (final TestEntityServiceException e) {
            //TODO: some reaction here
            return null;
        }
    }

    /**
     * Get all existing entities.
     *
     * @return
     *      {@link List} of {@link TestEntityBO}
     */
    @RequestMapping(value = "/get/all", method = RequestMethod.GET, produces = "application/json")
    public List<TestEntityBO> getAllEntities() {
        try {
            return testEntityService.getAllEntities();
        } catch (final TestEntityServiceException e) {
            //TODO: some reaction here
            return null;
        }
    }

    /**
     * Update entity.
     *
     * @param entity
     *      {@link TestEntityBO} with updates.
     * @return
     *      {@link TestEntityBO}
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public TestEntityBO updateEntity(final TestEntityBO entity) {
        try {
            return testEntityService.editEntity(entity);
        } catch (final TestEntityServiceException e) {
            //TODO: some reaction here
            return null;
        }
    }

    /**
     * Delete entity.
     *
     * @param id
     *      String id
     * @return
     *      deleted {@link TestEntityBO}
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public TestEntityBO deleteEntity(@PathVariable("id") final String id) {
        try {
            return testEntityService.deleteEntity(id);
        } catch (final TestEntityServiceException e) {
            //TODO: some reaction here
            return null;
        }
    }

    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET, produces = "application/json")
    public TestEntityBO testGet(@PathVariable("id") final String id) {
        if (id == null)
            return new TestEntityBO();
        final TestEntityBO testEntityBO = new TestEntityBO();
        testEntityBO.setBrowser("Chrome");
        testEntityBO.setCssGrade("Some CSS");
        testEntityBO.setEngineVersion("Some Engine Version");
        testEntityBO.setPlatform("Some Platform");

	    try {
		    return testEntityService.createEntity(testEntityBO);
	    } catch (TestEntityServiceException e) {
		    return null;
	    }
    }

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String getHello() {
        return "Ping rest";
    }
}
