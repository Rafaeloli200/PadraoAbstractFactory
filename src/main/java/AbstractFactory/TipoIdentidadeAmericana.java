package AbstractFactory;

public class TipoIdentidadeAmericana implements TipoIdentidade {

    @Override
    public String emitir() {
        return "National ID card";
    }
}
