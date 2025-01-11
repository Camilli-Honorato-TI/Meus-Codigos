public class Carro{
    private String placa;
    private int horario;
    private String cor;
    private int minuto;

    public Carro(String placa, String cor, int horario, int minuto){
      this.placa = placa;
      this.horario = horario;
      this.cor = cor;
      this.minuto = minuto;
    }

    public String getPlaca(){
        return placa;
    }

    public int getHorario(){
        return horario;
    }

    public String getCor(){
      return cor;
    }

    public int getMinuto(){
        return minuto;
    }

    @Override
    public String toString(){
      return placa + "," + cor + ","+ horario + "," + minuto;
    }

    public static Carro fromString(String linha){
      String[] partes = linha.split(",");
      return new Carro(partes[0], partes[1], Integer.parseInt(partes[2]),Integer.parseInt(partes[3]));
    }
}
