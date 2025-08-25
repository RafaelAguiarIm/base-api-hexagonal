package com.rafaelwaguiar.base_api_hexagonal.domain.port.in;

import com.rafaelwaguiar.base_api_hexagonal.domain.model.TodoList;

import java.util.List;

/**
 * Porta de entrada (Port In) para os casos de uso relacionados ao agregado {@link TodoList}.
 *
 * <p>
 * Define os comportamentos do sistema que podem ser invocados por controladores
 * da camada de API (REST, GraphQL etc.), ou mesmo por outros módulos da aplicação.
 * </p>
 *
 * <p>
 * Na arquitetura hexagonal:
 * <ul>
 *   <li>Esta interface representa o contrato do que o sistema oferece para o mundo externo.</li>
 *   <li>A implementação concreta fica na camada de aplicação (Application Service).</li>
 *   <li>Essa separação permite testar casos de uso sem depender de detalhes de
 *       infraestrutura ou frameworks.</li>
 * </ul>
 * </p>
 *
 *
 *
 * @author Rafael W Aguiar
 * @version 1.0
 * @since 2024-06-20
 * @see TodoList
 *
 */
public interface TodoListUseCase {

    /**
     * Cria uma nova {@link TodoList}.
     *
     * @param title entidade contendo os dados da lista
     * @return a {@link TodoList} criada
     */
    TodoList createTodoList(String title);

    /**
     * Retorna todas as {@link TodoList} existentes.
     *
     * @return lista de {@link TodoList}
     */
    List<TodoList> getAllTodoLists();

    /**
     * Busca uma {@link TodoList} pelo identificador.
     *
     * @param id identificador único
     * @return a {@link TodoList} correspondente
     */
    TodoList getTodoListById(String id);

    /**
     * Atualiza uma {@link TodoList} existente.
     *
     * @param id identificador único da {@link TodoList}
     * @param todoList dados atualizados
     * @return a {@link TodoList} atualizada
     */
    TodoList updateTodoList(String id, TodoList todoList);

    /**
     * Remove uma {@link TodoList}.
     *
     * @param id identificador único
     */
    void deleteTodoList(String id);

    /**
     * Marca uma {@link TodoList} como concluída.
     *
     * Este método atualiza o estado da {@link TodoList} para indicar que todas as tarefas foram concluídas.
     *
     * @param id identificador único da {@link TodoList} que será marcada como concluída
     * @return a {@link TodoList} atualizada com o status de concluída
     */
    TodoList completeTodoList(String id);
}
