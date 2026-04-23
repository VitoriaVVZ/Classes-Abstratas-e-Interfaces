# Classes: Abstratas e Interfaces

Este repositório contém o projeto prático desenvolvido para a disciplina de Programação Orientada a Objetos. O objetivo é demonstrar a Abstração através de dois pilares fundamentais: Classes Abstratas e Interfaces, utilizando o cenário de um sistema de gestão de produtos de uma confeitaria.

---

# 🎯 Objetivo do Trabalho

A finalidade deste projeto é demonstrar como o Java lida com a modelagem de entidades do mundo real. Através da abstração, isolamos as características essenciais de um objeto, escondendo a complexidade interna e focando no que o código deve realizar, em vez de como ele faz.

---

# Arquitetura do Sistema

O sistema foi desenhado para exemplificar a convivência entre herança e implementação de contratos:

**1. A Classe Abstrata:** Confeitaria.java

A classe Confeitaria atua como a base para todos os produtos comercializados. Ela é definida como abstract porque não faz sentido vender uma "Confeitaria" genérica; vendemos itens específicos como bolos ou doces.

- **Identidade ("É UM"):** Define o que todos os itens de confeitaria compartilham.

- **Atributos Protegidos:** Gerencia o tipo e o preco de forma centralizada, permitindo o reaproveitamento de código.

**2. A Interface:** Pedido.java

Enquanto a classe abstrata foca na identidade, a interface Pedido foca no comportamento e em habilidades específicas.

- **Contrato de Serviço:** Define o método entrega(). Qualquer classe que implementar esta interface "assina um contrato" onde se obriga a saber como realizar uma entrega.

- **Flexibilidade:** Permite que objetos de famílias diferentes (ex: um Doce ou uma Geladeira) partilhem a mesma habilidade de entrega sem precisarem de ser da mesma hierarquia de classes.

---

# 👥 Participantes

- Felipe

- João

- Livia Vitoria

- Lucas Souza

