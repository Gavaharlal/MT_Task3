// Generated from C:/Users/Computer/IdeaProjects/MT_Task3/src/parser\Expression.g4 by ANTLR 4.7.2
package parser;

  import entities.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, TYPE=20, VARNAME=21, STR=22, INCDEC=23, NUMBER=24, 
		OPERATOR=25, COMPARE=26, LOGBINOP=27, WS=28;
	public static final int
		RULE_body = 0, RULE_statement = 1, RULE_declaration = 2, RULE_mAssign = 3, 
		RULE_arithmExpression = 4, RULE_increment = 5, RULE_reading = 6, RULE_printing = 7, 
		RULE_whileCycle = 8, RULE_predicate = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"body", "statement", "declaration", "mAssign", "arithmExpression", "increment", 
			"reading", "printing", "whileCycle", "predicate"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\r'", "'\n'", "':'", "'='", "','", "'+'", "'*'", "'-'", "'/'", 
			"'('", "')'", "'read('", "'print('", "'while ('", "'){\r\n'", "'\r\n}'", 
			"'!'", "'true'", "'false'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "TYPE", "VARNAME", "STR", 
			"INCDEC", "NUMBER", "OPERATOR", "COMPARE", "LOGBINOP", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BodyContext extends ParserRuleContext {
		public Body bodyResult;
		public BodyContext pBody;
		public StatementContext stat;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		return body(0);
	}

	private BodyContext body(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BodyContext _localctx = new BodyContext(_ctx, _parentState);
		BodyContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_body, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(21);
			((BodyContext)_localctx).stat = statement();
			((BodyContext)_localctx).bodyResult =  new Body(((BodyContext)_localctx).stat.statementResult);
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BodyContext(_parentctx, _parentState);
					_localctx.pBody = _prevctx;
					_localctx.pBody = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_body);
					setState(24);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(25);
					match(T__0);
					setState(26);
					match(T__1);
					setState(27);
					((BodyContext)_localctx).stat = statement();
					((BodyContext)_localctx).bodyResult =  ((BodyContext)_localctx).pBody.bodyResult.add(((BodyContext)_localctx).stat.statementResult);
					}
					} 
				}
				setState(34);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement statementResult;
		public DeclarationContext decl;
		public MAssignContext mAsgn;
		public IncrementContext inc;
		public ReadingContext rd;
		public PrintingContext prnt;
		public WhileCycleContext whl;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public MAssignContext mAssign() {
			return getRuleContext(MAssignContext.class,0);
		}
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public ReadingContext reading() {
			return getRuleContext(ReadingContext.class,0);
		}
		public PrintingContext printing() {
			return getRuleContext(PrintingContext.class,0);
		}
		public WhileCycleContext whileCycle() {
			return getRuleContext(WhileCycleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((StatementContext)_localctx).decl = declaration();
				((StatementContext)_localctx).statementResult =  ((StatementContext)_localctx).decl.declarationResult;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((StatementContext)_localctx).mAsgn = mAssign();
				((StatementContext)_localctx).statementResult =  ((StatementContext)_localctx).mAsgn.assignResult;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				((StatementContext)_localctx).inc = increment();
				((StatementContext)_localctx).statementResult =  ((StatementContext)_localctx).inc.incResult;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				((StatementContext)_localctx).rd = reading();
				((StatementContext)_localctx).statementResult =  ((StatementContext)_localctx).rd.readingResult;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				((StatementContext)_localctx).prnt = printing();
				((StatementContext)_localctx).statementResult =  ((StatementContext)_localctx).prnt.printingResult;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				((StatementContext)_localctx).whl = whileCycle();
				((StatementContext)_localctx).statementResult =  ((StatementContext)_localctx).whl.whileResult;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public Statement declarationResult;
		public Token VARNAME;
		public TerminalNode VARNAME() { return getToken(ExpressionParser.VARNAME, 0); }
		public TerminalNode TYPE() { return getToken(ExpressionParser.TYPE, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((DeclarationContext)_localctx).VARNAME = match(VARNAME);
			setState(56);
			match(T__2);
			setState(57);
			match(TYPE);
			((DeclarationContext)_localctx).declarationResult =  new Declaration((((DeclarationContext)_localctx).VARNAME!=null?((DeclarationContext)_localctx).VARNAME.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MAssignContext extends ParserRuleContext {
		public Statement assignResult;
		public Token VARNAME;
		public ArithmExpressionContext arithm0;
		public MAssignContext asgn;
		public ArithmExpressionContext arithm;
		public TerminalNode VARNAME() { return getToken(ExpressionParser.VARNAME, 0); }
		public ArithmExpressionContext arithmExpression() {
			return getRuleContext(ArithmExpressionContext.class,0);
		}
		public MAssignContext mAssign() {
			return getRuleContext(MAssignContext.class,0);
		}
		public MAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterMAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitMAssign(this);
		}
	}

	public final MAssignContext mAssign() throws RecognitionException {
		MAssignContext _localctx = new MAssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mAssign);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((MAssignContext)_localctx).VARNAME = match(VARNAME);
				setState(61);
				match(T__3);
				setState(62);
				((MAssignContext)_localctx).arithm0 = arithmExpression(0);
				((MAssignContext)_localctx).assignResult =  new Assignment((((MAssignContext)_localctx).VARNAME!=null?((MAssignContext)_localctx).VARNAME.getText():null), ((MAssignContext)_localctx).arithm0.arithmResult);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				((MAssignContext)_localctx).VARNAME = match(VARNAME);
				setState(66);
				match(T__4);
				setState(67);
				((MAssignContext)_localctx).asgn = mAssign();
				setState(68);
				match(T__4);
				setState(69);
				((MAssignContext)_localctx).arithm = arithmExpression(0);
				((MAssignContext)_localctx).assignResult =  ((Assignment) ((MAssignContext)_localctx).asgn.assignResult).addLeft((((MAssignContext)_localctx).VARNAME!=null?((MAssignContext)_localctx).VARNAME.getText():null)).addRight(((MAssignContext)_localctx).arithm.arithmResult);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmExpressionContext extends ParserRuleContext {
		public String arithmResult;
		public ArithmExpressionContext a1;
		public ArithmExpressionContext a3;
		public ArithmExpressionContext a4;
		public ArithmExpressionContext a5;
		public Token NUMBER;
		public Token VARNAME;
		public ArithmExpressionContext a2;
		public List<ArithmExpressionContext> arithmExpression() {
			return getRuleContexts(ArithmExpressionContext.class);
		}
		public ArithmExpressionContext arithmExpression(int i) {
			return getRuleContext(ArithmExpressionContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(ExpressionParser.NUMBER, 0); }
		public TerminalNode VARNAME() { return getToken(ExpressionParser.VARNAME, 0); }
		public ArithmExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterArithmExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitArithmExpression(this);
		}
	}

	public final ArithmExpressionContext arithmExpression() throws RecognitionException {
		return arithmExpression(0);
	}

	private ArithmExpressionContext arithmExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmExpressionContext _localctx = new ArithmExpressionContext(_ctx, _parentState);
		ArithmExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_arithmExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(75);
				match(T__9);
				setState(76);
				((ArithmExpressionContext)_localctx).a3 = arithmExpression(0);
				setState(77);
				match(T__10);
				((ArithmExpressionContext)_localctx).arithmResult =  "(" + ((ArithmExpressionContext)_localctx).a3.arithmResult + ")";
				}
				break;
			case T__7:
				{
				setState(80);
				match(T__7);
				setState(81);
				((ArithmExpressionContext)_localctx).a4 = arithmExpression(4);
				((ArithmExpressionContext)_localctx).arithmResult =  "-" + ((ArithmExpressionContext)_localctx).a4.arithmResult;
				}
				break;
			case T__5:
				{
				setState(84);
				match(T__5);
				setState(85);
				((ArithmExpressionContext)_localctx).a5 = arithmExpression(3);
				((ArithmExpressionContext)_localctx).arithmResult =  ((ArithmExpressionContext)_localctx).a5.arithmResult;
				}
				break;
			case NUMBER:
				{
				setState(88);
				((ArithmExpressionContext)_localctx).NUMBER = match(NUMBER);
				((ArithmExpressionContext)_localctx).arithmResult =  (((ArithmExpressionContext)_localctx).NUMBER!=null?((ArithmExpressionContext)_localctx).NUMBER.getText():null);
				}
				break;
			case VARNAME:
				{
				setState(90);
				((ArithmExpressionContext)_localctx).VARNAME = match(VARNAME);
				((ArithmExpressionContext)_localctx).arithmResult =  (((ArithmExpressionContext)_localctx).VARNAME!=null?((ArithmExpressionContext)_localctx).VARNAME.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmExpressionContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmExpression);
						setState(94);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(95);
						match(T__5);
						setState(96);
						((ArithmExpressionContext)_localctx).a2 = arithmExpression(10);
						((ArithmExpressionContext)_localctx).arithmResult =  ((ArithmExpressionContext)_localctx).a1.arithmResult + "+" + ((ArithmExpressionContext)_localctx).a2.arithmResult;
						}
						break;
					case 2:
						{
						_localctx = new ArithmExpressionContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmExpression);
						setState(99);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(100);
						match(T__6);
						setState(101);
						((ArithmExpressionContext)_localctx).a2 = arithmExpression(9);
						((ArithmExpressionContext)_localctx).arithmResult =  ((ArithmExpressionContext)_localctx).a1.arithmResult + "*" + ((ArithmExpressionContext)_localctx).a2.arithmResult;
						}
						break;
					case 3:
						{
						_localctx = new ArithmExpressionContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmExpression);
						setState(104);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(105);
						match(T__7);
						setState(106);
						((ArithmExpressionContext)_localctx).a2 = arithmExpression(8);
						((ArithmExpressionContext)_localctx).arithmResult =  ((ArithmExpressionContext)_localctx).a1.arithmResult + "-" + ((ArithmExpressionContext)_localctx).a2.arithmResult;
						}
						break;
					case 4:
						{
						_localctx = new ArithmExpressionContext(_parentctx, _parentState);
						_localctx.a1 = _prevctx;
						_localctx.a1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmExpression);
						setState(109);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(110);
						match(T__8);
						setState(111);
						((ArithmExpressionContext)_localctx).a2 = arithmExpression(7);
						((ArithmExpressionContext)_localctx).arithmResult =  ((ArithmExpressionContext)_localctx).a1.arithmResult + "/" + ((ArithmExpressionContext)_localctx).a2.arithmResult;
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IncrementContext extends ParserRuleContext {
		public Statement incResult;
		public Token INCDEC;
		public Token VARNAME;
		public TerminalNode INCDEC() { return getToken(ExpressionParser.INCDEC, 0); }
		public TerminalNode VARNAME() { return getToken(ExpressionParser.VARNAME, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_increment);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCDEC:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				((IncrementContext)_localctx).INCDEC = match(INCDEC);
				setState(120);
				((IncrementContext)_localctx).VARNAME = match(VARNAME);
				((IncrementContext)_localctx).incResult =  new Unary(true, (((IncrementContext)_localctx).INCDEC!=null?((IncrementContext)_localctx).INCDEC.getText():null), (((IncrementContext)_localctx).VARNAME!=null?((IncrementContext)_localctx).VARNAME.getText():null));
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				((IncrementContext)_localctx).VARNAME = match(VARNAME);
				setState(123);
				((IncrementContext)_localctx).INCDEC = match(INCDEC);
				((IncrementContext)_localctx).incResult =  new Unary(false, (((IncrementContext)_localctx).INCDEC!=null?((IncrementContext)_localctx).INCDEC.getText():null), (((IncrementContext)_localctx).VARNAME!=null?((IncrementContext)_localctx).VARNAME.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadingContext extends ParserRuleContext {
		public Statement readingResult;
		public Token VARNAME;
		public TerminalNode VARNAME() { return getToken(ExpressionParser.VARNAME, 0); }
		public ReadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterReading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitReading(this);
		}
	}

	public final ReadingContext reading() throws RecognitionException {
		ReadingContext _localctx = new ReadingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_reading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__11);
			setState(128);
			((ReadingContext)_localctx).VARNAME = match(VARNAME);
			setState(129);
			match(T__10);
			((ReadingContext)_localctx).readingResult =  new Reading((((ReadingContext)_localctx).VARNAME!=null?((ReadingContext)_localctx).VARNAME.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintingContext extends ParserRuleContext {
		public Statement printingResult;
		public Token VARNAME;
		public Token STR;
		public TerminalNode VARNAME() { return getToken(ExpressionParser.VARNAME, 0); }
		public TerminalNode STR() { return getToken(ExpressionParser.STR, 0); }
		public PrintingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPrinting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPrinting(this);
		}
	}

	public final PrintingContext printing() throws RecognitionException {
		PrintingContext _localctx = new PrintingContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_printing);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__12);
				setState(133);
				((PrintingContext)_localctx).VARNAME = match(VARNAME);
				setState(134);
				match(T__10);
				((PrintingContext)_localctx).printingResult =  new Printing((((PrintingContext)_localctx).VARNAME!=null?((PrintingContext)_localctx).VARNAME.getText():null), Type.INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__12);
				setState(137);
				((PrintingContext)_localctx).STR = match(STR);
				setState(138);
				match(T__10);
				((PrintingContext)_localctx).printingResult =  new Printing((((PrintingContext)_localctx).STR!=null?((PrintingContext)_localctx).STR.getText():null), Type.STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileCycleContext extends ParserRuleContext {
		public Statement whileResult;
		public PredicateContext expr;
		public BodyContext bd;
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public WhileCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterWhileCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitWhileCycle(this);
		}
	}

	public final WhileCycleContext whileCycle() throws RecognitionException {
		WhileCycleContext _localctx = new WhileCycleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whileCycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__13);
			setState(143);
			((WhileCycleContext)_localctx).expr = predicate(0);
			setState(144);
			match(T__14);
			setState(145);
			((WhileCycleContext)_localctx).bd = body(0);
			setState(146);
			match(T__15);
			((WhileCycleContext)_localctx).whileResult =  new WhileCycle(((WhileCycleContext)_localctx).expr.predicateResult); ((WhileCycle) _localctx.whileResult).addAll(((Body) ((WhileCycleContext)_localctx).bd.bodyResult).getStatements());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public String predicateResult;
		public PredicateContext p1;
		public PredicateContext a;
		public PredicateContext p;
		public ArithmExpressionContext a1;
		public Token COMPARE;
		public ArithmExpressionContext a2;
		public Token LOGBINOP;
		public PredicateContext p2;
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode COMPARE() { return getToken(ExpressionParser.COMPARE, 0); }
		public List<ArithmExpressionContext> arithmExpression() {
			return getRuleContexts(ArithmExpressionContext.class);
		}
		public ArithmExpressionContext arithmExpression(int i) {
			return getRuleContext(ArithmExpressionContext.class,i);
		}
		public TerminalNode LOGBINOP() { return getToken(ExpressionParser.LOGBINOP, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionListener ) ((ExpressionListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_predicate, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(150);
				match(T__9);
				setState(151);
				((PredicateContext)_localctx).a = predicate(0);
				setState(152);
				match(T__10);
				((PredicateContext)_localctx).predicateResult =  "(" + ((PredicateContext)_localctx).a.predicateResult + ")";
				}
				break;
			case 2:
				{
				setState(155);
				match(T__16);
				setState(156);
				((PredicateContext)_localctx).p = predicate(4);
				((PredicateContext)_localctx).predicateResult =  "!" + ((PredicateContext)_localctx).p.predicateResult;
				}
				break;
			case 3:
				{
				setState(159);
				match(T__17);
				((PredicateContext)_localctx).predicateResult =  "true";
				}
				break;
			case 4:
				{
				setState(161);
				match(T__18);
				((PredicateContext)_localctx).predicateResult =  "false";
				}
				break;
			case 5:
				{
				setState(163);
				((PredicateContext)_localctx).a1 = arithmExpression(0);
				setState(164);
				((PredicateContext)_localctx).COMPARE = match(COMPARE);
				setState(165);
				((PredicateContext)_localctx).a2 = arithmExpression(0);
				((PredicateContext)_localctx).predicateResult =  ((PredicateContext)_localctx).a1.arithmResult + (((PredicateContext)_localctx).COMPARE!=null?((PredicateContext)_localctx).COMPARE.getText():null) + ((PredicateContext)_localctx).a2.arithmResult;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PredicateContext(_parentctx, _parentState);
					_localctx.p1 = _prevctx;
					_localctx.p1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_predicate);
					setState(170);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(171);
					((PredicateContext)_localctx).LOGBINOP = match(LOGBINOP);
					setState(172);
					((PredicateContext)_localctx).p2 = predicate(7);
					((PredicateContext)_localctx).predicateResult =  ((PredicateContext)_localctx).p1.predicateResult + (((PredicateContext)_localctx).LOGBINOP!=null?((PredicateContext)_localctx).LOGBINOP.getText():null) + ((PredicateContext)_localctx).p2.predicateResult;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return body_sempred((BodyContext)_localctx, predIndex);
		case 4:
			return arithmExpression_sempred((ArithmExpressionContext)_localctx, predIndex);
		case 9:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean body_sempred(BodyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arithmExpression_sempred(ArithmExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\38\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6u\n\6\f\6\16\6x\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00ab\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b2\n\13"+
		"\f\13\16\13\u00b5\13\13\3\13\2\5\2\n\24\f\2\4\6\b\n\f\16\20\22\24\2\2"+
		"\2\u00c2\2\26\3\2\2\2\4\67\3\2\2\2\69\3\2\2\2\bJ\3\2\2\2\n^\3\2\2\2\f"+
		"\177\3\2\2\2\16\u0081\3\2\2\2\20\u008e\3\2\2\2\22\u0090\3\2\2\2\24\u00aa"+
		"\3\2\2\2\26\27\b\2\1\2\27\30\5\4\3\2\30\31\b\2\1\2\31\"\3\2\2\2\32\33"+
		"\f\4\2\2\33\34\7\3\2\2\34\35\7\4\2\2\35\36\5\4\3\2\36\37\b\2\1\2\37!\3"+
		"\2\2\2 \32\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\3\3\2\2\2$\"\3\2\2"+
		"\2%&\5\6\4\2&\'\b\3\1\2\'8\3\2\2\2()\5\b\5\2)*\b\3\1\2*8\3\2\2\2+,\5\f"+
		"\7\2,-\b\3\1\2-8\3\2\2\2./\5\16\b\2/\60\b\3\1\2\608\3\2\2\2\61\62\5\20"+
		"\t\2\62\63\b\3\1\2\638\3\2\2\2\64\65\5\22\n\2\65\66\b\3\1\2\668\3\2\2"+
		"\2\67%\3\2\2\2\67(\3\2\2\2\67+\3\2\2\2\67.\3\2\2\2\67\61\3\2\2\2\67\64"+
		"\3\2\2\28\5\3\2\2\29:\7\27\2\2:;\7\5\2\2;<\7\26\2\2<=\b\4\1\2=\7\3\2\2"+
		"\2>?\7\27\2\2?@\7\6\2\2@A\5\n\6\2AB\b\5\1\2BK\3\2\2\2CD\7\27\2\2DE\7\7"+
		"\2\2EF\5\b\5\2FG\7\7\2\2GH\5\n\6\2HI\b\5\1\2IK\3\2\2\2J>\3\2\2\2JC\3\2"+
		"\2\2K\t\3\2\2\2LM\b\6\1\2MN\7\f\2\2NO\5\n\6\2OP\7\r\2\2PQ\b\6\1\2Q_\3"+
		"\2\2\2RS\7\n\2\2ST\5\n\6\6TU\b\6\1\2U_\3\2\2\2VW\7\b\2\2WX\5\n\6\5XY\b"+
		"\6\1\2Y_\3\2\2\2Z[\7\32\2\2[_\b\6\1\2\\]\7\27\2\2]_\b\6\1\2^L\3\2\2\2"+
		"^R\3\2\2\2^V\3\2\2\2^Z\3\2\2\2^\\\3\2\2\2_v\3\2\2\2`a\f\13\2\2ab\7\b\2"+
		"\2bc\5\n\6\fcd\b\6\1\2du\3\2\2\2ef\f\n\2\2fg\7\t\2\2gh\5\n\6\13hi\b\6"+
		"\1\2iu\3\2\2\2jk\f\t\2\2kl\7\n\2\2lm\5\n\6\nmn\b\6\1\2nu\3\2\2\2op\f\b"+
		"\2\2pq\7\13\2\2qr\5\n\6\trs\b\6\1\2su\3\2\2\2t`\3\2\2\2te\3\2\2\2tj\3"+
		"\2\2\2to\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\13\3\2\2\2xv\3\2\2\2y"+
		"z\7\31\2\2z{\7\27\2\2{\u0080\b\7\1\2|}\7\27\2\2}~\7\31\2\2~\u0080\b\7"+
		"\1\2\177y\3\2\2\2\177|\3\2\2\2\u0080\r\3\2\2\2\u0081\u0082\7\16\2\2\u0082"+
		"\u0083\7\27\2\2\u0083\u0084\7\r\2\2\u0084\u0085\b\b\1\2\u0085\17\3\2\2"+
		"\2\u0086\u0087\7\17\2\2\u0087\u0088\7\27\2\2\u0088\u0089\7\r\2\2\u0089"+
		"\u008f\b\t\1\2\u008a\u008b\7\17\2\2\u008b\u008c\7\30\2\2\u008c\u008d\7"+
		"\r\2\2\u008d\u008f\b\t\1\2\u008e\u0086\3\2\2\2\u008e\u008a\3\2\2\2\u008f"+
		"\21\3\2\2\2\u0090\u0091\7\20\2\2\u0091\u0092\5\24\13\2\u0092\u0093\7\21"+
		"\2\2\u0093\u0094\5\2\2\2\u0094\u0095\7\22\2\2\u0095\u0096\b\n\1\2\u0096"+
		"\23\3\2\2\2\u0097\u0098\b\13\1\2\u0098\u0099\7\f\2\2\u0099\u009a\5\24"+
		"\13\2\u009a\u009b\7\r\2\2\u009b\u009c\b\13\1\2\u009c\u00ab\3\2\2\2\u009d"+
		"\u009e\7\23\2\2\u009e\u009f\5\24\13\6\u009f\u00a0\b\13\1\2\u00a0\u00ab"+
		"\3\2\2\2\u00a1\u00a2\7\24\2\2\u00a2\u00ab\b\13\1\2\u00a3\u00a4\7\25\2"+
		"\2\u00a4\u00ab\b\13\1\2\u00a5\u00a6\5\n\6\2\u00a6\u00a7\7\34\2\2\u00a7"+
		"\u00a8\5\n\6\2\u00a8\u00a9\b\13\1\2\u00a9\u00ab\3\2\2\2\u00aa\u0097\3"+
		"\2\2\2\u00aa\u009d\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa"+
		"\u00a5\3\2\2\2\u00ab\u00b3\3\2\2\2\u00ac\u00ad\f\b\2\2\u00ad\u00ae\7\35"+
		"\2\2\u00ae\u00af\5\24\13\t\u00af\u00b0\b\13\1\2\u00b0\u00b2\3\2\2\2\u00b1"+
		"\u00ac\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\25\3\2\2\2\u00b5\u00b3\3\2\2\2\f\"\67J^tv\177\u008e\u00aa\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}