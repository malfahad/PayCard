package com.malfahad.paycardui;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

public class PayCard extends ConstraintLayout {

    TextView cardNumberView;
    TextView cardExpiryView;
    TextView cardHolderNameView;
    TextView cardNameView;
    ImageView cardTypeLogoView;
    private PayCardDetails cardDetails;

    public PayCard(Context context) {
        super(context);
        initAttrs(context, null);
    }

    public PayCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(context, attrs);
    }

    private void initAttrs(Context context, AttributeSet attrs) {
       inflate(context, R.layout.card_layout, this);
       initComponents(context);
    }

    private void initComponents(Context context) {
        cardTypeLogoView = findViewById(R.id.cardTypeLogo);
        cardNameView = findViewById(R.id.cardName);
        cardExpiryView = findViewById(R.id.cardExpiry);
        cardNumberView = findViewById(R.id.cardNumber);
        cardHolderNameView = findViewById(R.id.cardHolderName);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            setBackground(getResources().getDrawable(R.drawable.card_bg));
        }
    }

    private void setCardType(PayCardType cardType) {
        if(cardType.equals(PayCardType.VISA)) {
            cardTypeLogoView.setImageDrawable(getResources().getDrawable(R.drawable.visa_logo));
        }
        if(cardType.equals(PayCardType.MASTERCARD)) {
            cardTypeLogoView.setImageDrawable(getResources().getDrawable(R.drawable.mc_logo));
        }

    }

    public PayCardDetails getCardDetails() {
        return this.cardDetails;
    }

    public void setCardDetails(PayCardDetails cardDetails) {
        if(cardDetails != null) {
            this.cardDetails = cardDetails;
            cardNameView.setText(cardDetails.getCardName());
            cardHolderNameView.setText(cardDetails.getCardHoldersName());
            cardExpiryView.setText(cardDetails.getExpiryMonth() + "/" + cardDetails.getExpiryYear());
            cardNumberView.setText(cardDetails.getCardNumber());
            setCardType(cardDetails.getCardType());
            setCardBackground(R.drawable.card_bg);

        }
    }

    private void setCardBackground(int drawableId) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            setBackground(getResources().getDrawable(drawableId));
        } else {
            setBackgroundDrawable(getResources().getDrawable(drawableId));
        }
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void updateCardTheme(PaycardTheme theme) {
        switch (theme) {
            case NELSON:
                setCardBackground(R.drawable.card_bg_nelson);
                break;
            case WITCHING_HOUR:
                setCardBackground(R.drawable.card_bg_witch_hour);
                break;
            case FLARE:
                setCardBackground(R.drawable.card_bg_flare);
                break;
            case ARGON:
                setCardBackground(R.drawable.card_bg_argon);
                break;
             default:
                 setCardBackground(R.drawable.card_bg);
        }
    }

}
