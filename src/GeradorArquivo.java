import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {

    public void geraJson(Endereco endereco) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter escrita = new FileWriter("CEP.json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }

}
