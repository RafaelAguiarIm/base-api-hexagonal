package com.rafaelwaguiar.base_api_hexagonal.domain.port.out;

import com.rafaelwaguiar.base_api_hexagonal.domain.model.TodoList;

import java.util.List;
import java.util.Optional;


/**
 *
 *  * Interface Porta de saída (Port Out) para o agregado {@link TodoList}.
 * </p>
 *
 * <p>
 * Este contrato define as operações que o domínio espera de uma tecnologia de persistência (banco de dados, cache, API externa etc.).
 * Ele NÃO contém implementação, apenas descreve o que o domínio precisa para funcionar.
 * </p>
 *
 * <p>
 * Na arquitetura hexagonal:
 * <ul>
 *   <li>O domínio depende apenas desta interface.</li>
 *   <li>A infraestrutura fornece uma implementação concreta (adaptador), por exemplo usando JPA/Hibernate, MongoDB ou outra fonte de dados.</li>
 *   <li>Isso garante baixo acoplamento e testabilidade.</li>
 * </ul>
 * </p>
 *
 * <p><b>Importante:</b> métodos nesta interface devem se restringir a
 * operações de persistência (CRUD). Regras de negócio, como "marcar como
 * concluído", devem estar no domínio (aggregate root) ou no serviço de
 * aplicação, não aqui.</p>
 *
 *
 *
 * @author Rafael W Aguiar
 * @version 1.0
 * @since 2024-06-20
 * @see TodoList
 * @see com.rafaelwaguiar.base_api_hexagonal.infra.repository.TodoListRepositoryImpl
 *
 */


public interface TodoListRepository {

    /**
     * Persiste ou atualiza uma {@link TodoList}.
     *
     * @param todoList entidade do domínio a ser salva
     * @return a entidade salva (possivelmente com ID gerado)
     */
    TodoList save(TodoList todoList);

    /**
     * Busca uma {@link TodoList} pelo identificador.
     *
     * @param id identificador único
     * @return {@link Optional} contendo a entidade, caso exista
     */
    Optional<TodoList> findById(String id);

    /**
     * Remove uma {@link TodoList} pelo identificador.
     *
     * @param id identificador único
     */
    void deleteById(String id);

    /**
     * Retorna todas as {@link TodoList} persistidas.
     *
     * @return lista de todas as entidades
     */
    List<TodoList> findAll();

}
