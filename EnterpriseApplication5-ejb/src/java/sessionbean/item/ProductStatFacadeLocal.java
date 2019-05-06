/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.ProductStat;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface ProductStatFacadeLocal {

    void create(ProductStat productStat);

    void edit(ProductStat productStat);

    void remove(ProductStat productStat);

    ProductStat find(Object id);

    List<ProductStat> findAll();

    List<ProductStat> findRange(int[] range);

    int count();
    
}
