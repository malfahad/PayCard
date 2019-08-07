package com.malfahad.paycardui;

public class PayCardDetails {
    private String cardHoldersName;
    private String cardName;
    private  PayCardType cardType;
    private int expiryYear;
    private int expiryMonth;
    private String CardNumber;

    public PayCardDetails(String cardName,PayCardType cardType, String cardHoldersName,
                          String cardNumber,  int expiryMonth,
                           int expiryYear) {
        this.cardHoldersName = cardHoldersName;
        this.cardName = cardName;
        this.cardType = cardType;
        this.expiryYear = expiryYear;
        this.expiryMonth = expiryMonth;
        CardNumber = cardNumber;
    }

    public String getCardHoldersName() {
        return cardHoldersName;
    }

    public String getCardName() {
        return cardName;
    }

    public PayCardType getCardType() {
        return cardType;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public String getCardNumber() {
        return CardNumber;
    }
}
