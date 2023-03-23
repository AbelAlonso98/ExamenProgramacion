package ejercicio3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class Ejercicio3 {

	public static void main(String[] args) {
		Locale[] locales = Locale.getAvailableLocales();
		System.out.println(Arrays.toString(locales));
		Arrays.sort(locales, new Comparator<Locale>(){


			@Override
			public int compare(Locale o1, Locale o2) {
				int comparacionLenguaje = o1.getDisplayLanguage().compareTo(o2.getDisplayLanguage());
				if(comparacionLenguaje == 0)
					return o1.getDisplayCountry().compareTo(o2.getDisplayCountry());
				else
					return comparacionLenguaje;
					
			}
			
		});
		System.out.println(Arrays.toString(locales));

	}

}
