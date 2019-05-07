/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.state;

/**
 *
 * @author Manh
 */
public class PackagedState implements OrderState{

    @Override
    public String getState() {
        return "packaged";
    }
    
}
