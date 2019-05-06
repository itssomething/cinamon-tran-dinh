/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.BeautyCenter;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface BeautyCenterFacadeLocal {

    void create(BeautyCenter beautyCenter);

    void edit(BeautyCenter beautyCenter);

    void remove(BeautyCenter beautyCenter);

    BeautyCenter find(Object id);

    List<BeautyCenter> findAll();

    List<BeautyCenter> findRange(int[] range);

    int count();
    
}
