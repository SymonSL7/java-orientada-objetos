public enum EstadoBrasileiro {

    SAO_PAULO ("SP", "São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAIU ("PI", "Piauí"),
    MARANHO ("MA", "Maranhão"),
    MINAS_GERAIS ("MG","Minas Gerais")
    
    ;

    private String nome, sigla;

    

    private EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }   


}
