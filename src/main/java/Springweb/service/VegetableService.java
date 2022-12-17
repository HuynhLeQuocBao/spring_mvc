
package Springweb.service;

import Springweb.entity.Vegetable3;
import Springweb.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author caothanh
 */
@Service
public interface VegetableService {
    @Autowired
    Iterable<Vegetable3> findAll();
    List<Vegetable3> search(String term);
}
