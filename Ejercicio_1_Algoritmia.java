import java.util.Scanner;
import java.time.*;
public class Ejercicio_1_Algoritmia {
	static Scanner lapiz= new Scanner(System.in);
	
	public static void main(String[]args) 
	{
		System.out.println("=============================");
		System.out.println("====Bienvenido al sistema====");
		System.out.println("=============================");
		System.out.println("Eliga un ejercicio");
		int option=lapiz.nextInt();
		switch (option) {
		case 1:
			Ejercicio_1();
			break;
		case 2:
			Ejercicio_2();
			break;
		case 3:
			Ejercicio_3();
			break;
		case 4:
			Ejercicio_5();
			break;
		case 6:
			Ejercicio_6();
			break;
		case 7:
			Ejercicio_7();
			break;
		case 8:
			Ejercicio_8();
			break;
		case 9:
			Ejercicio_9();
			break;
		case 10:
			Ejercicio_10();
			break;
		case 11:
			Ejercicio_11();
			break;
		case 12:
			Ejercicio_12();
			break;
		case 13:
			Ejercicio_13();
			break;
		case 14:
			Ejercicio_14();
			break;
		case 15:
			Ejercicio_15();
			break;
		case 16:
			Ejercicio_16();
			break;
		case 17:
			Ejercicio_17();
			break;
		case 18:
			Ejercicio_18();
			break;
		case 19:
			Ejercicio_19();
			break;
		case 20:
			Ejercicio_20();
			break;
		case 21:
			Ejercicio_21();
			break;
		case 22:
			Ejercicio_22();
			break;
		case 23:
			Ejercicio_23();
			break;
		case 24:
			Ejercicio_24();
			break;
		case 26:
			Ejercicio_26();
			break;
		case 28:
			Ejercicio_28();
			break;
		case 30:
			Ejercicio_30();
			break;
		case 32:
			Ejercicio_32();
			break;
		case 34:
			Ejercicio_34();
			break;
		case 36:
			Ejercicio_36();
			break;
		case 38:
			Ejercicio_38();
			break;	
		case 40:
			Ejercicio_40();
			break;
		case 42:
			Ejercicio_42();
			break;	
		case 44:
			Ejercicio_44();
			break;
		case 47:
			Ejercicio_47();
			break;
		case 49:
			Ejercicio_49();
			break;
		case 51:
			Ejercicio_51();
			break;
		case 53:
			Ejercicio_53();
			break;
		case 55:
			Ejercicio_55();
			break;
		case 57:
			Ejercicio_57();
			break;
		case 59:
			Ejercicio_59();
			break;
		case 61:
			Ejercicio_61();
			break;
		case 63:
			Ejercicio_63();
			break;
		case 65:
			Ejercicio_65();
			break;
		case 67:
			Ejercicio_67();
			break;
		default:
			break;
		}
		
	}
	static void Ejercicio_1(){
		/*Sacar promedio edad 3 personas*/
		int persona1=12; int persona2=22; int persona3=16;
		float promedio_edad=(persona1+persona2+persona3)/3;
		System.out.println(promedio_edad);
		}
	static void Ejercicio_2(){
		/*Suponga que un individuo decide invertir su capital
		  en un banco y desea saber cuánto dinero ganará
		después de un mes si el banco paga a razón de 2%
		 mensual.*/
		int dinero=10000;
		double incremento=0.2;
		System.out.println(dinero*incremento);
	}
	static void Ejercicio_3(){
		/*Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas.
		  El vendedor desea saber cuánto dinero obtendrá por concepto de comisiones por las
		  tres ventas que realizó en el mes y el total que recibirá tomando en cuenta su 
		  sueldo base y sus comisiones.*/
		int sueldo_base=800000;
		int venta1=10000; int venta2=10000;int venta3=8000;
		double comisiones=(venta1+venta2+venta3)*0.10;
		System.out.println(sueldo_base+comisiones);
	}
	static void Ejercicio_4(){
		/*Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente 
		 desea saber cuánto deberá pagar finalmente por su compra.*/
		double descuento=0.15;
		int total_compra=20000;
		System.out.println(total_compra*descuento);
	}
	
