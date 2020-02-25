### Día 4

- La solucion se obtiene a partir de un bucle en el cual se hashea el string y se comprueba. Al ser la parte dos igual que la uno, esta última incluye ambas partes con un selector para elegir cuál ejecutar.
- Para este día volví a Go, ya que las librerías de Swift para el hash MD5 estarían sólo disponibles para XCode y no se podría compilar ni probar sin Mac. Para compilar la parte dos, habría que instalar la dependencia (Selector) basta con ejecutar "go get ./...". Posteriormente "go build {archivo.go}". Necesita Go 1.13
- El código fuente sin compilar está en la carpeta source.