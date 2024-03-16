Title :
.586
.model flat, stdcall
include    masm32rt.inc 
Include    debug.inc
Includelib debug.lib
;____________________________________
.Data
    x       DD	  1000 , 5000
    sum     DD    0
.Code
start:
      DbgDump Offset x, 8
      mov esi, [x+4]
      PrintDec esi
      PrintHex ESI	
      add esi, [x]
      PrintDec esi
      mov sum, esi
      PrintDec sum
      
      
Ret	 
end start
;====================================