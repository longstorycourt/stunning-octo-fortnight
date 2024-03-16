Title :
.586
.model flat, stdcall
include    masm32rt.inc 
Include    debug.inc
Includelib debug.lib
;____________________________________
.Data
    Array       DW	  30782,1866,245,829,170
    List 		DW 	  0 
.Code
start:
	DbgDump Offset Array,2
	
    mov eax,Offset Array
    mov bx, [eax]
    mov cl, LengthOf Array
    dec cl
    
    .while(cl!=0)
    	sub bx, [eax+2]
    	inc eax
    	inc eax
    	dec cl
    .endW
    
    mov List, bx
    PrintDec List
    
Ret	 
end start
;====================================