	static void Ejercicio_5(){
		/*Un alumno desea saber cuál será su calificación final en la materia de computación.
		Dicha calificaciónse compone de los siguientes porcentajes: 55% del promedio de sus
		 tres calificaciones parciales,30% de la calificación del examen final y 15% de la
		  calificación de un trabajo final.*/
		int parcial1=10;int parcial2=8; int parcial3=6;int examen=7; int trabajo=4;
		double parciales=((parcial1+parcial2+parcial3)/3)*0.55;
		double examen_final=examen*0.3;
		double trabajo_final=trabajo*0.15;
		double nota_final=parciales+examen_final+trabajo_final;
		System.out.println(nota_final);
	}
	static void Ejercicio_6(){
		/*Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay
		  en un grupo de estudiantes.*/
		int hombres=8;
		int mujeres=2;
		int total_personas=hombres+mujeres;
		float porcentaje_mujeres=(mujeres/total_personas)*100;
		System.out.println(porcentaje_mujeres);
	}
	
	static void Ejercicio_7(){
		/*Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas, considerando lo
		siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas.*/
		int metros_dados=2;
		double metro_pulgada=39.27;
		double pie_metro=3.2;
		System.out.println("Pulgadas:"+(metros_dados*metro_pulgada)+","+"Pies:"+(metros_dados*pie_metro));
	}
	
	static void Ejercicio_8(){
		/*Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:
		 √p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2*/
		int a=20;int b=20;int c=30;
		double p=(a+b+c)/2;
		double pa=p-a;
		double pb=p-b;
		double pc=p-c;
		double resultado_sqrt=p*pa*pb*pc;
		System.out.println(Math.sqrt(resultado_sqrt));
	}
	
	static void Ejercicio_9(){
		/*Calcular el salario neto de un trabajador en función del número de horas trabajadas, el precio de la
		hora y considerando un descuento fijo al sueldo base por concepto
		de impuestos del 20%.*/
		int salario_hora=20;
		int hrs_trabajo=240;
		double impuesto=0.2;
		double total=(salario_hora*hrs_trabajo)-impuesto;
		System.out.println(total);
		/*Lea una cantidad en chelines austriacos e imprima el equivalente en pesetas.
		Lea una cantidad en dracmas griegos e imprima su equivalente en francos
		franceses. Finalmente, lea una cantidad en pesetas e imprima su equivalente
		
		en dólares y liras italianas.*/
	}
	static void Ejercicio_10(){
		int cantidad=100;
		String moneda="Chelines Austriacos";
				if( (cantidad==100) && (moneda=="Pesetas") ){
					System.out.println("Eso equivale:0,64840318Dólares y 1163 Liras italianas");
				}else 
				{
					if(moneda=="Dracmas griegos"){
						System.out.println("Eso equivale:"+1.925+" Francos franceses");
					}else 
					{
						if(moneda=="Chelines Austriacos")
						{
							System.out.println("Eso equivale:"+9.56871+" Pesetas");

						}
					}
				}
	}
	
	static void Ejercicio_11(){
		/*Se conoce de un trabajador su nombre, el número de horas normales trabajadas, el 
		pago de una hora normal y el número de horas extras trabajadas. Además, que, cada
		hora extra se paga 25% más del valor de una hora normal. Si se deducen al trabajador
		sobre el sueldo base 5% del paro forzoso, 2% de política habitacional y 7% para caja
		de ahorro. Si se le asignan 25000 Bolívares por actualización académica, 17300
		Bolívares por cada hijo y una prima por hogar de 18000 Bolívares. Calcule y
		muestre las asignaciones, las deducciones y el sueldo neto del trabajador.*/
		
		String Nombre="Diego";
		int Horas_Normales=240;
		double Pago_Hora=20;
		int Horas_Extras=10;
		int Sueldo_Académico=25000;
		int Hijo=17300;
		int Prima=18000;
		double Pago_Extra=Pago_Hora*0.25;
		double Salario_Total=(Horas_Normales*Pago_Hora)+(Horas_Extras+Pago_Extra)+Sueldo_Académico+Hijo+Prima;
		double Salario_Deduccion=Salario_Total*(0.05+0.02+0.07);
		
		System.out.println("Nombre:"+Nombre);
		System.out.println("Sueldo Académico:"+Nombre+",sueldo por hijo:"+Hijo+",prima"+Prima);
		System.out.println("Salario con deducciones:"+Salario_Deduccion);
		System.out.println("Salario Total:"+Salario_Total);
		
	}
	
