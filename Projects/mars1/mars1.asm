Title :
.586
.model flat, stdcall
include    masm32rt.inc 
Include    debug.inc
Includelib debug.lib
;____________________________________
.Data
    x       DD	  31872 , 5368
    result	DD	  0
.Code
start:
    mov eax, [x]
    sub eax, [x+4]
    mov result, eax
    PrintDec result
    PrintHex result
    	
Ret	 
end start
;====================================