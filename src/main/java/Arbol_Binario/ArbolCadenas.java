package Arbol_Binario;

public class ArbolCadena{
    protected int dato;
    protected Nodo izq;
    protected Nodo der;
    public ArbolCadena(int valor) {
        dato = valor;
        izq = der=null;

    }
    public ArbolCadena(int valor, Nodo ramaizq, Nodo ramader) {
        dato = valor;
        izq = ramaizq;
        der = ramader;
    }

    //operadores de acceso
    public int valorNodo() {
        return dato;
    }
    public Nodo GetsubarbolIzq() {return izq;}
    public Nodo GetsubarbolDer() {return der;}
    public void nuevoValor(int d) {dato = d;}
    public void SetramaIzq(Nodo n) {izq = n;}
    public void SetramaDer(Nodo n) {der = n;}
    public void imprimirDato(){
        System.out.println(this.valorNodo());
    }
}
