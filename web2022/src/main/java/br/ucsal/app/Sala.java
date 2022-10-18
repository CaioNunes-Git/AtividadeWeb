package br.ucsal.app;

public class Sala {

    private Integer id;
    private String numSala;
    private String andar;
    private Integer qtdMaxAlunos;
    private Integer qtdMaquinas;

    public Sala(){
    }

    public Sala(String numSala, String andar, Integer qtdMaxAlunos, String qtdMaquinas) {
        this.numSala = numSala;
        this.andar = andar;
        this.qtdMaxAlunos = qtdMaxAlunos;
        setQtdMaquinas(qtdMaquinas);
    }

    public String getNumSala() {
        return numSala;
    }

    public void setNumSala(String numSala) {
        this.numSala = numSala;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public Integer getQtdMaxAlunos() {
        return qtdMaxAlunos;
    }

    public void setQtdMaxAlunos(Integer qtdMaxAlunos) {
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    public Integer getQtdMaquinas() {
        return qtdMaquinas;
    }

    public void setQtdMaquinas(String qtdMaquinas) {
        if(qtdMaquinas == null || qtdMaquinas.equals("")){
            this.qtdMaquinas = 0;
        } else {
            this.qtdMaquinas = Integer.parseInt(qtdMaquinas);
        }
    }
}