	static void Ejercicio_12(){
		/*Calcule y muestre, a un alumno, cuál será su promedio general en las tres materias
		más difíciles que cursa y cuál será el promedio que obtendrá en cada una de ellas.
		Estas materias se evalúan como se muestra a continuación:*/
		int Mate_1=10;
		int Mate_2=7;
		int Mate_3=9;
		int Examen_Mate=6;
		double Promedio_Mate=((Mate_1+Mate_2+Mate_3)*0.1)+(Examen_Mate*0.9);
		System.out.println("Promedio en Matemáticas:"+Promedio_Mate);
	
		int Fis_1=8;
		int Fis_2=7;
		int Fis_3=9;
		int Examen_Fis=9;
		double Promedio_Fis=((Fis_1+Fis_2+Fis_3)*0.1)+(Examen_Fis*0.9);
		System.out.println("Promedio en Matemáticas:"+Promedio_Fis);	
		int Qui_1=8;
		int Qui_2=7;
		int Qui_3=9;
		int Examen_Qui=9;
		double Promedio_Qui=((Qui_1+Qui_2+Qui_3)*0.1)+(Examen_Qui*0.9);
		System.out.println("Promedio en Matemáticas:"+Promedio_Qui);
	}
	
	static void Ejercicio_13(){
	/*Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2 billetes
	de 20000,N3 billetes de 10000, N4 billetes de 5000, N5 billetes de 2000,
	N6 billetes 1000, N7 billetes de 500 y N8 billetes de 100.*/
	System.out.println("Ingrese cantidades");
	int cantidad_50000=lapiz.nextInt();
	int cantidad_20000=lapiz.nextInt();
	int cantidad_10000=lapiz.nextInt();
	int cantidad_5000=lapiz.nextInt();
	int cantidad_2000=lapiz.nextInt();
	int cantidad_1000=lapiz.nextInt();
	int cantidad_500=lapiz.nextInt();
	int cantidad_100=lapiz.nextInt();
	int cantidad_dinero=(cantidad_100*100)+(cantidad_500*500)+(cantidad_1000*1000)
	+(cantidad_2000*2000)+(cantidad_5000*5000)+(cantidad_10000*10000)+(cantidad_20000)
	+(cantidad_50000*50000);
	System.out.println("El total es de:"+cantidad_dinero);
	}
	
	static void Ejercicio_14(){
		/*14. El siguiente sistema de ecuaciones lineales:*/
		int a=10; int b=6; int c=8; int d=2; int e=3; int f=7;
		int x=((c*e)-(b*f)/(a*e)-(b*d));
		int y=((a*f)-(c*d)/(a*e)-(b*d));
		System.out.println("El valor de x es:"+x);
		System.out.println("El valor de y es:"+y);	
	}
	
	static void Ejercicio_15(){
	/*Calcular y mostrar el monto total a pagar en un mes de luz eléctrica,
	teniendo como dato la lectura anterior, la lectura actual y el costo
	por kilovatio.*/
	int monto_anterior=lapiz.nextInt();
	int monto_actual=lapiz.nextInt();
	int kWh=monto_actual-monto_anterior;
	double precio=0.5;
	double total_pagar=precio*kWh;
	System.out.println("Precio del recibo:"+total_pagar);
	}
	
	static void Ejercicio_16(){
	/*Una empresa X trabaja con láminas de hierro para fabricar una pieza.
	Se conoce que (a) la lámina mide en promedio 4 metros de largo por 1.5
	metros de ancho; (b) la pieza a fabricar consume 0.5 metros en total.
	Se requiere que calcule y muestre cuántas piezas se fabrican con una
	lámina y cuánto será el desperdicio.*/
	System.out.println("Ingrese una cantidad de hierro");
	int cantidad_hierro=lapiz.nextInt();
	double pieza_A=4*1.5;
	double pieza_b=0.5;
	System.out.println("El total de laminas que se puede crear es de:"+
	cantidad_hierro/(pieza_A+pieza_b));
	}
	
	static void Ejercicio_17(){
	/*Dados como datos el precio final pagado por un producto y su precio de venta
	 al público (PVP), se requiere que calcule y muestre el porcentaje de
	 descuento que le ha sido aplicado.*/
	int PVP=10000;
	int Precio_Final=9000;
	System.out.println("El descuento fue de "+(PVP-Precio_Final)/100+"%");
	}
	
