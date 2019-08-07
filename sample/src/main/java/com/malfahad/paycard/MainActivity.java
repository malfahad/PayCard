package com.malfahad.paycard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.malfahad.paycardui.PayCardDetails;
import com.malfahad.paycardui.PayCardType;
import com.malfahad.paycardui.PayCard;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PayCard payCard = findViewById(R.id.myPayCard);
        PayCardDetails cardDetails = new PayCardDetails(
                "PayCard",
                PayCardType.VISA,
                "Wasswa Fahad Malende",
                "1234 5678 9012 3456",
                11,22);
        payCard.setCardDetails(cardDetails);

    }
}