
package Springweb.repository;

import Springweb.entity.Category;
import Springweb.entity.Vegetable3;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author caothanh
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    @Query(value="SELECT vegetable.* FROM vegetable, category WHERE category.Name=?1 and category.CatagoryID = vegetable.CatagoryID", nativeQuery = true)
    List <Vegetable3> searchCategoryByName( String name);
}
