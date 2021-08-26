package AbstractFactory;

public class FabricaBrasileira implements FabricaAbstrata {

    @Override
    public TipoIdentidade createTipoIdentidade() {
        return new TipoIdentidadeBrasileira();
    }

}
