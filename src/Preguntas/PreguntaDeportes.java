package Preguntas;

public class PreguntaDeportes implements Pregunta {
	
	//atributos
	
	private String pregunta;
	private String respuesta;
	private String opcion1;
	private String opcion2;
	private String opcion3;
	
	
	//constructor
	
	public PreguntaDeportes(String pregunta, String respuesta, String opcion1, String opcion2, String opcion3) {
		this.pregunta = pregunta;
		this.respuesta = respuesta;
		this.opcion1 = opcion1;
		this.opcion2 = opcion2;
		this.opcion3 = opcion3;
	}
	
	// GETERS ME PARECE QUE NO VA PERO CAPAZ MESSI
	
	//public String getPregunta() {
	//	return pregunta;
	//}
	
//	public String getRespuesta() {
//		return respuesta;
//	}
	
//	public String getOpcion1() {
//		return opcion1;
//	}
	
//	public String getOpcion2() {
//		return opcion2;
//	}
	
//	public String getOpcion3() {
//		return opcion3;
//	}

	@Override
	public String obtenerPregunta() {
		return pregunta;
	}

	@Override
	public String obtenerRespuesta() {
		return respuesta;
	}

	@Override
	public String obtenerOpcion1() {
		return opcion1;
	}

	@Override
	public String obternerOpcion2() {
		return opcion2;
	}

	@Override
	public String obtenerOpcion3() {
		return opcion3;
	}

}
