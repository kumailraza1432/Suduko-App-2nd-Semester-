package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button B1 = (Button) findViewById(R.id.B1);
        final Button B2 = (Button) findViewById(R.id.B2);
        final Button B3 = (Button) findViewById(R.id.B3);
        final Button B4 = (Button) findViewById(R.id.B4);
        final Button B5 = (Button) findViewById(R.id.B5);
        final Button B6 = (Button) findViewById(R.id.B6);
        final Button B7 = (Button) findViewById(R.id.B7);
        final Button B8 = (Button) findViewById(R.id.B8);
        final Button B9 = (Button) findViewById(R.id.B9);
        final Button B10 = (Button) findViewById(R.id.B10);
        final Button B11 = (Button) findViewById(R.id.B11);
        final Button B12 = (Button) findViewById(R.id.B12);
        final Button B13 = (Button) findViewById(R.id.B13);
        final Button B14 = (Button) findViewById(R.id.B14);
        final Button B15 = (Button) findViewById(R.id.B15);
        final Button B16 = (Button) findViewById(R.id.B16);
        final Button B17 = (Button) findViewById(R.id.B17);
        final Button B18 = (Button) findViewById(R.id.B18);
        final Button B19 = (Button) findViewById(R.id.B19);
        final Button B20 = (Button) findViewById(R.id.B20);
        final Button B21 = (Button) findViewById(R.id.B21);
        final Button B22 = (Button) findViewById(R.id.B22);
        final Button B23 = (Button) findViewById(R.id.B23);
        final Button B24 = (Button) findViewById(R.id.B24);
        final Button B25 = (Button) findViewById(R.id.B25);
        final Button Game = (Button) findViewById(R.id.Game);
        final Button reStart = (Button) findViewById(R.id.playAgain);


        reStart(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B2.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B2.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B3.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B3.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B4.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B4.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B5.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B5.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);

            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B6.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B6.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B8.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B8.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B9.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B9.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B10.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B10.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B11.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B11.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B12.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B12.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B14.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B14.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B15.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B15.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B16.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B16.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B17.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B17.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B18.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B18.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B20.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B20.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B21.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B21.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B22.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B22.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B23.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B23.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        B24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = B24.getText().toString();
                int B = (text.length() != 0) ? Integer.parseInt(text) : 0;
                if (B < 5)
                    B++;
                else
                    B = 1;
                B24.setText(String.format("%s", B));
                winCheck(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });
        reStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reStart(B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14,B15,B16,B17,B18,B19,B20,B21,B22,B23,B24,B25,Game);
            }
        });

    }
    public void winCheck(Button B1, Button B2,Button B3,Button B4,Button B5,Button B6,Button B7,
                            Button B8,Button B9,Button B10,Button B11,Button B12,Button B13,Button B14,
                            Button B15,Button B16,Button B17,Button B18,Button B19,Button B20,Button B21,
                            Button B22,Button B23,Button B24,Button B25, Button Game){
        String C1 = B1.getText().toString();
        String C2 = B2.getText().toString();
        String C3 = B3.getText().toString();
        String C4 = B4.getText().toString();
        String C5 = B5.getText().toString();
        String C6 = B6.getText().toString();
        String C7 = B7.getText().toString();
        String C8 = B8.getText().toString();
        String C9 = B9.getText().toString();
        String C10 = B10.getText().toString();
        String C11 = B11.getText().toString();
        String C12 = B12.getText().toString();
        String C13 = B13.getText().toString();
        String C14 = B14.getText().toString();
        String C15 = B15.getText().toString();
        String C16 = B16.getText().toString();
        String C17 = B17.getText().toString();
        String C18 = B18.getText().toString();
        String C19 = B19.getText().toString();
        String C20 = B20.getText().toString();
        String C21 = B21.getText().toString();
        String C22 = B22.getText().toString();
        String C23 = B23.getText().toString();
        String C24 = B24.getText().toString();
        String C25 = B25.getText().toString();
        String T1 = C1 + C2 + C3 + C4 + C5;
        String T2 = C6 + C7 + C8 + C9 + C10;
        String T3 = C11 + C12 + C13 + C14 + C15;
        String T4 = C16 + C17 + C18 + C19 + C20;
        String T5 = C21 + C22 + C23 + C24 + C25;
        String T6 = C1 + C6 + C11 + C16 + C21;
        String T7 = C2 + C7 + C12 + C17 + C22;
        String T8 = C3 + C8 + C13 + C18 + C23;
        String T9 = C4 + C9 + C14 + C19 + C24;
        String T10 = C5 + C10 + C15 + C20 + C25;
        String K = "12345";
        char[] L = K.toCharArray();
        char[] A1 = T1.toCharArray();
        char[] A2 = T2.toCharArray();
        char[] A3 = T3.toCharArray();
        char[] A4 = T4.toCharArray();
        char[] A5 = T5.toCharArray();
        char[] A6 = T6.toCharArray();
        char[] A7 = T7.toCharArray();
        char[] A8 = T8.toCharArray();
        char[] A9 = T9.toCharArray();
        char[] A10 = T10.toCharArray();
        Arrays.sort(A1);
        Arrays.sort(A2);
        Arrays.sort(A3);
        Arrays.sort(A4);
        Arrays.sort(A5);
        Arrays.sort(A6);
        Arrays.sort(A7);
        Arrays.sort(A8);
        Arrays.sort(A9);
        Arrays.sort(A10);
        if (Arrays.equals(A1, L) && Arrays.equals(A2, L) && Arrays.equals(A3, L) && Arrays.equals(A4, L)
                && Arrays.equals(A5, L) && Arrays.equals(A6, L) && Arrays.equals(A7, L) && Arrays.equals(A8, L) && Arrays.equals(A9, L) && Arrays.equals(A10, L)) {
            Game.setText(String.format("%s","You WOn"));
        }
    }
    public void reStart(Button B1, Button B2,Button B3,Button B4,Button B5,Button B6,Button B7,
                        Button B8,Button B9,Button B10,Button B11,Button B12,Button B13,Button B14,
                        Button B15,Button B16,Button B17,Button B18,Button B19,Button B20,Button B21,
                        Button B22,Button B23,Button B24,Button B25, Button Game)
    {
        Game.setText(String.format("%s","SODUKU"));
        int[] r = new int[5];

        for (int i = 0; i < 5; i++) {
            r[i] = new Random().nextInt(5) + 1;
        }
        B1.setText(String.format("%s", r[0]));
        B1.setBackgroundColor(Color.GREEN);
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText(String.format("%s", r[1]));
        B7.setBackgroundColor(Color.GREEN);
        B8.setText("");
        B9.setText("");
        B10.setText("");
        B11.setText("");
        B12.setText("");
        B13.setText(String.format("%s", r[2]));
        B13.setBackgroundColor(Color.GREEN);
        B14.setText("");
        B15.setText("");
        B16.setText("");
        B17.setText("");
        B18.setText("");
        B19.setText(String.format("%s", r[3]));
        B19.setBackgroundColor(Color.GREEN);
        B20.setText("");
        B21.setText("");
        B22.setText("");
        B23.setText("");
        B24.setText("");
        B25.setText(String.format("%s", r[4]));
        B25.setBackgroundColor(Color.GREEN);
    }
}