grammar Football;

raiz_programa: jogo EOF;

jogo: inicio (jogada)* fim;

inicio: time ESPACO CONTRA ESPACO time NOVA_LINHA;

jogada: time ESPACO ACAO ESPACO QUANTIDADE ESPACO JARDAS NOVA_LINHA;

fim: FIM;

time: NFL;
NFL: 'Arizona Cardinals' | 'Cardinals' |
     'Atlanta Falcons' | 'Falcons' |
     'Baltimore Ravens' | 'Ravens' |
     'Buffalo Bills' | 'Bills' |
     'Carolina Panthers' | 'Panthers' |
     'Chicago Bears' | 'Bears' |
     'Cincinnati Bengals' | 'Bengals' |
     'Cleveland Browns' | 'Browns' |
     'Dallas Cowboys' | 'Cowboys' |
     'Denver Broncos' | 'Broncos' |
     'Detroit Lions' | 'Lions' |
     'Green Bay Packers' | 'Packers' |
     'Houston Texans' | 'Texans' |
     'Indianapolis Colts' | 'Colts' |
     'Jacksonville Jaguars' | 'Jaguars' |
     'Kansas City Chiefs' | 'Chiefs' |
     'Las Vegas Raiders' | 'Raiders' |
     'Los Angeles Chargers' | 'Chargers' |
     'Los Angeles Rams' | 'Rams' |
     'Miami Dolphins' | 'Dolphins' |
     'Minnesota Vikings' | 'Vikings' |
     'New England Patriots' | 'Patriots' |
     'New Orleans Saints' | 'Saints' |
     'New York Giants' | 'Giants' |
     'New York Jets' | 'Jets' |
     'Philadelphia Eagles' | 'Eagles' |
     'Pittsburgh Steelers' | 'Steelers' |
     'San Francisco 49ers' | '49ers' |
     'Seattle Seahawks' | 'Seahawks' |
     'Tampa Bay Buccaneers' | 'Buccaneers' |
     'Tennessee Titans' | 'Titans' |
     'Washington Commanders' | 'Commanders';
CONTRA: '@';
NOVA_LINHA: '\n';
ESPACO: ' ';
ACAO: 'correu' | 'passou';
QUANTIDADE: [0-9][0-9]*;
JARDAS: 'jardas';
FIM: 'Fim de jogo';

//NOME: PALAVRA PALAVRA*;
//PALAVRA: [a-zA-Z_0-9][a-zA-Z_0-9]* ;
//ESPACO: [ \t\r\n]+ -> skip;