# PayCard
An Android UI library for easily creating Payment Cards.

## How it looks like

Sample Visa card

<img src="screenshots/cardImage.png" alt="payment card" width="300"/>

## How to use it

1. Add a PayCard to your layout file
```xml

...

    <com.malfahad.paycardui.PayCard
        android:id="@+id/myPayCard"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"/>
  
...
```

2. Then initialize it in your code
```java

     PayCard payCard = findViewById(R.id.myPayCard);

        PayCardDetails cardDetails = new PayCardDetails.Builder()
                .setCardName("PayCard")
                .setCardHolderName("John Franklin Doe")
                .setCardExpiry(11,22)
                .setCardType(PayCardType.MASTERCARD)
                .setCardNumber("1234 5678 9012 3456")
                .create();

        payCard.setCardDetails(cardDetails);


```


## Adding the dependency

1. Add `jitpack.io` to your root `build.gradle` file's repositories

```groovy

    allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }
        
```

2. Add the dependency implementation to your module's build.gradle

```groovy
	dependencies {
	        implementation 'com.github.malfahad:paycard:Tag'
	}

```