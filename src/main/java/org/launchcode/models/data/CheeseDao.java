//this class allows us to interact with the database, retrieving and storing data via crudrepository

package org.launchcode.models.data;

import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional // all methods in this interface should be wrapped by a database transaction (database transaction is one interaction with the database)
public class CheeseDao extends CrudRepository<Cheese, Integer> {
}
