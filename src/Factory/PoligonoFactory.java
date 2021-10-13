package Factory;
import java.util.HashMap;
import java.util.Map;

public class PoligonoFactory {
	
	String triangulo;
	
	static Map<String,  PoligonosIF> poligonos = new HashMap<String, PoligonosIF>();
	
	


	public static PoligonosIF createPoligono(String poligono) {
		
		if (poligono == "Triangulo"){ 
			
		 return poligonos.get("Triangulo") ;
		 
		}
		else
			if(poligono == "Circulo") {
				
				return poligonos.get("Circulo");
		}else
			if(poligono == "Quadrado") {
				return poligonos.get("Quadrado");
		}
		
		return null;
	}

	
	

}
