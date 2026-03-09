import java.util.Date;

public class Patricia {

    public static void main(String[] args) {
        Estudante camada = new Estudante();
        Estudante vinicius = new Estudante();
        Estudante joao = new Estudante();
        Estudante patricia = new Estudante();
          
        patricia.setNome("Patricia");
        camada.setNome("Camada");
        vinicius.setNome("Vinicius");
        joao.setNome("João");
        
        System.out.println(camada.getNome());
        System.out.println(vinicius.getNome());
        System.out.println(joao.getNome());
    }
}