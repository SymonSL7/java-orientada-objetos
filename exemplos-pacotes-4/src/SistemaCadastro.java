public class SistemaCadastro {

    public static void main(String[] args) {
        
        Pessoa marcos = new Pessoa("111.222.333-44", "Marcos");
        marcos.setEndereco("Rua UM");

        System.out.println("Nome: " + marcos.getNome() + " CPF: " + marcos.getCpf() );
        
    }

}