	static void Ejercicio_18(){
	/*Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma
	registran lo que surten en galones, pero el precio de la gasolina está fijado
	en litros. Se requiere que calcule y muestre lo que hay que cobrarle a un cliente,
	considerando que: (a) cada galón tiene 3.785 litros; (b) el precio del litro es
	de 100 Bolívares.*/
	double galon=3785/1;
	double precio=1000/100;
	double total=galon/precio;
	System.out.println("El precio es de:"+total);
	}
	
	static void Ejercicio_19(){
	System.out.println("Ponga un monto");
	int monto=lapiz.nextInt();
	double Gine=monto*0.4;
	double Trauma=monto*0.3;
	double Pedia=monto*0.3;
	System.out.println("Monto ginecología:"+Gine);
	System.out.println("Monto Traumatología:"+Trauma);
	System.out.println("Monto Pediatría:"+Pedia);


		
	}	
	static void Ejercicio_20(){
	/*Calcule qué tanto por ciento anual cobraron por un préstamo de Bolívares X, si
	se pagaron Bolívares  Y de intereses en 4 años. La fórmula del interés es*/	
		System.out.println("Escriba el valor del prestamo");
		int x=lapiz.nextInt();
		System.out.println("Escriba el valor de intereses");
		int y=lapiz.nextInt();
		System.out.println("El valor fue de:"+(x*4*y)/100);
	}
	
	static void Ejercicio_21(){
	/*Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena.
	Después de vender  todas las naranjas a los detallistas, obtiene Bs. K. Calcular
	el porcentaje de ganancia obtenida en la  inversión. Pruebe su programa con los
	 siguientes valores: X=48000, Y=6, K=42000 para obtener 75%  como resultado. */
		int precio=11;
		int x=48000*precio; int y=6; int k=42000;
		System.out.println("La ganancia fue de "+(x*y)/k+"%");
	}
	
	static void Ejercicio_22(){
	/*Un comerciante de computadores ofrece P precio por compra al contado ó 12
	 cuotas de T Bolívares  cada una. Desarrolle un programa para calcular
	 y mostrar cuál es el porcentaje que se cobra por el  recargo en el pago
	 del computador por cuotas. */
	System.out.println("Ingresa un numero");
	int Precio=lapiz.nextInt();
	int Cuotas=Precio/12;
	System.out.println("Lo que se debe pagar en cada cuota es de:"+Cuotas);
	}
	
	static void Ejercicio_23() {
	/*Suponga que a partir de una Tonelada de maíz una planta productora obtiene M kilogramos de
	harina y N litros de aceite. La planta vende cada bulto de 24 paquetes de un kilogramo de harina en
	Bs. B1 y cada caja de 15 envases de aceite en Bs. B2. Suponiendo que la planta vende todo lo que
	produce, calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo además que cada
	kilogramo de harina y cada litro de aceite que restan del embalaje se venden al detal a los precios de
	Bs. B3 y Bs. B4 respectivamente. Pruebe su algoritmo o programa con los sig. Valores: M=452,
	N=197, B1=132, B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895*/	
	int pago_harina=452*24;
	int pago_aceite=197*15;
	int b1=132;
	int b2=180;
	double b3=7.50;
	double b4=14.50;
	System.out.println((pago_harina*b1)+(pago_aceite*b2)-(b3*b4));
	}
	
	static void Ejercicio_24(){
	int cantidad=lapiz.nextInt();
	if(cantidad>7000){
	System.out.println("Se invirtió y tendrá:"+cantidad*0.08+" de ganancia");
	}else {
	System.out.println("No se invirtió");
		}
	}
	
	static void Ejercicio_26(){
	int a=lapiz.nextInt();
	int b=lapiz.nextInt();
	int c=lapiz.nextInt();
	int d=lapiz.nextInt();
	if (d<=0) {
	System.out.println(Math.pow((a-c),2));	
	}else {
		System.out.println((Math.pow((a-b),3))/d);	

		}
	}
	
