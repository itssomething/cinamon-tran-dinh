/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.staff;

import entities.staff.Shipper;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface ShipperFacadeLocal {

    void create(Shipper shipper);

    void edit(Shipper shipper);

    void remove(Shipper shipper);

    Shipper find(Object id);

    List<Shipper> findAll();

    List<Shipper> findRange(int[] range);

    int count();
    
}
