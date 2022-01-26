import java.util.ArrayList;
import java.util.Scanner;
import Preguntas.Pregunta;

import Preguntas.PreguntaGeografia;
import Preguntas.PreguntaDeportes;
import Preguntas.PreguntaMusica;

public class Main {

	public static void main(String[] args) {

		// LISTA PREGUNTAS, REPSUESTAS Y OPCIONES GEOGRAFIA

		ArrayList<PreguntaGeografia> preguntasGeografia = new ArrayList<PreguntaGeografia>();

		// LISTA PREGUNTAS, REPSUESTAS Y OPCIONES DEPORTES

		ArrayList<PreguntaDeportes> preguntasDeportes = new ArrayList<PreguntaDeportes>();

		// LISTA PREGUNTAS, REPSUESTAS Y OPCIONES MUSICA

		ArrayList<PreguntaMusica> preguntasMusica = new ArrayList<PreguntaMusica>();

		// (ATRIBUTOS) LISTA PREGUNTAS, RESPUESTAS Y OPCIONES GEOGRAFIA

		preguntasGeografia.add(new PreguntaGeografia("¿cual es la capital de argentina?", "Buenos Aires", "Cordoba", "Salta", "Rosario"));
		
		preguntasGeografia.add(new PreguntaGeografia("¿cual la capital de la India?", "Nueva Delhi", "Mumbai", "Bangalore", "Calcuta"));
		
		preguntasGeografia.add(new PreguntaGeografia("¿cual es el la capital de Inglaterra?", "Londres", "Leeds", "Liverpool", "Manchester"));
		
		preguntasGeografia.add(new PreguntaGeografia("¿cual es la la capital de Corea del sur?", "Seul", "Busan", "Daegu", "Goyang"));
		
		preguntasGeografia.add(new PreguntaGeografia("¿cual es la capital de Rusia?", "Moscu", "San Petersburgo","Novosibirsk", "Kazan"));

		// (ATRIBUTOS) LISTA PREGUNTAS, RESPUESTAS Y OPCIONES DEPORTES

		preguntasDeportes.add(new PreguntaDeportes("Cual es el ultimo seleccionado que gano la Copa America?","Argentina", "Chile", "Brasil", "Colombia"));
		
		preguntasDeportes.add(new PreguntaDeportes("En que equipo de la NBA jugo Kobe Bryant desde 1996?", "Los Angeles Lakers", "Milwuakee Bucks", "Miami Heat", "San Antonio Spurs"));
		
		preguntasDeportes.add(new PreguntaDeportes("Cual es el golfista con mas titulos?", "Tiger Woods","Dustin Johnson", "Phil Mickelson", "Vijay singh"));
		
		preguntasDeportes.add(new PreguntaDeportes("Quien es el nadador con mas medallas Olimpicas?", "Michael Phelps","Paavo Nurmi", "Larisa Latynina", "Usain Bolt"));
		
		preguntasDeportes.add(new PreguntaDeportes("En que equipo debuto el futbolista Cristiano Ronaldo?","Sportin C. P.", "Manchester United F.C.", "Futbol Club Oporto", "Spport Lisboa e Benfica"));

		// (ATRIBUTOS) LISTA PREGUNTAS, REPSUESTAS Y OPCIONES MUSICA

		preguntasMusica.add(new PreguntaMusica("Como se llama el artefacto para tocar las cuerdas de la guitarra?","Pua", "Moneda", "Anillo", "Tecla"));
	
		preguntasMusica.add(new PreguntaMusica("Como es el nombre del cantante de la banda Queen?", "Freddie Mercury","Bon Jovi", "Jim Morrison", "Eric Clapton"));
		
		preguntasMusica.add(new PreguntaMusica("¿En que anio fallecio el cantante Gustavo Cerati?", "2014", "2015","2010", "2011"));
		
		preguntasMusica.add(new PreguntaMusica("¿Cual fue la priemra banda en la que toco Charly Garcia?","Billy Bond and The Jets", "Seru Giran", "Sui Generis", "Los Descnocidos de Siempre"));
		
		
		
		int puntaje = 0;
		
		// pregunta numero 1

		System.out.println("Pregunta Numero 1 Geografia");

		System.out.println("==========================================================");

		System.out.println("\n");

		preguntasGeografia.stream()
				.filter((preguntaGeografia) -> preguntaGeografia.obtenerPregunta().contains("argentina"))
				.forEach((p) -> System.out.println(p.obtenerPregunta()));

		System.out.println("\n");

		preguntasGeografia.stream()
				.filter((preguntaGeografia) -> preguntaGeografia.obtenerRespuesta().contains("Buenos"))
				.forEach((r) -> System.out.println("Opcion A: " + r.obtenerRespuesta()));

		System.out.println("\n");
		
		preguntasGeografia.stream()
				.filter((preguntaGeografia) -> preguntaGeografia.obtenerOpcion1().contains("Cordoba"))
				.forEach((op1) -> System.out.println("Opcion B: " + op1.obtenerOpcion1()));

		System.out.println("\n");

		preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obternerOpcion2().contains("Salta"))
				.forEach((op2) -> System.out.println("Opcion C: " + op2.obternerOpcion2()));

