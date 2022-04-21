import java.util.Scanner;
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
}

	
	
