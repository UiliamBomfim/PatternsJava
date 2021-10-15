package Factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;

public class JSONWrite {



		
		
		public List<Integer> geradorASCII(PoligonosIF poligono) {
			
			String stringValue = poligono.descritor();
	        List<Integer> listOfIntegers = stringValue.chars()                      
	                .boxed()                      
	                .collect(Collectors.toList());  

	        
	        return listOfIntegers;

		}
		
	
		public void geradorJSON(PoligonosIF poligono) {
			
			List<Integer> listOfIntegers = geradorASCII( poligono);
			
				//Cria um Objeto JSON
			JSONObject jsonObject = new JSONObject();

			FileWriter writeFile = null;

			//Armazena dados em um Objeto JSON
			jsonObject.put(poligono.descritor(), listOfIntegers);


			try{
				writeFile = new FileWriter("saida.json");
				//Escreve no arquivo conteudo do Objeto JSON
				writeFile.write(jsonObject.toJSONString());
				writeFile.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}

			//Imprimne na Tela o Objeto JSON para vizualização
			System.out.println(jsonObject);

		}
		

}