		System.out.println("\n");

		preguntasGeografia.stream()
				.filter((preguntaGeografia) -> preguntaGeografia.obtenerOpcion3().contains("Rosario"))
				.forEach((op3) -> System.out.println("Opcion D: " + op3.obtenerOpcion3()));

		System.out.println("\n");

// pregunto si la respuesta que eligio es la correcta o no y sumo puntos 

	
		Scanner scanner = new Scanner(System.in);
		String r1 = scanner.nextLine();

        

		if (r1.equalsIgnoreCase("A")) {
			puntaje = puntaje + 1;

			System.out.println("su repuesta es correcta");

		} else {
			System.out.println("su repuesta es incorrecta");
		}

		System.out.println("\n");	

	//Pregunta Numero 2
	
	System.out.println("Pregunta Numero 2 Geografia ");

	System.out.println("==========================================================");

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerPregunta().contains("India?"))
			.forEach((p) -> System.out.println(p.obtenerPregunta()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerOpcion1().contains("Mumbai"))
			.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

	System.out.println("\n");

	preguntasGeografia.stream()
			.filter((preguntaGeografia) -> preguntaGeografia.obtenerRespuesta().contains("Nueva Delhi"))
			.forEach((r) -> System.out.println("Opcion B: " + r.obtenerRespuesta()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obternerOpcion2().contains("Bangalore"))
			.forEach((op2) -> System.out.println("Opcion C: " + op2.obternerOpcion2()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerOpcion3().contains("Calcuta"))
			.forEach((op3) -> System.out.println("Opcion D: " + op3.obtenerOpcion3()));

	System.out.println("\n");

//pregunto si la respuesta que eligio es la correcta o no y sumo puntos 

	String r2 = scanner.nextLine();

	if (r2.equalsIgnoreCase("B")) {
		puntaje = puntaje + 1;

		System.out.println("su repuesta es correcta");

	} else {
		System.out.println("su repuesta es incorrecta");
	}	
	
	
	
	//Pregunta numero 3 
	
	
	System.out.println("Pregunta Numero 3 Geografia  ");

	System.out.println("==========================================================");

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerPregunta().contains("Inglaterra?"))
			.forEach((p) -> System.out.println(p.obtenerPregunta()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerOpcion1().contains("Leeds"))
			.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

	System.out.println("\n");

	preguntasGeografia.stream()
			.filter((preguntaGeografia) -> preguntaGeografia.obtenerRespuesta().contains("Londres"))
			.forEach((r) -> System.out.println("Opcion B: " + r.obtenerRespuesta()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obternerOpcion2().contains("Liverpool"))
			.forEach((op2) -> System.out.println("Opcion C: " + op2.obternerOpcion2()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerOpcion3().contains("Manchester"))
			.forEach((op3) -> System.out.println("Opcion D: " + op3.obtenerOpcion3()));
	
	System.out.println("\n");
	
	//pregunto si la respuesta que eligio es la correcta o no y sumo puntos 


	
	String r3 = scanner.nextLine();

	if (r3.equalsIgnoreCase("B")) {
		puntaje = puntaje + 1;

		System.out.println("su repuesta es correcta");

	} else {
		System.out.println("su repuesta es incorrecta");
	}
	
	//Pregunta numero 4
	
	System.out.println("Pregunta Numero 4 geografia ");

	System.out.println("==========================================================");

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerPregunta().contains("Corea del sur?"))
			.forEach((p) -> System.out.println(p.obtenerPregunta()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerOpcion1().contains("Busan"))
			.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

	System.out.println("\n");

	preguntasGeografia.stream()
			.filter((preguntaGeografia) -> preguntaGeografia.obternerOpcion2().contains("Daegu"))
			.forEach((op2) -> System.out.println("Opcion B: " + op2.obternerOpcion2()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerRespuesta().contains("Seul"))
			.forEach((r) -> System.out.println("Opcion C: " + r.obtenerRespuesta()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerOpcion3().contains("Goyang"))
			.forEach((op3) -> System.out.println("Opcion D: " + op3.obtenerOpcion3()));
	
	System.out.println("\n");
	
	//pregunto si la respuesta que eligio es la correcta o no y sumo puntos 


	String r4 = scanner.nextLine();

	if (r4.equalsIgnoreCase("C")) {
		puntaje = puntaje + 1;

		System.out.println("su repuesta es correcta");

	} else {
		System.out.println("su repuesta es incorrecta");
	}
	
	
	//Pregunta numero 5
	
	System.out.println("Pregunta Numero 5 Geografia ");

	System.out.println("==========================================================");

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerPregunta().contains("Rusia?"))
			.forEach((p) -> System.out.println(p.obtenerPregunta()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerOpcion1().contains("San Petersburgo"))
			.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

	System.out.println("\n");

	preguntasGeografia.stream()
			.filter((preguntaGeografia) -> preguntaGeografia.obternerOpcion2().contains("Novosibirsk"))
			.forEach((op2) -> System.out.println("Opcion B: " + op2.obternerOpcion2()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerOpcion3().contains("Kazan"))
			.forEach((op3) -> System.out.println("Opcion C: " + op3.obtenerOpcion3()));

	System.out.println("\n");

	preguntasGeografia.stream().filter((preguntaGeografia) -> preguntaGeografia.obtenerRespuesta().contains("Moscu"))
			.forEach((r) -> System.out.println("Opcion D: " + r.obtenerRespuesta()));
	
	System.out.println("\n");
	
	//pregunto si la respuesta que eligio es la correcta o no y sumo puntos 

	
	String r5 = scanner.nextLine();


	if (r5.equalsIgnoreCase("D")) {
		puntaje = puntaje + 1;

		System.out.println("su repuesta es correcta");

	} else {
		System.out.println("su repuesta es incorrecta");
	}
	
	
	
	
	System.out.println("Pregunta Numero 1 Deportess ");

	System.out.println("==========================================================");

	System.out.println("\n");

	preguntasDeportes.stream()
	        .filter((preguntaDeportes) -> preguntaDeportes.obtenerPregunta().contains("America?"))
			.forEach((p) -> System.out.println(p.obtenerPregunta()));

	System.out.println("\n");

	preguntasDeportes.stream()
	        .filter((preguntaDeportes) -> preguntaDeportes.obtenerOpcion1().contains("Chile"))
			.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

	System.out.println("\n");

	preguntasDeportes.stream()
			.filter((preguntaDeportes) -> preguntaDeportes.obternerOpcion2().contains("Brasil"))
			.forEach((op2) -> System.out.println("Opcion B: " + op2.obternerOpcion2()));

	System.out.println("\n");

	preguntasDeportes.stream()
	        .filter((preguntaDeportes) -> preguntaDeportes.obtenerRespuesta().contains("Argentina"))
			.forEach((r) -> System.out.println("Opcion C: " + r.obtenerRespuesta()));

	System.out.println("\n");

	preguntasDeportes.stream()
	        .filter((preguntaDeportes) -> preguntaDeportes.obtenerOpcion3().contains("Colombia"))
			.forEach((op3) -> System.out.println("Opcion D: " + op3.obtenerOpcion3()));
	
	System.out.println("\n");
	
	
	
	//pregunto si la respuesta que eligio es la correcta o no y sumo puntos 

	
		String r6 = scanner.nextLine();


		if (r6.equalsIgnoreCase("C")) {
			puntaje = puntaje + 1;

			System.out.println("su repuesta es correcta");

		} else {
			System.out.println("su repuesta es incorrecta");
		}
		
		
		
		System.out.println("Pregunta Numero 2 Deportess ");

		System.out.println("==========================================================");

		System.out.println("\n");

		preguntasDeportes.stream()
		        .filter((preguntaDeportes) -> preguntaDeportes.obtenerPregunta().contains("1996?"))
				.forEach((p) -> System.out.println(p.obtenerPregunta()));

		System.out.println("\n");

		preguntasDeportes.stream()
		        .filter((preguntaDeportes) -> preguntaDeportes.obtenerOpcion1().contains("Milwuakee Bucks"))
				.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

		System.out.println("\n");

		preguntasDeportes.stream()
				.filter((preguntaDeportes) -> preguntaDeportes.obtenerRespuesta().contains("Los Angeles Lakers"))
				.forEach((r) -> System.out.println("Opcion B: " + r.obtenerRespuesta()));

		System.out.println("\n");

		preguntasDeportes.stream()
		        .filter((preguntaDeportes) -> preguntaDeportes.obternerOpcion2().contains("Miami Heat"))
				.forEach((op2) -> System.out.println("Opcion C: " + op2.obternerOpcion2()));

		System.out.println("\n");

		preguntasDeportes.stream()
		        .filter((preguntaDeportes) -> preguntaDeportes.obtenerOpcion3().contains("San Antonio Spurs"))
				.forEach((op3) -> System.out.println("Opcion D: " + op3.obtenerOpcion3()));
		
		System.out.println("\n");
		
		
		//pregunto si la respuesta que eligio es la correcta o no y sumo puntos 

		
			String r7 = scanner.nextLine();


			if (r7.equalsIgnoreCase("D")) {
				puntaje = puntaje + 1;

				System.out.println("su repuesta es correcta");

			} else {
				System.out.println("su repuesta es incorrecta");
			}
		
		
	
			
			System.out.println("Pregunta Numero 3 Deportess ");

			System.out.println("==========================================================");

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obtenerPregunta().contains("titulos?"))
					.forEach((p) -> System.out.println(p.obtenerPregunta()));

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obtenerOpcion1().contains("Dustin Johnson"))
					.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

			System.out.println("\n");

			preguntasDeportes.stream()
					.filter((preguntaDeportes) -> preguntaDeportes.obternerOpcion2().contains("Phil Mickelson"))
					.forEach((op2) -> System.out.println("Opcion B: " + op2.obternerOpcion2()));

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obtenerRespuesta().contains("Tiger Woods"))
					.forEach((r) -> System.out.println("Opcion C: " + r.obtenerRespuesta()));

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obtenerOpcion3().contains("Vijay singh"))
					.forEach((op3) -> System.out.println("Opcion D: " + op3.obtenerOpcion3()));
			
			System.out.println("\n");
			
			String r8 = scanner.nextLine();

			
			if (r8.equalsIgnoreCase("C")) {
				puntaje = puntaje + 1;

				System.out.println("su repuesta es correcta");

			} else {
				System.out.println("su repuesta es incorrecta");
			}
		
			System.out.println("\n");
			
			
			
			
			

			System.out.println("Pregunta Numero 4 Deportess ");

			System.out.println("==========================================================");

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obtenerPregunta().contains("Olimpicas?"))
					.forEach((p) -> System.out.println(p.obtenerPregunta()));

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obtenerOpcion1().contains("Paavo Nurmi"))
					.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

			System.out.println("\n");

			preguntasDeportes.stream()
					.filter((preguntaDeportes) -> preguntaDeportes.obtenerRespuesta().contains("Michael Phelps"))
					.forEach((r) -> System.out.println("Opcion B: " + r.obtenerRespuesta()));

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obternerOpcion2().contains("Larisa Latynina"))
					.forEach((op2) -> System.out.println("Opcion C: " + op2.obternerOpcion2()));

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obtenerOpcion3().contains("Usain Bolt"))
					.forEach((op3) -> System.out.println("Opcion D: " + op3.obtenerOpcion3()));
			
			System.out.println("\n");
			
			
			String r9 = scanner.nextLine();

			
			if (r9.equalsIgnoreCase("B")) {
				puntaje = puntaje + 1;

				System.out.println("su repuesta es correcta");

			} else {
				System.out.println("su repuesta es incorrecta");
			}
		
			System.out.println("\n");
			
			
