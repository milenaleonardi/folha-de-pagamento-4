package br.edu.up.persistencia;
import br.edu.up.entidades.Folha;
import br.edu.up.negocio.FolhaNegocio;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class FolhaPersistencia {
    private static List<Folha> folhas = new ArrayList<Folha>();
    public static Folha buscarFolha(Folha folha) {
        for (Folha itemFolha : folhas
        ) {
            if (itemFolha.getNome() == folha.getNome()
                    && itemFolha.getMes() == folha.getMes()
                    && itemFolha.getAno() == folha.getAno()) {
                return itemFolha;
            }
        } return null;
    }
    public static void incluirFolha(Folha folha) {
        folhas.add(folha);
    }
    public static void listarFolha(Folha folha) {
        for (Folha itemFolha:folhas
             ) {

        }
    }

}

