package ejemplo.calculadora.proyecto.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements OnClickListener{

    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean mult = false;
    boolean div = false;
    boolean igual = false;
    Double[] numero = new Double[20];
    Double resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Button n0 = (Button)findViewById(R.id.btn0);
        n0.setOnClickListener(this);
        Button n1 = (Button)findViewById(R.id.btn1);
        n1.setOnClickListener(this);
        Button n2 = (Button)findViewById(R.id.btn2);
        n2.setOnClickListener(this);
        Button n3 = (Button)findViewById(R.id.btn3);
        n3.setOnClickListener(this);
        Button n4 = (Button)findViewById(R.id.btn4);
        n4.setOnClickListener(this);
        Button n5 = (Button)findViewById(R.id.btn5);
        n5.setOnClickListener(this);
        Button n6 = (Button)findViewById(R.id.btn6);
        n6.setOnClickListener(this);
        Button n7 = (Button)findViewById(R.id.btn7);
        n7.setOnClickListener(this);
        Button n8 = (Button)findViewById(R.id.btn8);
        n8.setOnClickListener(this);
        Button n9 = (Button)findViewById(R.id.btn9);
        n9.setOnClickListener(this);

        Button punto = (Button)findViewById(R.id.btnPunto);
        punto.setOnClickListener(this);

        Button sum = (Button)findViewById(R.id.btnSuma);
        sum.setOnClickListener(this);
        Button rest = (Button)findViewById(R.id.btnResta);
        rest.setOnClickListener(this);
        Button mul = (Button)findViewById(R.id.btnMul);
        mul.setOnClickListener(this);
        Button divi = (Button)findViewById(R.id.btnDiv);
        divi.setOnClickListener(this);
        Button igua = (Button)findViewById(R.id.btnIgual);
        igua.setOnClickListener(this);

        Button raiz = (Button)findViewById(R.id.btnRaiz);
        raiz.setOnClickListener(this);
        Button exp = (Button)findViewById(R.id.btnExp);
        exp.setOnClickListener(this);

        Button borrar = (Button)findViewById(R.id.btnBorrar);
        borrar.setOnClickListener(this);
        Button limpiar = (Button)findViewById(R.id.btnLimpiar);
        limpiar.setOnClickListener(this);

        Button seno = (Button)findViewById(R.id.btnSen);
        seno.setOnClickListener(this);
        Button cos = (Button)findViewById(R.id.btnCos);
        cos.setOnClickListener(this);
        Button tan = (Button)findViewById(R.id.btnTan);
        tan.setOnClickListener(this);

        Button b1 = (Button)findViewById(R.id.pb);
        b1.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculadora, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        TextView pantalla = (TextView)findViewById(R.id.texto);
        int seleccion = v.getId();
        String a = pantalla.getText().toString();

        try {
        switch (seleccion) {

                case R.id.btn0:
                    pantalla.setText(a+"0");
                    break;
                case R.id.btn1:
                    pantalla.setText(a+"1");
                    break;
                case R.id.btn2:
                    pantalla.setText(a+"2");
                    break;
                case R.id.btn3:
                    pantalla.setText(a+"3");
                    break;
                case R.id.btn4:
                    pantalla.setText(a+"4");
                    break;
                case R.id.btn5:
                    pantalla.setText(a+"5");
                    break;
                case R.id.btn6:
                    pantalla.setText(a+"6");
                    break;
                case R.id.btn7:
                    pantalla.setText(a+"7");
                    break;
                case R.id.btn8:
                    pantalla.setText(a+"8");
                    break;
                case R.id.btn9:
                    pantalla.setText(a+"9");
                    break;
                case R.id.btnPunto:
                    if(decimal == false) {
                        pantalla.setText(a + ".");
                        decimal = true;
                    }else {return;}
                    break;
                case R.id.btnSuma:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnResta:
                    resta = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnMul:
                    mult = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnDiv:
                    div = true;
                    numero[0] = Double.parseDouble(a);
                    pantalla.setText("");
                    decimal = false;
                    break;
                case R.id.btnIgual:
                    numero[1] = Double.parseDouble(a);
                    if(suma == true){
                        resultado = numero[0]+numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if(resta == true){
                        resultado = numero[0]-numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if(mult == true){
                        resultado = numero[0]*numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }else if(div == true){
                        resultado = numero[0]/numero[1];
                        pantalla.setText(String.valueOf(resultado));
                    }
                    decimal = false;
                    suma = false;
                    resta = false;
                    mult = false;
                    div = false;
                break;
                case R.id.btnBorrar:
                    break;
                case R.id.btnLimpiar:
                pantalla.setText("");
                decimal = false;
                break;
                case R.id.btnSen:
                    break;
                case R.id.btnCos:
                    break;
                case R.id.btnTan:
                    break;
            }
        }catch(Exception e){
            pantalla.setText("error");
        }
    }
}
