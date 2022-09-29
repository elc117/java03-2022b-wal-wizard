public class TeamMate {
    private int userId = 0;
    private String name;
    private boolean online;

    public TeamMate(String userId, String name) {
        this.userId = Integer.parseInt(userId);
        this.name = name;
        this.online = false;
    }

    public TeamMate() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = Integer.parseInt(userId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }


    String[] pessoas = {"Lukas", "Felipe", "Kain", "Felipe", "Fernando", "João", "Jose", "Messias", "Alun", "Auron", "Italo", "Gabriel"};

    String status(String statusP) {
        if (online == false) {
            statusP = "Desconectado";
        } else {
            statusP = "Conectado";
        }
        return statusP;
    }

    String todosOsNomes() {
        for (int i = 0; i < pessoas.length; i++) {

            userId++;
            System.out.println("id " + userId + " nome: " + pessoas[i] + " status: " + status(""));
        }
        String nomes = " ";
        return nomes;
    }


}
