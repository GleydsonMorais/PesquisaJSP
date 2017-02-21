<%-- 
    Document   : index
    Created on : 14/04/2016, 13:31:11
    Author     : estagio.gleydson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        
        <title>Pesquisa</title>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="stylePesquisa.css"/>
    </head>
    
    <body>
        
        <div id="body-pesquisa">
            
            <img src="imagens/image001.gif" width="87" height="84" alt="image001"/>
            
            <h4>PODER JUDICIÁRIO <br>
                JUSTIÇA FEDERAL DE PRIMEIRO GRAU <br>
                SEÇÃO JUDICIÁRIA DA PARAÍBA <br>
                Seção de Comunicação Social</h4>
            
            <h3>PESQUISA DE OPINIÃO</h3>

            <p>No intuito de avaliar a qualidade dos serviços prestados pelos Postos
               de Atendimento Bancário da Caixa Econômica Federal na Justiça Federal
               em João Pessoa e em Campina Grande, <u>especificamente em relação ao caixa
               reservado aos servidores e magistrados</u>, solicitamos aos senhores o
               preenchimento desta PESQUISA DE OPINIÃO.</p>
            
            <p>Cada item será avaliado como: <u>Ótimo</u>, <u>Bom</u>, <u>Regular</u>,
               <u>Ruim</u> ou <u>Péssimo</u>. Deverá ser marcada apenas <b>UMA</b> dessas
               cinco opções listadas nas tabelas abaixo.</p>
            
            <h3>Participe! Sua opinião é extremamente importante.</h3>
            
            <form method="POST" action="pesquisaServlet">
                
                *Tempo para o atendimento:
            
                <select name="pesquisa1" id="pesquisa1">
                    
                    <option value="null"></option>
                    <option value="otimo">Ótimo</option>
                    <option value="bom">Bom</option>
                    <option value="regular">Regular</option>
                    <option value="ruim">Ruim</option>
                    <option value="pessimo">Péssimo</option>
                </select>
                
                *Qualidade do atendimento:
            
                <select name="pesquisa2" id="pesquisa2">
                    
                    <option value="null"></option>
                    <option value="otimo">Ótimo</option>
                    <option value="bom">Bom</option>
                    <option value="regular">Regular</option>
                    <option value="ruim">Ruim</option>
                    <option value="pessimo">Péssimo</option>
                </select><br><br>
                
                Sugestões:<br>
                <input type="text" id="sugestao" name="sugestao" size="75">
                
                <input type="submit" value="Enviar" id="votar" name="votar"> <br>
            </form>
        </div>        
    </body>
</html>
