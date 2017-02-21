package DAO;

import entidade.voto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author estagio.gleydson
 */

public class registraDAO extends DAO {
    
    public static voto valoresTabelaPesquisa1;
    public static voto valoresPesquisaTabela2;
    
    public void alterar(voto votoPesquisa1, voto votoPesquisa2) {
        try {
            
            Connection conexao = getConexao();

            if (votoPesquisa1.getVotoPesquisa1().equals("otimo")) {
                
                PreparedStatement pstmt = conexao.prepareStatement("UPDATE pesquisa1 SET ID = ID + 1, otimo = otimo + 1");
                
                pstmt.execute();
                pstmt.close();
            }
            
            if (votoPesquisa1.getVotoPesquisa1().equals("bom")) {
                
                PreparedStatement pstmt = conexao.prepareStatement("UPDATE pesquisa1 SET ID = ID + 1, bom = bom + 1");
                
                pstmt.execute();
                pstmt.close();
            }
            
            if (votoPesquisa1.getVotoPesquisa1().equals("regular")) {
                
                PreparedStatement pstmt = conexao.prepareStatement("UPDATE pesquisa1 SET ID = ID + 1, regular = regular + 1");
                
                pstmt.execute();
                pstmt.close();
            }
            
            if (votoPesquisa1.getVotoPesquisa1().equals("ruim")) {
                
                PreparedStatement pstmt = conexao.prepareStatement("UPDATE pesquisa1 SET ID = ID + 1, ruim = ruim + 1");
                
                pstmt.execute();
                pstmt.close();
            }
            
            if (votoPesquisa1.getVotoPesquisa1().equals("pessimo")) {
                
                PreparedStatement pstmt = conexao.prepareStatement("UPDATE pesquisa1 SET ID = ID + 1, pessimo = pessimo + 1");
                
                pstmt.execute();
                pstmt.close();
            }
            
            if (votoPesquisa2.getVotoPesquisa2().equals("otimo")) {
                
                PreparedStatement pstmt = conexao.prepareStatement("UPDATE pesquisa2 SET ID = ID + 1, otimo = otimo + 1");
                
                pstmt.execute();
                pstmt.close();
            }
            
            if (votoPesquisa2.getVotoPesquisa2().equals("bom")) {
                
                PreparedStatement pstmt = conexao.prepareStatement("UPDATE pesquisa2 SET ID = ID + 1, bom = bom + 1");
                
                pstmt.execute();
                pstmt.close();
            }
            
            if (votoPesquisa2.getVotoPesquisa2().equals("regular")) {
                
                PreparedStatement pstmt = conexao.prepareStatement("UPDATE pesquisa2 SET ID = ID + 1, regular = regular + 1");
                
                pstmt.execute();
                pstmt.close();
            }
            
            if (votoPesquisa2.getVotoPesquisa2().equals("ruim")) {
                
                PreparedStatement pstmt = conexao.prepareStatement("UPDATE pesquisa2 SET ID = ID + 1, ruim = ruim + 1");
                
                pstmt.execute();
                pstmt.close();
            }
            
            if (votoPesquisa2.getVotoPesquisa2().equals("pessimo")) {
                
                PreparedStatement pstmt = conexao.prepareStatement("UPDATE pesquisa2 SET ID = ID + 1, pessimo = pessimo + 1");
                
                pstmt.execute();
                pstmt.close();
            }
            
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void inserir(voto sugestao){
        
        try {
            
            Connection conexao = getConexao();
            
            PreparedStatement pstmt = conexao.prepareStatement("INSERT INTO sugestaoPesquisa (sugestao) VALUES ('" + sugestao.getSugestaoPesquisa() + "')");
                
            pstmt.execute();
            pstmt.close();
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void retornaValores(){
        
        try {
            
            Connection conexao = getConexao();
            
            Statement stm1 = conexao.createStatement();
            
            ResultSet rsPesquisa1 = stm1.executeQuery("Select * from pesquisa1");
            
            valoresTabelaPesquisa1 = new voto();
            
            while (rsPesquisa1.next()) {

                valoresTabelaPesquisa1.setID(rsPesquisa1.getInt("ID"));
                valoresTabelaPesquisa1.setOtimo(rsPesquisa1.getInt("otimo"));
                valoresTabelaPesquisa1.setBom(rsPesquisa1.getInt("bom"));
                valoresTabelaPesquisa1.setRegular(rsPesquisa1.getInt("regular"));
                valoresTabelaPesquisa1.setRuim(rsPesquisa1.getInt("ruim"));
                valoresTabelaPesquisa1.setPessimo(rsPesquisa1.getInt("pessimo"));
            }
            
            //JOptionPane.showMessageDialog(null, valoresTabelaPesquisa1.getID());
            
            
            Statement stm2 = conexao.createStatement();
            ResultSet rsPesquisa2 = stm2.executeQuery("Select * from pesquisa2");
            
            valoresPesquisaTabela2 = new voto();    
            
            while (rsPesquisa2.next()) {

                valoresPesquisaTabela2.setID(rsPesquisa2.getInt("ID"));
                valoresPesquisaTabela2.setOtimo(rsPesquisa2.getInt("otimo"));
                valoresPesquisaTabela2.setBom(rsPesquisa2.getInt("bom"));
                valoresPesquisaTabela2.setRegular(rsPesquisa2.getInt("regular"));
                valoresPesquisaTabela2.setRuim(rsPesquisa2.getInt("ruim"));
                valoresPesquisaTabela2.setPessimo(rsPesquisa2.getInt("pessimo"));
            }
            
            //JOptionPane.showMessageDialog(null, valoresPesquisaTabela2.getID());
            //JOptionPane.showMessageDialog(null, "terminou");
            
            stm1.close();
            stm2.close();
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
