package Tarefas;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        if (descricao == null)
            throw new IllegalArgumentException("Argumento nulo");
        this.descricao = descricao;
    }
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return "Descrição: " + this.descricao;
    }
}
