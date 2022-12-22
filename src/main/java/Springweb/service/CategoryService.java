
package Springweb.service;

import Springweb.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author caothanh
 */
@Service
public interface CategoryService {
    @Autowired
    Iterable<Category> findAll();
}
