import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        var properties = new Properties();
        properties.load(new FileInputStream("src/app.properties"));
        final String OPENAI_API_KEY = properties.getProperty("OPENAI_API_KEY");

        String opcaoStr = JOptionPane.showInputDialog(
            "Digite a opção desejada:"
            + "\n1 - Traduzir Textos"
            + "\n2 - Transformar filme em emojis"
            + "\n3 - Explicação super simplificada"
        );

        int opcao = Integer.parseInt(opcaoStr);
        ChatGPTClient insGPT = new ChatGPTClient();

        switch (opcao) {
            case 1:
                String texto = JOptionPane.showInputDialog("Texto?");
                String t = insGPT.traducaoGPT(OPENAI_API_KEY, texto);
                JOptionPane.showMessageDialog(null, t);
                break;

            case 2:
                String emoji = JOptionPane.showInputDialog("Qual filme?");
                String e = insGPT.emojiGPT(OPENAI_API_KEY, emoji);
                JOptionPane.showMessageDialog(null, e);
                break;

            case 3:
                String kid = JOptionPane.showInputDialog("O que você quer que seja explicado?");
                String k = insGPT.kidsGPT(OPENAI_API_KEY, kid);
                JOptionPane.showMessageDialog(null, k);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                break;
        }
    }
}

/*
var properties = new Properties(); -> Cria uma instância da classe Properties, que é uma classe Java que representa uma coleção de pares chave-valor.

properties.load(new FileInputStream("src/app.properties")); -> Carrega as propriedades do arquivo "app.properties" usando um objeto FileInputStream.
O arquivo "app.properties" deve estar localizado na pasta "src" do projeto. O método load() carrega as propriedades do arquivo para a instância de Properties.

final String OPENAI_API_KEY = properties.getProperty("OPENAI_API_KEY"); -> Obtém o valor da propriedade "OPENAI_API_KEY" do objeto Properties usando o método getProperty().
O valor é armazenado na variável OPENAI_API_KEY. 
A palavra-chave final indica que essa variável é uma constante e não pode ser modificada após a atribuição.
 */