package Tarefas;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefaManha = new Tarefa("Tirar o lixo");
        Tarefa tarefaTarde = new Tarefa("lavar a louça");
        Tarefa tarefaNoite = new Tarefa("Arrumar o quarto");
        Tarefa tarefaNoite2 = new Tarefa("arrumar o quarto");

        ListaTarefas listaTarefas = new ListaTarefas(tarefaManha, tarefaTarde, tarefaNoite, tarefaNoite2);

        System.out.println("Numero inicial de Tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        Tarefa tarefaSemana = new Tarefa("lavar a roupa e limpar a casa");
        listaTarefas.adicionarTarefa(tarefaSemana.getDescricao());

        System.out.println("Lista de Tarefas: ");
        listaTarefas.obterDescricoesTarefas().forEach(System.out::println);
        System.out.println("Numero de Tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Arrumar o quarto");

        System.out.println("##############################################################");
        System.out.println("Lista de Tarefas: ");
        listaTarefas.obterDescricoesTarefas().forEach(System.out::println);
        System.out.println("Numero de Tarefas: " + listaTarefas.obterNumeroTotalTarefas());
    }
}
