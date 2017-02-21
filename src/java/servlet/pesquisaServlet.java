package servlet;

import DAO.registraDAO;
import entidade.voto;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author estagio.gleydson
 */
public class pesquisaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        doPost(request, response);
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destino = "";
        String valorVoto = "null";

        //cria novos objetos voto
        voto votoPesquisa1 = new voto();
        voto votoPesquisa2 = new voto();
        voto sugestaoPesquisa = new voto();
        
        //cria um objeto DAO, para comunicação com o BD
        registraDAO dao = new registraDAO();

        votoPesquisa1.setVotoPesquisa1(request.getParameter("pesquisa1")); //atribui o valor da pesquisa1 no objeto valoresTabelaPesquisa1
        votoPesquisa2.setVotoPesquisa2(request.getParameter("pesquisa2")); //atribui o valor da pesquisa2 no objeto votoPesquisa3
        sugestaoPesquisa.setSugestaoPesquisa(request.getParameter("sugestao")); //atribui o valor da sugestao no objeto sugestaoPesquisa

        if (votoPesquisa1.getVotoPesquisa1().equals(valorVoto) || votoPesquisa2.getVotoPesquisa2().equals(valorVoto)) {

            JOptionPane.showMessageDialog(null, "Campo em branco. Tente novamente.");
            destino = "index.jsp";
        } else {

            dao.alterar(votoPesquisa1, votoPesquisa2);
            
            if (!sugestaoPesquisa.getSugestaoPesquisa().equals("")) {
              
                dao.inserir(sugestaoPesquisa);
            }
            
            dao.retornaValores();
            
            //JOptionPane.showMessageDialog(null, registraDAO.valoresTabelaPesquisa1.getID());
            //JOptionPane.showMessageDialog(null, registraDAO.valoresPesquisaTabela2.getID());
            //MUDAR AQUI DESTINO FINAL
            destino = "resultado.jsp";
        }

        RequestDispatcher rd = request.getRequestDispatcher(destino);
        rd.forward(request, response);
    }
    
    /*
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. * /
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet pesquisaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet pesquisaServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    */

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //@Override
    /*
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    */
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //@Override
    /*
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    */
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
