/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author gustavosa
 */
@Stateless
public class HelloWorldBean implements HelloWorldRemote {

    @Override
    public String olaMundo() {
        return "Ola Mundo com EJB";
    }
    
}
