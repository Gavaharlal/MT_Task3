grammar Expression;

@parser::header {
  import entities.*;
}


options {
    language = Java;
}

body returns [Body bodyResult] : pBody = body '\r''\n' stat = statement {$bodyResult = $pBody.bodyResult.add($stat.statementResult);}
									| stat = statement {$bodyResult = new Body($stat.statementResult);};

statement returns [Statement statementResult] : decl = declaration {$statementResult = $decl.declarationResult;} | mAsgn = mAssign {$statementResult = $mAsgn.assignResult;}
                                        	| inc = increment {$statementResult = $inc.incResult;} | rd = reading {$statementResult = $rd.readingResult;}
											| prnt = printing {$statementResult = $prnt.printingResult;}
											| whl = whileCycle {$statementResult = $whl.whileResult;};

declaration returns [Statement declarationResult] : VARNAME ':' TYPE {$declarationResult = new Declaration($VARNAME.text);};

mAssign returns [Statement assignResult] : VARNAME '=' arithm0 = arithmExpression {$assignResult = new Assignment($VARNAME.text, $arithm0.arithmResult);}
											| VARNAME ',' asgn = mAssign ',' arithm = arithmExpression {$assignResult = ((Assignment) $asgn.assignResult).addLeft($VARNAME.text).addRight($arithm.arithmResult);};

arithmExpression returns [String arithmResult] : a1 = arithmExpression '+' a2 = arithmExpression {$arithmResult = $a1.arithmResult + "+" + $a2.arithmResult;}
                                                    | a1 = arithmExpression '*' a2 = arithmExpression {$arithmResult = $a1.arithmResult + "*" + $a2.arithmResult;}
                                                    | a1 = arithmExpression '-' a2 = arithmExpression {$arithmResult = $a1.arithmResult + "-" + $a2.arithmResult;}
                                                    | a1 = arithmExpression '/' a2 = arithmExpression {$arithmResult = $a1.arithmResult + "/" + $a2.arithmResult;}
													| '(' a3 = arithmExpression ')' {$arithmResult = "(" + $a3.arithmResult + ")";}
													| '-' a4 = arithmExpression {$arithmResult = "-" + $a4.arithmResult;}
													| '+' a5 = arithmExpression {$arithmResult = $a5.arithmResult;}
													| NUMBER {$arithmResult = $NUMBER.text;}
													| VARNAME {$arithmResult = $VARNAME.text;};

increment returns [Statement incResult] : INCDEC VARNAME {$incResult = new Unary(true, $INCDEC.text, $VARNAME.text);}
											| VARNAME INCDEC {$incResult = new Unary(false, $INCDEC.text, $VARNAME.text);};

reading returns [Statement readingResult] : 'read(' VARNAME ')' {$readingResult = new Reading($VARNAME.text);};

printing returns [Statement printingResult] : 'print(' VARNAME ')' {$printingResult = new Printing($VARNAME.text, Type.INT);}
                                                | 'print(' STR ')' {$printingResult = new Printing($STR.text, Type.STRING);};

whileCycle returns [Statement whileResult] : 'while (' expr = predicate '){\r\n' bd = body '\r\n}' {$whileResult = new WhileCycle($expr.predicateResult); ((WhileCycle) $whileResult).addAll(((Body) $bd.bodyResult).getStatements());};

predicate returns [String predicateResult] : p1 = predicate LOGBINOP p2 = predicate {$predicateResult = $p1.predicateResult + $LOGBINOP.text + $p2.predicateResult;}
													| '(' a = predicate ')' {$predicateResult = "(" + $a.predicateResult + ")";}
													| '!' p = predicate {$predicateResult = "!" + $p.predicateResult;}
													| 'true' {$predicateResult = "true";}
													| 'false' {$predicateResult = "false";}
													| a1 = arithmExpression COMPARE a2 = arithmExpression {$predicateResult = $a1.arithmResult + $COMPARE.text + $a2.arithmResult;};


TYPE : 'int';
VARNAME : [a-z]+;
//ARITHMEXPRESSION : ('+'|'-'|'*'|('0'..'9')|('a'..'z'))+;
STR : '"'.+?'"';
INCDEC : '++'|'--';
NUMBER : ('1'..'9')+('1'..'9')*;
OPERATOR : ('+'|'-'|'*'|'/');
COMPARE : ('>'|'<'|'=='|'!=');
LOGBINOP : ('||'|'&&'|'^');
WS: [ ]+ -> skip;