package projvendedor;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Vendedor objVendedor = new Vendedor();
        
        objVendedor.setNome(JOptionPane.showInputDialog("Dados do vendedor" + "\nNome: "));
        objVendedor.setValorTotalVendido(Float.parseFloat(JOptionPane.showInputDialog("Valor total Vendido: ")));
        objVendedor.setMeta(Float.parseFloat(JOptionPane.showInputDialog("Informe a Meta: ")));
        
        JOptionPane.showMessageDialog(null, "Dados" + 
                "\n" + objVendedor);
    }
 
}
