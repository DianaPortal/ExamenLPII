package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TblProductoImp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProyecto
 */

public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }// fin del constructor

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TblProductoImp crud = new TblProductoImp();
        List<TblProductocl2> listadoproducto = crud.ListarProducto();
        request.setAttribute("listadoproductos", listadoproducto);
        request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar valores del formulario
        String nombre = request.getParameter("nombre");
        String precioVentaStr = request.getParameter("precioVenta");
        String precioCompStr = request.getParameter("precioCompra");
        String estado = request.getParameter("estado");
        String descripcion = request.getParameter("descripcion");
        //
        TblProductocl2 producto = new TblProductocl2();
        TblProductoImp crud = new TblProductoImp();
        // Convertir precios de String a double
        double precioVenta = 0;
        double precioCompra = 0;
        try {
            precioVenta = Double.parseDouble(precioVentaStr);
            precioCompra = Double.parseDouble(precioCompStr);
        } catch (NumberFormatException e) {
            // Manejo de error en la conversión
            e.printStackTrace();
                        
            return;
        }

        // Crear y asignar valores al objeto TblProductocl2
       
        producto.setNombreCL2(nombre);
        producto.setPrecioVentaCL2(precioVenta);
        producto.setPrecioCompCL2(precioCompra);
        producto.setEstadoCL2(estado);
        producto.setDescripCL2(descripcion);
        //
        crud.RegistrarProducto(producto);
      //actualizar listado
        List<TblProductocl2> listadoproducto = crud.ListarProducto();
        request.setAttribute("listadoproductos", listadoproducto);
        request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
        // Registrar el producto en la base de datos
    
    }

    

}
