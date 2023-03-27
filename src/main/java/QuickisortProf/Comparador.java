package QuickisortProf;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.time.*;

public class Comparador {
	static int[] lista = new int[200];
	static Random r = new Random();
	
	private static void randomiza(){
		for (int i = 0; i < lista.length; i++)
			lista[i] = r.nextInt(lista.length);
	}
	
	public static void main(String[] args) {
		randomiza();
		
		long i = 0;
		long f = 0;
		
		QuickSortIterativo qi = new QuickSortIterativo(lista);
		i = Calendar.getInstance().getTimeInMillis();
		qi.quickSort(0, lista.length-1);
		f = Calendar.getInstance().getTimeInMillis();
		System.out.println("Tempo transcorrido em milisegundos(QuickSort): " + (f - i));
		//qi.print();
		System.out.println(qi.listaSegmentos);

		/*BolhaInocente boi = new BolhaInocente(lista.clone());
		i = Calendar.getInstance().getTimeInMillis();
		boi.ordena();
		f = Calendar.getInstance().getTimeInMillis();
		System.out.println("Tempo transcorrido em milisegundos(Bolha Inocente): " + (f - i));
		//boi.print();

		BolhaOtimizado boo = new BolhaOtimizado(lista.clone());
		i = Calendar.getInstance().getTimeInMillis();
		boo.ordena();
		f = Calendar.getInstance().getTimeInMillis();
		System.out.println("Tempo transcorrido em milisegundos(Bolha Otimizado): " + (f - i));
		//boo.print();
		
		BuscaDireta bi = new BuscaDireta(lista.clone());
		i = Calendar.getInstance().getTimeInMillis();
		bi.ordena();
		f = Calendar.getInstance().getTimeInMillis();
		System.out.println("Tempo transcorrido em milisegundos(Busca Direta): " + (f - i));
		//bi.print();
		*/
	}
}
