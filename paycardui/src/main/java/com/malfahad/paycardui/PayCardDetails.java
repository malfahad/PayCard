package com.malfahad.paycardui;

public class PayCardDetails {
    private String cardHoldersName;
    private String cardName;
    private  PayCardType cardType;
    private int expiryYear;
    private int expiryMonth;
    private String cardNumber;

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
        return cardNumber;
    }

    public static class Builder {
        private PayCardDetails instance;

        public Builder(){
            instance = new PayCardDetails();
        }

        public Builder setCardName(String cardName){
            instance.cardName = cardName;
            return this;
        }
        public Builder setCardHolderName(String cardHolderName){
            instance.cardHoldersName = cardHolderName;
            return this;
        }
        public Builder setCardNumber(String cardNumber){
            instance.cardNumber = cardNumber;
            return this;
        }
        public Builder setCardExpiry(int month, int year){
            instance.expiryMonth = month;
            instance.expiryYear = year;
            return this;
        }
        public Builder setCardType(PayCardType cardType){
            instance.cardType = cardType;
            return this;
        }
        public PayCardDetails create(){
            return instance;
        }
    }
}
