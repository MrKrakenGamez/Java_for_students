// por lo regular para nombra una clase se sigue la nomenclatura de camel case o pascal case
// esto quiere decir que cada palabra iniciara con una mayuscula, evitando los espacios
// tipos de notación: https://www.neoguias.com/tipos-notacion-nombres/
public class HelloWorld {
    // por ahora solo se entendera que 'public' y 'class' son palabras reservadas
    /* una palabra reservada es una palabra que tiene un significado gramatical
    especial para ese lenguaje y no puede ser utilizada como un
    identificador de objetos en códigos del mismo, como pueden ser las variables.*/


    /* el metodo 'main' hace que una clase de Java sea una aplicacion, debido a que cuando arranque
    el programa, primero llamara al metodo 'main' o principal, para que se ejecuten todas las tareas,
    procesos, instancias, etc.
     */

    //la entrada siempre se va a definir por los argumentos esperados por el metodo
    public static void main(String[]args){

        // public: modificador de acceso que indica que este metodo se puede ejecutar o llamar desde cualquier parte de la aplicacion
        // void: es el tipo de retorno, en este caso void indica que no retornara nada, es un metodo vacio
        // main: recive argumentos o parametros, en este caso de tipo string o cadena

        System.out.println("hola mundo");

        // System: clase del sistema
        // out:atributo estatico
        // println: imprimir una sola linea en la consola
        // en este caso, lo que se va a imprimir en la cosola es una cadena
        // las cadenas de caracteres fijos siempre van a ir entre parentesis
        // toda instruccion deve terminar con un ;

        // para este caso la salda, se da por medio de la consola


    }// en este punto las llaves limitan el alcance de un metodo

}//en esta caso las llaves limitan el alcanse de la clase






//////////////////////////////////////palabras reservadas//////////////////////////////////////
/* Public: La palabra clave pública se usa en la declaración de una clase, método o campo;
Los miembros de cualquier clase pueden acceder a clases públicas, métodos y campos. */

/*
Class: Un tipo que define la implementación de un tipo particular de objeto.
    Una definición de clase define los campos de instancia y clase, los métodos y las clases internas,
    además de especificar las interfaces que implementa la clase y la superclase inmediata de la clase.
    Si la superclase no se especifica explícitamente, la superclase es implícitamente Object.
    La palabra clave de clase también se puede utilizar en el formulario Class.class
    para obtener un objeto Class sin necesidad de una instancia de esa clase.
    Por ejemplo, String.class se puede usar en lugar de hacer una nueva String (). GetClass ().
*/

/*
Static: Se utiliza para declarar un campo, método o clase interna como un campo de clase.
Las clases mantienen una copia de los campos de clase independientemente de
cuántas instancias existen de esa clase. Staticalso se usa para definir un método como un método de clase.
Los métodos de clase están vinculados a la clase en lugar de a una instancia específica,
y solo pueden operar en campos de clase. (Las clases e interfaces declaradas como miembros estáticos
de otra clase o interfaz son en realidad clases de nivel superior y no son clases internas).
 */
/*
    void: La palabra clave void se usa para declarar que un método no devuelve ningún valor.
 */
