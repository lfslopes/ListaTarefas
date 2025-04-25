package Tarefas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefas {
    private List<Tarefa> listatarefas = new ArrayList<>();

    public ListaTarefas() {
    }
    public ListaTarefas (Tarefa... tarefa) {
        listatarefas.addAll(Arrays.asList(tarefa));
    }
    public ListaTarefas (List<Tarefa> listatarefas) {
        this.listatarefas = listatarefas;
    }

    public void adicionarTarefa(String descricao) {
        this.listatarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        if (this.listatarefas.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }
        int index = 0;
        while (index < this.listatarefas.size()) {
            if (this.listatarefas.get(index).getDescricao().equalsIgnoreCase(descricao)) {
                this.listatarefas.remove(index);
            } else
                index++;
        }
    }
    public int obterNumeroTotalTarefas() {
        return this.listatarefas.size();
    }
    public List<String> obterDescricoesTarefas() {
        return this.listatarefas.stream().map(Tarefa::getDescricao).collect(Collectors.toList());
    }
}
