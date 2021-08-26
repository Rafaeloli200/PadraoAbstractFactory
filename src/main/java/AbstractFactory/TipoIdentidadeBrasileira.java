package AbstractFactory;

public class TipoIdentidadeBrasileira implements TipoIdentidade {

    @Override
    public String emitir() {
        return "RG";
    }
}
