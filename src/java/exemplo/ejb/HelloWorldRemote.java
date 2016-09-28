/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.ejb;

import javax.ejb.Remote;

/**
 *
 * @author gustavosa
 */

@Remote
public interface HelloWorldRemote {
    public String olaMundo();
}
