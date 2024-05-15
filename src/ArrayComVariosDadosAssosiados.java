import java.util.HashMap;

public class ArrayComVariosDadosAssosiados {
        public static void main(String[] args) {

            class DadosClientes{
              public String nomeCompleto;
              public String cpf;
              public int rg;
              public String email;
              public String ender;
              public String cidade;

              public DadosClientes(String nomeCompleto,String cpf, int rg, String email ,String ender, String cidade){
                  this.nomeCompleto = nomeCompleto;
                  this.cpf = cpf;
                  this.rg = rg;
                  this.email = email;
                  this.ender = ender;
                  this.cidade = cidade;
              }
            }

            HashMap<String, DadosClientes> consultaCpf = new HashMap<>();

            consultaCpf.put("07854946183", new DadosClientes("Bruno Gustavo Prado Domingues", "07854946183",27089991 ,"brgustavo648@gmail.com", "Rua A", "Cidade A"));


            DadosClientes dadosClientes = consultaCpf.get("07854946183");
            if (dadosClientes != null){
                System.out.println("\nNome Completo: " + dadosClientes.nomeCompleto);
                System.out.println("CPF: " + dadosClientes.cpf);
                System.out.println("RG: " + dadosClientes.rg);
                System.out.println("Email: " + dadosClientes.email);
                System.out.println("Rua: " + dadosClientes.ender);
                System.out.println("Cidade: " + dadosClientes.cidade);
            }else{
                System.out.println("Cliente Não Encontrado!");
            }

        }
    }
