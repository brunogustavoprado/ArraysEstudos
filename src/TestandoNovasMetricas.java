import java.util.HashMap;

public class TestandoNovasMetricas {
    public static void main(String[] args) {

        HashMap<String, String> consultaCpf = new HashMap<>();

        consultaCpf.put("07854946183", "Bruno Gustavo Prado Domingues");
        consultaCpf.put("07878787883", "Maria Fulana Seila");
        consultaCpf.put("78556466183", "Carla Rodriguez");
        consultaCpf.put("94234946183", "Lucas Lopes Pereira");

        System.out.println(consultaCpf.get("07854946183"));
    }
}
