
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.Symbol;
import com.mycompany.proyecto1.Nodo;
import com.mycompany.proyecto1.Expresiones;
import com.mycompany.proyecto1.Ventana;
import com.mycompany.proyecto1.error;
import com.mycompany.proyecto1.Arbol;
import javax.swing.JOptionPane;
import java.util.LinkedList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\002\007\000\002\003" +
    "\003\000\002\003\003\000\002\003\004\000\002\003\003" +
    "\000\002\003\005\000\002\004\004\000\002\004\003\000" +
    "\002\005\011\000\002\006\005\000\002\006\005\000\002" +
    "\006\003\000\002\006\003\000\002\007\004\000\002\007" +
    "\003\000\002\010\007\000\002\011\005\000\002\011\005" +
    "\000\002\011\004\000\002\011\004\000\002\011\004\000" +
    "\002\011\005\000\002\011\003\000\002\011\003\000\002" +
    "\011\003\000\002\011\003\000\002\012\004\000\002\012" +
    "\003\000\002\013\006" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\077\000\004\004\004\001\002\000\004\017\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\010\011\013\030\015\033\010\001\002\000\006\006" +
    "\052\012\024\001\002\000\006\017\ufff2\033\ufff2\001\002" +
    "\000\006\017\ufff9\030\ufff9\001\002\000\004\011\101\001" +
    "\002\000\006\017\ufffe\033\051\001\002\000\004\012\034" +
    "\001\002\000\006\017\uffff\030\015\001\002\000\004\017" +
    "\027\001\002\000\006\017\uffe5\033\uffe5\001\002\000\006" +
    "\017\ufffc\033\023\001\002\000\006\017\uffe6\033\uffe6\001" +
    "\002\000\004\012\024\001\002\000\004\032\025\001\002" +
    "\000\004\014\026\001\002\000\006\017\uffe4\033\uffe4\001" +
    "\002\000\012\005\030\011\013\030\015\033\010\001\002" +
    "\000\004\002\000\001\002\000\004\017\ufffb\001\002\000" +
    "\010\011\013\030\015\033\010\001\002\000\006\017\ufffa" +
    "\030\ufffa\001\002\000\004\033\035\001\002\000\004\006" +
    "\036\001\002\000\004\007\037\001\002\000\006\031\041" +
    "\034\040\001\002\000\010\010\ufff5\013\ufff5\014\ufff5\001" +
    "\002\000\010\010\ufff4\013\ufff4\014\ufff4\001\002\000\010" +
    "\010\043\013\044\014\045\001\002\000\006\031\041\034" +
    "\040\001\002\000\006\031\041\034\040\001\002\000\006" +
    "\017\ufff8\030\ufff8\001\002\000\010\010\043\013\ufff7\014" +
    "\ufff7\001\002\000\010\010\ufff6\013\ufff6\014\ufff6\001\002" +
    "\000\006\017\ufff3\033\ufff3\001\002\000\004\006\052\001" +
    "\002\000\004\007\053\001\002\000\026\004\056\020\054" +
    "\023\063\024\057\025\060\026\064\027\066\031\061\032" +
    "\055\034\062\001\002\000\030\004\uffe9\014\uffe9\020\uffe9" +
    "\023\uffe9\024\uffe9\025\uffe9\026\uffe9\027\uffe9\031\uffe9\032" +
    "\uffe9\034\uffe9\001\002\000\030\004\uffea\014\uffea\020\uffea" +
    "\023\uffea\024\uffea\025\uffea\026\uffea\027\uffea\031\uffea\032" +
    "\uffea\034\uffea\001\002\000\004\033\077\001\002\000\026" +
    "\004\056\020\054\023\063\024\057\025\060\026\064\027" +
    "\066\031\061\032\055\034\062\001\002\000\026\004\056" +
    "\020\054\023\063\024\057\025\060\026\064\027\066\031" +
    "\061\032\055\034\062\001\002\000\030\004\uffe7\014\uffe7" +
    "\020\uffe7\023\uffe7\024\uffe7\025\uffe7\026\uffe7\027\uffe7\031" +
    "\uffe7\032\uffe7\034\uffe7\001\002\000\030\004\uffe8\014\uffe8" +
    "\020\uffe8\023\uffe8\024\uffe8\025\uffe8\026\uffe8\027\uffe8\031" +
    "\uffe8\032\uffe8\034\uffe8\001\002\000\026\004\056\020\054" +
    "\023\063\024\057\025\060\026\064\027\066\031\061\032" +
    "\055\034\062\001\002\000\026\004\056\020\054\023\063" +
    "\024\057\025\060\026\064\027\066\031\061\032\055\034" +
    "\062\001\002\000\004\014\070\001\002\000\026\004\056" +
    "\020\054\023\063\024\057\025\060\026\064\027\066\031" +
    "\061\032\055\034\062\001\002\000\030\004\uffed\014\uffed" +
    "\020\uffed\023\uffed\024\uffed\025\uffed\026\uffed\027\uffed\031" +
    "\uffed\032\uffed\034\uffed\001\002\000\006\017\ufff1\033\ufff1" +
    "\001\002\000\030\004\uffec\014\uffec\020\uffec\023\uffec\024" +
    "\uffec\025\uffec\026\uffec\027\uffec\031\uffec\032\uffec\034\uffec" +
    "\001\002\000\026\004\056\020\054\023\063\024\057\025" +
    "\060\026\064\027\066\031\061\032\055\034\062\001\002" +
    "\000\030\004\ufff0\014\ufff0\020\ufff0\023\ufff0\024\ufff0\025" +
    "\ufff0\026\ufff0\027\ufff0\031\ufff0\032\ufff0\034\ufff0\001\002" +
    "\000\026\004\056\020\054\023\063\024\057\025\060\026" +
    "\064\027\066\031\061\032\055\034\062\001\002\000\030" +
    "\004\uffef\014\uffef\020\uffef\023\uffef\024\uffef\025\uffef\026" +
    "\uffef\027\uffef\031\uffef\032\uffef\034\uffef\001\002\000\030" +
    "\004\uffee\014\uffee\020\uffee\023\uffee\024\uffee\025\uffee\026" +
    "\uffee\027\uffee\031\uffee\032\uffee\034\uffee\001\002\000\004" +
    "\005\100\001\002\000\030\004\uffeb\014\uffeb\020\uffeb\023" +
    "\uffeb\024\uffeb\025\uffeb\026\uffeb\027\uffeb\031\uffeb\032\uffeb" +
    "\034\uffeb\001\002\000\004\017\ufffd\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\077\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\020\003\016\004\015" +
    "\005\011\007\013\010\010\012\020\013\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\047\001\001\000\002\001\001\000" +
    "\004\005\032\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\013\021\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\020\003\030\004\015\005\011\007\013\010\010\012" +
    "\020\013\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\020\003\030\004\015\005\011\007\013\010\010\012" +
    "\020\013\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\041\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\046\001\001\000\004\006\045\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\011" +
    "\064\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\011\075\001\001\000\004\011\073\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\011\071" +
    "\001\001\000\004\011\070\001\001\000\002\001\001\000" +
    "\004\011\066\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\011\072\001\001\000\002\001" +
    "\001\000\004\011\074\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        public static Nodo raiz;
        public static LinkedList<Expresiones> listaExpresiones;
        public int hojas=0;
        
        public void syntax_error(Symbol s)
        {
            System.err.println("Error en la Linea " + (s.right+1) +" Columna "+(s.left+1)+ ". Identificador "+s.value + " no reconocido. Se ha recuperado del error." );
            error nuevo = new error("Error Sintactico (Recuperado)", s.value.toString(), s.right+1, s.left+1);
            Ventana.listaErrores.add(nuevo);
        }
        public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
        {
            System.err.println("Error en la Linea " + (s.right+1)+ " Columna "+(s.left+1)+". Identificador " +s.value + " no reconocido.");
            error nuevo = new error("Error Sintactico", s.value.toString(), s.right+1, s.left+1);
            Ventana.listaErrores.add(nuevo);
        }

        public Nodo getRaiz(){
            return raiz;
        }

 

