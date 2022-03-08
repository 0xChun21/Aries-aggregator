package brainiac.nht.ariesaggregator.Entity;

public class Coin {
    public String id;
    public String name;
    public String symbol;
//    public String rank;
    public String price_usd;
//    public String price_btc;
 //   public String _invalid_name_24h_volume_usd;
   // public String marketcap_usd;
 //   public String avaiable_supply;
  //  public String total_supply;
 //   public String max_supply;
    public String percent_change_1h;
    public String percent_change_24h;
    public String percent_change_7d;
   // public String last_update;


    public Coin() {
    }

    public Coin(String id, String name, String symbol, String price_usd, String percent_change_1h, String percent_change_24h, String percent_change_7d) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.price_usd = price_usd;
        this.percent_change_1h = percent_change_1h;
        this.percent_change_24h = percent_change_24h;
        this.percent_change_7d = percent_change_7d;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getPrice_usd() {
        return price_usd;
    }


    public String getPercent_change_24h() {
        return percent_change_24h;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setPrice_usd(String price_usd) {
        this.price_usd = price_usd;
    }

    public String getPercent_change_1h() {
        return percent_change_1h;
    }

    public void setPercent_change_1h(String percent_change_1h) {
        this.percent_change_1h = percent_change_1h;
    }

    public void setPercent_change_7d(String percent_change_7d) {
        this.percent_change_7d = percent_change_7d;
    }

    public String getPercent_change_7d() {
        return percent_change_7d;
    }

    public void setPercent_change_24h(String percent_change_24h) {
        this.percent_change_24h = percent_change_24h;
    }
}
