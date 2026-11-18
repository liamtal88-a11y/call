package com.example.call; // לפי שם החבילה שלך בפרויקט

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // הגדרה של שני הכפתורים למעלה כדי שלא יהיו שגיאות
    Button btnWeb;
    Button btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // קישור הכפתורים מתוך ה-XML
        btnWeb = (Button) findViewById(R.id.btnWeb);
        btnDial = (Button) findViewById(R.id.btnDial);

        // הגדרת מאזין לחיצה לשניהם
        btnWeb.setOnClickListener(this);
        btnDial.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // בדיקה איזה כפתור נלחץ
        if (v.getId() == R.id.btnWeb) {
            // פתיחת אתר אינטרנט
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://appschool.co.il"));
            startActivity(intent);
        }
        else if (v.getId() == R.id.btnDial) {
            // ביצוע חיוג ישיר

                // פתיחת החייגן עם המספר (עובד בצורה מושלמת באמולטור ובמכשירים)
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0521110111"));
                startActivity(intent);
            }

        }

}