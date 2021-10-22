# FactoryMethod

## Creacion de las clases.

Para poder dar solución a este ejercicio, primero creamos un nuevo proyecto en IntelliJ IDEA y un repositorio donde se subiran cada una de las clases creadas. 

# Clase figura.

Primero se crea una clase que haga referencia al patron que se esta elaborando, en este caso el patron MethodFactory, así que creamos una clase llamada Figura.

Esta clase tendra las variables de los lados de la figura que se inicializan en 0 y se crean los metodoos, esta clase al ser abstracta se utiliza para crear las diferentes figuras ya sean cuadrados o circulos.

![alt text](./imagenes/ClassFigura.png)

# Clase Circulo

Luego de crear la clase circulo debemos extenderla desde la clase Figura que acabamos de crear para poder obtener las propiedades.

En esta clase heredamos los atributos de la clase Figura, dentro del metodo obtener el area establecemos los parametros que se utilizaran para la creacion de la figura dependiendo del area que se ingrese.

![alt text](./imagenes/ClassCirculo.png)

# Clase cuadrado

Al igual que en la clase circulo, luego de crear la clase cuadrado extendemos desde la clase principal Figura para poder obtener las propiedades y reutilizarlas para la creacion de esta figura.

Heredamos las propiedades de la clase figura y las inicializamos, luego creamos el metodo obtener area y retornamos valores de tipo double, luego creamos la funcion para dibujar y le pasamos las variables G, X, Y, establecemos un color para que se imprima la figura.

![alt text](./imagenes/ClassCuadrado.png)

# Clase prueba fabrica.

En esta clase se extiende desde una libreria llamada Jframe la cual nos permite trabajar con interfaces graficas.

Primero creamos las cajas de texto, botones los cuales nos pertiten ingresar la informacion como el tipo de figura y los botones nos permiten dibujar o borrar las figuras.

![alt text](./imagenes/ClassPrueba1.png)

Más abajo encontramos el Main, aquí es donde se ejecutaran las propiedades de la clase PruebaFabrica, tambien aqui se establecen los margenes de la ventana grafica como la altura y anchura.

![alt text](./imagenes/ClassPrueba2.png)

Por último se toman los valores ingresados desde la interfaz gráfica, aqui tambien convertimos valores de tipo String a enteros ya que la interfaz acepta valores numericos..

![alt text](./imagenes/ClassPrueba3.png)


