package AbstractFactory;

public class FabricaPortuguesa implements FabricaAbstrata {

    @Override
    public TipoIdentidade createTipoIdentidade() {
        return new TipoIdentidadePortuguesa();
    }

}
