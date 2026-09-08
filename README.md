# Atividade Prática – Boas Práticas e Controle de Versão

## 1. Qual era o principal problema do código original?
O código original apresentava problemas de legibilidade, organização e manutenção. Ele utilizava nomes de variáveis pouco descritivos e genéricos (`n`, `a`, `b`, `c`), além de concentrar toda a lógica do sistema (cálculo, validação e exibição) de forma monolítica dentro do método `main`, sem separação de responsabilidades.

## 2. Quais melhorias você realizou?
Foram aplicadas as seguintes melhorias:
* **Renomeação de variáveis:** Substituição dos nomes vagos por identificadores claros e compreensíveis (`nomeAluno`, `primeiraNota`, `segundaNota`, `media`).
* **Modularização:** O código foi dividido em métodos específicos e independentes (`calcularMedia`, `verificarSituacao` e `exibirResultados`).
* **Padronização:** Ajuste da indentação, padronização de nomenclatura (*camelCase*) e estruturação limpa do código.

## 3. Como a modularização facilitou a organização do código?
A modularização separou a lógica do sistema em blocos menores com responsabilidades únicas e bem definidas. Isso tornou o código mais limpo, fácil de entender à primeira vista, reutilizável e muito mais simples de realizar manutenções ou correções futuras sem impactar outras partes do sistema.

## 4. Como o Git ajudou a controlar as alterações realizadas no sistema?
O Git permitiu um controle de versionamento seguro e organizado. Através do uso de uma branch específica (`melhoria-boas-praticas`), foi possível isolar o desenvolvimento das melhorias sem mexer diretamente na versão estável da `main`. Além disso, o histórico de *commits* registrou passo a passo a evolução do código, e o fluxo de *Pull Request* e *Merge* garantiu uma revisão estruturada antes de integrar as alterações definitivas.