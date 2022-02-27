// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: /home/alex/Escritorio/CUNOC/COMPI 1/PROYECTOS/Practica 1/Practica1_Java/src/main/java/Recursos/AnalizadorLexico.jflex

package JFLEX_Y_CUP;
import java_cup.runtime.*;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\12\0\4\1\22\0\1\2\1\0\1\3\1\4\4\0"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\12\15\1\16\1\17\5\0\1\20\1\21\1\22\1\23"+
    "\13\20\1\24\12\20\1\25\1\0\1\26\3\0\1\27"+
    "\1\20\1\30\1\31\1\32\1\33\2\20\1\34\1\35"+
    "\1\20\1\36\1\20\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\20\1\50\1\51\1\20"+
    "\1\52\1\0\1\53\7\0\1\1\u0196\0\1\54\1\55"+
    "\12\0\2\1\326\0\u0100\1";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\3\1\14\4\1\1\15"+
    "\1\16\4\1\1\17\1\20\1\21\1\22\17\0\1\23"+
    "\1\24\2\0\1\25\1\26\30\0\1\27\1\30\2\0"+
    "\1\31\2\0\1\32\1\0\1\33\3\0\1\34\1\0"+
    "\1\35\4\0\1\36\1\0\1\37\2\0\1\40\2\0"+
    "\1\41\1\42";

  private static int [] zzUnpackAction() {
    int [] result = new int[103];
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
    "\0\0\0\56\0\134\0\212\0\56\0\56\0\56\0\56"+
    "\0\56\0\56\0\56\0\56\0\270\0\56\0\346\0\u0114"+
    "\0\u0142\0\u0170\0\56\0\56\0\u019e\0\u01cc\0\u01fa\0\u0228"+
    "\0\56\0\56\0\u0256\0\56\0\u0284\0\u02b2\0\u02e0\0\u030e"+
    "\0\u033c\0\u036a\0\u0398\0\u03c6\0\u03f4\0\u0422\0\u0450\0\u047e"+
    "\0\u04ac\0\u04da\0\u0508\0\56\0\u02b2\0\u0536\0\u0564\0\56"+
    "\0\56\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u0678\0\u06a6"+
    "\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8\0\u0816"+
    "\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\u0958\0\u0986"+
    "\0\u09b4\0\56\0\56\0\u09e2\0\u0a10\0\56\0\u0a3e\0\u0a6c"+
    "\0\56\0\u0a9a\0\56\0\u0ac8\0\u0af6\0\u0b24\0\56\0\u0b52"+
    "\0\56\0\u0b80\0\u0bae\0\u0bdc\0\u0c0a\0\56\0\u0c38\0\56"+
    "\0\u0c66\0\u0c94\0\56\0\u0cc2\0\u0cf0\0\56\0\56";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[103];
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
    "\3\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\2\1\16\1\2\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\2\2\1\21\1\25"+
    "\12\2\1\26\1\27\1\30\2\2\1\31\1\32\1\33"+
    "\1\34\76\0\5\35\2\0\23\35\4\0\1\4\1\0"+
    "\54\4\13\0\1\36\1\0\1\15\67\0\1\37\55\0"+
    "\1\40\60\0\1\41\57\0\1\42\3\0\1\43\52\0"+
    "\1\44\7\0\1\45\2\0\1\46\41\0\1\47\3\0"+
    "\1\50\54\0\1\51\45\0\1\52\46\0\5\53\2\0"+
    "\23\53\6\0\1\35\1\54\11\0\1\35\2\0\5\35"+
    "\2\0\23\35\21\0\1\55\103\0\1\56\51\0\1\57"+
    "\51\0\1\60\54\0\1\61\66\0\1\62\44\0\1\63"+
    "\57\0\1\64\66\0\1\65\51\0\1\66\3\0\1\67"+
    "\55\0\1\70\44\0\1\71\57\0\1\72\21\0\1\53"+
    "\12\0\1\53\2\0\5\53\2\0\23\53\3\0\1\54"+
    "\43\0\1\73\57\0\1\74\40\0\1\75\75\0\1\76"+
    "\1\77\46\0\1\100\56\0\1\101\52\0\1\102\63\0"+
    "\1\103\36\0\1\104\71\0\1\105\52\0\1\106\44\0"+
    "\1\107\62\0\1\110\53\0\1\111\41\0\1\112\55\0"+
    "\1\113\105\0\1\114\36\0\1\115\44\0\1\116\75\0"+
    "\1\117\55\0\1\120\35\0\1\121\102\0\1\122\56\0"+
    "\1\123\42\0\1\124\63\0\1\125\50\0\1\126\41\0"+
    "\1\127\77\0\1\130\33\0\1\131\71\0\1\132\52\0"+
    "\1\133\73\0\1\134\55\0\1\135\26\0\1\136\103\0"+
    "\1\137\42\0\1\140\53\0\1\141\55\0\1\142\44\0"+
    "\1\143\74\0\1\144\64\0\1\145\43\0\1\146\41\0"+
    "\1\147\37\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3358];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\10\11\1\1\1\11\4\1\2\11"+
    "\4\1\2\11\1\1\1\11\17\0\1\11\1\1\2\0"+
    "\2\11\30\0\2\11\2\0\1\11\2\0\1\11\1\0"+
    "\1\11\3\0\1\11\1\0\1\11\4\0\1\11\1\0"+
    "\1\11\2\0\1\11\2\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[103];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
//codigo java



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
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

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
            // fall through
          case 35: break;
          case 2:
            { return new Symbol(sym.COMILLA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 36: break;
          case 3:
            { return new Symbol(sym.NUMERO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 37: break;
          case 4:
            { return new Symbol(sym.PABIERTO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 38: break;
          case 5:
            { return new Symbol(sym.PCERRADO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 39: break;
          case 6:
            { return new Symbol(sym.POR, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 40: break;
          case 7:
            { return new Symbol(sym.MAS, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 41: break;
          case 8:
            { return new Symbol(sym.COMA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 42: break;
          case 9:
            { return new Symbol(sym.MENOS, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 43: break;
          case 10:
            { return new Symbol(sym.PUNTO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 44: break;
          case 11:
            { return new Symbol(sym.DIVIDIDO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 45: break;
          case 12:
            { return new Symbol(sym.PUNTOYCOMA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 46: break;
          case 13:
            { return new Symbol(sym.CORABIERTO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 47: break;
          case 14:
            { return new Symbol(sym.CORCERRADO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 48: break;
          case 15:
            { return new Symbol(sym.LLABIERTO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 49: break;
          case 16:
            { return new Symbol(sym.LLCERRADO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 50: break;
          case 17:
            { return new Symbol(sym.CABIERTO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 51: break;
          case 18:
            { return new Symbol(sym.CCERRADO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 52: break;
          case 19:
            { return new Symbol(sym.CADENA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 53: break;
          case 20:
            { return new Symbol(sym.DECIMAL, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 54: break;
          case 21:
            { return new Symbol(sym.DEF, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 55: break;
          case 22:
            { return new Symbol(sym.PIE, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 56: break;
          case 23:
            { return new Symbol(sym.EJEX, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 57: break;
          case 24:
            { return new Symbol(sym.EJEY, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 58: break;
          case 25:
            { return new Symbol(sym.TIPO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 59: break;
          case 26:
            { return new Symbol(sym.UNIR, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 60: break;
          case 27:
            { return new Symbol(sym.BARRAS, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 61: break;
          case 28:
            { return new Symbol(sym.EXTRA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 62: break;
          case 29:
            { return new Symbol(sym.TOTAL, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 63: break;
          case 30:
            { return new Symbol(sym.TITULO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 64: break;
          case 31:
            { return new Symbol(sym.CANTIDAD, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 65: break;
          case 32:
            { return new Symbol(sym.VALORES, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 66: break;
          case 33:
            { return new Symbol(sym.PORCENTAJE, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 67: break;
          case 34:
            { return new Symbol(sym.ETIQUETAS, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 68: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
