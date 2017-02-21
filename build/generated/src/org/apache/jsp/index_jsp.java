package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>Pesquisa</title>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"stylePesquisa.css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id=\"body-pesquisa\">\n");
      out.write("            \n");
      out.write("            <img src=\"imagens/image001.gif\" width=\"87\" height=\"84\" alt=\"image001\"/>\n");
      out.write("            \n");
      out.write("            <h4>PODER JUDICIÁRIO <br>\n");
      out.write("                JUSTIÇA FEDERAL DE PRIMEIRO GRAU <br>\n");
      out.write("                SEÇÃO JUDICIÁRIA DA PARAÍBA <br>\n");
      out.write("                Seção de Comunicação Social</h4>\n");
      out.write("            \n");
      out.write("            <h3>PESQUISA DE OPINIÃO</h3>\n");
      out.write("\n");
      out.write("            <p>No intuito de avaliar a qualidade dos serviços prestados pelos Postos\n");
      out.write("               de Atendimento Bancário da Caixa Econômica Federal na Justiça Federal\n");
      out.write("               em João Pessoa e em Campina Grande, <u>especificamente em relação ao caixa\n");
      out.write("               reservado aos servidores e magistrados</u>, solicitamos aos senhores o\n");
      out.write("               preenchimento desta PESQUISA DE OPINIÃO.</p>\n");
      out.write("            \n");
      out.write("            <p>Cada item será avaliado como: <u>Ótimo</u>, <u>Bom</u>, <u>Regular</u>,\n");
      out.write("               <u>Ruim</u> ou <u>Péssimo</u>. Deverá ser marcada apenas <b>UMA</b> dessas\n");
      out.write("               cinco opções listadas nas tabelas abaixo.</p>\n");
      out.write("            \n");
      out.write("            <h3>Participe! Sua opinião é extremamente importante.</h3>\n");
      out.write("            \n");
      out.write("            <form method=\"POST\" action=\"pesquisaServlet\">\n");
      out.write("                \n");
      out.write("                *Tempo para o atendimento:\n");
      out.write("            \n");
      out.write("                <select name=\"pesquisa1\" id=\"pesquisa1\">\n");
      out.write("                    \n");
      out.write("                    <option value=\"null\"></option>\n");
      out.write("                    <option value=\"otimo\">Ótimo</option>\n");
      out.write("                    <option value=\"bom\">Bom</option>\n");
      out.write("                    <option value=\"regular\">Regular</option>\n");
      out.write("                    <option value=\"ruim\">Ruim</option>\n");
      out.write("                    <option value=\"pessimo\">Péssimo</option>\n");
      out.write("                </select>\n");
      out.write("                \n");
      out.write("                *Qualidade do atendimento:\n");
      out.write("            \n");
      out.write("                <select name=\"pesquisa2\" id=\"pesquisa2\">\n");
      out.write("                    \n");
      out.write("                    <option value=\"null\"></option>\n");
      out.write("                    <option value=\"otimo\">Ótimo</option>\n");
      out.write("                    <option value=\"bom\">Bom</option>\n");
      out.write("                    <option value=\"regular\">Regular</option>\n");
      out.write("                    <option value=\"ruim\">Ruim</option>\n");
      out.write("                    <option value=\"pessimo\">Péssimo</option>\n");
      out.write("                </select><br><br>\n");
      out.write("                \n");
      out.write("                Sugestões:<br>\n");
      out.write("                <input type=\"text\" id=\"sugestao\" name=\"sugestao\" size=\"75\">\n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Enviar\" id=\"votar\" name=\"votar\"> <br>\n");
      out.write("            </form>\n");
      out.write("        </div>        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
