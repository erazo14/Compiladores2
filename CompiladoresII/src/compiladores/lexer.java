/* The following code was generated by JFlex 1.5.0-SNAPSHOT */

package compiladores;
import compiladores.sym;
import java_cup.runtime.*;
import java.util.ArrayList;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.0-SNAPSHOT
 * from the specification file <tt>src/compiladores/Visual.flex</tt>
 */
class lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int str = 2;
  public static final int com = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\51\1\34\1\63\1\63\1\34\22\0\1\50\1\0\1\46"+
    "\3\0\1\45\1\62\1\56\1\57\1\54\1\53\1\41\1\52\1\61"+
    "\1\55\12\35\1\40\1\0\1\42\1\33\1\43\2\0\1\1\1\3"+
    "\1\10\1\13\1\6\1\17\1\24\1\11\1\32\2\30\1\5\1\15"+
    "\1\7\1\4\1\23\1\27\1\12\1\31\1\21\1\16\1\26\1\20"+
    "\1\25\1\22\1\30\1\0\1\47\1\0\1\44\1\60\1\0\1\1"+
    "\1\3\1\10\1\13\1\6\1\17\1\24\1\11\1\32\2\30\1\5"+
    "\1\15\1\7\1\4\1\23\1\27\1\12\1\31\1\21\1\16\1\26"+
    "\1\20\1\25\1\22\1\30\1\36\1\0\1\37\7\0\1\63\252\0"+
    "\2\14\115\0\1\2\u1ea8\0\1\63\1\63\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\1\11\2\1\1\10\2\1\3"+
    "\1\4\1\5\1\6\1\7\1\4\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\2\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\2\31\1\33\1\34\1\2\1\34\3\0\2\2\1\35"+
    "\12\2\1\36\1\0\1\2\2\0\1\37\6\2\1\40"+
    "\12\2\1\37\1\0\1\41\1\42\1\43\2\0\1\44"+
    "\1\45\1\0\1\46\2\0\4\2\1\0\1\2\1\47"+
    "\1\0\1\2\1\50\1\51\1\2\1\0\5\2\2\52"+
    "\2\0\1\53\1\0\2\2\1\54\2\2\1\0\4\2"+
    "\1\0\1\2\1\55\1\2\1\46\4\2\1\53\1\0"+
    "\1\17\1\0\1\56\2\0\3\2\1\57\2\60\1\0"+
    "\2\61\1\62\1\63\1\64\1\63\1\65\2\2\2\0"+
    "\2\66\1\0\2\2\1\0\1\2\1\67\1\70\1\71"+
    "\2\0\3\2\1\56\4\2\4\0\1\2\1\72\1\73"+
    "\10\0\3\2\1\0\1\74\1\70\1\75\1\2\2\76"+
    "\1\77\1\0\1\77\5\2\1\74\1\0\1\100\1\101"+
    "\1\0\1\2\3\0\1\102\5\0\1\2\1\103\1\104"+
    "\2\0\1\2\1\0\1\2\1\100\1\2\1\101\1\2"+
    "\2\0\1\105\1\106\1\107\1\0\1\110\1\111\3\0"+
    "\2\112\1\113\1\0\1\2\2\114\1\105\1\113\1\115"+
    "\4\0\1\116\2\117\3\0\1\120\1\0\1\121\1\0"+
    "\1\122\1\0\1\123";

  private static int [] zzUnpackAction() {
    int [] result = new int[294];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478\0\u04ac"+
    "\0\234\0\u04e0\0\u0514\0\u0548\0\234\0\234\0\234\0\u057c"+
    "\0\u05b0\0\234\0\234\0\234\0\234\0\u05e4\0\234\0\234"+
    "\0\234\0\234\0\234\0\234\0\234\0\234\0\234\0\234"+
    "\0\234\0\234\0\u0618\0\u05e4\0\u064c\0\234\0\u0680\0\u0270"+
    "\0\u06b4\0\u06e8\0\u071c\0\u0750\0\u0784\0\u0270\0\u07b8\0\u07ec"+
    "\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c"+
    "\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\234\0\u0ac4\0\u0af8"+
    "\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0270\0\u0bfc\0\u0c30\0\u0c64"+
    "\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0270"+
    "\0\u0e04\0\234\0\234\0\234\0\u05e4\0\u0e38\0\234\0\u0270"+
    "\0\u0e6c\0\234\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4"+
    "\0\u0fd8\0\u100c\0\u1040\0\u1074\0\u10a8\0\u0270\0\u0270\0\u10dc"+
    "\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214\0\234\0\u0270"+
    "\0\u1248\0\u127c\0\234\0\u12b0\0\u12e4\0\u1318\0\u0270\0\u134c"+
    "\0\u1380\0\u13b4\0\u13e8\0\u141c\0\u1450\0\u1484\0\u14b8\0\u14ec"+
    "\0\u0270\0\u1520\0\u0270\0\u1554\0\u1588\0\u15bc\0\u15f0\0\u0270"+
    "\0\u1624\0\u1658\0\u168c\0\234\0\u16c0\0\u16f4\0\u1728\0\u175c"+
    "\0\u1790\0\u0270\0\u17c4\0\u17f8\0\u182c\0\u1860\0\u1894\0\u0270"+
    "\0\234\0\u0270\0\u0270\0\u0270\0\u18c8\0\u18fc\0\u1930\0\u1964"+
    "\0\234\0\u0270\0\u1998\0\u19cc\0\u1a00\0\u1a34\0\u1a68\0\u0270"+
    "\0\u0270\0\u0270\0\u1a9c\0\u1ad0\0\u1b04\0\u1b38\0\u1b6c\0\u0270"+
    "\0\u1ba0\0\u1bd4\0\u1c08\0\u1c3c\0\u1c70\0\u1ca4\0\u1cd8\0\u1d0c"+
    "\0\u1d40\0\u0270\0\u0270\0\u1d74\0\u1da8\0\u1ddc\0\u1e10\0\u1e44"+
    "\0\u1e78\0\u1eac\0\u1860\0\u1ee0\0\u1f14\0\u1f48\0\u1f7c\0\234"+
    "\0\234\0\u0270\0\u1fb0\0\234\0\u0270\0\234\0\u1fe4\0\u0270"+
    "\0\u2018\0\u204c\0\u2080\0\u20b4\0\u20e8\0\u0270\0\u211c\0\u2150"+
    "\0\234\0\u2184\0\u21b8\0\u21ec\0\u2220\0\u2254\0\234\0\u2288"+
    "\0\u22bc\0\u22f0\0\u2324\0\u2358\0\u238c\0\u0270\0\u0270\0\u23c0"+
    "\0\u23f4\0\u2428\0\u245c\0\u2490\0\u24c4\0\u24f8\0\u0270\0\u252c"+
    "\0\u2560\0\u2594\0\234\0\u0270\0\234\0\u25c8\0\234\0\234"+
    "\0\u25fc\0\u2630\0\u2664\0\234\0\u0270\0\234\0\u2698\0\u26cc"+
    "\0\234\0\u0270\0\u0270\0\u0270\0\234\0\u2700\0\u2734\0\u2768"+
    "\0\u279c\0\234\0\234\0\u0270\0\u27d0\0\u2804\0\u2838\0\234"+
    "\0\u286c\0\234\0\u28a0\0\234\0\u28d4\0\234";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[294];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\15\1\22"+
    "\1\23\1\24\1\15\1\25\1\15\1\26\3\15\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\0\34\61\1\0\11\61\1\62\1\63\1\64"+
    "\12\61\1\0\34\61\1\65\13\61\1\64\12\61\66\0"+
    "\1\15\1\66\4\15\1\67\4\15\1\0\14\15\1\70"+
    "\1\15\2\0\1\15\22\0\1\15\11\0\1\71\7\0"+
    "\1\72\2\0\1\73\43\0\1\15\1\0\1\15\1\74"+
    "\7\15\1\0\5\15\1\75\10\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\15\1\0\7\15\1\76\1\15\1\0"+
    "\16\15\2\0\1\15\22\0\1\15\4\0\1\15\1\0"+
    "\1\15\1\77\7\15\1\0\16\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\15\1\0\2\15\1\100\1\15\1\101"+
    "\4\15\1\0\10\15\1\102\1\15\1\103\3\15\2\0"+
    "\1\15\22\0\1\15\4\0\1\15\1\0\1\15\1\104"+
    "\1\15\1\105\5\15\1\0\16\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\106\1\0\6\15\1\107\2\15\1\0"+
    "\16\15\2\0\1\15\22\0\1\15\4\0\1\15\1\0"+
    "\11\15\1\0\16\15\2\0\1\15\22\0\1\15\4\0"+
    "\1\15\1\0\3\15\1\110\5\15\1\0\16\15\2\0"+
    "\1\15\22\0\1\15\4\0\1\15\1\0\1\15\1\111"+
    "\7\15\1\112\15\15\1\113\2\0\1\15\22\0\1\15"+
    "\12\0\1\114\5\0\1\115\1\0\1\116\45\0\1\117"+
    "\1\0\11\15\1\0\16\15\2\0\1\15\22\0\1\15"+
    "\4\0\1\120\1\0\1\15\1\121\1\122\6\15\1\0"+
    "\1\15\1\123\14\15\2\0\1\15\22\0\1\15\4\0"+
    "\1\15\1\0\6\15\1\124\2\15\1\0\16\15\2\0"+
    "\1\15\22\0\1\15\4\0\1\15\1\0\1\15\1\125"+
    "\4\15\1\126\1\127\1\15\1\0\5\15\1\130\10\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\15\1\0\7\15"+
    "\1\131\1\15\1\0\16\15\2\0\1\15\22\0\1\15"+
    "\4\0\1\15\1\0\1\15\1\132\7\15\1\0\16\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\15\1\0\3\15"+
    "\1\133\5\15\1\0\1\15\1\134\2\15\1\135\11\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\15\1\0\4\15"+
    "\1\136\4\15\1\0\1\137\1\15\1\140\13\15\2\0"+
    "\1\15\22\0\1\15\37\0\1\32\64\0\1\33\33\0"+
    "\1\141\111\0\1\142\7\0\1\143\53\0\1\144\100\0"+
    "\1\145\7\0\1\146\51\0\1\147\51\0\1\65\30\0"+
    "\1\15\1\0\10\15\1\150\1\0\16\15\2\0\1\15"+
    "\22\0\1\15\10\0\1\151\61\0\1\152\66\0\1\153"+
    "\3\0\1\154\52\0\1\15\1\0\1\15\1\155\7\15"+
    "\1\0\16\15\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\0\7\15\1\156\1\15\1\0\11\15\1\157\4\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\15\1\0\1\15"+
    "\1\160\7\15\1\0\16\15\2\0\1\15\22\0\1\15"+
    "\4\0\1\15\1\161\11\15\1\0\14\15\1\162\1\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\15\1\0\10\15"+
    "\1\163\1\0\16\15\2\0\1\15\22\0\1\15\4\0"+
    "\1\15\1\0\11\15\1\164\15\15\1\165\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\0\11\15\1\0\11\15"+
    "\1\166\4\15\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\0\11\15\1\0\4\15\1\167\11\15\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\0\11\15\1\0\10\15"+
    "\1\170\5\15\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\171\2\15\1\172\6\15\1\0\14\15\1\173\1\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\174\1\0\11\15"+
    "\1\0\16\15\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\0\11\15\1\0\4\15\1\175\11\15\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\0\11\15\1\0\1\15"+
    "\1\176\14\15\2\0\1\15\22\0\1\15\20\0\1\177"+
    "\47\0\1\15\1\0\11\15\1\0\1\200\15\15\2\0"+
    "\1\15\22\0\1\15\24\0\1\201\1\0\1\202\63\0"+
    "\1\203\41\0\1\15\1\0\11\15\1\204\15\15\1\205"+
    "\2\0\1\15\22\0\1\15\4\0\1\15\1\0\2\15"+
    "\1\206\6\15\1\0\16\15\2\0\1\15\22\0\1\15"+
    "\4\0\1\15\1\0\7\15\1\207\1\15\1\0\16\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\15\1\0\1\15"+
    "\1\210\7\15\1\0\16\15\2\0\1\15\22\0\1\15"+
    "\4\0\1\15\1\0\4\15\1\211\4\15\1\0\16\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\15\1\0\11\15"+
    "\1\212\15\15\1\213\2\0\1\15\22\0\1\15\4\0"+
    "\1\15\1\0\3\15\1\214\5\15\1\0\16\15\2\0"+
    "\1\15\22\0\1\15\4\0\1\15\1\0\11\15\1\0"+
    "\1\15\1\215\14\15\2\0\1\15\22\0\1\15\4\0"+
    "\1\15\1\0\11\15\1\0\6\15\1\216\7\15\2\0"+
    "\1\15\22\0\1\15\4\0\1\15\1\0\11\15\1\217"+
    "\15\15\1\220\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\0\7\15\1\221\1\15\1\0\16\15\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\0\2\15\1\222\6\15"+
    "\1\0\16\15\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\0\1\223\10\15\1\0\16\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\15\1\0\3\15\1\224\3\15\1\225"+
    "\1\15\1\0\16\15\2\0\1\15\22\0\1\15\4\0"+
    "\1\15\1\0\11\15\1\0\4\15\1\226\1\15\1\227"+
    "\7\15\2\0\1\15\22\0\1\15\4\0\1\15\1\0"+
    "\11\15\1\0\6\15\1\230\7\15\2\0\1\15\22\0"+
    "\1\15\11\0\1\231\111\0\1\232\13\0\1\146\21\0"+
    "\1\233\100\0\1\234\54\0\1\235\1\0\1\236\13\0"+
    "\1\235\32\0\1\15\1\0\2\15\1\237\6\15\1\0"+
    "\16\15\2\0\1\15\22\0\1\15\4\0\1\15\1\0"+
    "\3\15\1\240\5\15\1\0\16\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\241\1\0\11\15\1\0\16\15\2\0"+
    "\1\15\22\0\1\15\4\0\1\15\1\0\11\15\1\0"+
    "\6\15\1\242\7\15\2\0\1\15\22\0\1\15\11\0"+
    "\1\243\56\0\1\15\1\0\3\15\1\244\5\15\1\0"+
    "\16\15\2\0\1\15\22\0\1\15\4\0\1\15\1\0"+
    "\11\15\1\0\16\15\2\0\1\15\12\0\1\245\7\0"+
    "\1\15\24\0\1\246\43\0\1\15\1\0\11\15\1\0"+
    "\4\15\1\247\11\15\2\0\1\15\22\0\1\15\4\0"+
    "\1\15\1\0\11\15\1\0\4\15\1\250\11\15\2\0"+
    "\1\15\22\0\1\15\11\0\1\251\56\0\1\15\1\0"+
    "\2\15\1\252\6\15\1\0\16\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\15\1\0\3\15\1\253\5\15\1\0"+
    "\16\15\2\0\1\15\22\0\1\15\4\0\1\15\1\0"+
    "\7\15\1\254\1\15\1\0\16\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\15\1\0\11\15\1\0\1\15\1\255"+
    "\14\15\2\0\1\15\22\0\1\15\4\0\1\15\1\0"+
    "\1\256\10\15\1\0\16\15\2\0\1\15\22\0\1\15"+
    "\11\0\1\257\73\0\1\260\54\0\1\261\55\0\1\15"+
    "\1\0\4\15\1\262\4\15\1\0\16\15\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\263\11\15\1\0\14\15"+
    "\1\215\1\15\2\0\1\15\22\0\1\15\4\0\1\264"+
    "\1\0\11\15\1\0\16\15\2\0\1\15\22\0\1\15"+
    "\4\0\1\15\1\0\5\15\1\265\3\15\1\0\16\15"+
    "\2\0\1\15\22\0\1\15\10\0\1\266\57\0\1\15"+
    "\1\0\2\15\1\267\6\15\1\0\16\15\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\0\4\15\1\270\4\15"+
    "\1\0\16\15\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\0\3\15\1\271\5\15\1\0\16\15\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\0\3\15\1\272\5\15"+
    "\1\0\16\15\2\0\1\15\22\0\1\15\12\0\1\273"+
    "\16\0\1\274\36\0\1\15\1\0\4\15\1\275\4\15"+
    "\1\0\11\15\1\276\4\15\2\0\1\15\22\0\1\15"+
    "\4\0\1\15\1\0\3\15\1\277\5\15\1\0\16\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\15\1\0\11\15"+
    "\1\0\6\15\1\300\7\15\2\0\1\15\22\0\1\15"+
    "\4\0\1\15\1\0\11\15\1\235\1\15\1\301\13\15"+
    "\1\302\2\0\1\15\22\0\1\15\4\0\1\15\1\0"+
    "\3\15\1\303\5\15\1\0\16\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\15\1\0\11\15\1\0\1\15\1\304"+
    "\14\15\2\0\1\15\22\0\1\15\24\0\1\305\76\0"+
    "\1\232\37\0\1\306\62\0\1\307\64\0\1\310\54\0"+
    "\1\15\1\0\3\15\1\311\5\15\1\0\16\15\2\0"+
    "\1\15\22\0\1\15\4\0\1\15\1\0\11\15\1\0"+
    "\2\15\1\312\13\15\2\0\1\15\22\0\1\15\4\0"+
    "\1\15\1\0\2\15\1\313\6\15\1\0\16\15\2\0"+
    "\1\15\22\0\1\15\53\0\1\314\14\0\1\15\1\0"+
    "\11\15\1\0\16\15\2\0\1\15\12\0\1\314\7\0"+
    "\1\15\5\0\1\315\11\0\1\316\2\0\1\317\1\320"+
    "\1\321\7\0\1\315\1\316\15\0\1\245\32\0\1\322"+
    "\30\0\1\323\14\0\1\15\1\0\11\15\1\0\2\15"+
    "\1\324\13\15\2\0\1\15\12\0\1\323\7\0\1\15"+
    "\4\0\1\15\1\0\7\15\1\325\1\15\1\0\16\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\15\1\0\2\15"+
    "\1\326\6\15\1\0\16\15\2\0\1\15\22\0\1\15"+
    "\27\0\1\327\60\0\1\330\50\0\1\331\56\0\1\15"+
    "\1\0\11\15\1\0\4\15\1\332\11\15\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\0\11\15\1\0\4\15"+
    "\1\333\11\15\2\0\1\15\22\0\1\15\11\0\1\334"+
    "\56\0\1\15\1\0\3\15\1\335\5\15\1\0\16\15"+
    "\2\0\1\15\22\0\1\15\24\0\1\336\43\0\1\337"+
    "\63\0\1\15\1\0\11\15\1\0\4\15\1\340\11\15"+
    "\2\0\1\15\22\0\1\15\4\0\1\341\1\0\11\15"+
    "\1\0\16\15\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\0\5\15\1\342\3\15\1\0\16\15\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\0\5\15\1\343\3\15"+
    "\1\0\16\15\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\0\4\15\1\344\4\15\1\0\16\15\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\0\11\15\1\0\7\15"+
    "\1\345\6\15\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\0\11\15\1\0\4\15\1\346\11\15\2\0\1\15"+
    "\22\0\1\15\15\0\1\347\72\0\1\350\66\0\1\351"+
    "\60\0\1\352\43\0\1\353\1\0\11\15\1\0\16\15"+
    "\2\0\1\15\22\0\1\15\17\0\1\354\15\0\1\354"+
    "\15\0\1\314\21\0\1\355\7\0\1\356\64\0\1\357"+
    "\50\0\1\360\11\0\1\361\56\0\1\362\74\0\1\363"+
    "\45\0\1\364\60\0\1\15\1\0\1\15\1\365\7\15"+
    "\1\0\16\15\2\0\1\15\22\0\1\15\4\0\1\15"+
    "\1\0\4\15\1\366\4\15\1\0\16\15\2\0\1\15"+
    "\22\0\1\15\4\0\1\15\1\0\3\15\1\367\5\15"+
    "\1\0\16\15\2\0\1\15\22\0\1\15\11\0\1\370"+
    "\56\0\1\15\1\0\11\15\1\371\15\15\1\372\2\0"+
    "\1\15\22\0\1\15\24\0\1\373\43\0\1\15\1\0"+
    "\11\15\1\0\4\15\1\374\11\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\15\1\0\11\15\1\0\4\15\1\375"+
    "\11\15\2\0\1\15\22\0\1\15\4\0\1\15\1\0"+
    "\11\15\1\0\4\15\1\376\11\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\15\1\0\11\15\1\0\7\15\1\377"+
    "\6\15\2\0\1\15\22\0\1\15\4\0\1\15\1\0"+
    "\3\15\1\u0100\5\15\1\0\16\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\u0101\132\0\1\u0102\15\0\1\u0103\26\0"+
    "\1\u0103\33\0\1\15\1\0\4\15\1\u0104\4\15\1\0"+
    "\16\15\2\0\1\15\22\0\1\15\22\0\1\u0105\51\0"+
    "\1\u0106\61\0\1\u0107\72\0\1\u0108\60\0\1\u0109\70\0"+
    "\1\u010a\15\0\1\u010a\54\0\1\u010b\52\0\1\u010c\52\0"+
    "\1\15\1\0\7\15\1\u010d\1\15\1\0\16\15\2\0"+
    "\1\15\22\0\1\15\15\0\1\u010e\55\0\1\u010f\60\0"+
    "\1\15\1\0\1\15\1\u0110\7\15\1\0\16\15\2\0"+
    "\1\15\22\0\1\15\11\0\1\u0111\56\0\1\15\1\0"+
    "\3\15\1\u0112\5\15\1\0\16\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\15\1\0\11\15\1\0\16\15\2\0"+
    "\1\15\12\0\1\u0102\7\0\1\15\4\0\1\15\1\u0103"+
    "\11\15\1\0\14\15\1\u0113\1\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\15\1\0\7\15\1\u0114\1\15\1\0"+
    "\16\15\2\0\1\15\22\0\1\15\42\0\1\u0115\34\0"+
    "\1\u0116\37\0\1\u0102\21\0\1\u0117\65\0\1\u0118\60\0"+
    "\1\u0119\64\0\1\u011a\64\0\1\u011b\55\0\1\15\1\0"+
    "\4\15\1\u011c\4\15\1\0\16\15\2\0\1\15\22\0"+
    "\1\15\4\0\1\u011d\72\0\1\u011e\74\0\1\u011f\50\0"+
    "\1\u0120\57\0\1\u0121\26\0\1\u0121\53\0\1\u0122\56\0"+
    "\1\u0123\15\0\1\u0123\37\0\1\u0124\61\0\1\u0125\66\0"+
    "\1\u0126\54\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10504];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\24\1\1\11\3\1\3\11\2\1\4\11"+
    "\1\1\14\11\3\1\1\11\2\1\3\0\16\1\1\0"+
    "\1\1\2\0\1\11\22\1\1\0\3\11\2\0\1\11"+
    "\1\1\1\0\1\11\2\0\4\1\1\0\2\1\1\0"+
    "\4\1\1\0\5\1\1\11\1\1\2\0\1\11\1\0"+
    "\5\1\1\0\4\1\1\0\11\1\1\0\1\1\1\0"+
    "\1\11\2\0\6\1\1\0\3\1\1\11\5\1\2\0"+
    "\1\11\1\1\1\0\2\1\1\0\4\1\2\0\10\1"+
    "\4\0\3\1\10\0\3\1\1\0\2\11\2\1\1\11"+
    "\1\1\1\11\1\0\7\1\1\0\1\1\1\11\1\0"+
    "\1\1\3\0\1\11\5\0\3\1\2\0\1\1\1\0"+
    "\5\1\2\0\1\11\1\1\1\11\1\0\2\11\3\0"+
    "\1\11\1\1\1\11\1\0\1\1\1\11\3\1\1\11"+
    "\4\0\2\11\1\1\3\0\1\11\1\0\1\11\1\0"+
    "\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[294];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    
        ArrayList<Visual_Error> erroresLexicos = new ArrayList<Visual_Error>();

	String st;
	private Symbol symbol(int type) {
    	return new Symbol(type, yyline, yycolumn, yytext());
  	}
  	private Symbol symbol(int type, Object value) {
    	return new Symbol(type, yyline, yycolumn, value);
  	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  lexer(java.io.Reader in) {
  	st = "";
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { System.out.println("Errores lexicos:" + erroresLexicos.add(new Visual_Error( yyline +1 , yycolumn +1, "Caracter invalido en la linea " + (yyline +1) +", columna " + (yycolumn +1) + ". No se esperaba :" + yytext() )));
          }
        case 84: break;
        case 2: 
          { return symbol(sym.Id);
          }
        case 85: break;
        case 3: 
          { return symbol(sym.Asigna);
          }
        case 86: break;
        case 4: 
          { return symbol(sym.EndLine);
          }
        case 87: break;
        case 5: 
          { return symbol(sym.Entero);
          }
        case 88: break;
        case 6: 
          { return symbol(sym.LlaveDer);
          }
        case 89: break;
        case 7: 
          { return symbol(sym.LlaveIzq);
          }
        case 90: break;
        case 8: 
          { return symbol(sym.Coma);
          }
        case 91: break;
        case 9: 
          { return symbol(sym.Menor);
          }
        case 92: break;
        case 10: 
          { return symbol(sym.Mayor);
          }
        case 93: break;
        case 11: 
          { return symbol(sym.Potencia);
          }
        case 94: break;
        case 12: 
          { return symbol(sym.Concatenacion);
          }
        case 95: break;
        case 13: 
          { yybegin(str);
          }
        case 96: break;
        case 14: 
          { return symbol(sym.DiviEntera);
          }
        case 97: break;
        case 15: 
          { 
          }
        case 98: break;
        case 16: 
          { return symbol(sym.Resta);
          }
        case 99: break;
        case 17: 
          { return symbol(sym.Suma);
          }
        case 100: break;
        case 18: 
          { return symbol(sym.Mult);
          }
        case 101: break;
        case 19: 
          { return symbol(sym.Div);
          }
        case 102: break;
        case 20: 
          { return symbol(sym.ParIzq);
          }
        case 103: break;
        case 21: 
          { return symbol(sym.ParDer);
          }
        case 104: break;
        case 22: 
          { return symbol(sym.GuionBajo);
          }
        case 105: break;
        case 23: 
          { return symbol(sym.Punto);
          }
        case 106: break;
        case 24: 
          { yybegin(com);
          }
        case 107: break;
        case 25: 
          { st+=yytext();
          }
        case 108: break;
        case 26: 
          { System.out.println("String: " + st);st="";yybegin(YYINITIAL); return symbol(sym.str);
          }
        case 109: break;
        case 27: 
          { System.out.println("Comentario");yybegin(YYINITIAL);
          }
        case 110: break;
        case 28: 
          { return symbol(sym.As);
          }
        case 111: break;
        case 29: 
          { return symbol(sym.Or);
          }
        case 112: break;
        case 30: 
          { return symbol(sym.Do);
          }
        case 113: break;
        case 31: 
          { return symbol(sym.If);
          }
        case 114: break;
        case 32: 
          { return symbol(sym.To);
          }
        case 115: break;
        case 33: 
          { return symbol(sym.MenorIgual);
          }
        case 116: break;
        case 34: 
          { return symbol(sym.Distinto);
          }
        case 117: break;
        case 35: 
          { return symbol(sym.MayorIgual);
          }
        case 118: break;
        case 36: 
          { st+="\"";
          }
        case 119: break;
        case 37: 
          { return symbol(sym.And);
          }
        case 120: break;
        case 38: 
          { return symbol(sym.Sub);
          }
        case 121: break;
        case 39: 
          { return symbol(sym.End);
          }
        case 122: break;
        case 40: 
          { return symbol(sym.Eqv);
          }
        case 123: break;
        case 41: 
          { return symbol(sym.Not);
          }
        case 124: break;
        case 42: 
          { return symbol(sym.Dim);
          }
        case 125: break;
        case 43: 
          { return symbol(sym.Imp);
          }
        case 126: break;
        case 44: 
          { return symbol(sym.For);
          }
        case 127: break;
        case 45: 
          { return symbol(sym.Xor);
          }
        case 128: break;
        case 46: 
          { return symbol(sym.Step);
          }
        case 129: break;
        case 47: 
          { return symbol(sym.Loop);
          }
        case 130: break;
        case 48: 
          { return symbol(sym.Else);
          }
        case 131: break;
        case 49: 
          { return symbol(sym.Exit);
          }
        case 132: break;
        case 50: 
          { return symbol(sym.Next);
          }
        case 133: break;
        case 51: 
          { return symbol(sym.Case);
          }
        case 134: break;
        case 52: 
          { return symbol(sym.Call);
          }
        case 135: break;
        case 53: 
          { return symbol(sym.Char);
          }
        case 136: break;
        case 54: 
          { return symbol(sym.Main);
          }
        case 137: break;
        case 55: 
          { return symbol(sym.Then);
          }
        case 138: break;
        case 56: 
          { return symbol(sym.TipoBoolean);
          }
        case 139: break;
        case 57: 
          { return symbol(sym.Type);
          }
        case 140: break;
        case 58: 
          { return symbol(sym.ByRef);
          }
        case 141: break;
        case 59: 
          { return symbol(sym.ByVal);
          }
        case 142: break;
        case 60: 
          { return symbol(sym.Input);
          }
        case 143: break;
        case 61: 
          { return symbol(sym.Float);
          }
        case 144: break;
        case 62: 
          { return symbol(sym.While);
          }
        case 145: break;
        case 63: 
          { return symbol(sym.Print);
          }
        case 146: break;
        case 64: 
          { return symbol(sym.Select);
          }
        case 147: break;
        case 65: 
          { return symbol(sym.String);
          }
        case 148: break;
        case 66: 
          { return symbol(sym.EndIf);
          }
        case 149: break;
        case 67: 
          { return symbol(sym.Return);
          }
        case 150: break;
        case 68: 
          { return symbol(sym.Double);
          }
        case 151: break;
        case 69: 
          { return symbol(sym.Structs);
          }
        case 152: break;
        case 70: 
          { return symbol(sym.Boolean);
          }
        case 153: break;
        case 71: 
          { return symbol(sym.ElseIf);
          }
        case 154: break;
        case 72: 
          { return symbol(sym.EndSub);
          }
        case 155: break;
        case 73: 
          { return symbol(sym.EndFor);
          }
        case 156: break;
        case 74: 
          { return symbol(sym.ExitFor);
          }
        case 157: break;
        case 75: 
          { return symbol(sym.Integer);
          }
        case 158: break;
        case 76: 
          { return symbol(sym.Private);
          }
        case 159: break;
        case 77: 
          { return symbol(sym.Ch);
          }
        case 160: break;
        case 78: 
          { return symbol(sym.EndType);
          }
        case 161: break;
        case 79: 
          { return symbol(sym.Function);
          }
        case 162: break;
        case 80: 
          { return symbol(sym.EndWhile);
          }
        case 163: break;
        case 81: 
          { return symbol(sym.EndSelect);
          }
        case 164: break;
        case 82: 
          { return symbol(sym.SelectCase);
          }
        case 165: break;
        case 83: 
          { return symbol(sym.EndFunction);
          }
        case 166: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}