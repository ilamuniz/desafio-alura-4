# Desafio Alura n° 4

Desafio proposto pelo curso "Java: consumindo API, gravando arquivos e lidando com erros", como parte da formação "Aprenda a programar em Java com Orientação a Objetos" da Alura.

O desafio consiste em projetar  uma aplicação que será um buscador de CEP.

A aplicação vai consumir a API Via CEP, vai receber os dados, exibir o endereço na aplicação e gravar num JSON.

Ao fazer um GET em uma ferramenta como Postman ou Insomnia, ele retorna um endereço em formato Json, como no exemplo abaixo:

**URL enviada**

```https://viacep.com.br/ws/70083900/json/```

**Resposta da API**

```
{
  "cep": "70083-900",
  "logradouro": "Praça dos Três Poderes Anexo II",
  "complemento": "",
  "unidade": "Vice-Presidência da República",
  "bairro": "Zona Cívico-Administrativa",
  "localidade": "Brasília",
  "uf": "DF",
  "estado": "Distrito Federal",
  "regiao": "Centro-Oeste",
  "ibge": "5300108",
  "gia": "",
  "ddd": "61",
  "siafi": "9701"
}
```

### O que vamos fazer?

- Criar uma aplicação para consultar a API ViaCEP;
- Menu para o usuário informar o CEP para busca;
- Geração de um arquivo .JSON com os dados do endereço.