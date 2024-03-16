Title :
.586
.model flat, stdcall
include    masm32rt.inc 
Include    debug.inc
Includelib debug.lib
;____________________________________
.Data
    Input        DB	  "IT Year2 M5" 
    Output       DB	  sizeOf Input DUP(0)
.Code
start:
      DbgDump Offset Input,12
      DbgDump Offset Output,12
      MOV ESI, Offset Input
      MOV EDI, Offset Output
      MOV AL, sizeOf Input
      .while (AL!=0)
      MOV BL,[ESI]
      .If(BL>=41H && BL<=5AH)
      ADD BL,20H
      MOV [EDI],BL
      .elseIf (BL>=61H && BL<=7AH)
      MOV [EDI],BL
      .elseIf (BL==20H)
      MOV [EDI], BL
      .else 
      MOV [EDI], BL
      .endIf
      INC EDI
      INC ESI
      DEC AL
      .endW
      PrintString Input
      PrintString Output
      DbgDump Offset Output,12
Ret	 
end start
;====================================