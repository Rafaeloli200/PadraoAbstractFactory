package AbstractFactory;

public class FabricaAmericana implements FabricaAbstrata {

    @Override
    public TipoIdentidade createTipoIdentidade() {
        return new TipoIdentidadeAmericana();
    }

}
