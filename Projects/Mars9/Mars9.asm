Title :
.586
.model flat, stdcall
include    masm32rt.inc 
Include    debug.inc
Includelib debug.lib
;____________________________________
.Data
    Result       DW	  0
    
.Code
start:
	DbgDump Offset Result,2
	
    mov ax,0
    mov bx,2
    mov cl,15
      
	.while(cl!=0)
      	add ax, bx
      	inc bx
      	inc bx
      	dec cl  	
	.endW
	
    mov Result, ax
      	
    PrintDec Result
    PrintHex Result
    DbgDump Offset Result,2
      	
Ret	 
end start
;====================================