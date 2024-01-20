grammar Orca;

program
    : (assignment DELIMITER)* return DELIMITER EOF
    ;

return
    : 'return' WS expression
    ;

assignment
    : VARIABLE WS '=' WS expression
    ;

expression
    : CONSTANT                          # Constant
    | VARIABLE                          # Variable
    | expression WS '+' WS expression   # Addition
    ;

CONSTANT: [-]?[1-9][0-9]*;
VARIABLE: [a-zA-Z][a-zA-Z0-9]*;
DELIMITER: [\n]+;
WS: [ ];