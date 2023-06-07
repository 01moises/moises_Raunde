/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gitmoises;

/**
 *
 * @author Nhabomba
 */
public class Pedido {
        private String nomeCliente;
    private String tipoItem;
    private float taxa;

    public Pedido(String nomeCliente, String tipoItem, float taxa) {
        this.nomeCliente = nomeCliente;
        this.tipoItem = tipoItem;
        this.taxa = taxa;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTipoItem() {
        return tipoItem;
    }

    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nomeCliente=" + nomeCliente + ", tipoItem=" + tipoItem + ", taxa=" + taxa + '}';
    }
    
}
