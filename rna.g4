grammar rna;
main  : 'primary' RNAstring 'declare' loop 'structure' expr 'end' ;         
RNAString : [AGCU]+ ;
LOOP_ID : [0-9]+ ;
loop : 'H' LOOP_ID '=' (LOOP_ID ',' LOOP_ID);
expr : LOOP_ID+LOOP_ID;