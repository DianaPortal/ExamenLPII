package Controlador;

import Dao.TblUsuarioImp;
import Interfaces.IUsuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.TblUsuariocl2;

public class ControladorUsuario extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IUsuario usuarioDAO;
    private EntityManagerFactory em;
    private EntityManager emanager;

    public ControladorUsuario() {
        em = Persistence.createEntityManagerFactory("LPII_CL2_PORTALOLANODIANALIZETH");
        emanager = em.createEntityManager();
        usuarioDAO = new TblUsuarioImp(emanager);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.getRequestDispatcher("/index.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        TblUsuariocl2 usuarioValidado = usuarioDAO.validar(usuario, password);
        if (usuarioValidado != null) {
            request.getSession().setAttribute("usuario", usuarioValidado);
            request.getSession().setAttribute("welcomeMessage", "Bienvenido al sistema, " + usuario + "!");
            response.sendRedirect("RegistrarProductos.jsp");
        } else {
            request.setAttribute("error", "Usuario o contraseña incorrectos");
            request.getRequestDispatcher("/ControladorUsuario").forward(request, response);
        }
    }

}
