package Teoria_Inicial;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Poo_Conceptos_Iniciales {

    //==========[CONCEPTO DE POO]==========//
    /*
      La programacion Orientada a Objetos es un paradigma
      o estilo de programacion la cual no sigue una secuencia
      constante como lo es la programacion estructurada.

      La poo imita la realidad tomando ragos de estas y se los
      aplica a un objeto, estos ragos son:
      Identidad: Nombre del Objeto
      Estado: Caracteristicas del Objeto
      Comportamiento: Acciones del Objeto
      */

      //==========[PALABRAS RESERVADAS]==========//

      /*
        Existen en todos los lenguajes palabras reservadas,
        estas palabras son de uso unico para el lenguaje, es
        decir invocan una funcion por dicho motivo no pueden
        ser usadas para nombrar a una variable

        [abstract] [case] [continue] [extends] [go to]
        [asset] [catch] [default] [fianl] [import] [boolean]
        [char] [do] [finally] [long] [break] [class] [do]
        [double] [float] [new] [byte] [const] [else] [for]
        [if] [interface] [package] [implements] [int] [native]
        [private] [protected] entre otros mas
        */

      //==========[CLASES Y METODOS]==========//
      /*
        Un metodo es aquel que contiene funciones de un prgrama
        este se encarga de ocultarlos del usuario
        Una clase es una plantilla donde se definen nuestros
        datos y metodos que operan sobre nuestro datos
      */

      //==========[INSTANCIACION]==========//
      /*
        En terminos sencillos es la conexion de una clase a otra
        con la cual se le permite interactuar entre si, es decir
        la clase que instancia podra acceder a los metodos publicos
        de la clase intanciada
      */

      //==========[REUTILIZACION]==========//
      /*
        Nos permite crear muchos objetos de una clase para ser
        utilizados multiple vecez y asi ahorranos tiempo y mejorando
        nuestros programas
      */

      //==========[LLAMADA A METODOS]==========//
      /*
        Es la posibilidad de llamar a un metodo para que realize su
        funcion ya sea un metodo con o sin parametros
      */

      //==========[ATRIBUTOS Y VARIABLES DE INSTANCIA]==========//
      /*
        Son las caracteristicas del objeto de una instancia
      */

      //==========[Encapsulamiento]==========//
      /*
        Es la opcion de limitar el acceso a un elemento (Variables),
        este termino viene en conjunto con los accesadores getters y
        setters los cuales nos permiten acceder a variables encapsuladas.

        Accesador default: Surge cuando nose define un tipo de accesador y
          por defecto sera de tipo publico
        Accesador public: Se define como public indicando que cuando sea
          heredado o se encuentre en el mismo package podra ser utilizado por otra
        Accesador protected: Se define como protected indicando que cuando sea
          heredado solamente podra ser utilizado por otra clase
        Accesador private: Se define como private indicando que solamente podra
          ser accedido a sus valores por medio de getter y setter sin importar
          si se herada o esta en el mismo package no podra ser usado sin los accesadores
      */

      //==========[Herencia]==========//
      /*
        Es la opcion de limitar el acceso a un elemento (Variable,Metodo),
        este termino viene en conjunto con los accesadores getters y
        setters los cuales nos permiten acceder a variables encapsuladas.
      */

      //==========[Polimorfismo]==========//
      /*
        Es la capacidad que se le da a un metodo, de comportase de mas de una
        manera diferente de acuerdo a la instancia creada, es decir, segun sea
        la clase con la que se comunique realizara una funcion u otra.
      */

      //==========[Super]==========//
      /*
        Nos ayuda a acceder a los atributos y metodos de las clases padre o
        superclases, se puede utilizar para llamar a métodos anulados, acceder
        a propiedades ocultas o invocar al constructor de una superclase.

        Uno de los usos mas frecuentes es invocar al constructor de la superclase,
        con ello podemos reducir el codigo
                                  ver:
  https://www.arquitecturajava.com/java-constructores-y-super/#Java_constructores_y_super
      */

      //==========[Excepciones]==========//
      /*
        Las Excepciones son el medio que ayuda a tratar situaciones anomalas aque
        pueden suceder cuando ejecutamos un programa, por lo tando, cuando ejecutamos
        un programa y se origina un error hacemos uso del try,catch y finally para
        informar el error
      */

      //==========[HILOS (THREADS)]==========//
      /*
        Es un flujo de control dentro de un programa, el cual permite tener multiples
        procesos de forma simultanea.

        <<><<>><<><<>>ESTADOS DE UN HILO<<><<>><<><<>>

        Un hilo presenta estados desde su creacion hasta el final de su ejecucion
        Estado(new): se origian cuando un hilo a sido creado pero no inicializado
        Estado(Runnable): Se otigina al hacer uso del metodo start(); el cual crea
        los recursos necesarios para ejecutar el hilo programando el thread y llamar
        al metodo run(); del thread
        Estado(Blocked o Not Runnable): En este estado el hilo se encuentra en
        ejecucion, pero existe una tarea o actividad del mismo hilo que lo impide
        continuar
        Estado(Dead o Finalizado): exiten dos formas en las que puede finalizar un
        hilo, la primera de manera normal, es decir ejecutando su funcion de manera
        normal, y dos siendo interrumpido por alguna otra isntruccion para ello se
        utiliza el metodo stop();

        Manual de java: https://docs.oracle.com/javase/7/docs/api/
      */

      //==========[HILOS (Sincronizados)]==========//




      
}
