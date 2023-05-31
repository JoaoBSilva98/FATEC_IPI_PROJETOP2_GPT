import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatGPTRequest {
  private String model;
  private String prompt;
  private int max_tokens;
  private double top_p;
}

/*
A anotação @Getter é aplicada à classe e gera automaticamente os métodos getter para os campos model, prompt, max_tokens e top_p.

A anotação @Setter é aplicada à classe e gera automaticamente os métodos setter para os mesmos campos, permitindo que seja possível definir o valor desses campos.

A anotação @NoArgsConstructor é aplicada à classe e gera automaticamente um construtor sem argumentos, 
o que significa que é possível criar uma instância da classe ChatGPTRequest sem fornecer nenhum argumento.

A anotação @AllArgsConstructor é aplicada à classe e gera automaticamente um construtor com argumentos para todos os campos da classe. 
Isso significa que é possível criar uma instância da classe ChatGPTRequest passando os valores para todos os campos no momento da criação do objeto.

Essas anotações do Lombok ajudam a reduzir a quantidade de código necessário para criar métodos de acesso e construtores, 
tornando o código mais limpo e conciso, além de facilitar a criação e manipulação de objetos da classe ChatGPTRequest.
 */