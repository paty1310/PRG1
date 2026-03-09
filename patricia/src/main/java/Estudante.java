import java.util.Date;

public class Estudante {

    private String nome;
    private Date dataNascimento;
    private int cpf;
    private char genero;
    private int matricula;
    private String email;
    private int telefone;
    private String anoIngresso;
    private String semestreIngrasso; 
    private String situacaoAcademica;
    private String nivelEnsino;
    private int obterMatricula;
    private int codigo;
    
        
    public Estudante() {
        this.nome = "Patrícia";
    }

    public int obterIdade(Date hoje) {
        int idade = 0;
        // Lógica para calcular idade
        return idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public Date getDate() {
        return this.dataNascimento;
    }

    public void setDate(Date _dataNascimento) {
        this.dataNascimento = _dataNascimento;
    }

    public int getCPF() {
        return this.cpf;
    }

    public void setCPF(int set_CPF) {
        this.cpf = set_CPF;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char set_genero) {
        this.genero = set_genero;
    }

    public void setMatricula(int set_matricula) {
        this.matricula = set_matricula;
    }
    public String getMatricula() {
        return anoIngresso+semestreIngrasso+codigo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String set_email) {
        this.email = set_email;
    }
    
    public  int getTelefone (){
        return this.telefone;
    }
    
    public void setTelefone (int set_telefone){
        this.telefone = set_telefone;
    }
    
    public String getAnoIngresso(){
        return this.anoIngresso;
    }
    
    public void setAnoIngresso(String set_anoIngresso){
        this.anoIngresso = set_anoIngresso;
    }
    
    public String getSemestreIngrasso(){
        return this.semestreIngrasso;
    }
    
    public void setSemestreIngrasso(String set_semestreIngrasso){
        this.semestreIngrasso = set_semestreIngrasso;
    }
    
    public String getSituacaoAcademica(){
        return this.situacaoAcademica;
    }
    
    public void setSituacaoAcademica(String set_SituacaoAcademica){
        this.situacaoAcademica = set_SituacaoAcademica;
    }
    
}