package Factory;
import java.util.Map;
import java.util.jar.JarException;

import javax.tools.JavaFileObject;

import org.json.simple.JSONObject;





public class App {

	public static void main(String[] args) throws JSONException  {
		
		PoligonoFactory teste = new PoligonoFactory();
		
		teste.poligonos.put("Triangulo", new Triangulo());
		teste.poligonos.put("Quadrado", new Quadrado());
		teste.poligonos.put("Circulo", new Circulo());
		
		
		
		PoligonosIF poligono = PoligonoFactory.createPoligono("Circulo") ;
		System.out.println(poligono.descritor() ); 
		
		JSONWrite json = new JSONWrite();
		json.geradorJSON(poligono);
		
		

    
		
	}

}