//			"Sportin C. P.", "Manchester United F.C.", "Futbol Club Oporto", "Spport Lisboa e Benfica"
			
			
			System.out.println("Pregunta Numero 5 Deportes ");

			System.out.println("==========================================================");

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obtenerPregunta().contains("Cristiano Ronaldo?"))
					.forEach((p) -> System.out.println(p.obtenerPregunta()));

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obtenerOpcion1().contains("Manchester United F.C."))
					.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

			System.out.println("\n");

			preguntasDeportes.stream()
					.filter((preguntaDeportes) -> preguntaDeportes.obtenerOpcion3().contains("Spport Lisboa e Benfica"))
					.forEach((op3) -> System.out.println("Opcion B: " + op3.obtenerOpcion3()));

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obternerOpcion2().contains("Futbol Club Oporto"))
					.forEach((op2) -> System.out.println("Opcion C: " + op2.obternerOpcion2()));

			System.out.println("\n");

			preguntasDeportes.stream()
			        .filter((preguntaDeportes) -> preguntaDeportes.obtenerRespuesta().contains("Sportin C. P."))
					.forEach((r) -> System.out.println("Opcion D: " + r.obtenerRespuesta()));
			
	        System.out.println("\n");
			
			
			String r10 = scanner.nextLine();

			
			if (r10.equalsIgnoreCase("D")) {
				puntaje = puntaje + 1;

				System.out.println("su repuesta es correcta");

			} else {
				System.out.println("su repuesta es incorrecta");
			}
		
			System.out.println("\n");	
			
			
			
			
			System.out.println("Pregunta Numero 1 Musica ");

			System.out.println("==========================================================");

			System.out.println("\n");

			preguntasMusica.stream()
			        .filter((preguntaMusica) -> preguntaMusica.obtenerPregunta().contains("guitarra?"))
					.forEach((p) -> System.out.println(p.obtenerPregunta()));

			System.out.println("\n");

			preguntasMusica.stream()
			        .filter((preguntaMusica) -> preguntaMusica.obtenerOpcion1().contains("Moneda"))
					.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

			System.out.println("\n");

            preguntasMusica.stream()
					.filter((preguntaMusica) -> preguntaMusica.obtenerOpcion3().contains("Tecla"))
					.forEach((op3) -> System.out.println("Opcion B: " + op3.obtenerOpcion3()));

			System.out.println("\n");

			preguntasMusica.stream()
			        .filter((preguntaMusica) -> preguntaMusica.obtenerRespuesta().contains("Pua"))
					.forEach((r) -> System.out.println("Opcion C: " + r.obtenerRespuesta()));

			System.out.println("\n");

			preguntasMusica.stream()
			        .filter((preguntaMusica) -> preguntaMusica.obternerOpcion2().contains("Anillo"))
					.forEach((op2) -> System.out.println("Opcion D: " + op2.obternerOpcion2()));
			
			 System.out.println("\n");
				
				
				String r11 = scanner.nextLine();

				
				if (r11.equalsIgnoreCase("C")) {
					puntaje = puntaje + 1;

					System.out.println("su repuesta es correcta");

				} else {
					System.out.println("su repuesta es incorrecta");
				}
			
				System.out.println("\n");	
				
				
			
				System.out.println("Pregunta Numero 2 Musica ");

				System.out.println("==========================================================");

				System.out.println("\n");

				preguntasMusica.stream()
				        .filter((preguntaMusica) -> preguntaMusica.obtenerPregunta().contains("Queen?"))
						.forEach((p) -> System.out.println(p.obtenerPregunta()));

				System.out.println("\n");

				preguntasMusica.stream()
				        .filter((preguntaMusica) -> preguntaMusica.obtenerOpcion1().contains("Bon Jovi"))
						.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

				System.out.println("\n");

	            preguntasMusica.stream()
						.filter((preguntaMusica) -> preguntaMusica.obtenerRespuesta().contains("Freddie Mercury"))
						.forEach((r) -> System.out.println("Opcion B: " + r.obtenerRespuesta()));

				System.out.println("\n");

				preguntasMusica.stream()
				        .filter((preguntaMusica) -> preguntaMusica.obtenerOpcion3().contains("Eric Clapton"))
						.forEach((r) -> System.out.println("Opcion C: " + r.obtenerRespuesta()));

				System.out.println("\n");

				preguntasMusica.stream()
				        .filter((preguntaMusica) -> preguntaMusica.obternerOpcion2().contains("Jim Morrison"))
						.forEach((op2) -> System.out.println("Opcion D: " + op2.obternerOpcion2()));
				
				 System.out.println("\n");

				 
				 String r12 = scanner.nextLine();

					
					if (r12.equalsIgnoreCase("B")) {
						puntaje = puntaje + 1;

						System.out.println("su repuesta es correcta");

					} else {
						System.out.println("su repuesta es incorrecta");
					}
				
					
					
					System.out.println("\n");
					
					

					
					System.out.println("Pregunta Numero 3 Musica ");

					System.out.println("==========================================================");

					System.out.println("\n");

					preguntasMusica.stream()
					        .filter((preguntaMusica) -> preguntaMusica.obtenerPregunta().contains("Cerati?"))
							.forEach((p) -> System.out.println(p.obtenerPregunta()));

					System.out.println("\n");

					preguntasMusica.stream()
					        .filter((preguntaMusica) -> preguntaMusica.obtenerOpcion1().contains("2015"))
							.forEach((op1) -> System.out.println("Opcion A: " + op1.obtenerOpcion1()));

					System.out.println("\n");

		            preguntasMusica.stream()
							.filter((preguntaMusica) -> preguntaMusica.obtenerOpcion3().contains("2011"))
							.forEach((op3) -> System.out.println("Opcion B: " + op3.obtenerOpcion3()));

					System.out.println("\n");

					preguntasMusica.stream()
					        .filter((preguntaMusica) -> preguntaMusica.obtenerRespuesta().contains("2014"))
							.forEach((r) -> System.out.println("Opcion C: " + r.obtenerRespuesta()));

					System.out.println("\n");

					preguntasMusica.stream()
					        .filter((preguntaMusica) -> preguntaMusica.obternerOpcion2().contains("2010"))
							.forEach((op2) -> System.out.println("Opcion D: " + op2.obternerOpcion2()));
					
					 System.out.println("\n");

					 
					 String r13 = scanner.nextLine();

						
						if (r13.equalsIgnoreCase("C")) {
							puntaje = puntaje + 1;

							System.out.println("su repuesta es correcta");

						} else {
							System.out.println("su repuesta es incorrecta");
						}
					
						
						
						System.out.println("\n");
						
						
