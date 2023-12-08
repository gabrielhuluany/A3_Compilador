grammar Gramatica2;

raiz_programa: jogo EOF;

jogo: EOF | (declaracao)*;

declaracao: INICIO time CONTRA time LINHA |
           time ACAO VARIAS VEZES LINHA |
           CONDICAO declaracao2 CONSEQUENCIA LINHA |
           declaracao2 LINHA;


declaracao2: time RESULTADO;


INICIO: 'NFL' LINHA;
LINHA: '\n';
time: NOME;
NOME: PALAVRA PALAVRA*;
PALAVRA: [a-zA-Z_0-9][a-zA-Z_0-9]* ;
CONTRA: '@';
ACAO: 'correu'|'lançou'|'avançou';
RESULTADO: ESPACO 'venceu';
VEZES: 'vezes';
VARIAS: [1-9][0-9]*;
CONDICAO: 'Se' ESPACO;
CONSEQUENCIA: 'First Down!';
ESPACO: [ \t\r\n]+ -> skip;
