
package projaluno;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        Aluno objAluno = new Aluno();
        
        objAluno.setNome(JOptionPane.showInputDialog("Dados do Aluno" + "\nNome: "));
        objAluno.setRa(Long.parseLong(JOptionPane.showInputDialog("RA do aluno: ")));
        objAluno.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Nota 1 do aluno: ")));
        objAluno.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Nota 2 do aluno: ")));
        objAluno.calcularMedia();
        objAluno.setDiasLetivos(Integer.parseInt(JOptionPane.showInputDialog("Dias letivos: ")));
        objAluno.setQuantidadeDeFaltas(Double.parseDouble(JOptionPane.showInputDialog("Quantidade de faltas: ")));
        
        
        JOptionPane.showMessageDialog(null, "Dados do Aluno" +
                objAluno);
        
    }
}
