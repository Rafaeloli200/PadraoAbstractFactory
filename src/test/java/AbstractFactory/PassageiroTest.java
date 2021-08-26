/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassageiroTest {

    @Test
    void mostraTipoIdentidadeBrasileira() {
        FabricaAbstrata fabrica = new FabricaBrasileira();
        Passageiro passageiro = new Passageiro(fabrica);
        assertEquals("RG", passageiro.emitirTipoIdentidade());
    }

    @Test
    void mostraTipoIdentidadePortuguesa() {
        FabricaAbstrata fabrica = new FabricaPortuguesa();
        Passageiro passageiro = new Passageiro(fabrica);
        assertEquals("Cartao de Cidadao", passageiro.emitirTipoIdentidade());
    }

    @Test
    void mostraTipoIdentidadeAmericana() {
        FabricaAbstrata fabrica = new FabricaAmericana();
        Passageiro passageiro = new Passageiro(fabrica);
        assertEquals("National ID card", passageiro.emitirTipoIdentidade());
    }

}
