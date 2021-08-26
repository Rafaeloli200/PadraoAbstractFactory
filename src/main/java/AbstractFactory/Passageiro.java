package AbstractFactory;

public class Passageiro {

    private TipoIdentidade tipoidentidade;
    private String identidade;

    public Passageiro(FabricaAbstrata fabrica) {
        this.tipoidentidade = fabrica.createTipoIdentidade();
    }

    public String emitirTipoIdentidade() {
        return this.tipoidentidade.emitir();
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    
}
