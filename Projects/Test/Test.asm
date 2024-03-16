Title :
.586
.model flat, stdcall
include    masm32rt.inc 
Include    debug.inc
Includelib debug.lib
;____________________________________
.Data
    x       DD	  0 
    y       DD	  0
    r	    DD	  0
.Code
start:
      mov eax, x 
      PrintDec x
      mov x,23	
      PrintDec x
      
Ret	 
end start
;====================================