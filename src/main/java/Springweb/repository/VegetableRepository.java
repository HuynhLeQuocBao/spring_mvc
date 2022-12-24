
package Springweb.repository;


import Springweb.*;
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
public interface VegetableRepository extends CrudRepository<Vegetable3, Integer>{
    @Query(value="SELECT * FROM `vegetable` WHERE Vegetable_Name = ?1", nativeQuery = true)
    List<Vegetable3> SearchVegetableByCategogyIdOrName( String name);

    @Query(value = "SELECT vegetable.* FROM `vegetable`, `orderdetail` WHERE orderdetail.VegetableID = vegetable.VegetableID GROUP BY orderdetail.VegetableID ORDER BY SUM(orderdetail.Quantity) DESC LIMIT 3", nativeQuery = true)
    List<Vegetable3> getBestSeller();
}
