import java.util.Date;

public class Estudante {
        private String nome;
        private Date dataNascimento;
        private String cpf;
        private char genero;
        private String matricula;
        private String email;
       
       
            public Estudante(){
                this.nome = "Nobody";
            }
       
            public int obterIdade(Date hoje) {
            int idade = 0;
            // Lógica para calcular idade
            return idade;
        }
            public String getNome (){
                return this.nome;
            }
           
            public void setNome (String _nome){
                this.nome = _nome;
            }
           
            public Date getDate (){
                return this.dataNascimento;
            }
           
            public void setDate (Date _dataNascimento){
                this.dataNascimento = _dataNascimento;
            }
    }