package entidade;

/**
 *
 * @author estagio.gleydson
 */
public class voto {
    
    private String votoPesquisa1; //resposta da primeira pergunta
    private String votoPesquisa2; //resposta da segunda pergunta
    
    private String sugestaoPesquisa; //sugestao

    public String getVotoPesquisa1() {
        return votoPesquisa1;
    }

    public void setVotoPesquisa1(String votoPesquisa1) {
        this.votoPesquisa1 = votoPesquisa1;
    }
    
    public String getVotoPesquisa2() {
        return votoPesquisa2;
    }

    public void setVotoPesquisa2(String votoPesquisa2) {
        this.votoPesquisa2 = votoPesquisa2;
    }
    
    public String getSugestaoPesquisa() {
        return sugestaoPesquisa;
    }

    public void setSugestaoPesquisa(String sugestaoPesquisa) {
        this.sugestaoPesquisa = sugestaoPesquisa;
    }
    
    //Variaveis para gerar resultado parcial
    private int ID, otimo, bom, regular, ruim, pessimo;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getOtimo() {
        return otimo;
    }

    public void setOtimo(int otimo) {
        this.otimo = otimo;
    }

    public int getBom() {
        return bom;
    }

    public void setBom(int bom) {
        this.bom = bom;
    }

    public int getRegular() {
        return regular;
    }

    public void setRegular(int regular) {
        this.regular = regular;
    }

    public int getRuim() {
        return ruim;
    }

    public void setRuim(int ruim) {
        this.ruim = ruim;
    }

    public int getPessimo() {
        return pessimo;
    }

    public void setPessimo(int pessimo) {
        this.pessimo = pessimo;
    }
}
