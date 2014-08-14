def verificaNum():
	n = raw_input("Ingrese un numero\n");
	if n.isdigit() and n>0:
		limit = int(n);
		print "La lista de numero en el rango de 0 a %d" % (limit);
		for x in range(0,(limit+1)):
			print x;
	else:
		print "Debe ingresar un numero y debe ser almenos cero.\n";
		verificaNum();

print("Programa 2");
print("201314457 - Erick Gustavo Chali Ulin\n");
verificaNum();
raw_input("Presione cualquier tecla para continuar.");
