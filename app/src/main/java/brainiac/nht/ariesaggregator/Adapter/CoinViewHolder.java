package brainiac.nht.ariesaggregator.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import brainiac.nht.ariesaggregator.R;

public class CoinViewHolder extends RecyclerView.ViewHolder {
    public ImageView coin_icon;
    public TextView coin_symbol, coin_name, coin_price, on_hour_change, twenty_four_hour_change, seven_day_change;
    public CoinViewHolder(@NonNull View itemView) {
        super(itemView);
        coin_icon = (ImageView) itemView.findViewById(R.id.coin_icon);
        coin_symbol =(TextView) itemView.findViewById(R.id.coin_symbol);
        coin_name =(TextView) itemView.findViewById(R.id.coin_name);
        on_hour_change =(TextView) itemView.findViewById(R.id.oneHourText);
        twenty_four_hour_change =(TextView) itemView.findViewById(R.id.twentyFourHourText);
        seven_day_change =(TextView) itemView.findViewById(R.id.sevenDayText);

    }
}