	static void Ejercicio_28(){
		System.out.println("Inserte dos números");
		int a=lapiz.nextInt();
		int b=lapiz.nextInt();
		double triangulo=(a*b)/2;
		double circulo= a*Math.pow(b,2);
		int rectangulo=a*b;
		System.out.println("Esoja un numero del 1-3");
		int opcion=lapiz.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("La area de un triangulo es de:"+triangulo);
			break;
		case 2:
			System.out.println("La area de un circulo es de:"+circulo);
			break;
		case 3:
			System.out.println("La area de un rectangulo es de:"+rectangulo);
			break;
		default:
			break;
		}
	}
	
	static void Ejercicio_30(){
		int a=2000;int b=300;int c=60;int d=2;
		int n=a+b+c+d;
		if (n>2362) {
			n=2400;
			System.out.println("Número redondeado a:"+n);
		} else{
			n=2300;
			System.out.println("Número redondeado a:"+n);

		}
	}
	
	static void Ejercicio_32(){
		int p=lapiz.nextInt();
		int q=lapiz.nextInt();
		double expresion=(Math.pow(p, 3)+Math.pow(q,4))-(2*Math.pow(p,2));
		if (expresion>680) {
			System.out.println("El valor de p es:"+p);
			System.out.println("El valor de q es:"+q);
		} else {
			System.out.println("El resultado es menor a 680");
		}
	}
	
	static void Ejercicio_34(){
		System.out.println("Ingrese su sueldo actual");
		int sueldo=lapiz.nextInt();
		System.out.println("Elija la categoría a la que pertenece");
		int categoria=lapiz.nextInt();
		switch (categoria) {
		case 1:
			System.out.println("Su nuevo salario es de:"+(sueldo+(sueldo*0.15)));
			break;
		case 2:
			System.out.println("Su nuevo salario es de:"+(sueldo+(sueldo*0.10)));
			break;
		case 3:
			System.out.println("Su nuevo salario es de:"+(sueldo+(sueldo*0.08)));
			break;
		case 4:
			System.out.println("Su nuevo salario es de:"+(sueldo+(sueldo*0.07)));
			break;
		default:
			break;
		}
	}
	
	static void Ejercicio_36(){
		System.out.println("Ingrese su temperatura en grados farenheit");
		int temp=lapiz.nextInt();
		if (temp>85) {
		System.out.println("Hoy es un gran día para nadar");
		} else if (temp<85 && temp>=70) {
		System.out.println("Hoy es un gran día para practicar tennis");	
		}else if (temp<70 && temp>=32) {
		System.out.println("Hoy es un gran día para practicar golf");
		}else if (temp<32 && temp>10) {
		System.out.println("Hoy es un gran dia para esquiar");
		}else if (temp<=10) {
		System.out.println("Hoy es un gran día para hacer una marcha");
		}

		
		}
	
	static void Ejercicio_38(){
		System.out.println("Ingresa el día de tu nacimiento");
		int dia=lapiz.nextInt();
		System.out.println("Ingresa el mes de tu nacimiento");
		int mes=lapiz.nextInt();
		String signo;
		if (mes==11 && (dia>=22 || dia<=31) || (mes==12 && (dia<=21))) {
			signo="Sagitario";
		System.out.println("SU signo es:"+signo);
			
		}else if (mes==12 && (dia>=22 || dia<=31) || (mes==1 && (dia<=20))) {
			signo="Capricornio";
			System.out.println("Su signo es:"+signo);
		}else if (mes==1 && (dia>=21 || dia<=31) || (mes==2 && (dia<=19))) {
			signo="Acuario";
			System.out.println("Su signo es:"+signo);
		}else if (mes==2 && (dia>=20 || dia<=28) || (mes==3 && (dia<=19))) {
			signo="Picis";
			System.out.println("Su signo es:"+signo);
		}else if (mes==03 && (dia>=21 || dia<=31) || (mes==4 && (dia<=20))) {
			signo="Aries";
			System.out.println("Su signo es:"+signo);
		}else if (mes==4 && (dia>=21 || dia<=31) || (mes==5 && (dia<=21))) {
			signo="Tauro";
			System.out.println("Su signo es:"+signo);
		}else if (mes==5 && (dia>=22 || dia<=31) || (mes==6 && (dia<=21))) {
			signo="Geminis";
			System.out.println("Su signo es:"+signo);
		}else if (mes==6 && (dia>=22 || dia<=31) || (mes==7 && (dia<=22))) {
			signo="Cáncer";
			System.out.println("Su signo es:"+signo);
		}else if (mes==7 && (dia>=23 || dia<=31) || (mes==8 && (dia<=23))) {
			signo="Leo";
			System.out.println("Su signo es:"+signo);
		}else if (mes==8 && (dia>=24 || dia<=31) || (mes==9 && (dia<=22))) {
			signo="Virgo";
			System.out.println("Su signo es:"+signo);
		}else if (mes==9 && (dia>=23 || dia<=31) || (mes==10 && (dia<=22))) {
			signo="Libra";
			System.out.println("Su signo es:"+signo);
		}else if (mes==10 && (dia>=23 || dia<=31) || (mes==11 && (dia<=21))) {
			signo="Escorpión";
			System.out.println("Su signo es:"+signo);
		}
	}
	
	static void Ejercicio_40(){
	System.out.println("Escriba su lectura actual"); 
	int lectura=lapiz.nextInt();
	if (lectura>=0 && lectura <=100) {
		System.out.println("El pago de este mes es de: 2622 COP");
	}else if (lectura>100 && lectura<=300) {
		System.out.println("EL pago de este mes es de: 7878 COP");
	}else if (lectura>300 && lectura<=500) {
		System.out.println("EL pago de este mes es de: 8952 COP");
	}else if (lectura>500) {
		System.out.println("EL pago de este mes es de: 9795 COP");
	}
	 
	}
	
	static void Ejercicio_42(){
	System.out.println("Ingrese su edad");
	double edad=lapiz.nextInt();
	System.out.println("Ingrese su nivel de hemoglobina");
	double nivel_hemoglobina=lapiz.nextInt();
	System.out.println("Indique su género a través de una M o F ");
	String genero=lapiz.next();
	if (edad==0.1 && (nivel_hemoglobina>=13 || nivel_hemoglobina<=26)) {
	System.out.println("Su nivel es estable");
	}else if ((edad>0.1 || edad<=0.6) && (nivel_hemoglobina>=10 || nivel_hemoglobina<=18)) {
		System.out.println("Su nivel es estable");
	}
	else if ((edad>0.6 || edad<=1) && (nivel_hemoglobina>=11 || nivel_hemoglobina<=15)) {
		System.out.println("Su nivel es estable");
	}else if ((edad>1 || edad<=5) && (nivel_hemoglobina>=11.5 || nivel_hemoglobina<=15)) {
		System.out.println("Su nivel es estable");
	}else if ((edad>5 || edad<=10) && (nivel_hemoglobina>=12.6 || nivel_hemoglobina<=15.5)) {
		System.out.println("Su nivel es estable");
	}else if ((edad>10 || edad<=15) && (nivel_hemoglobina>=13 || nivel_hemoglobina<=15.5)) {
		System.out.println("Su nivel es estable");
	}else if ((edad>15 && genero=="F")  && (nivel_hemoglobina>=12 || nivel_hemoglobina<=16)) {
		System.out.println("Su nivel es estable");
	}else if ((edad>15 && genero=="M")  && (nivel_hemoglobina>=14 || nivel_hemoglobina<=18)) {
		System.out.println("Su nivel es estable");
	}else {
		System.out.println("Su hemoglobina está rara,vaya al médico");
	}
	
	}
	
	static void Ejercicio_44(){
		System.out.println("De cuánto es la hipoteca?");
		int valor_hipoteca=lapiz.nextInt();
		if (valor_hipoteca<1000000) {
			double inversion=valor_hipoteca*0.5;
			double socio=valor_hipoteca*0.5;
			System.out.println("Se hará una inversión de:"+(inversion+socio));
		}else{
			System.out.println("Se invirtió todo el dinero de la hipoteca");
			double inversion=valor_hipoteca/2;
			System.out.println("Se repartió "+inversion+" para cada uno");
		}
	}
	
	static void Ejercicio_47(){
		for(int i=1;i<=100;i+=2)
        {
			if (i%7==0) {
				System.out.println("");
			}
		System.out.println("Valor:"+i);
        }	
	}
	
	static void Ejercicio_49(){
		int Pregunta_1=1;
		int Pregunta_2=1;
		int Pregunta_3=1;
		if (Pregunta_1==1 && Pregunta_2==1 && Pregunta_3==1) {
			System.out.println("Tuvo todas las respuestas correctas");
		}else if (Pregunta_1==1 && Pregunta_2==1 && Pregunta_3==0) {
			System.out.println("Tuvo las respuestas 1 y 2");
		}else if (Pregunta_1==1 && Pregunta_3==1&& Pregunta_2==0) {
			System.out.println("Tuvo las respuestas 1 y 3");
		}else if (Pregunta_2==1 && Pregunta_3==1 && Pregunta_1==0) {
			System.out.println("Tuvo las respuestas 2 y 3");
		}else if (Pregunta_1==1 && Pregunta_2==0 && Pregunta_3==0) {
			System.out.println("Tuvo la respuesta 1");
		}else if (Pregunta_1==0 && Pregunta_2==1 && Pregunta_3==0) {
			System.out.println("Tuvo las respuesta 2");
		}else if (Pregunta_1==0 && Pregunta_2==0 && Pregunta_3==1) {
			System.out.println("Tuvo las respuesta 3");
		}else if (Pregunta_1==0 && Pregunta_2==0 && Pregunta_3==0) {
			System.out.println("No tuvo ninguna respuesta correcta");
		}	
	}
	
	static void Ejercicio_51(){
		for(int i=6;i<=402;i+=5)
        {
			int suma=+i;
		System.out.println("Valor"+suma);

        }
	}
	
	static void Ejercicio_53(){
		System.out.println("Ingrese su nombre");
		String nombre=lapiz.next();
		System.out.println("Ingrese su nacionalidad");
		String nacionalidad=lapiz.next();
		System.out.println("Ingrese su edad");
		int edad=lapiz.nextInt();
		System.out.println("Qué tipo de empleado es (1-3)");
		int tipo_empleado=lapiz.nextInt();
		System.out.println("Ingrese sus horas trabajadas");
		int horas_trabajadas=lapiz.nextInt();
		int sueldo=5000;
		switch (tipo_empleado) {
		case 1:
		System.out.println("Nombre:"+nombre);
		System.out.println("Nacionalidad:"+nacionalidad);
		System.out.println("Edad:"+edad);
		System.out.println("Horas trabajadas:"+horas_trabajadas);
		System.out.println("Sueldo:"+sueldo);
		if (sueldo>100000) {
			System.out.println("Seguro social:"+(sueldo*0.03));
		}
			break;
		case 2:
		System.out.println("Nombre:"+nombre);
		System.out.println("Nacionalidad:"+nacionalidad);
		System.out.println("Edad:"+edad);
		System.out.println("Horas trabajadas:"+horas_trabajadas);
		System.out.println("Sueldo:"+sueldo);
		if (sueldo>100000) {
			System.out.println("Seguro social:"+(sueldo*0.03));
		}
			break;
		case 3:
			System.out.println("Nombre:"+nombre);
			System.out.println("Nacionalidad:"+nacionalidad);
			System.out.println("Edad:"+edad);
			System.out.println("Horas trabajadas:"+horas_trabajadas);
			System.out.println("Sueldo:"+sueldo);
			if (sueldo>100000) {
				System.out.println("Seguro social:"+(sueldo*0.03));
			}
				break;

		default:
			break;
		}
	}
	
	static void Ejercicio_55(){
	System.out.println("Digita un número cualquiera");
	int i=lapiz.nextInt();
	int sumatoria=0;
	int contador=i;
	while (contador!=0) {
		sumatoria=sumatoria+contador;
		contador--;
		
	}
	if (sumatoria>1000 || sumatoria<=900) {
		System.out.println("Está alejado o se pasó del mil");
		System.out.println("El resultado de "+i+ " es:"+sumatoria);

	}else if(sumatoria<=1000)
	System.out.println("Se ha acercado a mil");
	System.out.println("El resultado de "+i+ " es:"+sumatoria);
	}
	
	static void Ejercicio_57(){
	System.out.println("Ingresa un número");
	int n=lapiz.nextInt();
	double x=0;
	double rn=(((x+n)/x)/2);
	for(x=0.1;rn>0;x++) {
		if(rn>0){
			System.out.println("La raiz cuadrada es:"+rn);
			break;
		}else{
			System.out.println("Es un numero negativo");
		}
	   }
	}
	
	static void Ejercicio_59(){
	System.out.println("Ingrese su nombre");
	String nombre=lapiz.next();
	System.out.println("Ingrese su nota de matemática ");
	int nota_mat=lapiz.nextInt();
	System.out.println("Ingrese su nota de programacion ");
	int nota_prg=lapiz.nextInt();
	System.out.println("Ingrese su nota de inglés ");
	int nota_ing=lapiz.nextInt();
	String estado;
	double promedio_final=(nota_ing+nota_mat+nota_prg)/3;
	if (nota_mat<6 || nota_ing<6 || nota_prg<6) {
		estado="Repobado";
	}else {
		estado="Aprobado";

	}
	System.out.println("Nombre:"+nombre+" Estado:"+estado+" Promedio final:"+promedio_final);
		
	}
	
	static void Ejercicio_61(){
	System.out.println("Ingrese un número");
	int multiplicador=lapiz.nextInt();
	System.out.println("Ingrese otro número");
	int multiplicando=lapiz.nextInt();
	int i=0;
	double resultado=0;
		for (multiplicador=multiplicador; multiplicador!=0; i++) {
			if (multiplicador%2!=0) {
			
			resultado=resultado+multiplicando;
			}
		multiplicando=multiplicando/2;
		multiplicador=multiplicador*2;
		System.out.println("El resultado de la multiplicación es:"+resultado);
		
		}
	 
	}
	
	static void Ejercicio_63(){
		System.out.println("Ingresa tu edad");
		int edad=lapiz.nextInt();
		System.out.println("Escribe tu género");
		String genero=lapiz.next();
		System.out.println("Ingresa tu estado civil (Hombre o Mujer)");
		String estado_c=lapiz.next();
		
		System.out.println("Edad:"+edad+" Genero:"+genero+" Estado Civil:"+estado_c);
	}
	
	static void Ejercicio_65(){
		String nombre="Diego murillo";
		String ti="1025460660";
		System.out.println("Ingrese su salario");
		int sueldo_basico=lapiz.nextInt();
		System.out.println("Ingrese la cantidad de hijos que tenga");
		int cantidad_hijos=lapiz.nextInt();
		System.out.println("Escriba sus inasistencias");
		int inasistencias=lapiz.nextInt();
		double aporte_hijo=sueldo_basico*(cantidad_hijos*0.10);
		double caja_ahorros=sueldo_basico*0.1;
		double seguro=sueldo_basico*0.02;
		double aporte_inasistencias=0;
		
		if (inasistencias>2) {
			 aporte_inasistencias=0;
			} else{
			 aporte_inasistencias=sueldo_basico*0.05;
			}
		double sueldo_neto=(sueldo_neto=sueldo_basico+aporte_hijo+aporte_inasistencias)-
				caja_ahorros-seguro;
		switch (sueldo_basico) {
		case 100000:
			System.out.println("Nombre:"+nombre+" Número de documento"+ti);
			System.out.println("Sueldo básico:"+sueldo_basico);
			System.out.println("Aporte a la caja de ahorros"+caja_ahorros);
			System.out.println("Seguro social:"+seguro);
			System.out.println("Tiene en total:"+sueldo_neto);
			break;
		
		case 165000:
			System.out.println("Nombre:"+nombre+" Número de documento"+ti);
			System.out.println("Sueldo básico:"+sueldo_basico);
			System.out.println("Aporte a la caja de ahorros"+caja_ahorros);
			System.out.println("Seguro social:"+seguro);
			System.out.println("Tiene en total:"+sueldo_neto);
			break;
		
		case 250000:
			System.out.println("Nombre:"+nombre+" Número de documento"+ti);
			System.out.println("Sueldo básico:"+sueldo_basico);
			System.out.println("Aporte a la caja de ahorros"+caja_ahorros);
			System.out.println("Seguro social:"+seguro);
			System.out.println("Tiene en total:"+sueldo_neto);
			break;

		default:
			break;
		}
		
	}
	
	static void Ejercicio_67(){
	int deuda=12775;
	int pago_1=100;
	int pago_23=125;
	int cuotas=14;
	int ultimo_pago=1725;	
	System.out.println("La persona debe pagar en las siguientes 10 deudas:"+(deuda-pago_1-pago_23-ultimo_pago)/cuotas);
	}
	
	static void Ejercicio_69(){
	int amigo_a;
	}
	
	}
	
	
	


	
	
