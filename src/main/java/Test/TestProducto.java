package Test;

import java.util.List;

import Dao.TblProductoImp;
import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		// // realizamos la respectivas instancias
		TblProductocl2 cliente = new TblProductocl2();
		TblProductoImp crud = new TblProductoImp();
		
		List<TblProductocl2> listado=crud.ListarProducto();
		//aplicamos un bucle
		for(TblProductocl2 lis:listado) {
			
			//imprimimos por pantalla
			System.out.println("codigo :"+ lis.getIdProductoCL2()+
					" nombre :"+lis.getNombreCL2()+
					" precioVenta :"+lis.getPrecioVentaCL2()+
					" precioCompra :"+lis.getPrecioCompCL2()+
					" estado :"+lis.getEstadoCL2()+
					" descripcion :"+lis.getDescripCL2());
		}

	} //fin del metodo principal

} // fin de la clase