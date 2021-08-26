package AbstractFactory;

public class TipoIdentidadePortuguesa implements TipoIdentidade {

    @Override
    public String emitir() {
        return "Cartao de Cidadao";
    }
}
