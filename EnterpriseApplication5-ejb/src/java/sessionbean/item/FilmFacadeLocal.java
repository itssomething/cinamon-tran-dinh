/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean.item;

import entities.item.Film;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Manh
 */
@Local
public interface FilmFacadeLocal {

    void create(Film film);

    void edit(Film film);

    void remove(Film film);

    Film find(Object id);

    List<Film> findAll();

    List<Film> findRange(int[] range);

    int count();
    
}
