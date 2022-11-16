// 1.EJERCICIO CLCULO DE SUMA DE 5 PRODUCTOS.

//creamos la clase y la importamos
Scannerreader = new Scanner(sumanumeros.in);


// hacemos un meno para la insercion de los productos a sumar
int numeroasumar1 = 0;
int numeroasumar2 = 0;
int numeroasumar3 = 0;
int numeroasumar4 = 0;
int numeroasumar5 = 0;
  
sumanumeros.out.println("Introduce el primer número:");      
numeroasumar1 = reader.nextInt();
      
sumanumeros.out.println("Introduce el segundo número:");
numeroasumar2 = reader.nextInt();

sumanumeros.out.println("Introduce el tercer número:");
numeroasumar3 = reader.nextInt();

sumanumeros.out.println("Introduce el cuarto número:");
numeroasumar4 = reader.nextInt();

sumanumeros.out.println("Introduce el quinto número:");
numeroasumar5 = reader.nextInt();

// aqui saldra el resultado de la operacion 
resultado = numeroasumar1+numeroasumar2+numeroasumar3+numeroasumar4+numeroasumar5;

//resultado final 
sumanumeros.out.println('La suma de los productos es ' + numeroasumar1+numeroasumar2+numeroasumar3+numeroasumar4+numeroasumar5);


// 2.EJERCICIO CLCULO DE MULTIPLICACINO DE 5 PRODUCTOS.

//creamos la clase y la importamos
Scannerreader = new Scanner(multiplicacionnumeros.in);


// hacemos un meno para la insercion de los productos a multiplicar
int numeromultiplicar1 = 0;
int numeromultiplicar2 = 0;
int numeromultiplicar3 = 0;
int numeromultiplicar4 = 0;
int numeromultiplicar5 = 0;
  
multiplicacionnumeros.out.println("Introduce el primer número:");      
numeromultiplicar1 = reader.nextInt();
      
multiplicacionnumeros.out.println("Introduce el segundo número:");
numeromultiplicar2 = reader.nextInt();

multiplicacionnumeros.out.println("Introduce el tercer número:");
numeromultiplicar3 = reader.nextInt();

multiplicacionnumeros.out.println("Introduce el cuarto número:");
numeromultiplicar4 = reader.nextInt();

multiplicacionnumeros.out.println("Introduce el quinto número:");
numeromultiplicar5 = reader.nextInt();

// aqui saldra el resultado de la operacion
resultado = numeromultiplicar1*numeromultiplicar2*numeromultiplicar3*numeromultiplicar4*numeromultiplicar5;

//resultado final
multiplicacionnumeros.out.println('La multiplicacion de los productos es ' * numeromultiplicar1 * numeromultiplicar2 * numeromultiplicar3 * numeromultiplicar4 * numeromultiplicar5);


// EJERCICIO CLCULO DEL PROMEDIO DE 5 PRODUCTOS.

//creamos la clase y la importamos
Scannerreader = new Scanner(promedionumeros.in);


// hacemos un meno para la insercion de los productos para poder scara el promedio
int numeroapromediar1 = 0;
int numeroapromediar2 = 0;
int numeroapromediar3 = 0;
int numeroapromediar4 = 0;
int numeroapromediar5 = 0;
  
promedionumeros.out.println("Introduce el primer número:");      
numeroapromediar1 = reader.nextInt();
      
promedionumeros.out.println("Introduce el segundo número:");
numeroapromediar2 = reader.nextInt();

promedionumeros.out.println("Introduce el tercer número:");
numeroapromediar3 = reader.nextInt();

promedionumeros.out.println("Introduce el cuarto número:");
numeroapromediar4 = reader.nextInt();

promedionumeros.out.println("Introduce el quinto número:");
numeroapromediar5 = reader.nextInt();

// aqui saldra el resultado de la operacion
resultado = numeroapromediar1+numeroapromediar2+numeroapromediar3+numeroapromediar4+numeroapromediar5/5;

//resultado final
promedionumeros.out.println('el promedio de los productos es ' + ( numeroapromediar1 + numeroapromediar2 + numeroapromediar3 + numeroapromediar4 + numeroapromediar5)/5);