/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Sintactico$actions {

  
  private final Sintactico parser;

  /** Constructor */
  CUP$Sintactico$actions(Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action_part00000000(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintactico$parser.done_parsing();
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= llaveabre saltolinea CUERPO saltolinea llavecierra 
            {
              String RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CUERPO ::= LISTA_CONJ 
            {
              String RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CUERPO ::= LISTA_EXPRESIONES 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		LinkedList<Expresiones> a = (LinkedList<Expresiones>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 parser.listaExpresiones= a; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CUERPO ::= porcentaje porcentaje 
            {
              String RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CUERPO ::= CADENAS_EVALUAR 
            {
              String RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CUERPO ::= CUERPO saltolinea CUERPO 
            {
              String RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CUERPO",1, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LISTA_CONJ ::= LISTA_CONJ CONJ 
            {
              Object RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("LISTA_CONJ",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // LISTA_CONJ ::= CONJ 
            {
              Object RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("LISTA_CONJ",2, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CONJ ::= conj dospuntos id guion mayor CONJUNTO puntoycoma 
            {
              Object RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CONJ",3, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // CONJUNTO ::= CONJUNTO coma CONJUNTO 
            {
              Object RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CONJUNTO",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // CONJUNTO ::= CONJUNTO tilde CONJUNTO 
            {
              Object RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CONJUNTO",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // CONJUNTO ::= letra 
            {
              Object RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CONJUNTO",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // CONJUNTO ::= numero 
            {
              Object RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CONJUNTO",4, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // LISTA_EXPRESIONES ::= LISTA_EXPRESIONES EXPRESIONES 
            {
              LinkedList<Expresiones> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		LinkedList<Expresiones> a = (LinkedList<Expresiones>)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Expresiones b = (Expresiones)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT=a; RESULT.add(b); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("LISTA_EXPRESIONES",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // LISTA_EXPRESIONES ::= EXPRESIONES 
            {
              LinkedList<Expresiones> RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Expresiones a = (Expresiones)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT=new LinkedList<>();RESULT.add(a); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("LISTA_EXPRESIONES",5, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXPRESIONES ::= id guion mayor E puntoycoma 
            {
              Expresiones RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Nodo d = (Nodo)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Expresiones(a.toString(), new Arbol(d)); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EXPRESIONES",6, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // E ::= concatenacion E E 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Nodo c = (Nodo)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Nodo("." ,"" ,-1 ,b ,c,"N","",""); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // E ::= disyuncion E E 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Nodo c = (Nodo)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Nodo("|" ,"" ,-1 ,b ,c ,"N","",""); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // E ::= kleene E 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Nodo("*" ,"" ,-1 ,b ,null,"A","","" ); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // E ::= positivo E 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Nodo("+" ,"" ,-1 ,b ,null ,"N","",""); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // E ::= interrogacion E 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		Nodo b = (Nodo)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Nodo("?" ,"" ,-1 ,b ,null,"A","",""); 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // E ::= llaveabre id llavecierra 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Nodo(b.toString(),"",parser.hojas,null,null,"N","",""); parser.hojas++; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // E ::= cadena 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Nodo(a.toString(),"",parser.hojas,null,null,"N","",""); parser.hojas++; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // E ::= especiales 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Nodo(a.toString(),"",parser.hojas,null,null,"N","",""); parser.hojas++; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // E ::= letra 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Nodo(a.toString(),"",parser.hojas,null,null,"N","",""); parser.hojas++; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // E ::= numero 
            {
              Nodo RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Sintactico$stack.peek()).value;
		 RESULT= new Nodo(a.toString(),"",parser.hojas,null,null,"N","",""); parser.hojas++; 
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("E",7, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // CADENAS_EVALUAR ::= CADENAS_EVALUAR EVALUAR 
            {
              Object RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CADENAS_EVALUAR",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // CADENAS_EVALUAR ::= EVALUAR 
            {
              Object RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("CADENAS_EVALUAR",8, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // EVALUAR ::= id dospuntos cadena puntoycoma 
            {
              Object RESULT =null;
		  
              CUP$Sintactico$result = parser.getSymbolFactory().newSymbol("EVALUAR",9, ((java_cup.runtime.Symbol)CUP$Sintactico$stack.elementAt(CUP$Sintactico$top-3)), ((java_cup.runtime.Symbol)CUP$Sintactico$stack.peek()), RESULT);
            }
          return CUP$Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Sintactico$do_action(
    int                        CUP$Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Sintactico$parser,
    java.util.Stack            CUP$Sintactico$stack,
    int                        CUP$Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Sintactico$do_action_part00000000(
                               CUP$Sintactico$act_num,
                               CUP$Sintactico$parser,
                               CUP$Sintactico$stack,
                               CUP$Sintactico$top);
    }
}

}
