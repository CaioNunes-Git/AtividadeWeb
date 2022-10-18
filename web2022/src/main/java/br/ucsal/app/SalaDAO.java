package br.ucsal.app;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class SalaDAO {

    public static HashMap<String, Sala> listaDAO = new HashMap<>();
    private static AtomicInteger pk = new AtomicInteger();

    public static void inserir(Sala lista){
        Integer id = pk.getAndIncrement();
        lista.setId(id);
        listaDAO.put(lista.getNumSala(), lista);
    }

    public static void editar(Sala lista, int id, String numSala){
        removerByNumSala(numSala);
        lista.setId(id);
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
                    "Qtd. Máquinas: " +item.getValue().getQtdMaquinas() + "<br/>-----<br/>";
        }
        return str;
    }
}
