/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 9:
         jjmatchedKind = 2;
         return jjMoveNfa_0(5, 0);
      case 10:
         jjmatchedKind = 3;
         return jjMoveNfa_0(5, 0);
      case 13:
         jjmatchedKind = 4;
         return jjMoveNfa_0(5, 0);
      case 32:
         jjmatchedKind = 5;
         return jjMoveNfa_0(5, 0);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 39:
         jjmatchedKind = 11;
         return jjMoveNfa_0(5, 0);
      case 40:
         jjmatchedKind = 33;
         return jjMoveNfa_0(5, 0);
      case 41:
         jjmatchedKind = 34;
         return jjMoveNfa_0(5, 0);
      case 42:
         jjmatchedKind = 26;
         return jjMoveNfa_0(5, 0);
      case 43:
         jjmatchedKind = 24;
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 45:
         jjmatchedKind = 25;
         return jjMoveNfa_0(5, 0);
      case 47:
         jjmatchedKind = 27;
         return jjMoveNfa_0(5, 0);
      case 58:
         jjmatchedKind = 39;
         return jjMoveNfa_0(5, 0);
      case 59:
         jjmatchedKind = 40;
         return jjMoveNfa_0(5, 0);
      case 60:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 61:
         jjmatchedKind = 28;
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 62:
         jjmatchedKind = 16;
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x100080L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x40600400L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x80040000L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x100082L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x100000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x40600400L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x80040000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 123:
         jjmatchedKind = 36;
         return jjMoveNfa_0(5, 0);
      case 125:
         jjmatchedKind = 37;
         return jjMoveNfa_0(5, 0);
      default :
         return jjMoveNfa_0(5, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 0);
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa2_0(active0, 0x2L);
      case 43:
         if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 1;
         }
         break;
      case 61:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 14;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 1;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 70:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
         }
         break;
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000080000L);
      case 76:
         return jjMoveStringLiteralDfa2_0(active0, 0x100200000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 79:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x40100000L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x280L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 102:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
         }
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000080000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x100200000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000L);
      case 111:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x40100000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x280L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 1);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x300000L);
      case 82:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 2;
         }
         break;
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 84:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x300000L);
      case 114:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 30;
            jjmatchedPos = 2;
         }
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 116:
         if ((active0 & 0x40000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 194:
         return jjMoveStringLiteralDfa3_0(active0, 0x2L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 2);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 2);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 2);
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x200080L);
      case 67:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 69:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 3;
         }
         break;
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000100000L);
      case 82:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 3;
         }
         break;
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x200080L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 101:
         if ((active0 & 0x200L) != 0L)
         {
            jjmatchedKind = 9;
            jjmatchedPos = 3;
         }
         else if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 3;
         }
         break;
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000100000L);
      case 114:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 3;
         }
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 175:
         return jjMoveStringLiteralDfa4_0(active0, 0x2L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 3);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 3);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 3);
   }
   switch(curChar)
   {
      case 38:
         return jjMoveStringLiteralDfa5_0(active0, 0x2L);
      case 69:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 75:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 84:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 101:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 4;
         }
         else if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 107:
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 116:
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 4);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 4);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 4);
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x2L) != 0L)
         {
            jjmatchedKind = 1;
            jjmatchedPos = 5;
         }
         break;
      case 59:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 5;
         }
         break;
      case 65:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 78:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 5;
         }
         break;
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 110:
         if ((active0 & 0x100L) != 0L)
         {
            jjmatchedKind = 8;
            jjmatchedPos = 5;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 5);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 5);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 5);
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 6;
         }
         break;
      case 79:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      case 110:
         if ((active0 & 0x100000L) != 0L)
         {
            jjmatchedKind = 20;
            jjmatchedPos = 6;
         }
         break;
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000L);
      default :
         break;
   }
   return jjMoveNfa_0(5, 6);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjMoveNfa_0(5, 6);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
   return jjMoveNfa_0(5, 6);
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 7;
         }
         break;
      case 110:
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 7;
         }
         break;
      default :
         break;
   }
   return jjMoveNfa_0(5, 7);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int strKind = jjmatchedKind;
   int strPos = jjmatchedPos;
   int seenUpto;
   input_stream.backup(seenUpto = curPos + 1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { throw new Error("Internal Error"); }
   curPos = 0;
   int startsAt = 0;
   jjnewStateCnt = 48;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                     jjCheckNAddStates(0, 2);
                  }
                  else if ((0x280000000000L & l) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  else if (curChar == 46)
                     jjCheckNAdd(34);
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 29;
                  else if (curChar == 40)
                     jjAddStates(3, 5);
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  if (curChar == 45)
                  {
                     if (kind > 44)
                        kind = 44;
                     jjCheckNAddStates(6, 8);
                  }
                  else if (curChar == 43)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 0:
                  if (curChar == 47)
                     jjCheckNAddStates(9, 11);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 3:
                  if (curChar == 13 && kind > 6)
                     kind = 6;
                  break;
               case 4:
                  if (curChar == 10)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 6:
                  if (curChar == 32)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(7, 9);
                  break;
               case 9:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 13:
                  if (curChar == 40)
                     jjAddStates(3, 5);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjAddStates(12, 16);
                  break;
               case 15:
                  if (curChar == 61)
                     jjCheckNAdd(16);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAdd(17);
                  break;
               case 17:
                  if (curChar == 41 && kind > 35)
                     kind = 35;
                  break;
               case 18:
                  if (curChar == 61)
                     jjCheckNAdd(15);
                  break;
               case 19:
                  if (curChar == 33)
                     jjCheckNAdd(15);
                  break;
               case 20:
                  if (curChar == 62)
                     jjCheckNAdd(15);
                  break;
               case 21:
                  if (curChar == 60)
                     jjCheckNAdd(15);
                  break;
               case 22:
                  if ((0x5000000000000000L & l) != 0L)
                     jjCheckNAdd(16);
                  break;
               case 27:
                  if (curChar == 49)
                     jjCheckNAdd(17);
                  break;
               case 28:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 30:
                  if (curChar == 39 && kind > 41)
                     kind = 41;
                  break;
               case 31:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 33:
                  if (curChar == 46)
                     jjCheckNAdd(34);
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAddTwoStates(34, 35);
                  break;
               case 36:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(37);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 42)
                     kind = 42;
                  jjCheckNAdd(37);
                  break;
               case 38:
                  if (curChar == 43)
                     jjCheckNAdd(39);
                  break;
               case 39:
                  if (curChar != 45)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAdd(39);
                  break;
               case 40:
                  if (curChar == 43)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAddStates(0, 2);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAdd(42);
                  break;
               case 43:
                  if (curChar != 45)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAddStates(6, 8);
                  break;
               case 44:
                  if (curChar != 45)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(44);
                  break;
               case 45:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(45, 47);
                  break;
               case 46:
                  if (curChar == 43 && kind > 46)
                     kind = 46;
                  break;
               case 47:
                  if (curChar == 43)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 5:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                     jjCheckNAddStates(6, 8);
                  }
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 1:
                  jjAddStates(9, 11);
                  break;
               case 7:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjAddStates(17, 18);
                  break;
               case 8:
                  if ((0x10000000100L & l) != 0L && kind > 23)
                     kind = 23;
                  break;
               case 10:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 11:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 14:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjAddStates(12, 16);
                  break;
               case 16:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjCheckNAdd(17);
                  break;
               case 23:
                  if ((0x2000000020L & l) != 0L)
                     jjCheckNAdd(17);
                  break;
               case 24:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 29:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 35:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 39:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 43:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAddStates(6, 8);
                  break;
               case 44:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  jjCheckNAdd(44);
                  break;
               case 45:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                     jjCheckNAddTwoStates(45, 47);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(9, 11);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 48 - (jjnewStateCnt = startsAt)))
         break;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { break; }
   }
   if (jjmatchedPos > strPos)
      return curPos;

   int toRet = Math.max(curPos, seenUpto);

   if (curPos < toRet)
      for (i = toRet - Math.min(curPos, seenUpto); i-- > 0; )
         try { curChar = input_stream.readChar(); }
         catch(java.io.IOException e) { throw new Error("Internal Error : Please send a bug report."); }

   if (jjmatchedPos < strPos)
   {
      jjmatchedKind = strKind;
      jjmatchedPos = strPos;
   }
   else if (jjmatchedPos == strPos && jjmatchedKind > strKind)
      jjmatchedKind = strKind;

   return toRet;
}
static final int[] jjnextStates = {
   32, 33, 42, 14, 26, 27, 44, 45, 47, 1, 2, 4, 18, 19, 20, 21, 
   22, 7, 9, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, "\47", 
"\75\75", "\41\75", "\76\75", "\74\75", "\76", "\74", null, null, null, null, null, null, 
"\53", "\55", "\52", "\57", "\75", null, null, null, null, "\50", "\51", null, 
"\173", "\175", null, "\72", "\73", null, null, null, null, "\53\53", null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7ffffffffe01L, 
};
static final long[] jjtoSkip = {
   0x1feL, 
};
static final long[] jjtoSpecial = {
   0x1c0L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[48];
static private final int[] jjstateSet = new int[96];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 48; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
            SkipLexicalActions(matchedToken);
         }
         else
            SkipLexicalActions(null);
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 6 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                               System.out.println("Comentario");
         break;
      case 7 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                         System.out.println("BREAK");
         break;
      case 8 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                          System.out.println("RETURN");
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}