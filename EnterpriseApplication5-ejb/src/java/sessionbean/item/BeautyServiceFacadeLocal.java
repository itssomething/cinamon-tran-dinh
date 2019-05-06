/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.BeautyService;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface BeautyServiceFacadeLocal {

    void create(BeautyService beautyService);

    void edit(BeautyService beautyService);

    void remove(BeautyService beautyService);

    BeautyService find(Object id);

    List<BeautyService> findAll();

    List<BeautyService> findRange(int[] range);

    int count();
    
}
