/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.MovieTicket;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface MovieTicketFacadeLocal {

    void create(MovieTicket movieTicket);

    void edit(MovieTicket movieTicket);

    void remove(MovieTicket movieTicket);

    MovieTicket find(Object id);

    List<MovieTicket> findAll();

    List<MovieTicket> findRange(int[] range);

    int count();
    
}
