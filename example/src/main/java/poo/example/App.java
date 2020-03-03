package poo.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {    	
		//creo un nuevo objeto de tipo celular, con el constructor vacío
		Celular celular = new Celular();
		// le asigno la marca, modelo, y color
		celular.setMarca("Nokia");
		celular.setModelo("1100");
		celular.setColor("Gris");
		//utilizo lo métodos, llamar, cortarLlamada e informar características
		celular.llamar("Pablo");
		celular.cortarLlamada();
		System.out.println();
		celular.informarCaracteristicas();
		////////////////////////////////////////////////////////////////////////
		///Se crea un objeto de tipo Smartphone con polimorfismo a traves del padre 
		Celular smartphone = new SmartPhone();
		smartphone.setMarca("SmartPhone - Samsug");
		smartphone.setModelo("SmartPhone - S3 MINI");
		smartphone.setColor("SmartPhone - Negro");
		((smartphone)smartphone.setPixelesCamara(5);
		((smartphone)smartphone.setTamanioMemoriaInterna(4);
		((smartphone)smartphone.setTamanioMemoriaExterna(4);
		//utilizo lo métodos, llamar, cortarLlamada heredados de la clase celular
		smartphone.llamar("Carlos");
		smartphone.cortarLlamada();
		System.out.println();
		
		//método sobrescrito
		smartphone.informarCaracteristicas();			
	}
}
