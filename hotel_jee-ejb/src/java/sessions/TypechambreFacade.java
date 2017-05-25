/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Typechambre;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author MANAGER
 */
@Stateless
public class TypechambreFacade extends AbstractFacade<Typechambre> implements TypechambreFacadeLocal {

    @PersistenceContext(unitName = "hotel_jee-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TypechambreFacade() {
        super(Typechambre.class);
    }
    
}
