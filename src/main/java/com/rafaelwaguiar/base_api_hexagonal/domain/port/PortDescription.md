# Ports em Arquitetura Hexagonal e DDD

Na Arquitetura Hexagonal, os **Ports** definem interfaces que conectam o núcleo do sistema (domínio) com o mundo externo, promovendo **isolamento, testabilidade e flexibilidade**.

---

## Port In (Aplicações / Use Cases)
O **Port In** representa a entrada do sistema, ou seja, **os comportamentos que o sistema expõe ao mundo externo** (UI, API, outros sistemas). Ele define **o que o sistema faz**, não como ele faz.

- **Responsabilidade:** Orquestrar casos de uso do domínio, aplicando regras de negócio.
- **Boa prática DDD:** O Port In deve depender apenas do **domínio**; não deve conhecer detalhes de infraestrutura ou frameworks.
- **Exemplo:**
    - "Usuário quer marcar uma lista como concluída" → implementado em um `TodoListUseCase`.

---

## Port Out (Saída / Repositórios)
O **Port Out** define contratos que o domínio precisa para se comunicar com recursos externos, como bancos de dados, APIs externas ou sistemas de fila. Ele representa **dependências técnicas**, não regras de negócio.

- **Responsabilidade:** Apenas definir operações necessárias para persistência ou comunicação com sistemas externos.
- **Boa prática DDD:** O domínio interage com o Port Out sem depender de implementações concretas. Isso permite trocar a tecnologia de persistência sem afetar a lógica de negócio.
- **Exemplos de operações:**
    - Salvar entidade (`save`)
    - Buscar por ID (`findById`)
    - Deletar (`delete`)

---

### Resumo
- **Port In:** Expõe comportamentos do sistema; aplica regras de negócio; depende do domínio.
- **Port Out:** Define contratos de infraestrutura; não contém regras de negócio; é implementado fora do domínio.
- **Benefício:** Separação clara entre lógica de negócio e detalhes técnicos, facilitando manutenção, teste e evolução do sistema.
