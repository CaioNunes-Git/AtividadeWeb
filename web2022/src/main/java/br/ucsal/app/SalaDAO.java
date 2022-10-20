package br.ucsal.app;

import java.util.HashMap;
import java.util.Map;

public class SalaDAO {

    public static HashMap<String, Sala> listaDAO = new HashMap<>();

    public static void inserir(Sala lista){
        listaDAO.put(lista.getNumSala(), lista);
    }

    public static void editar(Sala lista, String numSala){
        removerByNumSala(numSala);
        listaDAO.put(numSala, lista);
    }

    public static void removerByNumSala(String numSala){
        listaDAO.remove(numSala);
    }

    public static String listarTodos(){
        String str = "";

        for (Map.Entry<String,Sala> item : listaDAO.entrySet()) {
            str += "N° Sala: "+ item.getValue().getNumSala() + "<br/>" +
                    "Andar: " + item.getValue().getAndar() + "<br/>" +
                    "Qtd. Max. Alunos: " + item.getValue().getQtdMaxAlunos() + "<br/>" +
                    "Qtd. Máquinas: " +item.getValue().getQtdMaquinas() + "<br/>----------------------------<br/>";
        }
        return str;
    }
}