//						Charly Garcia?","Billy Bond and The Jets", "Seru Giran", "Sui Generis", "Los Descnocidos de Siempre"
						
						
						System.out.println("Pregunta Numero 4 Musica ");

						System.out.println("==========================================================");

						System.out.println("\n");

						preguntasMusica.stream()
						        .filter((preguntaMusica) -> preguntaMusica.obtenerPregunta().contains("Charly Garcia?"))
								.forEach((p) -> System.out.println(p.obtenerPregunta()));

						System.out.println("\n");

						preguntasMusica.stream()
						        .filter((preguntaMusica) -> preguntaMusica.obtenerRespuesta().contains("Billy Bond and The Jets"))
								.forEach((r) -> System.out.println("Opcion A: " + r.obtenerRespuesta()));

						System.out.println("\n");

			            preguntasMusica.stream()
								.filter((preguntaMusica) -> preguntaMusica.obtenerOpcion3().contains("Los Descnocidos de Siempre"))
								.forEach((op3) -> System.out.println("Opcion B: " + op3.obtenerOpcion3()));

						System.out.println("\n");

						preguntasMusica.stream()
						        .filter((preguntaMusica) -> preguntaMusica.obtenerOpcion1().contains("2014"))
								.forEach((op1) -> System.out.println("Opcion C: " + op1.obtenerOpcion1()));

						System.out.println("\n");

						preguntasMusica.stream()
						        .filter((preguntaMusica) -> preguntaMusica.obternerOpcion2().contains("Seru Giran"))
								.forEach((op2) -> System.out.println("Opcion D: " + op2.obternerOpcion2()));
						
						 System.out.println("\n");
						 
						 String r14 = scanner.nextLine();

							
							if (r14.equalsIgnoreCase("A")) {
								puntaje = puntaje + 1;

								System.out.println("su repuesta es correcta");

							} else {
								System.out.println("su repuesta es incorrecta");
							}
						
							
							
							System.out.println("\n");
							

						

	}

}
