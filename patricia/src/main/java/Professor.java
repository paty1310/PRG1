import java.util.Date;

public class Professor {

    private String nomeCompleto;
    private int siape;
    private String email;
    private int telefone;
    private String titulacao;
    private String areaAtuacao;
    private String regimeTrabalho;
    private Date dataIngresso;
    private String formacao;

    public Professor() {
        this.nomeCompleto = "Marcos Camada";
    }

    public String getNome() {
        return this.nomeCompleto;
    }

    public void setNome(String _nome) {
        this.nomeCompleto = _nome;
    }

    public int getSiape() {
        return this.siape;
    }

    public void setNome(int _siape) {
        this.siape = _siape;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String set_email) {
        this.email = set_email;
    }

    public int getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int set_telefone) {
        this.telefone = set_telefone;
    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String _titulacao) {
        this.titulacao = _titulacao;
    }

    public String getAtuacao() {
        return this.areaAtuacao;
    }

    public void setatuacao(String _atuacao) {
        this.areaAtuacao = _atuacao;
    }

    public String getRegime() {
        return this.regimeTrabalho;
    }

    public void setRegima(String _regime) {
        this.regimeTrabalho = _regime;
    }
    
        public Date getDate() {
        return this.dataIngresso;
    }

    public void setDate(Date _dataIngresso) {
        this.dataIngresso = _dataIngresso;
    }
    
    public String setFormacao(){
        return this.formacao;
    }
    
    public void setFormacao(String _formacao){
        this.formacao = _formacao;
    }
}