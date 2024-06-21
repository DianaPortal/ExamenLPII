package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class TblProductoImp implements IProducto{

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		// Establecer conexion con la unidad de persistencia
				EntityManagerFactory em=Persistence.createEntityManagerFactory("LPII_CL2_PORTALOLANODIANALIZETH");
				//gestionar las entidades
				EntityManager emanager=em.createEntityManager();
				//iniciamos la transacción
				emanager.getTransaction().begin();
				//registramos a la base datos
				emanager.persist(producto);
				//emitimos mensaje por consola
				System.out.println("cliente registrado en la BD");
				//confirmamos la transacción.
				emanager.getTransaction().commit();
				//cerramos
				emanager.close();
		
	} //fin del metodo registrar

	@Override
	public void ActualizarProducto(TblProductocl2 producto) {
		// TODO Auto-generated method stub
		
	} //fin del metodo actualizar

	@Override
	public void EliminarProducto(TblProductocl2 producto) {
		// TODO Auto-generated method stub
		
	} //fin del metodo Eliminar

	@Override
	public TblProductocl2 BuscarProducto(TblProductocl2 producto) {
		// TODO Auto-generated method stub
		return null;
	} //fin del metodo Buscar

	@Override
	public List<TblProductocl2> ListarProducto() {
		// Establecer conexion con la unidad de persistencia
				EntityManagerFactory fab=Persistence.createEntityManagerFactory("LPII_CL2_PORTALOLANODIANALIZETH");
				//gestionar las entidades
				EntityManager em=fab.createEntityManager();
				//iniciamos la transacción
				em.getTransaction().begin();
				//recuperamos la data
				List<TblProductocl2> listado = em.createQuery("SELECT c FROM TblProductocl2 c", TblProductocl2.class).getResultList();
				//confirmamos la transaccion
				em.getTransaction().commit();
				//cerramos
				em.close();
				//retornamos el listado
				return listado;
	} // fin del metodo Listar

} //fin de clase
