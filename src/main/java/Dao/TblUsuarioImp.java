package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Interfaces.IUsuario;
import model.TblUsuariocl2;

public class TblUsuarioImp implements IUsuario{

	@Override
	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		// Establecer conexion con la unidad de persistencia
				EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_PORTALOLANODIANALIZETH");
				//gestionar las entidades
				EntityManager emanager=em.createEntityManager();
				//iniciamos la transacción
				emanager.getTransaction().begin();
				//registramos a la base datos
				emanager.persist(usuario);
				//emitimos mensaje por consola
				System.out.println("Uauario registrado en la BD");
				//confirmamos la transacción.
				emanager.getTransaction().commit();
				//cerramos
				emanager.close();
		
	} // fin del metodo registrar

	@Override
	public void ActualizarUsuario(TblUsuariocl2 usuario) {
		// TODO Auto-generated method stub
		
	} //fin del metodo actualizar

	@Override
	public void EliminarUsuario(TblUsuariocl2 usuario) {
		// TODO Auto-generated method stub
		
	} //fin del metodo eliminar

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 usuario) {
		// TODO Auto-generated method stub
		return null;
	} //fin del metodo Buscar

	@Override
	public List<TblUsuariocl2> ListarUsuario() {
		// TODO Auto-generated method stub
		return null;
	} //fin del metodo Listar

} //fin de la clase
