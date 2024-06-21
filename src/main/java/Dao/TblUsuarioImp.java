package Dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class TblUsuarioImp implements IUsuario {

    private EntityManager entityManager;

    public TblUsuarioImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    public TblUsuariocl2 validar(String usuario, String password) {
        TypedQuery<TblUsuariocl2> query = entityManager.createQuery("SELECT t FROM TblUsuariocl2 t WHERE t.usuarioCL2 = :usuario AND t.passwordCL2 = :password", TblUsuariocl2.class);
        query.setParameter("usuario", usuario);
        query.setParameter("password", password);
        return query.getSingleResult();
    }
}
