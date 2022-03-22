package com.example.lifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
// AppCompatActivity est une classe de type LifecycleOwner
public class MainActivity extends AppCompatActivity {

    private TextView amountLabel;
    private EditText amountText;
    private TextView tipAmountLabel;
    private EditText tipAmountText;
    private Observer observer;

    // methode de cycle de vie en Android, se déclenche au moment
    // ou l'activité est lancée.  Les initialisation s'effectuent
    // l'interface d'activité (layout) est gonflée ("inflaté")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        observer = new Observer();
        getLifecycle().addObserver(observer);
//        amountLabel = findViewById(R.id.amountLabel);
//        amountText = findViewById(R.id.amountText);
//        tipAmountLabel = findViewById(R.id.tipAmountLabel);
//        tipAmountText = findViewById(R.id.tipAmountText);
//        if (savedInstanceState != null) {
//            String amount = savedInstanceState.getString("amount", "");
//            tipAmountLabel.setText(amount);
//        }
//        Log.d("MainActivity", "Methode onCreate");
    }

    // cette methode est appelée lors que l'activité devient
    // visible pour l'utilisateur
    @Override
    protected void onStart() {
        super.onStart();
//        Log.d("MainActivity", "Methode onStart");
    }

    // L'activity obtient le focus (i.e. on peut agir à l'activité)
    @Override
    protected void onResume() {
        super.onResume();
//        Log.d("MainActivity", "Methode onResume");
    }

    // L'activité a perdu focus (elle n'est pas/plus au premier plan)
    // L'activité est toujours visible mais l'utilisateur n'interragit pas
    // activement avec elle
    @Override
    protected void onPause() {
        super.onPause();
//        Log.d("MainActivity", "Methode onPause");
    }

    // l'activité n'est plus visible pour l'utilisateur
    // on libère les ressources qui ne sont plus nécessaire
    // on enregistre tous les états persistants pour ne pas perdre le travail
    // IMPORTANT bcs Android may détruire l'appli si pas assez de ressource
    @Override
    protected void onStop() {
        super.onStop();
//        Log.d("MainActivity", "Methode onStop");
    }

    // L'activité est sur le point de détruire (parce que terminé)
    // Nettoyage de ressource mais ne pas faire surtout persister des données
    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Log.d("MainActivity", "Methode onDestroy");
    }

    // appelée lors de redémarrge appli
    @Override
    protected void onRestart() {
        super.onRestart();
//        Log.d("MainActivity", "Methode onRestart");
    }

    // permettre la sauvegarde des données utilisateur
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
//        outState.putString("amount", tipAmountLabel.getText().toString());
//        Log.d("MainActivity", "Methode onSaveInstanceState");
    }

    public void calculate(View view) {
//        tipAmountLabel.setText("20");
//        tipAmountText.setText("Amount");
    }
}